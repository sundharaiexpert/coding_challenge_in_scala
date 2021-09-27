
https://leetcode.com/problems/add-two-numbers/solution/

def addNUmbersInList(l1:List[Int], l2:List[Int]): List[Int] = {
     
    def addWithCarry(lists:(List[Int], List[Int]), carry: Int) = lists match {
case (Nil, Nil) => if(carry == 0) Nil else List(carry)
case (x :: xtail, Nil) => addHeads(x, 0, carry, (xtail, Nil))
case (Nil, y :: ytail) => addHeads(0, y, carry, (Nil, ytail))
case (x :: xtail, y:: ytail) => addHeads(x, y, carry, (xtail, ytail))
    }
   def addHeads(x:Int, y:Int, carry:Int, tails: (List[Int], List[Int])): List[Int] =  {
      val sum = x + y + carry
      sum % 10 :: addWithCarry(tails, sum/ 10)
    }

    addWithCarry((l1,l2),0)
}

val l1 = List(2, 4, 3)
val l2 = List(5, 6, 4)

val return = addNUmbersInList(l1, l2)
return.foreach(println)
scala> addNUmbersInList(l1,l2).foreach(print)
708
scala> addNUmbersInList(l1,l2).reverse
val res9: List[Int] = List(8, 0, 7)

scala> addNUmbersInList(l1,l2).reverse.foreach(println)
8
0
7

scala> addNUmbersInList(l1,l2).reverse.foreach(print)
807


object ListNode {
  def apply(x: Int, next: ListNode): ListNode = {
    val n = new ListNode(x)
    n.next = next
    n
  }

  implicit def listnode2list(x: ListNode): List[Int] = x match {
    case null => Nil
    case n => n.x :: listnode2list(n.next)
  }

  implicit def list2listnode(l: List[Int]): ListNode = l match {
    case head :: tail => ListNode(head, list2listnode(tail))
    case Nil => null
  }
}

object Solution {
  import ListNode.{list2listnode, listnode2list}

  def addTwoNumbers(l1: ListNode, l2: ListNode): ListNode = addTwoNumbers(l1, l2, 0)

  def addTwoNumbers(l1: List[Int], l2: List[Int], c: Int): List[Int] = (l1, l2, c) match {
    case (Nil, Nil, 0) => Nil
    case (Nil, Nil, 1) => List(1)
    case (h1 :: t1, Nil, _) => (h1 + c) % 10 :: addTwoNumbers(t1, Nil, (h1 + c) / 10)
    case (Nil, h2 :: t2, _) => (h2 + c) % 10 :: addTwoNumbers(Nil, t2, (h2 + c) / 10)
    case (h1 :: t1, h2 :: t2, _) => (h1 + h2 + c) % 10 :: addTwoNumbers(t1, t2, (h1 + h2 + c) / 10)
  }
}

scala> evenProducts.toSet.size
val res158: Int = 28

scala> evenProducts.toSet.toList.sorted
val res163: List[Int] = List(2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 24, 28, 30, 32, 36, 40, 42, 48, 50, 54, 56, 60, 64, 70, 72, 80, 90, 100)

scala> val evenProducts = for(i <- 1 to 10; j <- 1 to 10; product = i * j; if product%2 == 0) yield product



	
342
465    Modulo gives remeinder 
----   Divide gives quoitent 
807 

def addTwoList(l1: List[Int], l2: List[Int]): List[Int] = {

	def addListCase(lists: (List[Int], List[Int]), carry:Int) = lists match{
case (Nil, Nil) => if(carry == 0) Nil else List(carry)
case (x :: xtail, Nil) => addHeads(x, 0, carry, (xtail, Nil))
case (Nil, y:: ytail) => addHeads(0, y, carry, (Nil, ytail))
case (x:: xtail, y :: ytail) => addHeads(x, y, carry, (xtail, ytail))
	}


	def addHeads(x: Int, y:Int, carry:Int, tails:(List[Int], List[Int])): List[Int] ={
      val sum = x + y + carry
      sum%10 :: addListCase(tails, sum/10)
	}
	addListCase((l1,l2), 0)
}


addTwoList(l1,l2)
def addTwoList(l1: List[Int], l2: List[Int]): List[Int]

scala> val l1 = List(2,4,3)   
     | val l2 = List(5,6,4)
val l1: List[Int] = List(2, 4, 3)
val l2: List[Int] = List(5, 6, 4)

scala> addTwoList(l1,l2)
val res185: List[Int] = List(7, 0, 8)
carry 11
      999 +
      999
     ----
     1998
val l3 = List(9,9,9)
val l4 = List(9,9,9)
scala> addTwoList(l3,l4)
val res186: List[Int] = List(8, 9, 9, 1)

val l5 = List(9,9,9)
val l6 = List(1)
scala> addTwoList(l5,l6)
val res187: List[Int] = List(0, 0, 0, 1)
 1 --> carry
 23
 99
---
122
def addTwoNumbersFromList(l1: List[Int], l2: List[Int]): List[Int] ={

def addWithCarry(lists:(List[Int], List[Int]), carry: Int) = lists match {
	case (Nil, Nil) => if(carry ==0) Nil else List(carry)
	case (x :: xtail , Nil) => addHeads(x, 0, carry, (xtail, Nil))
	case (Nil, y :: ytail) => addHeads(0, y, carry, (Nil, ytail))
	case (x :: xtail, y:: ytail) => addHeads(x, y, carry ,(xtail, ytail)) 
}

def addHeads(x: Int, y: Int, carry: Int, tails: (List[Int], List[Int]) ): List[Int] ={
	val sum = x + y + carry
	sum%10 :: addWithCarry(tails , sum/10)
}
addWithCarry((l1, l2), 0)
}

addTwoNumbersFromList(l5, l6)



val l1 = List(9,9,9)
val l2 = List(1)
anser 
  999
    1
-----
 1000
-----

def addTwoList(l1: List[Int], l2: List[Int]): List[Int] = {

def addWithCarry(lists:(List[Int], List[Int]), carry:Int) = lists match{
case (Nil, Nil) => if(carry == 0) Nil else List(carry)
case (x :: xtail, Nil) => addHeads(x, 0, carry, (xtail, Nil))
case (Nil, y :: ytail) => addHeads(0, y, carry, (Nil, ytail))
case (x :: xtail, y:: ytail) => addHeads(x, y, carry, (xtail, ytail))
}

def addHeads(x: Int, y: Int, carry: Int, tails:(List[Int], List[Int])) : List[Int]={
	val sum = x + y + carry
	sum%10 :: addWithCarry(tails, sum/10)
}
addWithCarry((l1,l2),0)
}

addTwoList(l1,l2)




val l1 = List(9,9,9,9,9)
val l2 = List(1)

def addTwoList(l1: List[Int], l2: List[Int]) : List[Int] ={

	def addWithCarry(lists:(List[Int], List[Int]), carry : Int) = lists match{
     case (Nil, Nil) => if (carry == 0) Nil else List(carry)
     case (x :: xtail, Nil) => addHeads(x, 0, carry , (xtail, Nil))
     case (Nil, y :: ytail) => addHeads(0, y, carry, (Nil, ytail))
     case (x:: xtail, y:: ytail) => addHeads(x, y, carry, (xtail, ytail))
	}

	def addHeads(x: Int, y: Int, carry: Int, tails:(List[Int], List[Int])): List[Int] ={
		val sum = x + y + carry
		sum%10 :: addWithCarry(tails, sum/10)
	}
	addWithCarry((l1,l2),0)
}

addTwoList(l1,l2)


val l1 = List(9,9,9,9,9)
val l2 = List(1)
def addTwoList(l1: List[Int], l2: List[Int]) ={

def addWithCarry(lists:(List[Int], List[Int]), carry :Int) = lists match{
case (Nil, Nil) => if(carry == 0) Nil else List(carry)
case (x :: xtail, Nil) => addHeads(x, 0, carry, (xtail, Nil))
case (Nil, y :: ytail) => addHeads(0, y, carry, (Nil, ytail))
case (x :: xtail, y :: ytail) => addHeads(x, y, carry, (xtail, ytail))
}
	def addHeads(x: Int, y:Int, carry:Int, tails:(List[Int], List[Int])): List[Int] ={
		val sum = x + y + carry
		sum%10 :: addWithCarry(tails, sum/10)
	}
	addWithCarry((l1,l2), 0)
}
addTwoList(l1, l2)







