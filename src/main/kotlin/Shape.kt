abstract class Shape (_name : String){
    var name = _name

    open fun getArea() : Double{
        return 0.0
    }

    open fun printAll(){
        printName()
        printDimensions()
        printArea()
    }

    open fun printName(){
        println(name)
    }

    open fun printDimensions(){
        println("No dimensions")
    }

    fun printArea(){
        println("Area: " + getArea())
    }
}