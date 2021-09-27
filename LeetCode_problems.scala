3) Reverse Integer
val int1: Int = 987654321

scala> val reverseInt = int1.toString()
val reverseInt: String = 987654321

scala> val reverseInt = int1.toString.toList
val reverseInt: List[Char] = List(9, 8, 7, 6, 5, 4, 3, 2, 1)

scala> val reverseInt = int1.toString.toList.reverse
val reverseInt: List[Char] = List(1, 2, 3, 4, 5, 6, 7, 8, 9)

scala> val reverseInt = int1.toString.toList.reverse.mkString
val reverseInt: String = 123456789

scala> val reverseInt = int1.toString.toList.reverse.mkString.toInt
val reverseInt: Int = 123456789
