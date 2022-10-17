fun main(){

    val pointOne = Fraction(10.0, 4.0)
    val pointTwo = Fraction(10.0, 2.0)
    val ptOne = Point(4.0 ,2.0)
    val ptTwo = Point(6.0,2.0)


    println(ptOne.toString())

    println(pointOne.equals(pointTwo))

    println(ptOne.simetricalPoint())

    println(ptOne.length(ptOne.simetricalPoint()))

    println(pointOne.addFract(pointTwo))

    println(pointOne.multiply(pointTwo))



}


class Fraction(private var numerator: Double, private var denominator: Double) {
    override fun toString(): String {
        if (denominator == 0.0) {
            return "Not a Num"
        } else if (numerator == 0.0) return "0.0"
        return "$numerator / $denominator"
    }

    fun addFract(other: Fraction): Fraction {
        if (denominator == 0.0 || other.denominator == 0.0) return Fraction(0.0, 0.0)
        else if (denominator == other.denominator) return Fraction(numerator + other.numerator, denominator)
        else if (denominator != other.denominator) return Fraction(
            numerator * other.denominator + other.numerator * denominator, (denominator * other.denominator)
        )
        else return Fraction(0.0, 1.0)
    }

    fun subFract(other: Fraction): Fraction {
        if (denominator == 0.0 || other.denominator == 0.0) return Fraction(0.0, 0.0)
        else if (denominator == other.denominator) return Fraction(numerator - other.numerator, denominator)
        else if (denominator != other.denominator) return Fraction(
            numerator * other.denominator - other.numerator * denominator,
            (denominator * other.denominator)
        )
        else return Fraction(0.0, 1.0)
    }

    fun multiply(other: Fraction): Fraction{
        if (numerator == 0.0 || other.numerator == 0.0 || denominator == 0.0 || other.denominator ==0.0) return Fraction(0.0,0.0)
        else return Fraction(numerator * other.numerator, denominator* other.denominator)
    }



    override fun equals(other: Any?): Boolean {
        if (other is Fraction) {
            if (numerator * other.denominator == denominator * other.numerator)
                return true
        }
        return false
    }


}

class Point(private var x:Double, private var y:Double){

    override fun toString(): String {
        return "$x / $y"
    }

    fun simetricalPoint(): Point {
        return Point(-x, -y)
    }


    fun length(other: Point): Double{
        if(x == 0.0 && y ==0.0) return 0.0
        else return (kotlin.math.sqrt((((x - other.x) * (x - other.x)) + ((y - other.y) * (y - other.y)))))

    }
}