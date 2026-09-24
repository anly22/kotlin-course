package lessons.lesson07.homework

fun main() {
    printMultiplicationTable(10, 10)
    sum(32)
    factorial(12)
    sumEven(15)
    printRectangle(3, 5)
    sumEvenAndOdd(12)
}

// 1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.
fun printMultiplicationTable(lines: Int, columns: Int) {
    println("Task 1:")

    var lineCounter = 1

    while (lineCounter <= lines) {
        var columnCounter = 1

        while (columnCounter <= columns) {
            print(columnCounter * lineCounter)
            print(" ")
            ++columnCounter
        }
        ++lineCounter
        println()
    }
}

// 2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
fun sum(arg: Int) {
    var res: Int = 0
    for (i in 1..arg) {
        res += i
    }
    println("Task 2: $res")
}

// 3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
fun factorial(arg: Int) {
    var counter = 1
    var res: Int = 1

    while (counter <= arg) {
        res *= counter++
    }
    println("Task 3: $res")
}

// 4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
fun sumEven(arg: Int) {
    var counter = 2
    var res: Int = 0

    while (counter <= arg) {
        if (counter % 2 != 0) {
            ++counter
            continue
        } else {
            res += counter++
        }
    }
    println("Task 4: $res")
}

// 5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
fun printRectangle(lines: Int, columns: Int) {
    println("Task 5:")

    var lineCounter = 1

    while (lineCounter++ <= lines) {
        var columnCounter = 1

        while (columnCounter <= columns) {
            print("*")
            ++columnCounter
        }
        println()
    }
}

// 6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
fun sumEvenAndOdd(arg: Int) {
    var resEven: Int = 0
    var resOdd: Int = 0

    for (i in 1..arg) {
        if (i % 2 == 0) {
            resEven += i
        } else {
            resOdd += i
        }
    }

    println("Task 6: Even numbers sum $resEven, Odd numbers sum $resOdd")
}
