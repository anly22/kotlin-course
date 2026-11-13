package lessons.lesson19.homework

/*
Напиши класс ListHolder, который будет хранить список элементов типа T и иметь метод для добавления нового элемента
и получения всех элементов в виде неизменяемого списка.
*/

class ListHolder<T> {

    private val elements = mutableListOf<T>()

    fun add(element: T) {
        elements.add(element)
    }

    fun getAll(): List<T> {
        return elements.toList()
    }
}