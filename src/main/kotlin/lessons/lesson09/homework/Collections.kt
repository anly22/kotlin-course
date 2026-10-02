package lessons.lesson09.homework

fun main() {
    createArray()
    createNullableArray()
    copyArray()
    createArrayFromTwoArrays()
    findElementInArray()
    analyzeArrayElements()
    findStringInArray(arrayOf("Kotlin", "Python", "Typescript", "Javascript"), "script")

    addToMutableList(mutableListOf(1, 2, 3, 4, 5))
    removeFromMutableList(mutableListOf("Hello", "World", "Kotlin"))
    printListElements(listOf(1, 2, 5, 4, 10))
    extractElementByIndex(listOf("Hello", "World", "Kotlin"))
    updateList(mutableListOf(1, 2, 3, 4, 5), 2, 100)
    combineLists(listOf("Hello", "Kotlin"), listOf("Java", "Python"))
    findMinMax(listOf(10, 5, 20, 3, 15))
    extractEvenNumbers(listOf(1, 2, 3, 4, 5, 6))

    addToSet(mutableSetOf("Kotlin", "Java", "Scala"))
    removeFromSet(mutableSetOf(1, 2, 3, 4))
    printSetElements()
    checkStringInSet(setOf("Kotlin", "Java", "Scala"), "Python")
    convertSetToMutableList()
}

//--------------------------
//Работа с массивами Array
//--------------------------
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)

//Создайте пустой массив строк размером 10 элементов.
val emptyArray = Array(10) { "" }

//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
val doubleArray = doubleArrayOf(0.0, 1.1, 2.2)

//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение,
// равное его индексу, умноженному на 3.
fun createArray() {
    val array = Array(5) { 0 }
    for (i in array.indices) {
        array[i] = i * 3
    }
    println(array.contentToString())
}

//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
fun createNullableArray() {
    val emptyNullableArray = arrayOfNulls<String>(3)
    emptyNullableArray[1] = "Hello"
    emptyNullableArray[2] = "Kotlin"

    println(emptyNullableArray.contentToString())
}

//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
fun copyArray() {
    val numbersFirst: Array<Int> = arrayOf(1, 2, 3)
    val numbersSecond = Array(numbersFirst.size) { 0 }
    for (n in numbersFirst.indices) {
        numbersSecond[n] = numbersFirst[n]
    }
    println("${numbersFirst.contentToString()}, ${numbersSecond.contentToString()}")
}

//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
fun createArrayFromTwoArrays() {
    val numbersFirst: Array<Int> = arrayOf(10, 20, 30)
    val numbersSecond: Array<Int> = arrayOf(5, 11, 33)

    val numbersThird = Array(numbersFirst.size) { 0 }
    for (n in numbersFirst.indices) {
        numbersThird[n] = numbersFirst[n] - numbersSecond[n]
    }
    println("${numbersFirst.contentToString()}, ${numbersSecond.contentToString()}, ${numbersThird.contentToString()}")
}

//Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1.
// Реши задачу через цикл while.
fun findElementInArray() {
    val numbers: Array<Int> = arrayOf(10, 20, 30)
    var i = 0
    var index = -1

    while (i < numbers.size) {
        if (numbers[i] == 5) {
            index = i
            break
        }
        i++
    }

    println(index)
}

//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
// Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
fun analyzeArrayElements() {
    val numbers: Array<Int> = arrayOf(10, 21, 32, 54, 10)
    var i = 0

    while (i < numbers.size) {
        if (numbers[i] % 2 == 0) {
            println("${numbers[i]} - чётное")
        } else {
            println("${numbers[i]} - нечётное")
        }
        i++
    }
}

//Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент,
// в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun findStringInArray(stringArray: Array<String>, targetString: String) {
    var i = 0
    while (i < stringArray.size) {
        if (stringArray[i].contains(targetString)) println(stringArray[i])
        i++
    }
}

//--------------------------
//Работа со списками List
//--------------------------
//Создайте пустой неизменяемый список целых чисел.
val intList: List<Int> = listOf(1, 3, 5, 5)

//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
val stringList: List<String> = listOf("Hello", "World", "Kotlin")

//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
val mutableIntList: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
fun addToMutableList(mutableList: MutableList<Int>) {
    mutableList.add(6)
    mutableList.add(7)
    mutableList.add(8)

    println(mutableList)
}

//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
fun removeFromMutableList(mutableList: MutableList<String>) {
    for (i in mutableList.indices.reversed()) {
        if (mutableList[i] == "World") {
            mutableList.removeAt(i)
        }
    }

    println(mutableList)
}

//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printListElements(intList: List<Int>) {
    var i = 0
    while (i < intList.size) {
        println(intList[i++])
    }
}

//Создайте список строк и получите из него второй элемент, используя его индекс.
fun extractElementByIndex(stringList: List<String>) {
    println(stringList[1])
}

//Имея изменяемый список чисел, измените значение элемента на определенной позиции
// (например, замените элемент с индексом 2 на новое значение).
fun updateList(intList: MutableList<Int>, position: Int, newValue: Int) {
    if (position < intList.size) {
        intList[position] = newValue
    }

    println(intList)
}

//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков.
// Реши задачу с помощью циклов.
fun combineLists(firstList: List<String>, secondList: List<String>) {
    val resultList = mutableListOf<String>()

    for (element in firstList) {
        resultList.add(element)
    }

    for (element in secondList) {
        resultList.add(element)
    }

    println(resultList)
}

//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
fun findMinMax(numbers: List<Int>) {
    var min = numbers[0]
    var max = numbers[0]

    for (number in numbers) {
        if (number < min) min = number
        if (number > max) max = number
    }

    println("Min: $min")
    println("Max: $max")
}

//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
fun extractEvenNumbers(numbers: List<Int>) {
    val evenNumbers = mutableListOf<Int>()

    for (number in numbers) {
        if (number % 2 == 0) {
            evenNumbers.add(number)
        }
    }

    println(evenNumbers)
}

//--------------------------
// Работа с Множествами Set
//--------------------------
//Создайте пустое неизменяемое множество целых чисел.
val emptyIntSet: Set<Int> = emptySet()

//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
val intSet: Set<Int> = setOf(1, 2, 3)

//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
val stringSet: MutableSet<String> = mutableSetOf("Kotlin", "Java", "Scala")

//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
fun addToSet(stringSet: MutableSet<String>) {
    stringSet.add("Swift")
    stringSet.add("Go")

    println(stringSet)
}

//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
fun removeFromSet(intSet: MutableSet<Int>) {
    intSet.remove(2)

    println(intSet)
}

//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
fun printSetElements() {
    val numbersSet: Set<Int> = setOf(10, 20, 30, 40)

    for (number in numbersSet) {
        println(number)
    }
}

//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
// Нужно распечатать булево значение true если строка есть. Реши задачу через цикл.
fun checkStringInSet(stringSet: Set<String>, target: String) {
    var isFound = false

    for (element in stringSet) {
        if (element == target) {
            isFound = true
            break
        }
    }

    println(isFound)
}

// Создайте неизменяемое множество строк и конвертируйте его
// в изменяемый список строк с использованием цикла.
fun convertSetToMutableList() {
    val originalSet: Set<String> = setOf("Kotlin", "Java", "Scala")
    val stringList = mutableListOf<String>()

    for (element in originalSet) {
        stringList.add(element)
    }

    println(stringList)
}
