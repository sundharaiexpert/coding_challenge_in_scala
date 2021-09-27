scala> nums
val res56: Array[Int] = Array(6, 8, 3, 4, 1, 7)

scala> nums.foldLeft(_ + _)
                     ^
       error: missing parameter type for expanded function ((<x$1: error>, x$2) => x$1.$plus(x$2))
                         ^
       error: missing parameter type for expanded function ((<x$1: error>, <x$2: error>) => x$1.$plus(x$2))

scala> nums.foldLeft(0)(_ + _)
val res59: Int = 29

scala> nums.foldLeft(100000)(_ + _)
val res60: Int = 100029

scala> nums.foldLeft(1)(_ * _)
val res61: Int = 4032

scala> nums.foldLeft(0)(_ * _)
val res62: Int = 0

scala> nums.fold
def fold[A1 >: Int](z: A1)(op: (A1, A1) => A1): A1

scala> nums.foldLeft(0)(_ + _.length)
                              ^
       error: value length is not a member of Int

scala> words
val res68: Array[String] = Array(scala, is, fun, to, work)

scala> words.foldLeft(0)(_ + _.length))
                                      ^
       error: ';' expected but ')' found.

scala> words.foldLeft(0)(_ + _.length())
val res70: Int = 16

scala> words
val res71: Array[String] = Array(scala, is, fun, to, work)


scala> nums.scanLeft(0)(_ + _)
val res79: Array[Int] = Array(0, 6, 14, 17, 21, 22, 29)

scala> nums.foldLeft(0)(_ + _)
val res81: Int = 29

scala> words.scanLeft(0)(_ + _.length())
val res83: Array[Int] = Array(0, 5, 7, 10, 12, 16)

scala> words.scanLeft(0)(_ + _.length)
val res84: Array[Int] = Array(0, 5, 7, 10, 12, 16)

scala> Array(2,1,3).map(1 to 3)
java.lang.IndexOutOfBoundsException: 3 is out of bounds (min 0, max 2)
  at scala.collection.immutable.Range.apply$mcII$sp(Range.scala:180)
  at scala.collection.immutable.Range.apply(Range.scala:178)
  at scala.collection.immutable.Range.apply(Range.scala:59)
  at scala.collection.ArrayOps$.map$extension(ArrayOps.scala:925)
  ... 32 elided

scala> Array(2,1,3).map(1 to _)
val res86: Array[scala.collection.immutable.Range.Inclusive] = Array(Range 1 to 2, Range 1 to 1, Range 1 to 3)

scala> Array(2,1,3).flatMap(1 to _)
val res87: Array[Int] = Array(1, 2, 1, 1, 2, 3)

scala> Array(2,1,3,5).flatMap(1 to _)
val res88: Array[Int] = Array(1, 2, 1, 1, 2, 3, 1, 2, 3, 4, 5)

scala> Array(2,0,3,5).flatMap(1 to _)
val res89: Array[Int] = Array(1, 2, 1, 2, 3, 1, 2, 3, 4, 5)

scala> words.maxByy(s => s(0))
             ^
       error: value maxByy is not a member of Array[String]

scala> words.maxBy(s => s(0))
val res92: String = work

scala> words
val res93: Array[String] = Array(scala, is, fun, to, work)

scala> val words = Array("scala","a","b","yello","zebra")
val words: Array[String] = Array(scala, a, b, yello, zebra)

scala> words.maxBy(s => s(0))
val res94: String = zebra

scala> words.minBy(s => s(0))
val res95: String = a

scala> words
val res96: Array[String] = Array(scala, a, b, yello, zebra)

scala> words.sortBy(s => s(1))
java.lang.StringIndexOutOfBoundsException: String index out of range: 1
  at java.base/java.lang.StringLatin1.charAt(StringLatin1.java:48)
  at java.base/java.lang.String.charAt(String.java:711)
  at scala.collection.StringOps$.apply$extension(StringOps.scala:170)
  at $anonfun$res97$1(<console>:1)
  at $anonfun$res97$1$adapted(<console>:1)
  at scala.math.Ordering$$anon$1.compare(Ordering.scala:140)
  at java.base/java.util.TimSort.countRunAndMakeAscending(TimSort.java:355)
  at java.base/java.util.TimSort.sort(TimSort.java:220)
  at java.base/java.util.Arrays.sort(Arrays.java:1232)
  at scala.collection.ArrayOps$.sorted$extension(ArrayOps.scala:592)
  at scala.collection.ArrayOps$.sortBy$extension(ArrayOps.scala:641)
  ... 32 elided

scala> words.sortBy(s => s(0))
val res98: Array[String] = Array(a, b, scala, yello, zebra)

scala> words.sortWith((s1,s2) => s1> s2)
val res99: Array[String] = Array(zebra, yello, scala, b, a)

scala> words.reverse
val res101: Array[String] = Array(zebra, yello, b, a, scala)

scala> val nums = Array(3,5,2,4,1,8,9)
val nums: Array[Int] = Array(3, 5, 2, 4, 1, 8, 9)

scala> nums.find(_%2 == 0)
val res7: Option[Int] = Some(2)

scala> nums.find(_%25 == 0)
val res8: Option[Int] = None

scala> nums.find(_%25 == 1) match {
     | case Some(n)=> println("Found " + n)
     | case None => println("No Odd Number")
     | }
Found 1

scala> nums.find(_%2 == 1) match {
     | case Some(n)=> println("Found " + n)
     | case None => println("No Odd Number")
     | }
Found 3
scala> nums
val res11: Array[Int] = Array(3, 5, 2, 4, 1, 8, 9)

 nums.find(_%2==1)
val res12: Option[Int] = Some(3)

 nums.filter(_%2 ==1)
val res13: Array[Int] = Array(3, 5, 1, 9)

scala> nums.filter(_%2 ==1).size
val res15: Int = 4

scala> nums.find(_%2==1).getOrElse(-1)
val res17: Int = 3

scala> nums
val res18: Array[Int] = Array(3, 5, 2, 4, 1, 8, 9)

scala> nums.exists(_%2==1)
val res20: Boolean = true

scala> nums.find
def find(p: Int => Boolean): Option[Int]
scala> 1%2
val res23: Int = 1

scala> 3%2
val res24: Int = 1

scala> 5%1
val res25: Int = 0

scala> 5%2
val res26: Int = 1

scala> nums.find(_%2==0).getOrElse(-1)
val res27: Int = 2

scala> nums.filter(_%2 ==0)
val res28: Array[Int] = Array(2, 4, 8)

scala> nums.find(_%2==0).getOrElse
final def getOrElse[B >: Int](default: => B): B
scala> nums.find(_%2==0).getOrElse
final def getOrElse[B >: Int](default: => B): B

scala> nums
val res31: Array[Int] = Array(3, 5, 2, 4, 1, 8, 9)

scala> def add(x: Int)(y:Int) : Int = x + y
def add(x: Int)(y: Int): Int

scala> add(3)(5)
val res32: Int = 8

scala> val add3 = add(3)_
val add3: Int => Int = $Lambda$1363/0x000000080120f040@754ecc69

scala> nums.map(_.add3)
                  ^
       error: value add3 is not a member of Int

scala> nums.map(add3)
val res34: Array[Int] = Array(6, 8, 5, 7, 4, 11, 12)

scala> nums
val res35: Array[Int] = Array(3, 5, 2, 4, 1, 8, 9)


scala> // passBy Value

scala> def make3PassByValue(a: Int): (Int, Int, Int) = (a , a, a)
def make3PassByValue(a: Int): (Int, Int, Int)

scala> make3PassByValue(32)
val res37: (Int, Int, Int) = (32,32,32)

scala> // pass_by_Name

scala> def make3PassByName(s: => Int): (Int, Int, Int) = (s , s, s)
def make3PassByName(s: => Int): (Int, Int, Int)

scala> make3PassByName(32)
val res40: (Int, Int, Int) = (32,32,32)

scala> make3PassByValue({println("eval " + 24)})
                                ^
       error: type mismatch;
        found   : Unit
        required: Int

scala> make3PassByValue({println("eval "); + 24})
eval 
val res44: (Int, Int, Int) = (24,24,24)

scala> make3PassByName({println("eval by Name"); 23})
eval by Name
eval by Name
eval by Name
val res47: (Int, Int, Int) = (23,23,23)


scala> var i =0
var i: Int = 0

scala> make3PassByValue({i +=1; i})
val res50: (Int, Int, Int) = (1,1,1)

scala> make3PassByName({i +=1; i})
val res54: (Int, Int, Int) = (2,3,4)

scala> def addNumber(x: Int)(y:Int): Int = x + y
def addNumber(x: Int)(y: Int): Int

scala> addNumber(4)_
val res56: Int => Int = $Lambda$1404/0x000000080120e840@bf3c37c

scala> res56(5)
val res58: Int = 9

scala> val addtwo = addNumber(30)_
val addtwo: Int => Int = $Lambda$1405/0x0000000801237040@43533c03

scala> val finalResult = addtwo(89)
val finalResult: Int = 119

scala> def addNumber(x: Int)(y:Int): Int = ???
def addNumber(x: Int)(y: Int): Int

scala> addNumber(3)(4)
scala.NotImplementedError: an implementation is missing
  at scala.Predef$.$qmark$qmark$qmark(Predef.scala:347)
  at addNumber(<console>:1)
  ... 32 elided

scala> 