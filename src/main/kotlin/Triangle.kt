open class Triangle (_name : String) : Shape(_name){

    var adjacent = 0.0
    var opposite = 0.0
    var hypotenuse = 0.0

    fun setDimensions(_adjacent : Double, _opposite : Double, _hypotenuse : Double){
        adjacent = _adjacent
        opposite = _opposite
        hypotenuse = _hypotenuse
    }

    override fun getArea() : Double{
        val s = (adjacent + opposite + hypotenuse) / 2
        return Math.sqrt(s * (s - adjacent) * (s - opposite) * (s - hypotenuse))
    }

    override fun printDimensions(){
        println("$adjacent x $opposite x $hypotenuse")
    }
}