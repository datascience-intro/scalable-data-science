// Databricks notebook source
// MAGIC %md
// MAGIC # [ScaDaMaLe, Scalable Data Science and Distributed Machine Learning](https://lamastex.github.io/scalable-data-science/sds/3/x/)

// COMMAND ----------

// MAGIC %md
// MAGIC # Write files periodically with normal mixture samples for structured streaming
// MAGIC 
// MAGIC This notebook can be used to write files every few seconds into the distributed file system where each of these files contains a time stamp field followed by randomly drawn words.
// MAGIC 
// MAGIC After running the commands in this notebook you should have a a set of files named by the minute and second for easy setting up of structured streaming jobs in another notebook.

// COMMAND ----------

// MAGIC %md
// MAGIC ## Mixture of 2 Normals
// MAGIC Here we will write some Gaussian mixture samples to files.

// COMMAND ----------

import scala.util.Random
import scala.util.Random._

// make a sample to produce a mixture of two normal RVs with standard deviation 1 but with different location or mean parameters
def myMixtureOf2Normals( normalLocation: Double, abnormalLocation: Double, normalWeight: Double, r: Random) : (String, Double) = {
  val sample = if (r.nextDouble <= normalWeight) {r.nextGaussian+normalLocation } 
               else {r.nextGaussian + abnormalLocation} 
  Thread.sleep(5L) // sleep 5 milliseconds
  val now = (new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")).format(new java.util.Date())
  return (now,sample)
   }

// COMMAND ----------

val r = new Random(1L)
println(myMixtureOf2Normals(1.0, 10.0, 0.99, r), myMixtureOf2Normals(1.0, 10.0, 0.99, r))
// should always produce samples as (0.5876430182311466,-0.34037937678788865) when seed = 1L

// COMMAND ----------

display(sc.parallelize(Vector.fill(1000){myMixtureOf2Normals(1.0, 10.0, 0.99, r)}).toDF.select("_2")) // histogram of 1000 samples

// COMMAND ----------

dbutils.fs.rm("/datasets/streamingFilesNormalMixture/",true) // this is to delete the directory before staring a job

// COMMAND ----------

val r = new Random(12345L) // set seed for reproducibility
var a = 0;
// for loop execution to write files to distributed fs
for( a <- 1 to 5){
  // make a DataSet
  val data = sc.parallelize(Vector.fill(100){myMixtureOf2Normals(1.0, 10.0, 0.99, r)}) // 100 samples from mixture
               .coalesce(1) // this is to make sure that we have only one partition per dir
               .toDF.as[(String,Double)]
  val minute = (new java.text.SimpleDateFormat("mm")).format(new java.util.Date())
  val second = (new java.text.SimpleDateFormat("ss")).format(new java.util.Date())
  // write to dbfs
  data.write.mode(SaveMode.Overwrite).csv("/datasets/streamingFilesNormalMixture/" + minute +"_" + second)
  Thread.sleep(5000L) // sleep 5 seconds
}


// COMMAND ----------

display(dbutils.fs.ls("/datasets/streamingFilesNormalMixture/"))

// COMMAND ----------

display(dbutils.fs.ls("/datasets/streamingFilesNormalMixture/48_43/"))

// COMMAND ----------

// MAGIC %md
// MAGIC Take a peek at what was written.

// COMMAND ----------

val df_csv = spark.read.option("inferSchema", "true").csv("/datasets/streamingFilesNormalMixture/48_43/*.csv")

// COMMAND ----------

df_csv.count() // 100 samples per file

// COMMAND ----------

df_csv.show(10,false) // first 10

// COMMAND ----------

