//
//val pointOne = Point(20,3)
//val pointTwo = Point(4,2)
//val pointThree = Fraction(4.0, 0.0)
//
//
//println(pointThree.toString())
//
//
//
//println(pointOne.toString())
//
//println(pointOne.addNumbers())
//
//println(pointOne.multiplyNumbers())
//
//println(pointOne.devideNumbers())
//
//println(pointOne.equals(pointTwo))
//
//println(pointOne.simetricalNumOne() + pointOne.simetricalNumTwo())
//
//println(pointOne.getLength())
//
//println(pointTwo.simetricalNumOne() + pointTwo.simetricalNumTwo())
//
//println(pointTwo.getLength())
//
//
//class Point(val x: Int,val y: Int){
//
//    override fun toString(): String {
//        return "$x / $y"
//    }
//
//    fun addNumbers(): Int{
//        return x + y
//    }
//
//    fun multiplyNumbers(): Int{
//        return x * y
//    }
//
//    fun devideNumbers(): Int{
//        return x / y
//    }
//
//    override fun equals(other: Any?): Boolean {
//        if (other is Point) {
//            if (x * other.y == y * other.x)
//                return true
//        }
//        return false
//    }
//
//
//    fun simetricalNumOne(): Int{
//        return x * (-1)
//    }
//
//    fun simetricalNumTwo(): Int{
//        return y * (-1)
//    }
//
//
//    fun getLength(): Int {
//        return (x+y)*2
//    }
//
//
//
//}
//
//
//fun decade(other: Fraction): Fraction{
//    if (numerator == 0.0 || denominator == 0.0) return Fraction(0.0,0.0)
//    else if (numerator != 0.0 && denominator != 0.0) return Fraction(other.numerator, other.denominator)
//    else if (numerator == denominator) return Fraction(1.0,1.0)
//    else return Fraction(-500.0,-500.0)
//}
//
