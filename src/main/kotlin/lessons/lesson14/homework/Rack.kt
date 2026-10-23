package lessons.lesson14.homework

// Класс Rack (Стеллаж)
//Характеристики:
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.
//Методы:
//Добавление Полки (addShelf):
//Добавляет новую полку в стеллаж.
//Возвращает true, если полка была успешно добавлена или false если стеллаж уже заполнен или была попытка добавить полку которая уже установлена.
//Удаление Полки (removeShelf):
//Принимает индекс полки для удаления.
//Удаляет полку по указанному индексу.
//Возвращает список предметов полки, если полка была успешно удалена или пустой список если полка не существует.
//Добавление Предмета (addItem):
//Добавляет предмет на первую свободную полку.
//Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.
//Удаление Предмета (removeItem):
//Находит и удаляет только один предмет с любой полки.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.
//Проверка наличия предмета на стеллаже (containsItem):
//Возвращает true если предмет есть на одной из полок
//Получение списка полок (getShelves):
//Возвращает неизменяемый список полок
//Печать Содержимого (printContents):
//Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся вместимость, список предметов. Информацию выводить в наглядном читаемом виде
//Сложное удаление полки (advancedRemoveShelf):
//Принимает индекс полки для удаления
//Перераспределяет предметы по имеющимся полкам, начиная с самых длинных. Если очередной предмет никуда не вмещается, его нужно пропустить и попробовать разместить следующий.
//Удаляет полку с оставшимися предметами
//Возвращает неизменяемый список предметов, которые не удалось удалить или пустой список если полки с таким индексом нет.

class Rack(
    private val maxShelves: Int
) {
    private val shelves = mutableListOf<Shelf>()

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves) {
            return false
        }

        if (shelves.contains(shelf)) {
            return false
        }

        shelves.add(shelf)
        return true
    }

    fun removeShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }

        val items = shelves[index].getItems()
        shelves.removeAt(index)

        return items
    }

    fun addItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(name)) {
                return true
            }
        }

        return false
    }

    fun removeItem(name: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(name)) {
                return true
            }
        }

        return false
    }

    fun containsItem(name: String): Boolean {
        return shelves.any { it.containsItem(name) }
    }

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

    fun printContents() {
        for (index in shelves.indices) {
            val shelf = shelves[index]

            println("Полка №${index + 1}")
            println("Вместимость: ${shelf.capacity}")
            println("Свободно: ${shelf.getRemainingCapacity()}")
            println("Предметы: ${shelf.getItems().joinToString()}")
            println()
        }
    }

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices) {
            return emptyList()
        }

        val shelfToRemove = shelves[index]

        val otherShelves = shelves
            .filterIndexed { shelfIndex, _ -> shelfIndex != index }
            .sortedByDescending { it.getRemainingCapacity() }

        val notMovedItems = mutableListOf<String>()

        for (item in shelfToRemove.getItems()) {
            val targetShelf = otherShelves.firstOrNull {
                it.canAccommodate(item)
            }

            if (targetShelf != null) {
                targetShelf.addItem(item)
            } else {
                notMovedItems.add(item)
            }
        }

        shelves.removeAt(index)

        return notMovedItems.toList()
    }
}