


fun main(){
    testWhen(1)
    testWhen("aaa")
    testWhen(15)
}



fun testWhen(input: Any){

    when(input){
        1 -> println("Единица")
        2 -> println("Двойка")
        in 10..20 -> println("от 10 до 20")
        is String -> println("Была введена строка ${input.length}")
        else -> println("что-то еще")
    }
}