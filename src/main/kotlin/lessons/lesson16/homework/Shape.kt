package lessons.lesson16.homework

import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sin

open class Shape {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(
    val radius: Double
) : Shape() {

    override fun area(): Double {
        return PI * radius.pow(2)
    }
}

class Square(
    val side: Double
) : Shape() {

    override fun area(): Double {
        return side * side
    }
}

class Triangle(
    val sideA: Double,
    val sideB: Double,
    val angle: Double
) : Shape() {

    override fun area(): Double {
        val angleInRadians = Math.toRadians(angle)

        return 0.5 * sideA * sideB * sin(angleInRadians)
    }
}

fun main() {
    val shapes: List<Shape> = listOf(
        Circle(5.0),
        Square(4.0),
        Triangle(5.0, 6.0, 90.0)
    )

    for (shape in shapes) {
        println("Area: ${"%.2f".format(shape.area())}")
    }
}