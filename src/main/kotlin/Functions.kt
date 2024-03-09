fun main(){
//    println(testSimple(5,2))
//    println(testString(20))


//    println(testNamedArguments(y = 1,z = 2,x = 3))

//    testDefaultArguments()

//    printEven(2,3,45,5,34,325,43,34,5,4,4,3,4,3,54)

//    var a = intArrayOf(34231,4,32,43,24,23,4,32)

    printEven(12, 16, *intArrayOf(4,3,5,654,645,465), 6, 9, 10)

}

//vararg
fun printEven(vararg numbers: Int){
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}


fun testSimple(x:Int, y:Int): Int = x + y

fun testString(x:Int): String{
    return "String is $x"
}

fun testNamedArguments(x:Int, y:Int, z:Int): List<Int>{
    return listOf(x,y,z)
}


//как void в Java
fun testDefaultArguments(x: Int = 1, y:Int = 2){
    println(x + y)
}
