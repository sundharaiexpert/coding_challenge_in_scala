 val x = 1234
 def reverse(x1: Int): Int = {
    var rev = 0;
    var x = x1
        while (x != 0) {
            val pop = x % 10;
            println("value pop= " + pop + " x= "+ x +" rev= " + rev +" x=" + x)
            x /= 10;
            println("value pop= " + pop + " x= "+ x +" rev= " + rev +" x=" + x)
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            rev = rev * 10 + pop;
            println("value pop= " + pop + " x= "+ x +" rev= " + rev +" x=" + x)
        }
        return rev;
 }
reverse(1234
value pop= 4 x= 1234 rev= 0 x=1234
value pop= 4 x= 123 rev= 0 x=123
value pop= 4 x= 123 rev= 4 x=123
value pop= 3 x= 123 rev= 4 x=123
value pop= 3 x= 12 rev= 4 x=12
value pop= 3 x= 12 rev= 43 x=12
value pop= 2 x= 12 rev= 43 x=12
value pop= 2 x= 1 rev= 43 x=1
value pop= 2 x= 1 rev= 432 x=1
value pop= 1 x= 1 rev= 432 x=1
value pop= 1 x= 0 rev= 432 x=0
value pop= 1 x= 0 rev= 4321 x=0
def reverse(x1: Int): Int
val res31: Int = 4321

	val res22: Int = 4321
scala> reverse(1234)
val res22: Int = 4321

scala> 1234%10
val res23: Int = 4

scala> 1234%10
val res24: Int = 4

scala> 123%10
val res25: Int = 3

scala> 12%10
val res26: Int = 2

scala> 1%10
val res27: Int = 1

scala> 1234/10
val res28: Int = 123

scala> 123/10
val res29: Int = 12

scala> 12/10
val res30: Int = 1

val int1 = 1234
output should be = 4321 
1234%10 = 4
123%10  = 3
12%10   = 2
1%10    = 1
------
1234/10 = 123
123/10  = 12
12/10   = 1
1/10    = 0

def findSubstringLenght(inp: Int): Int ={
var rev = 0
var x1 = inp 
while(x1 != 0) {
	val pop = x1%10
	x1 /= 10
	rev = rev * 10 + pop
}
rev 
}