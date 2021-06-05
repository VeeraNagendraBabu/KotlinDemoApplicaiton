abstract class Animal(name:String){
    init {
        println("Hi dear, my name is $name")
    }
    //test comment
   abstract fun getNumberOfLegs() : Int
}