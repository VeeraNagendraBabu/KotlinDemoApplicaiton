import test.Bird

fun main(arguments: Array<String>) {
    var bird = Bird()
    println(bird.getBirdName())
    //variable declarations in Kotlin
    //var, val
    val nameOfFuncation: String = "Bobby"
    //  nameOfFuncation="Ramu" this is invalid in Kotlin, val cannot be changes through out the class
    var nameofSomethin: String = "Ramu"
    nameofSomethin = "Raghava"
    println(nameOfFuncation)
    //__________________________________________________________________
    // Datatypes
    //Integers, decimals, string, boolean, long
    //Integers
    var integerEg: Int = 31111111
    var integerEx = 4
    var integerNullable: Int? = null
    integerNullable = 4
    //-------------------------------------------------------------------
    //String
    var stringEx: String = "Nagendra"
    var stringEg = "Bobby"
    var nullableString: String? = "Bobby"
    //____________________________________________________________________
    //Print statement types
    println("Lets print value of IntegerEg that is $integerEg")
    println("Lets print value of integerEx that is " + integerEx)
    //Long
    var longVariable = 342343242343242234L
    //Float
    var floatingpoint = 12.22F
    println(floatingpoint)

    var a = 13F / 6
    println(a)
    //List
    //mutable array and unmutable List
    var nonMutableAarry = listOf<String>("Ramu", "Bobby", "Raghava", "Kalyan")
    var nonMutableIntegerArray = listOf<Int>(1, 2, 3, 4, 4, 5)
    println(nonMutableIntegerArray.count())

    var mutableArray = mutableListOf<String>("Ramu", "Bobby")
    mutableArray.add("Ashok")
    println(mutableArray.count())

    //Conditional operator
    // == , != &&
    if (mutableArray.count() != 3 && mutableArray.count() > 0) {
        println("List has 3 values")
    } else {
        println("List doesnt have 3 values")
    }
    //Switch condtion
    var listOfIntegers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9)

//    for (i in (1..20)) {
//        when (i) {
//            in 1..5 -> {
//                println("Value is between 1 to 5")
//                println("Value is between 1 to 5")
//            }
//            in 6..10 -> println("Value is between 6 to 10")
//            else -> println("value is out of range")
//        }
//    }
//    var ior = 0
//    while (ior < listOfIntegers.count()) {
//        println(listOfIntegers[ior])
//        ior++
//    }

    //Classes
    var Dinosaur = object :Animal("Dinosaur") {
        override fun getNumberOfLegs(): Int {
            return 2
        }
    }

    println("Dinosaur legs "+ Dinosaur.getNumberOfLegs())


    var Cat = TestAnimal("Cat");
    println("Cat legs "+ Cat.getNumberOfLegs())

    var Bingo = Dog()
    println(Bingo.getNumberOfLegs())

    var greatestValue =listOfIntegers.max()
    println(greatestValue)

    var findStringWithLength4 = nonMutableAarry.filter{
        stringVal -> stringVal.length==4
    }
    println(findStringWithLength4.count())
println("Test code")

}



