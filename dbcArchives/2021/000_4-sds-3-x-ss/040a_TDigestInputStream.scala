// Databricks notebook source
// MAGIC %md
// MAGIC # [ScaDaMaLe, Scalable Data Science and Distributed Machine Learning](https://lamastex.github.io/scalable-data-science/sds/3/x/)

// COMMAND ----------

// this is a companion notebook that generates a bivariate gaussian mixture file stream

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
   
 dbutils.fs.rm("/datasets/streamingFiles/",true) // this is to delete the directory before staring a job
 
val r = new Random(12345L)
var a = 0;
// for loop execution to write files to distributed fs
for( a <- 1 to 20){
  val data = sc.parallelize(Vector.fill(100){myMixtureOf2Normals(1.0, 10.0, 0.99, r)}).coalesce(1).toDF.as[(String,Double)]
  val minute = (new java.text.SimpleDateFormat("mm")).format(new java.util.Date())
  val second = (new java.text.SimpleDateFormat("ss")).format(new java.util.Date())
  data.write.mode(SaveMode.Overwrite).csv("/datasets/streamingFiles/" + minute +"_" + second + ".csv")
  Thread.sleep(5000L) // sleep 5 seconds
}

// COMMAND ----------

