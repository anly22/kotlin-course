package lessons.lesson08.homework

//1.Преобразование строк
//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования,
// делая текст более ироничным или забавным. Функция должна уметь распознавать ключевые слова или условия
// и соответственно изменять фразу.
//Правила проверки и преобразования:
//Если фраза содержит слово "невозможно":
//Преобразование: Замените "невозможно" на "совершенно точно возможно, просто требует времени".
//Если фраза начинается с "Я не уверен":
//Преобразование: Добавьте в конец фразы ", но моя интуиция говорит об обратном".
//Если фраза содержит слово "катастрофа":
//Преобразование: Замените "катастрофа" на "интересное событие".
//Если фраза заканчивается на "без проблем":
//Преобразование: Замените "без проблем" на "с парой интересных вызовов на пути".
//Если фраза содержит только одно слово:
//Преобразование: Добавьте перед словом "Иногда," и после слова ", но не всегда".

fun textProcessing(text: String) {
    var processedText: String
    if (text.contains("невозможно")) {
        processedText = text.replace("невозможно", "совершенно точно возможно, просто требует времени")
        println(processedText)
    } else if (text.startsWith("Я не уверен")) {
        processedText = "$text, но моя интуиция говорит об обратном"
        println(processedText)
    } else if (text.contains("катастрофа")) {
        processedText = text.replace("катастрофа", "интересное событие")
        println(processedText)
    } else if (text.endsWith("без проблем")) {
        processedText = text.replace("без проблем", "с парой интересных вызовов на пути")
        println(processedText)
    } else if (!(text.trim()).contains(" ")) {
        processedText = "Иногда, ${text.lowercase()}, но не всегда"
        println(processedText)
    }
}

//2. Извлечение даты из строки лога
//У вас есть строка лога, например "Пользователь вошел в систему -> 2021-12-01 09:48:23"
// (данные могут быть любыми, но формат всегда такой).
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.
// Используй indexOf или split для получения правой части сообщения.
fun logProcessing(text: String) {
    val delimiterIndex = text.indexOf("->")
    val dateTime = text.substring(delimiterIndex + 2).trim()
    val dateAndTime = dateTime.split(" ")

    println(dateAndTime[0])
    println(dateAndTime[1])
}

//3. Маскирование личных данных
//Дана строка с номером кредитной карты, например "4539 1488 0343 6467".
// Замаскируйте все цифры, кроме последних четырех, символами "*".
fun hideCardNumber(cardNumber: String) {
    println("**** **** **** ${cardNumber.trim().substring(15)}")
}

fun hideCardNumber2(cardNumber: String) {
    val number = cardNumber.replace(" ", "")
    println("**** **** **** ${number.takeLast(4)}")
}

//4. Форматирование адреса электронной почты.
//У вас есть электронный адрес, например "username@example.com".
// Преобразуйте его в строку "username [at] example [dot] com", используя функцию replace()
fun emailProcessor(email: String) {
    println(email.replace("@", " [at] ").replace(".", " [dot] "))
}

//5. Извлечение имени файла из пути.
//Дан путь к файлу, например "C:/Пользователи/Документы/report.txt" или "D:/good.themes/dracula.theme" (может быть любым).
// Извлеките название файла с расширением.
fun filenameRetriever(path: String) {
    val pathParts = path.split("/")
    println(pathParts[pathParts.size - 1]) // or println(path.split("/").last())
}


//6. Создание аббревиатуры из фразы.
//У вас есть фраза, например "Котлин лучший язык программирования" (может быть любой с разделителями слов - пробел).
// Создайте аббревиатуру из начальных букв слов (например, "ООП").
// Используйте split. Используйте for для перебора слов. Используйте var переменную для накопления первых букв.
fun abbreviation(text: String) {
    val words = text.trim().split(" ")
    var result = ""

    for (i in 0..words.size - 1) {
        result += words[i][0].uppercase()
    }

    println(result)
}


fun main() {
    println("Task 1:")
    textProcessing("Это невозможно выполнить за один день")
    textProcessing("Я не уверен в успехе этого проекта")
    textProcessing("Произошла катастрофа на сервере")
    textProcessing("Этот код работает без проблем")
    textProcessing("Удача")

    println("Task 2:")
    logProcessing("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    println("Task 3:")
    hideCardNumber("4539 1488 0343 6467")
    hideCardNumber2("4539 1488 0343 6467")

    println("Task 4:")
    emailProcessor("username@example.com")

    println("Task 5:")
    filenameRetriever("C:/Пользователи/Документы/report.txt")
    filenameRetriever("D:/good.themes/dracula.theme")

    println("Task 6:")
    abbreviation("Котлин лучший язык программирования")
}
