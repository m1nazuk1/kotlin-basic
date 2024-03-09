


fun main(){
    val a = listOf(1,2,3,4,5)

    a.forEach { e -> println(e) }
    println(a.map { e -> e * 2 })
    println(a.filter { e -> e % 2 == 0 })
    println(a.reduce {sum, e -> sum + e})



    a.sortedByDescending { it } // обратная сортировка по конкретному элементу ( it - текущий элемент листа )
    println( a.any { it > 10 } ) //есть ли какой-то / false
    println( a.all { it < 10 }) // все элементы должны подходить по условию
    a.sum()


    val numbers = listOf(1, 3, -4, 2, -11)
    val (positive, negative) = numbers.partition { it > 0 } // разделения по условию
    println(positive)
    println(negative)


    var result = listOf("a", "b", "ba", "ccc", "ad").groupBy { it.length }
    println(result)
}