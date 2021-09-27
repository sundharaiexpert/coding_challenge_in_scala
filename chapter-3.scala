chapter -3

class Vector2D(val x: Double, val y: Double) {
	def plus(v: Vector2D) = new Vector2D(x+ v.x, y + v.y)
	def minus(v: Vector2D) = new Vector2D(x - v.x, y - v.y)
	def scale(c: Double) = new Vector2D(x * c, y *c)
	def magnitude = math.sqrt(x * x + y * y)
}

object Vector2D {
	def main(args: Array[String]): Unit = {
		val v1 = new Vector2D(1,2)
		val v2 = new Vector2D(2,2)
		val v3 = v1.plus(v2)
		println(v3.magnitude)
	}
}