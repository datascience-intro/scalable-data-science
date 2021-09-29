---
title: SDS-3.x
permalink: /sds/3/x/
sidebar:
  nav: "lMenu-SDS-3.x"
header:
  overlay_color: "#5e616c"
  overlay_image: /assets/images/DISP-SDS-1600x524.jpg
  caption: 
excerpt: 'Scalable Data Science and Distributed Machine Learning with Apache Spark 3.x and 2.x.<br /><br /><br />{::nomarkdown}<iframe style="display: inline-block;" src="https://ghbtns.com/github-btn.html?user=lamastex&repo=scalable-data-science&type=star&count=true&size=large" frameborder="0" scrolling="0" width="160px" height="30px"></iframe> <iframe style="display: inline-block;" src="https://ghbtns.com/github-btn.html?user=lamastex&repo=scalable-data-science&type=fork&count=true&size=large" frameborder="0" scrolling="0" width="158px" height="30px"></iframe>{:/nomarkdown}'
---

{% include toc %}

# SDS-3.x: Scalable Data Science and Distributed Machine Learning

The course is the fifth and final mandatory course in the [AI-Track of the WASP Graduate School](https://wasp-sweden.org/graduate-school/ai-graduate-school-courses/). 
It is given in three modules. In addition to academic lectures there is invited guest speakers from industry.

This site provides course contents for modules 1 and 3 with some background materials for module 2. This content is referred to as **sds-3.x** here.

**Module 1** – Introduction to Data Science: Introduction to fault-tolerant distributed file systems and computing.

The whole data science process illustrated with industrial case-studies. Practical introduction to scalable data processing to ingest, extract, load, transform, and explore (un)structured datasets. Scalable machine learning pipelines to model, train/fit, validate, select, tune, test and predict or estimate in an unsupervised and a supervised setting using nonparametric and partitioning methods such as random forests. Introduction to distributed vertex-programming.

**Module 2** – Distributed Deep Learning: Introduction to the theory and implementation of distributed deep learning.

Classification and regression using generalised linear models, including different learning, regularization, and hyperparameters tuning techniques. The feedforward deep network as a fundamental network, and the advanced techniques to overcome its main challenges, such as overfitting, vanishing/exploding gradient, and training speed. Various deep neural networks for various kinds of data. For example, the CNN for scaling up neural networks to process large images, RNN to scale up deep neural models to long temporal sequences, and autoencoder and GANs. 

**Module 3** – Decision-making with Scalable Algorithms

Theoretical foundations of distributed systems and analysis of their scalable algorithms for sorting, joining, streaming, sketching, optimising and computing in numerical linear algebra with applications in scalable machine learning pipelines for typical decision problems (eg. prediction, A/B testing, anomaly detection) with various types of data (eg. time-indexed, space-time-indexed and network-indexed). Privacy-aware decisions with sanitized (cleaned, imputed, anonymised) datasets and datastreams. Practical applications of these algorithms on real-world examples (eg. mobility, social media, machine sensors and logs). Illustration via industrial use-cases. 

 

# Course Content 

Upload Course Content as `.dbc` file into [Databricks Community Edition](https://community.cloud.databricks.com/login.html).

*  [2021 dbc ARCHIVES](https://github.com/lamastex/scalable-data-science/tree/master/dbcArchives/2021)

Reading Materials Provided

* [read](https://github.com/lamastex/scalable-data-science/tree/master/read)

Expected Reference Readings (you need to be logged into your library with access to these publishers):

* [https://learning.oreilly.com/library/view/high-performance-spark/9781491943199/](https://learning.oreilly.com/library/view/high-performance-spark/9781491943199/)
* [https://learning.oreilly.com/library/view/spark-the-definitive/9781491912201/](https://learning.oreilly.com/library/view/spark-the-definitive/9781491912201/)
* [https://learning.oreilly.com/library/view/learning-spark-2nd/9781492050032/](https://learning.oreilly.com/library/view/learning-spark-2nd/9781492050032/)
* Introduction to Algorithms, Third Edition, Thomas H. Cormen, Charles E. Leiserson, Ronald L. Rivest, and Clifford Stein from 
  - [https://ebookcentral.proquest.com/lib/uu/reader.action?docID=3339142](https://ebookcentral.proquest.com/lib/uu/reader.action?docID=3339142)

The databricks notebooks have been made available as the following course modules:

# 000_1-sds-3-x

## Introduction to Scalable Data Science and Distributed Machine Learning. 

**Topics:** *Apache Spark, Scala, RDD, map-reduce, Ingest, Extract, Load, Transform and Explore with noSQL in SparkSQL.*

1. Introduction:  What is Data Science, Data Engineering and the Data Engineering Science Process?
	*  [Introduction](db/000_1-sds-3-x/000_ScaDaMaLe/)
2. Apache Spark and Big Data
	*  [Why Spark?](db/000_1-sds-3-x/001_whySpark/)
	*  [Login to databricks](db/000_1-sds-3-x/002_00_loginToDatabricks/)
	*  [Multi-Lingual Notebooks](db/000_1-sds-3-x/002_01_multiLingualNotebooks/)
	*  [Scala Crash Course 00](db/000_1-sds-3-x/003_00_scalaCrashCourse/)
	*  [Scala Crash Course 01](db/000_1-sds-3-x/003_01_scalaCrashCourse/)
3. Map-Reduce, Transformations and Actions with Resilient Distributed datasets
	*  [RDDs](db/000_1-sds-3-x/004_RDDsTransformationsActions/)
	*  [RDDs HOMEWORK](db/000_1-sds-3-x/005_RDDsTransformationsActionsHOMEWORK/)
	*  [Word Count - SOU](db/000_1-sds-3-x/006_WordCount/)
4. Ingest, Extract, Transform, Load and Explore with noSQL
	*  [Spark SQL Basics](db/000_1-sds-3-x/007_SparkSQLIntroBasics/)
	*  [SparkSQL HW-a ProgGuide](db/000_1-sds-3-x/007a_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-b ProgGuide](db/000_1-sds-3-x/007b_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-c ProgGuide](db/000_1-sds-3-x/007c_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-d ProgGuide](db/000_1-sds-3-x/007d_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-e ProgGuide](db/000_1-sds-3-x/007e_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-f ProgGuide](db/000_1-sds-3-x/007f_SparkSQLProgGuide_HW/)
	*  [SparkSQL HW-g ProgGuide](db/000_1-sds-3-x/007g_PivotInSQL/)
	*  [ETL Diamonds Data](db/000_1-sds-3-x/008_DiamondsPipeline_01ETLEDA/)
	*  [ETL Power Plant](db/000_1-sds-3-x/009_PowerPlantPipeline_01ETLEDA/)
	*  [Wiki Click streams](db/000_1-sds-3-x/010_wikipediaClickStream_01ETLEDA/)
5. Ethics, Explainability and Fairness - An Operational View
	* [Ethical AI - Explainability](colab/Ethical_AI_Explainability_Self_Study_Exercise/)
	* [Ethical AI - Fairness](colab/Ethical_AI_Fairness_Self_Study_Exercise/)

# 000_2-sds-3-x-ml

## Deeper Dive into Distributed Machine Learning

**Topics:**  *Distributed Simulation; various un/supervised ML Algorithms; Linear Algebra; Vertex Programming using SparkML, GraphX and piped-RDDs.*

6. Introduction to Spark GDELT-project: Global Mass Media Monitoring
        * [030_Spark-GDELT-project](db/000_2-sds-3-x-ml/030_Spark-GDELT-project/)
7. Old Bailey Online - ETL of XML
        * [033_OBO_LoadExtract](db/000_2-sds-3-x-ml/033_OBO_LoadExtract/)
7. Piped RDDs - Rigorous Bayesian AB Testing on Old Bailey Online Data
        * [033_OBO_PipedRDD_RigorousBayesianABTesting](db/000_2-sds-3-x-ml/033_OBO_PipedRDD_RigorousBayesianABTesting/)
9. Latent Dirichlet Allocation of Cornell Movie Dialogs
        * [035_LDA_CornellMovieDialogs](db/000_2-sds-3-x-ml/035_LDA_CornellMovieDialogs/)


<!---
15. Additional Topics to bolster by examples and help prepare for group-projects:
	* group-project-01 doing scalable XML-parsing 
		* [Old Bailey Online - ETL of XML](db/033_OBO_LoadExtract/)
		* group-project-17 doing distributed Topological Data Analysis with single-machine-processes via PipedRDDs
	* [Introduction to Piped RDDs](db/006a_PipedRDD/)
		* [Piped RDDs - Rigorous Bayesian AB Testing on Old Bailey Online Data](db/033_OBO_PipedRDD_RigorousBayesianABTesting/)
	* group-projects interested in integrating with mass-media data
		* [Introduction to Spark GDELT-project - Global Mass Media Monitoring](db/030_Spark-GDELT-project/)
	* group-projects doing Latent Dirichlet Allocation
		* [Latent Dirichlet Allocation of Cornell Movie Dialogs](db/035_LDA_CornellMovieDialogs/)

	*  [Spark SQL Windows and Activity Detection by Random Forest](db/021_recognizeActivityByRandomForest/)

5. Distributed Vertex Programming, ETL and Graph Querying with GraphX and GraphFrames
	*  [Graph Frames Intro](db/022_GraphFramesUserGuide/)
	*  [Ontime Flight Performance](db/023_OnTimeFlightPerformance/)
6. Spark Streaming with Discrete Resilient Distributed Datasets
	*  [Spark Streaming Intro](db/024_SparkStreamingIntro/)
	*  [Extended Twitter Utils](db/025_a_extendedTwitterUtils2run/)
	*  [Tweet Transmission Trees](db/025_b_TTTDFfunctions/)
	*  [Tweet Collector](db/026_TweetCollector/)
	*  [Tweet Track, Follow](db/027_TweetCollectorTrackAndFollow/)
	*  [Tweet Hashtag Counter](db/028_TweetHashtagCount/)
7. ETL of GDELT Dataset and XML-structured Dataset
	*  [GDELT dataset](db/030_Spark-gdelt-1.1-examples/)
	*  [Old Bailey Online - ETL of XML](db/033_OBO_LoadExtract/)
8. ETL, Exploration and Export of Structured, Semi-Structured and Unstructured Data and Models
	* [Latent Dirichlet Allocation of Cornell Movie Dialogs](db/035_LDA_CornellMovieDialogs/)
	* [MLeap Model Export Demo](db/080_MLeapModelExportDemo/)
	* [Market Basket Analysis via FP Growth](db/081_MarketBasketAnalysisByFPGrowth/)
9. Spark Structured Streaming
	*  [Animal Names Streaming Files](db/037a_AnimalNamesStructStreamingFiles/)
	*  [Normal Mixture Streaming Files](db/037b_Mix2NormalsStructStreamingFiles/)
	*  [Structured Streaming Prog Guide](db/038_StructuredStreamingProgGuide/)
	*  [Graph Mixture Streaming Files](db/037c_Mix2RandomGraphStructStreamingFiles/)
	*  [Structured Streaming of JSONs](db/039_StructuredStreamingFromJSONFileStream/)
10. Sketching for Anomaly Detection in Streams
	*  [T-Digest Normal Mixture Streaming Files](db/040a_TDigestInputStream/)
	*  [Sketching with T-Digest](db/041_SketchingWithTDigest/)
	*  [Streaming with T-Digest](db/042_streamingWithTDigest/)

2. Introduction to Simulation and Machine Learning
	*  [Simulation Intro](db/011_02_IntroToSimulation/)
	*  [Machine Learning Intro](db/011_03_IntroToML/)
3. Unsupervised Learning - Clustering 
	*  [K-Means 1MSongs Intro](db/012_UnsupervisedClustering_1MSongsKMeans_Intro/)
	*  [1MSongs - 1 ETL](db/013_UnsupervisedClustering_1MSongsKMeans_Stage1ETL/)
	*  [1MSongs - 2 Explore](db/014_UnsupervisedClustering_1MSongsKMeans_Stage2Explore/)
	*  [1MSongs - 3 Model](db/015_UnsupervisedClustering_1MSongsKMeans_Stage3Model/)
4. Supervised Learning - Decision Trees
	*  [Decision Trees for Digits](db/016_SupervisedClustering_DecisionTrees_HandWrittenDigitRecognition/)
5. Linear Algebra for Distributed Machine Learning
	*  [Linear Algebra Intro](db/017_LAlgIntro/)
	*  [Linear Regression Intro](db/018_LinRegIntro/)
	*  [DLA - Distributed Linear Algebra](db/019_DistLAlgForLinRegIntro/)
	*  [DLA - Data Types Prog Guide](db/019x_000_dataTypesProgGuide/)
	*  [DLA - Local Vector](db/019x_001_LocalVector/)
	*  [DLA - Labeled Point](db/019x_002_LabeledPoint/)
	*  [DLA - Local Matrix](db/019x_003_LocalMatrix/)
	*  [DLA - Distributed Matrix](db/019x_004_DistributedMatrix/)
	*  [DLA - Row Matrix](db/019x_005_RowMatrix/)
	*  [DLA - Indexed Row Matrix](db/019x_006_IndexedRowMatrix/)
	*  [DLA - Coordinate Matrix](db/019x_007_CoordinateMatrix/)
	*  [DLA - Block Matrix](db/019x_008_BlockMatrix/)
6. Supervised Learning - Regression and Random Forests
	*  [Power Plant - Model Tune Evaluate](db/020_PowerPlantPipeline_02ModelTuneEvaluate/)
	*  [Tweet Language Classifier](db/029_TweetLanguageClassifier/)
	*  [Power Plant - Model Tune Evaluate Deploy](db/030_PowerPlantPipeline_03ModelTuneEvaluateDeploy/) 
	*  [Activity Detection - Random Forest](db/021_recognizeActivityByRandomForest/)
7. Unsupervised Learning - Latent Dirichlet Allocation
	*  [20 Newsgroups - Latent Dirichlet Allocation](db/034_LDA_20NewsGroupsSmall/)
	*  [Cornell Movie Dialogs - Latent Dirichlet Allocation](db/035_LDA_CornellMovieDialogs/)
8. Collaborative Filtering for Recommendation Systems
	*  [Movie Recommendation - Alternating Least Squares](db/036_ALS_MovieRecommender/)
9. Scalabe Geospatial Analytics
	*  [Geospatial Analytics in Magellan](db/031_GeospatialAnalyticsInMagellan/)
	*  [Open Street Map Ingestion in Magellan](db/031a_MagellanOSMIngestion/)
	*  [NY Taxi trips in Magellan](db/032_NYtaxisInMagellan/)
	*  [Querying Beijin Taxi Trajectories in Magellan](db/032a_MSR_BeijingTaxiTrajectories_MagellanQueries/)
	*  [Map-matching and Visualizing Uber Trajectories](db/032b_UberMapMatchingAndVisualization/)
11. Neural networks and Deep Learning
	*  [Intro to Deep Learning](db/049_DeepLearningIntro/)
	*  [Outline for DL](db/050_DLbyABr_01-Intro/)
	*  [Neural Networks](db/051_DLbyABr_02-Neural-Networks/)
	*  [Deep feed Forward NNs with Keras](db/052_DLbyABr_02a-Keras-DFFN/)
	*  [Hello Tensorflow](db/053_DLbyABr_03-HelloTensorFlow/)
	*  [Batch Tensorflow with Matrices](db/054_DLbyABr_03a-BatchTensorFlowWithMatrices/)
	*  [Convolutional Neural Nets](db/055_DLbyABr_04-ConvolutionalNetworks/)
	*  [MNIST: Multi-Layer-Perceptron](db/056_DLbyABr_04a-Hands-On-MNIST-MLP/)
	*  [MNIST: Convolutional Neural net](db/057_DLbyABr_04b-Hands-On-MNIST-CNN/)
	*  [CIFAR-10: CNNs](db/058_DLbyABr_04c-CIFAR-10/)
	*  [Recurrent Neural Nets and LSTMs](db/059_DLbyABr_05-RecurrentNetworks/)
	*  [LSTM solution](db/060_DLByABr_05a-LSTM-Solution/)
	*  [LSTM spoke Zarathustra](db/061_DLByABr_05b-LSTM-Language/)
	*  [Generative Networks](db/062_DLbyABr_06-GenerativeNetworks/)
	*  [Reinforcement Learning](db/063_DLbyABr_07-ReinforcementLearning/)
	*  [DL Operations](db/064_DLbyABr_08-Operations/)
12. Privacy and GDPR-compliant Machine Learning
	*  [Intro to Privacy-preserving Machine Learning](db/01_privacyPreservingDataScience/)
	*  [Privacy and Pseudonomyzation](db/02_privacyPreservingDataScience_pseudonomyzation/)
	*  [Differential Privacy](db/03_privacyPreservingDataScience_Differential_Privacy/)


**Possible Topics to Choose From:**

#### NOTE: Most links below will NOT work until we calibrate the content interactively. But you can get the contents from dbc ARCHIVES above.


23. Advise from Industry
	*  [2017 Advise from Data Industry](adviseFromIndustry/AndrewMorgan/)
24. Project Ideas
	*  [Potential Projects](db/998_01_PotentialProjectIdeas/)
25. Student Projects
	*  [Student Project 01 on Network Anomaly Detection](db/999_01_StudentProject_NetworkAnomalyDetection/)
	*  [Student Project 02 on Twitter UK Election](db/999_02_StudentProject_Twitter_UKElection2017/)
	*  [Student Project 03 on Article Topics in Retweet Networks](db/999_03_StudentProject_ArticleTopicInRTNetwork/)
	*  [Student Project 03 on Article Topics in Retweet Networks - scalable web scraper](db/999_03_StudentProject_ArticleTopicInRTNetwork_webScraping/)
	*  [Student Project 04 on Power Forecasting - Part 0](db/999_04_StudentProject_PowerForecasting_0_Introduction/)
	*  [Student Project 04 on Power Forecasting - Part 1](db/999_04_StudentProject_PowerForecasting_1_LoadDataFromJSON/)
	*  [Student Project 04 on Power Forecasting - Part 2](db/999_04_StudentProject_PowerForecasting_2_CreateTrainingData/)
	*  [Student Project 04 on Power Forecasting - Part 3](db/999_04_StudentProject_PowerForecasting_3_TrainAndValidate/)
	*  [Student Project 05 on Hail Scala for Population Genomics ETL](db/999_05_StudentProject_HailScalaGenomicsETLTutorial/)

-->

<!--
Optional materials 11. Spark Performance Tuning
	*  [Tuning Utilities](db/00_dbcTuningUtilities2run/)
	*  [Tuning Transformations and Actions](db/01_TransformationsActions/)
	*  [Tuning Utilities in Action](db/02_tuningUtilitiesInAction/)
	*  [Tuning for Caching](db/03_caching/)
	*  [Tuning for Partitioning](db/04_partitioning/)

10. Natural Language Processing
	*  [Intro to NLP](db/00_Intro2NLP)
	*  [Getting Started with SparkNLP](db/01_GettingStarted_SparkNLP/)
	*  [Annotations with Pretrained Pipelines](db/02_annotation_1_PreTrainedPipelines/)
	*  [Named Entity Recognitions with Pretrained Models](db/02_annotation_2_NerDL_WordEmbeddingsPreTrainedModels/)
	*  [Tain Lemmatizer Model in Italian](db/03_training_1_TrainLemmatizerModelInItalian/)
	*  [Training French POS Tagger](db/03_training_2_TrainPOSTagger_French_UniversalDependency/)
	*  [Evaluate French POS Model](db/04_EvaluateFrenchPOSModelBySparkMultiClassMetrics/)
-->

# Supplements

Several freely available MOOCs, hyperlinks and reference books are used to bolster the learning experience. Plese see references to such additional supplemantary resources in the above content.

We will be supplementing the lecture notes with reading assignments from original sources.  

Here are some resources that may be of further help.

### Recommended Preparations for Data *Engineering* Scientists: 

- You should have already installed docker and gone through the [setup and preparation instructions for TASK 2](https://lamastex.github.io/scalable-data-science/sds/basics/instructions/prep/).
- Successfully complete at least the SKINNY `docker-compose` steps 1-5 in [Quick Start](https://lamastex.github.io/scalable-data-science/sds/basics/infrastructure/onpremise/dockerCompose/readmes/startingNotes/)

1. Complete the [sbt tutorial](https://lamastex.github.io/scalable-data-science/sds/basics/infrastructure/onpremise/dockerCompose/readmes/sbt_tutorial/)
1. Complete the exercises to [use sbt and spark-submit packaged jars to a yarn-managed hdfs-based spark cluster](https://github.com/lamastex/scalable-data-science/tree/master/_sds/basics/infrastructure/onpremise/dockerCompose/programs).

Please be self-directed and try out more complex exercises on your own either in the databricks community edition and/or in sbt in the local hadoop service.

### Mathematical Statistical Foundations
- Avrim Blum, John Hopcroft and Ravindran Kannan.  Foundations of Data Science. Freely available from: [https://www.cs.cornell.edu/jeh/book2016June9.pdf](https://www.cs.cornell.edu/jeh/book2016June9.pdf). It is  intended as a modern theoretical course in computer science and statistical learning.
- Kevin P. Murphy.  Machine Learning:  A Probabilistic Perspective.  ISBN 0262018020.  2013.
- Trevor  Hastie,  Robert  Tibshirani  and  Jerome  Friedman.   Elements  of  Statistical  Learning, Second Edition.  ISBN 0387952845.  2009.  Freely available from: [https://statweb.stanford.edu/~tibs/ElemStatLearn/](https://statweb.stanford.edu/~tibs/ElemStatLearn/).

### Data Science / Data Mining at Scale

- Jure Leskovek,  Anand Rajaraman and Jeffrey Ullman.  Mining of Massive Datasets.  v2.1, Cambridge University Press.  2014.  Freely available from: [http://www.mmds.org/#ver21](http://www.mmds.org/#ver21).
- Foster Provost and Tom Fawcett.  Data Science for Business:  What You Need to Know about Data Mining and Data-analytic Thinking.  ISBN 1449361323.  2013.
- Mohammed J. Zaki and Wagner Miera Jr.  Data Mining and Analysis: Fundamental Concepts and Algorithms.  Cambridge University Press.  2014.
- Cathy  O’Neil  and  Rachel  Schutt.   Doing  Data  Science,  Straight  Talk  From  The  Frontline. O’Reilly.  2014.

Here are some free online courses if you need quick refreshers or want to go indepth into specific subjects.


### Apache Spark / shell / github / Scala / Python / Tensorflow / R

- Learning Spark : lightning-fast data analytics by Holden Karau, Andy Konwinski, Patrick Wendell, and Matei Zaharia, O'Reilly, 2015.
- Advanced analytics with Spark : patterns for learning from data at scale, O'Reilly, 2015.
- Command-line Basics
	* [Linux Commnad-line Basics](https://www.udacity.com/course/linux-command-line-basics--ud595)
	* [Windows Command-line Bascis](https://www.lynda.com/-tutorials/Windows-command-line-basics/497312/513424-4.html)

- [How to use Git and GitHub: Version control for code](https://www.udacity.com/course/how-to-use-git-and-github--ud775)
- [Intro to Data Analysis: Using NumPy and Pandas](https://www.udacity.com/course/intro-to-data-analysis--ud170)
- [Data Analysis with R by facebook](https://www.udacity.com/course/data-analysis-with-r--ud651)
* [Machine Learning Crash Course with TensorFlow APIs by Google Developers](https://developers.google.com/machine-learning/crash-course/)
- [Data Visualization and D3.js](https://www.udacity.com/course/data-visualization-and-d3js--ud507)
- [Scala Programming](http://www.scala-lang.org/documentation/)
- [Scala for Data Science, Pascal Bugnion, Packt Publishing, 416 pages, 2016](http://shop.oreilly.com/product/9781785281372.do). 

### Computer Science Refreshers

* [Intro to Computer Science (with Python)](https://www.udacity.com/course/intro-to-computer-science--cs101)
* [Intro to Python Programming](https://www.udacity.com/course/programming-foundations-with-python--ud036)
* [Intro to Relational Databases](https://www.udacity.com/course/intro-to-relational-databases--ud197)
