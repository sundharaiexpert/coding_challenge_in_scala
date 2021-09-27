I have data table with hierarchy data model with tree structures. 
For example: Here is a sample data row:

-------------------------------------------
Id | name    |parentId | path       | depth
-------------------------------------------
55 | Canada  | null    | null       | 0
77 | Ontario |  55     | /55        | 1
100| Toronto |  77     | /55/77     | 2
104| Brampton| 100     | /55/77/100 | 3
I am looking to convert those rows into flattening version, sample output would be:

-----------------------------------
Id | name     | parentId | depth
------------------------------------
104| Brampton | Toronto  | 3
100| Toronto  | Ontario  | 2
77 | Ontario  | Canada   | 1
55 | Canada   | None     | 0
100| Toronto  | Ontario  | 2
77 | Ontario  | Canada   | 1
55 | Canada   | None     | 0
77 | Ontario  | Canada   | 1
55 | Canada   | None     | 0
55 | Canada   | None     | 0


//Creating DF with your data
def getSeq(s:String): Seq[String] = { s.split('|').map(_.trim).toSeq }
var l = getSeq("77 | Ontario |  55     | /55        | 1") :: Nil
l :+= getSeq("55 | Canada  | null    | null       | 0")
l :+= getSeq("100| Toronto |  77     | /55/77     | 2")
l :+= getSeq("104| Brampton| 100     | /55/77/100 | 3")
val df = l.map(x => x match { case Seq(a,b,c,d,e) => (a,b,c,d,e) }).
toDF("Id", "name", "parentId", "path", "depth")

//original DF with parentName using a self join
val dfWithPar = df.as("df1").join(df.as("df2"), $"df1.parentId" === $"df2.Id", "leftouter").
select($"df1.Id",$"df1.name",$"df1.parentId",$"df1.path",$"df1.depth",$"df2.name".
	as("parentName"))

// Split path as per requirement and get the exploded DF
val dfExploded = dfWithPar.withColumn("path", regexp_replace($"path", "^/", "")).
withColumn("path", split($"path","/")).withColumn("path", explode($"path"))

//Join orig with exploded to get addendum of rows as per individual path placeholders
val dfJoined = dfWithPar.join(dfExploded, dfWithPar.col("Id") === dfExploded.col("path")).
select(dfWithPar.col("Id"), dfWithPar.col("name"), dfWithPar.col("parentId"), 
	dfWithPar.col("path"), dfWithPar.col("depth"), dfWithPar.col("parentName"))

//Get the final result by adding the addendum to orig
dfWithPar.union(dfJoined).select($"Id", $"name", $"parentName", $"depth").show

+---+--------+----------+-----+
| Id|    name|parentName|depth|
+---+--------+----------+-----+
| 77| Ontario|    Canada|    1|
| 55|  Canada|      null|    0|
|100| Toronto|   Ontario|    2|
|104|Brampton|   Toronto|    3|
| 77| Ontario|    Canada|    1|
| 77| Ontario|    Canada|    1|
| 55|  Canada|      null|    0|
| 55|  Canada|      null|    0|
| 55|  Canada|      null|    0|
|100| Toronto|   Ontario|    2|
+---+--------+----------+-----+