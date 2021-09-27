 
import scala.collection.mutable._
 def lengthOfLongestSubstring(s: String): Int = {
    val indices = scala.collection.mutable.Map[Char, Int]()
    var left = 0
    var longest = 0
    for ((char, right) <- s.zipWithIndex) {
      indices.get(char) foreach { i => left = left max (i + 1) } 
	    longest = longest max (right - left + 1)
      indices.put(char, right)
    }
    longest
  }
  def lengthOfLongestSubstring(s: String): Int

scala> lengthOfLongestSubstring(str)
val res6: Int = 3

scala> val str2 = "bbbbb"
val str2: String = bbbbb

scala> lengthOfLongestSubstring(str2)
val res7: Int = 1

scala> val str3 = "pwwkew"
val str3: String = pwwkew

scala> lengthOfLongestSubstring(str3)
val res8: Int = 3


val str ="abcabcbb"
import scala.collection.mutable._

def findSubstring(str: String): Int ={
val indices = scala.collection.mutable.Map[Char, Int]()
var longest, left = 0
for((char, right) <- str.zipWithIndex) {
indices.get(char) foreach(i => left = left max (i +1))
longest = longest max (rigt - left +1)
indices.put(char, right)
}
longest
}

--------------------- my try ------------
// count of Non repeating sub string 

import scala.collection.mutable._
def findSubstringLenght(str: String): Int ={
val indices = scala.collection.mutable.Map[Char, Int]()
var longest, left = 0
for((char, right) <- str.zipWithIndex) {
  indices.get(char) foreach(i => left = left max(i + 1))
  longest = longest max (right - left + 1)
  indices.put(char, right)
}
longest
}

ANJPLANO10
val str = "abcabcbb"
val str2 = "bbbbb"
val str3 = "pwwkew"
findSubstringLenght(str: String)


val str = "abcabcbb"
val str1 = "bbbbbb"
val str3 = "pwwkew"

import scala.collection.mutable._
def lengthOfLongestSubstring(str: String) : Int ={
  val indices = mutable.Map[Char, Int]()
  var left, longest = 0
  for((char, pos) <- str.zipWithIndex) {
   indices.get(char) foreach{i => left = left max(i + 1)}
   longest = longest max(right - left + 1)
   indices.put(char, right)
  }
  longest
}

lengthOfLongestSubstring(str)
scala> lengthOfLongestSubstring(str)
after adding 
(a,0)
(a,0)
after adding 
(a,0)
(b,1)
(a,0)
(b,1)
after adding 
(a,0)
(b,1)
(c,2)
(a,0)
(b,1)
(c,2)
after adding 
(a,3)
(b,1)
(c,2)
(a,3)
(b,1)
(c,2)
after adding 
(a,3)
(b,4)
(c,2)
(a,3)
(b,4)
(c,2)
after adding 
(a,3)
(b,4)
(c,5)
(a,3)
(b,4)
(c,5)
after adding 
(a,3)
(b,6)
(c,5)
(a,3)
(b,6)
(c,5)
after adding 
(a,3)
(b,7)
(c,5)
val res5: Int = 3
scala> str          012345
val res28: String = zxyyxz
import scala.collection.mutable._
  def lengthOfLongestSubstring(str: String) : Int ={
       val indices = scala.collection.mutable.Map[Char, Int]()
      var left, longest = 0
        for((char, pos) <- str.zipWithIndex) {
         println("values before left= " + left + " longest= " + longest + " pos=" + pos +" char=" + char)
         indices.foreach(println)
         indices.get(char) foreach{i => left = left max(i + 1); 
          println(i + " ** inside foreach  " + left)}
         println("after foreach left= " + left + " longest=" + longest + " pos=" + pos)
         longest = longest max(pos - left + 1)
         println("before putting longest= " + longest)
         indices.put(char, pos)
      println("after put ")
      indices.foreach(print)
        }
        longest
      }
lengthOfLongestSubstring(str3)
            012345
val str3 = "pwwkew"
scala> str3
val res10: String = pwwkew
(p,0),(w,1),(w,2),(k,3),(e,4),(w,5)
values before left= 0 longest= 0 pos=0 char=p
after foreach left= 0 longest=0 pos=0
before putting longest= 1
after put 
(p,0)
values before left= 0 longest= 1 pos=1 char=w
(p,0)
after foreach left= 0 longest=1 pos=1
before putting longest= 2
after put 
(p,0)(w,1)
values before left= 0 longest= 2 pos=2 char=w
(p,0)
(w,1)
after foreach left= 2 longest=2 pos=2
before putting longest= 2
after put 
(p,0)(w,2)
values before left= 2 longest= 2 pos=3 char=k
(p,0)
(w,2)
after foreach left= 2 longest=2 pos=3
before putting longest= 2
after put 
(p,0)(w,2)(k,3)
values before left= 2 longest= 2 pos=4 char=e
(p,0)
(w,2)
(k,3)
after foreach left= 2 longest=2 pos=4
before putting longest= 3
after put 
(p,0)(e,4)(w,2)(k,3)
values before left= 2 longest= 3 pos=5 char=w
(p,0)
(e,4)
(w,2)
(k,3)
after foreach left= 3 longest=3 pos=5
before putting longest= 3
after put 
(p,0)(e,4)(w,5)(k,3)

val res13: Int = 3


val str = "bbbbb" => 1
val str1 = "abcabcbb" => 3
import scala.collection.mutable._
def lengthOfLongestSubstring(str: String): Int ={
  val indices = scala.collection.mutable.Map[Char, Int]()
  var left, longest = 0
 for((char, right)<- str.zipWithIndex) {
  indices.get(char) foreach {i => left = left max(i+ 1); println(i + " ** " + left)}
  longest = longest max(right - left+1)
  indices.put(char, right)
 }
 longest
}
01234567
abcabcbb



val str = "abcabcbb"
import scala.collection.mutable._
def lengthOfLongestSubstring(str: String): Int ={
  val indices = scala.collection.mutable.Map[Char, Int]()
  var left, longest = 0
  for((char, right)<- str.zipWithIndex) {
    indices.get(char) foreach{i => left = left max(i + 1)}
    longest = longest max(right - left +1)
    indices.put(char, right)
  }
  longest
}