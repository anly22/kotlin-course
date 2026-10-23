package lessons.lesson14.homework

// Класс Shelf (Полка Стеллажа)
//Характеристики:
//Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//Список предметов (items): хранит названия предметов на полке.
//Методы:
//Добавление Предмета (addItem):
//Принимает название предмета.
//Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
//Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.
//Удаление Предмета (removeItem):
//Принимает название предмета.
//Удаляет предмет, если он найден на полке.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//Проверка Вместимости (canAccommodate):
//Принимает название предмета.
//Определяет, вместится ли предмет на полку.
//Возвращает true, если предмет вместится, и false, если места недостаточно.
//Проверка наличия предмета (containsItem):
//Принимает название предмета
//Возвращает true если такой предмет есть
//Получение списка предметов (getItems):
//Возвращает неизменяемый список предметов

class Shelf(
    val capacity: Int
) {
    private val items = mutableListOf<String>()

    fun addItem(name: String): Boolean {
        if (!canAccommodate(name)) {
            return false
        }

        items.add(name)
        return true
    }

    fun removeItem(name: String): Boolean {
        if (!items.contains(name)) {
            return false
        }

        items.remove(name)
        return true
    }

    fun canAccommodate(name: String): Boolean {
        val currentLength = items.sumOf { it.length }

        return currentLength + name.length <= capacity
    }

    fun containsItem(name: String): Boolean {
        return items.contains(name)
    }

    fun getItems(): List<String> {
        return items.toList()
    }

    fun getRemainingCapacity(): Int {
        return capacity - items.sumOf { it.length }
    }
}