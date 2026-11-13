package lessons.lesson19.homework

/*
Создай интерфейс Mapper с двумя дженериками, который будет определять методы для преобразования:
элементов одного типа в элементы другого типа
списка элементов одного типа в список элементов другого типа
 */

interface Mapper<T, R> {

    fun map(element: T): R

    fun mapList(elements: List<T>): List<R>
}

/*
Создай класс PhrasesToListOfStrings и имплементируй интефрейс Mapper с типами String и List<String>. Метод преобразования
должен разбивать входящую строку по символу пробела и возвращать список из полученных слов.
 Метод преобразования списков с аналогичной механикой.
 */
class PhrasesToListOfStrings : Mapper<String, List<String>> {

    override fun map(element: String): List<String> {
        return element.trim()
            .split(Regex("\\s+"))
            .filter { it.isNotEmpty() }
    }

    override fun mapList(elements: List<String>): List<List<String>> {
        return elements.map { map(it) }
    }
}