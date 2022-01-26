class Circle (_name : String) : Shape(_name){

    var radius = 0.0

    fun setDimensions(_radius : Double){
        radius = _radius
    }

    override fun getArea() : Double{
        return Math.PI * radius * radius
    }

    override fun printDimensions(){
        println("$radius")
    }
}