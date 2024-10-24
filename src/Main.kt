fun main() {

    //Задача 1
    print("Ответ к задаче 1: ")
    print('1')
    print(1)
    print(1.0)

    //Задача 2
    val person1 = Person("Иван", +79123456789)
    val person2 = Person("Дмитрий", "+79123456789")
    println("Ответ к задаче 2:")
    println("Person: name = ${person1.name}, phone = ${person1.phone}")
    println("Person: name = ${person2.name}, phone = ${person2.phone}")

    //Задача 3
    val a = 10
    val b = "Hello"
    val c = listOf(10, 16, 3)
    val d = 'f'
    println("Ответ к задаче 3: ")
    printWrapped(a, '{')
    printWrapped(b, '[')
    printWrapped(c, '"')
    printWrapped(d, '(')
}

fun <T> print(value: T) {
    println(value)
}

data class Person<T>(val name: String, val phone: T)

fun <T> printWrapped(value: T, char: Char) {
    println(when (char) {
        '{', '}' -> "{$value}"
        '[', ']' -> "[$value]"
        '(', ')' -> "($value)"
        else -> "$char$value$char"
    })
}