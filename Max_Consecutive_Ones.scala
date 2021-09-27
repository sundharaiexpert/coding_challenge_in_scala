Max Consecutive Ones
Given a binary array, find the maximum number of consecutive 1s in this array.

Example 1:
Input: [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s.
    The maximum number of consecutive 1s is 3.
Note:

The input array will only contain 0 and 1.
The length of input array is a positive integer and will not exceed 10,000
val nums = Array(1,0,1,1,0,1)

object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        var count = 0
        for(i <-0 to nums.length-1 ) {
            for(j <-i+1 to nums.length-1) {
                println(s'value of i $  (i) value of j $nums(j) value count is $count' )
                if(nums(i) == nums(j)) {
                    count = count +1
                    println(count)
                }
            }
        }
        count
    }
}
object Solution {
    def findMaxConsecutiveOnes(nums: Array[Int]): Int = {
        var count = 0
        var max = Integer.MIN_VALUE
        for(i <- 0 to nums.length-1){
                if(nums(i) == 1) {
                    count = count +1
                    println(count)
                 }
                 else {
                    max = Math.max(count, max)
                    count = 0
                 }
        }
        Math.max(max,count)
    }
}


 public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) count++;
            else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return Math.max(max, count);
    }


Your input
[1,0,1,1,0,1]

You can also try something fancy one liner solution as shared by Stefan Pochmann.

def findMaxConsecutiveOnes(self, nums):
  return max(map(len, ''.join(map(str, nums)).split('0')))



Find Numbers with Even Number of Digits
Given an array nums of integers, return how many of them contain an even number of digits.
 

Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
 

Constraints:

1 <= nums.length <= 500
1 <= nums[i] <= 10^5
   Hide Hint #1  
How to compute the number of digits of a number ?
   Hide Hint #2  
Divide the number by 10 again and again to get the number of digits.

def findNumberDigits(num : Int): Int = { 
    1 + findNumberDigits(num/10) 
}

Functional Solution in Scala
34
VIEWS
0
Created at: December 22, 2019 6:52 AM

object Solution {
  @scala.annotation.tailrec
  def digits(n: Int): Int =
    if(n >= 0) {
      n.toString.length
    } else {
      digits(-n)
    }

  def findNumbers(nums: Array[Int]): Int =
    nums.map(digits).count(_%2 == 0)
}

Scala one line map and count
25
VIEWS
0
Created at: December 31, 2019 7:55 AM
    def findNumbers(nums: Array[Int]): Int = {
        nums.map(_.toString.length % 2 == 0).count(_ == true)
    }

    object Solution {
    def findNumbers(nums: Array[Int]): Int = {
        nums.map { e => 
            e.toString.length % 2  
        }.count(_ == 0)
    }
}

scala> def findNumberDigits(num : Array[Int]) ={
     | num.map(e => println(e.toString.length%2))
     | }
def findNumberDigits(num: Array[Int]): Array[Unit]

scala> findNumberDigits(numList)
0
1
1
1
0
val res28: Array[Unit] = Array((), (), (), (), ())

scala> numList
val res30: Array[Int] = Array(12, 345, 2, 6, 7896)

scala> def findNumberDigits(num : Array[Int]) ={
     | num.map(e => e.toString.length%2).count(_ ==0)
     | }
def findNumberDigits(num: Array[Int]): Int

scala> findNumberDigits(numList)
val res31: Int = 2

Example 1:

Input: [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Example 2:


Input: [-7,-3,2,3,11]
Output: [4,9,9,49,121]
val A = Array(-4,-1,0,3,10)
val B = Array(-7,-3,2,3,11)

def sortedSquares(A: Array[Int]): Array[Int] = {
        A.map(e => println(e * e))
    }
    scala> A.map(e => e*e).sorted
val res41: Array[Int] = Array(0, 1, 9, 16, 100)
