open class Shape {
    open fun shape(){
        println("Shape is defined")
    }
}
interface  Rectangle{
    fun shape(){
        println("Helloo")
    }
}
class Square:Shape(),Rectangle{
    override fun shape() {
        println("Circle Shape")
        super<Shape>.shape()
        super<Rectangle>.shape()
    }
}

fun main() {
    var SquareObj=Square()
    SquareObj.shape()
}