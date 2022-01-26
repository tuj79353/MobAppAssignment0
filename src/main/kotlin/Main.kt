import java.util.Scanner

fun main (args: Array<String>){
    val reader = Scanner(System.`in`)
    var side1 = 0.0
    var side2 = 0.0
    var side3 = 0.0

    val square : Shape = Square("User Square")
    println("Enter Square's Dimensions")
    print("Length: ")
    side1 = reader.nextDouble()
    print("Height: ")
    side2 = reader.nextDouble()
    (square as Square).setDimensions(side1, side2)
    square.printAll(); println()

    val circle : Shape = Circle("User Circle")
    println("Enter Circle's Dimensions")
    print("Radius: ")
    side1 = reader.nextDouble()
    (circle as Circle).setDimensions(side1)
    circle.printAll(); println()

    val triangle : Shape = Triangle("User Triangle")
    println("Enter Triangle's Dimensions")
    print("Adjacent: ")
    side1 = reader.nextDouble()
    print("Opposite: ")
    side2 = reader.nextDouble()
    print("Hypotenuse: ")
    side3 = reader.nextDouble()
    (triangle as Triangle).setDimensions(side1, side2, side3)
    triangle.printAll(); println()

    val eTriangle : Shape = EquilateralTriangle("User Equilateral Triangle")
    println("Enter Equilateral Triangle's Dimensions")
    print("Side Length: ")
    side1 = reader.nextDouble()
    (eTriangle as EquilateralTriangle).setDimensions(side1)
    eTriangle.printAll();
}