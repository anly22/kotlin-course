package lessons.lesson06.homework

//Задание 1: "Определение сезона"
//Напишите функцию, которая на основе номера месяца распечатывает сезон года. Номера месяцев начинаются с единицы.
fun detectSeason(month: Int) {
    val result: String = when (month) {
        1, 2, 12 -> "winter"
        in 3..5 -> "spring"
        in 6..8 -> "summer"
        in 9..11 -> "autumn"
        else -> "invalid month number given"
    }
    println("Task 1: $result")
}

//Задание 2: "Расчет возраста питомца"
//Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
// До 2 лет каждый год собаки равен 10.5 человеческим годам,
// после - каждый год равен 4 человеческим годам. Результат распечатай в консоль.

fun convertDogAgeToHuman(dogAge: Int) {
    val result: Any = when (dogAge) {
        0 -> 0.0f
        1 -> 10.5f
        2 -> 10.5f * 2
        in 3..20 -> 10.5f * 2 + 4 * (dogAge - 2)
        else -> "Invalid dog age given"
    }
    println("Task 2: $result")
}

//Задание 3: "Определение способа перемещения"
//Напишите функцию, которая печатает в консоль, какой способ перемещения лучше использовать, исходя из длины маршрута.
// Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".
fun chooseTransport(pathLength: Float) {
    val result: String = when {
        pathLength in 0.0f..0.9f -> "пешком"
        pathLength in 1.0f..4.9f -> "велосипед"
        pathLength > 5.0f -> "автотранспорт"
        else -> "Invalid path length given"
    }
    println("Task 3: $result")
}

//Задание 4: "Расчет бонусных баллов"
//Клиенты интернет-магазина получают бонусные баллы за покупки.
// Напишите функцию, которая принимает сумму покупки и печатает в консоль количество бонусных баллов:
// 2 балла за каждые 100 рублей при сумме покупки до 1000 рублей и 3 балла за каждые 100 рублей при сумме свыше этого.
fun calculateBonus(order: Double) {
    val result: String = when {
        order < 0.0 -> "Invalid order given"
        order <= 999.99 -> {
            val points = (order / 100).toInt() * 2
            "$points"
        }

        else -> {
            val points = 20 + ((order - 1000.0) / 100).toInt() * 3
            "$points"
        }
    }
    println("Task 4: $result")
}

//Задание 5: "Определение типа документа"
//В системе хранения документов каждый файл имеет расширение. Напишите функцию, которая на основе расширения файла
// печатает в консоль его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".
fun defineFileType(extension: String) {
    val result: String = when (extension) {
        "jpg", "jpeg", "png" -> "Изображение"
        "doc", "docx", "txt" -> "Текстовый документ"
        "xls", "xlsx" -> "Таблица"
        else -> "Неизвестный тип"
    }
    println("Task 5: $result")
}

//Задание 6: "Конвертация температуры"
//Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот
// в зависимости от указанной единицы измерения (C/F). Единицу измерения нужно передать вторым аргументом функции.
// Несколько аргументов передаются через запятую. Распечатай в консоль результат конвертации с добавлением единицы измерения.
// Чтобы добавить единицу измерения после результата используй функцию печати без переноса строки print("C") или print("F").
fun convertTemperature(temperature: Double, scale: Char) {
    if (scale == 'C') {
        // Конвертируем из Цельсия в Фаренгейты
        val result = (temperature * 9 / 5) + 32
        print("Task 6: $result")
        println("F")
    } else if (scale == 'F') {
        // Конвертируем из Фаренгейтов в Цельсии
        val result = (temperature - 32) * 5 / 9
        print("Task 6: $result")
        println("C")
    } else {
        println("Task 6: Неверная единица измерения. Используйте 'C' или 'F'.")
    }
}

//Задание 7: "Подбор одежды по погоде"
//Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка" при температуре ниже +10,
// "ветровка" от +10 до +18 градусов включительно и "футболка и шорты" при температуре выше +18 градусов.
// При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.
fun defineClothesByTemperature(temperature: Int) {
    val result: String = when {
        temperature in 9 downTo -30 -> "куртка и шапка"
        temperature in 10..18 -> "ветровка"
        temperature in 19 until 35 -> "футболка и шорты"
        temperature < -30 || temperature > 35 -> "остаться дома"
        else -> "Invalid temperature"
    }
    println("Task 7: $result")
}

//Задание 8: "Выбор фильма по возрасту"
//Кинотеатр предлагает фильмы разных возрастных категорий. Напишите функцию, которая принимает возраст зрителя
// и возвращает доступные для него категории фильмов: "детские" (от 0 до 9), "подростковые" (от 10 до 18), "18+" для остальных.
fun defineAvailableMovieCategoryByAge(age: Int) {
    val result: String = when {
        age in 0..9 -> "детские"
        age in 10..17 -> "подростковые"
        age >= 18 -> "18+"
        else -> "Invalid age"
    }
    println("Task 8: $result")
}

fun main() {
    detectSeason(5)
    convertDogAgeToHuman(3)
    chooseTransport(1.5f)
    calculateBonus(1450.00)
    defineFileType("pdf")
    convertTemperature(35.5, 'C')
    defineClothesByTemperature(0)
    defineAvailableMovieCategoryByAge(13)
}