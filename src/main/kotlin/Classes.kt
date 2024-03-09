

fun main(){
//    val p2 = Person("Pavel", "Shitov", 28)
//    val p1 = Person("Nizami", "Alekperov", 19, p2)
//    val p3 = Person()

    val r1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${r1.perimeter}")

    val r2 = Rectangle(5.0, 2.0)
    println(r1 == r2)

}

//ключевое слово data
//класс прямоугольник
data class Rectangle(var height: Double, var lenght: Double){
    var perimeter = (height + lenght) * 2

    var test = 1
        get() = field + 1// field тоже самое что и this.поле
        set(value){
            if (value < 0) println("negative value")
            field = value
        }

    fun area() = height * lenght
}




//первичный конструктор
class Person(val firstName: String, val lastName: String, var age: Int){
    var children: MutableList<Person> = mutableListOf() // ArrayList

    init {
        println("Person is created $firstName")
    }

    //вторичный конструктор - все остальные конструкторы , которые нужны для создания объекта
    // всегда должен вызывать в себе первичный конструктор

    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age){
        children.add(child)
    }

    //конструктор без аргументов
    constructor(): this("", "", -1)
}


