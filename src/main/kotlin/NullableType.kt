// NPE

fun main(){

    var a: String = "Hello"
//    a = null - никогда нельзя вставлять null, поэтому никогда не будет ошибки NPE


    //но если нужен null
    var b: String? = "Test"
    b = null
//    b.length - нельзя

    //если лежит строка, то вернет строку, но если нулл, то вернется нулл
    b?.length // безопасный вызов

    // bob?.name?.lastName?.age? -> null


    // Elvis оператор - ?:
    val l = b?.length ?: -1

    // !! - выброс NPE
    b = if ((0..10).random() > 5) "asd" else null
    println(b)
    val t = b!!.length
    println(t)
}