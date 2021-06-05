abstract class Animal(name:String){
    init {
        println("Hi dear, my name is $name")
    }
   abstract fun getNumberOfLegs() : Int
}