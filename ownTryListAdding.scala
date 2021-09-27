val l1 = List(2,4,3)
val l2 = List(5,6,4)
342 +
465
----
807 (carry =1 for 2nd Digit)
-------------------------------

def addNumberInList(l1:List[Int], l2:List[Int]) ={
	def addWithCarry(lists: (List[Int], List[Int]), carry: Int) = lists match{
     case (Nil, Nil) => if(carry == 0) Nil else List(carry)
     case (x :: xtail, Nil) => addHead(x, 0, carry, (xtail, Nil))
     case (Nil, y :: ytail) => addHead(0, y, carry, (Nil, ytail))
     case (x:: xtail, y:: ytail) => addHead(x, y, carry, (xtail, ytail))
	}

def addHead(x: Int, y:Int , carry:Int, tails: (List[Int], List[Int])): List[Int] ={
	val sum = x + y + carry // 2 + 5 = 7
	// 9+ 9 =18 i.e 18%10 = 8 and 18/10 = 1
    sum % 10 :: addWithCarry(tails, sum/10)
}
  addWithCarry((l1,l2), 0)
}


addNumberInList(l1,l2)
1
 8
 2
 -
10


val l1 = List(8,8,8,8,8,8,8,8)
val l2 = List(2)

def addTwoList(l1: List[Int], l2: List[Int]) : List[Int] ={

def addWithCarry(lists:(List[Int], List[Int]), carry : Int) = lists match{
case (Nil, Nil) => if(carry == 0) Nil else List(carry)
case (x :: xtail, Nil) => addHead(x, 0, carry, (xtail, Nil))
case (Nil, y :: ytail) => addHead(0, y, carry, (Nil, ytail))
case (x:: xtail, y :: ytail) => addHead(x,y,carry,(xtail, ytail))
}

def addHead(x: Int, y: Int, carry: Int, tails:(List[Int], List[Int])): List[Int] ={
	val sum = x + y + carry
	sum%10 :: addWithCarry(tails, sum/10)
}
addWithCarry((l1,l2),0)
}

addTwoList(l1,l2)
scala> addTwoList(l1,l2)
val res1: List[Int] = List(0, 9, 8, 8, 8, 8, 8, 8)