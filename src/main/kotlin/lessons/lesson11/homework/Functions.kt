package  lessons.lesson11.homework

//----------------------------
// Задачи на сигнатуру метода
//----------------------------
//Напишите сигнатуру метода в которую входит модификатор доступа, название функции, список аргументов с типами
// и возвращаемое значение. В теле метода можешь сделать возврат объекта нужного типа если это требуется для устранения ошибок.
//
//1. Не принимает аргументов и не возвращает значения.
public fun noArgsNoReturn() {
    println("Done")
}

//2. Принимает два целых числа и возвращает их сумму.
public fun sum(a: Int, b: Int): Int = a + b

//3. Принимает строку и ничего не возвращает.
public fun stringArg(s: String) {
    println(s)
}

//4. Принимает список целых чисел и возвращает среднее значение типа Double.
public fun avg(l: List<Int>): Double {
    if (l.isEmpty()) return 0.0

    var sum = 0
    var i = 0

    while (i < l.size) {
        sum += l[i++]
    }

    return sum.toDouble() / l.size
}

//5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
private fun getStringLength(s: String?): Int? {
    return s?.length
}

//6. Не принимает аргументов и возвращает nullable вещественное число.
public fun noArgs(): Double? {
    return null
}

//7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
private fun nullableArgs(intList: List<Int>?) {
    println(intList)
}

//8. Принимает целое число и возвращает nullable строку.
public fun intArg(n: Int): String? {
    return n.toString()
}

// 9. Не принимает аргументов и возвращает список nullable строк.
public fun getNullableStrings(): List<String?> {
    return listOf("Kotlin", null, "Java")
}

// 10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
public fun compareLength(s: String?, n: Int?): Boolean? {
    if (s == null || n == null) return null
    return s.length == n
}

//--------------------------
// Задачи на написание кода
//--------------------------
//Напишите валидную сигнатуру метода а так же рабочий код для задач.
//
//1. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
public fun multiplyByTwo(n: Int): Int = n * 2

//2. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
public fun isEven(n: Int): Boolean {
    return n % 2 == 0
}

//3. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
// Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
public fun printNumbersUntil(n: Int) {
    if (n < 1) return
    var counter = 1
    while (counter <= n) println(counter++)
}

//4. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
// Если отрицательных чисел нет, функция должна вернуть null.
public fun findFirstNegative(intList: List<Int>): Int? {
    for (i in intList) {
        if (i < 0) return i
    }
    return null
}

//5. Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
// Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
public fun processList(stringList: List<String?>) {
    for (string in stringList) {
        if (string == null) return
        println(string)
    }
}

fun main() {
    // 11. multiplyByTwo
    println("11: ${multiplyByTwo(4)}")

    // 12. isEven
    println("12: ${isEven(7)}")

    // 13. printNumbersUntil
    println("13:")
    printNumbersUntil(3)

    // 14. findFirstNegative
    println("14: ${findFirstNegative(listOf(4, 0, -5, -2))}")

    // 15. processList
    println("15:")
    processList(listOf("Hello", "Kotlin", null, "Java"))
}