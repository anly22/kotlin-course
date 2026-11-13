package lessons.lesson19.homework

/*
Напиши интерфейс Validator с дженериком с функцией валидации, которая будет принимать элемент с типом дженерика
 и возвращать булево значение.
 */
interface Validator<T> {

    fun validate(element: T): Boolean
}

/*
Создай класс StringValidator и имплементируй интерфейс Validator с типом String?.
 Реализуй проверку, что строка не является null, не пустая и не состоит из одних пробелов.
 */

class StringValidator : Validator<String?> {

    override fun validate(element: String?): Boolean {
        return !element.isNullOrBlank()
    }
}

/*
Создай класс OddValidator и имплементируй интерфейс Validator типизированный по Int.
 Реализуй проверку, что число чётное.
 */

class OddValidator : Validator<Int> {

    override fun validate(element: Int): Boolean {
        return element % 2 == 0
    }
}

/*
Создай класс ListValidator с дженериком, ограниченным типом Number, имплементируй интерфейс Validator
типизированный по типу List с nullable типом дженерика класса
Реализуй проверку:
Ни один элемент списка не является null
Ни один элемент приведённый к типу Double не равен 0.0
 */

class ListValidator<T : Number> : Validator<List<T?>> {

    override fun validate(element: List<T?>): Boolean {
        return element.all {
            it != null && it.toDouble() != 0.0
        }
    }
}