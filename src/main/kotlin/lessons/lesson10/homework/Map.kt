package  lessons.lesson10.homework

//------------------------------
// Задачи на работу со словарём
//------------------------------
fun main() {

// 1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val emptyMap: Map<Int, Int> = mapOf()

// 2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map1: Map<Float, Double> = mapOf(1.1f to 1.1, 2.2f to 2.2)

// 3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "one", 2 to "two")

// 4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    mutableMap[3] = "three"

// 5. Используя словарь из предыдущего задания, извлеките значение, используя ключ.
//Попробуй получить значение с ключом, которого в словаре нет.
    println(mutableMap[3])
    println(mutableMap[5])

// 6. Удалите определенный элемент из изменяемого словаря по его ключу.
    mutableMap.remove(1)

//7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение.
// Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val map2: Map<Double, Int> = mapOf(0.0 to 0, 1.1 to 1, 2.2 to 2, 3.3 to 3)
    for ((key, value) in map2) {
        if (value == 0) {
            println("бесконечность")
        } else {
            println(key / value)
        }
    }

// 8. Измените значение для существующего ключа в изменяемом словаре.
    mutableMap[3] = "THREE"
    println(mutableMap[3])

// 9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val first = mapOf(1 to "one", 2 to "two")
    val second = mapOf(2 to "TWO", 3 to "three", 4 to "four")
    val third: MutableMap<Int, String> = mutableMapOf()
    for ((key, value) in first) {
        third[key] = value
    }
    for ((key, value) in second) {
        third[key] = value
    }

// 10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val mutableMap1 = mutableMapOf("first" to listOf(1, 2, 3), "second" to listOf(11, 12, 13))
    val thirdValue = listOf(21, 22, 23)
    mutableMap1["third"] = thirdValue

// 11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк. Добавь данные в словарь.
// Получи значение по ключу (это должно быть множество строк) и добавь в это множество ещё строку. Распечатай полученное множество.
    val map3: MutableMap<Int, MutableSet<String>> = mutableMapOf()
    map3[1] = mutableSetOf("one", "two")
    map3[2] = mutableSetOf("one", "two", "three")

    val requiredValue = map3[2]
    requiredValue?.add("five")
    map3[2]?.add("six")

    println(requiredValue)

// 12. Создай словарь, где ключами будут пары чисел. Через перебор найди значение у которого пара будет содержать цифру 5
// в качестве первого или второго значения.
    val pairsMap: Map<Pair<Int, Int>, String> = mapOf(
        (1 to 2) to "first",
        (5 to 3) to "second",
        (4 to 5) to "third",
        (7 to 8) to "fourth"
    )

    for ((pair, value) in pairsMap) {
        if (pair.first == 5 || pair.second == 5) {
            println(value)
        }
    }

//------------------------------------------------
// Задачи на подбор оптимального типа для словаря
//------------------------------------------------
// Словарь библиотеки: автор -> список книг
    val library: MutableMap<String, MutableList<String>> = mutableMapOf(
        "Толстой" to mutableListOf("Война и мир", "Анна Каренина"),
        "Булгаков" to mutableListOf("Мастер и Маргарита")
    )

// Справочник растений: тип растения -> список названий
    val plants: MutableMap<String, List<String>> = mutableMapOf(
        "Цветы" to listOf("Роза", "Тюльпан"),
        "Деревья" to listOf("Дуб", "Берёза")
    )

// Четвертьфинала: команда -> множество игроков
    val quarterfinal: Map<String, Set<String>> = mapOf(
        "Команда A" to setOf("Иван", "Пётр"),
        "Команда B" to setOf("Анна", "Мария")
    )

// Курс лечения: дата -> множество препаратов
    val treatment: MutableMap<String, Set<String>> = mutableMapOf(
        "2026-10-11" to setOf("Препарат A", "Препарат B"),
        "2026-10-12" to setOf("Препарат A")
    )

// Словарь путешественника: страна -> город -> список мест
    val travelDict: MutableMap<String, MutableMap<String, MutableList<String>>> =
        mutableMapOf(
            "Италия" to mutableMapOf(
                "Рим" to mutableListOf("Колизей", "Фонтан Треви"),
                "Венеция" to mutableListOf("Гранд-канал", "Площадь Сан-Марко")
            )
        )
}