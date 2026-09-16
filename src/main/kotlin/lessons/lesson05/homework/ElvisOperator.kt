package lessons.lesson05.homework

/*
---------------------------
Задачи с оператором элвиса
---------------------------
Для заданий по оператору элвиса создай Котлин файл ElvisOperator.
В файле создай функцию main() и последовательно напиши код решения всех заданий так, чтобы получалось решение поставленной задачи.
 В случае затруднений в нахождении решений посмотри на частичную реализацию в общих рекомендациях.
 Так же в решениях можно посмотреть пример полного решения.

Задача 1
Контекст: Вы изучаете физическое явление затухания звука в помещении.
 У вас есть измеренное значение начальной интенсивности звука, но из-за ограничений оборудования
 данные о коэффициенте затухания иногда могут быть неизвестны.
 Задача: Рассчитать предполагаемую интенсивность звука после затухания.
 Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
 Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.
*/

fun printSoundIntensity(startSoundIntensity: Double, soundIntensityCoefficient: Double?) {
    val defaultCoefficient: Double = 0.5
    val coefficient = soundIntensityCoefficient ?: defaultCoefficient
    val endSoundIntensity = startSoundIntensity * coefficient
    println("Final sound intensity is $endSoundIntensity")
}

/*
Задача 2
Контекст: Клиент оплачивает доставку груза. К
 стоимости доставки добавляется страховка на груз,
 которая составляет 0,5% от его стоимости.
 В случае, если стоимость не указана, то берётся стандартная стоимость в $50
Задача: Рассчитать полную стоимость доставки.
*/

fun printCalculatedDeliveryWithInsurance(delivery: Double, cost: Double?): Unit {
    val defaultCost: Double = 50.0
    val insurance: Double = 0.5 * (cost ?: defaultCost)
    val delivery = delivery + insurance
    println("Delivery cost (insurance included): $delivery")
}

/*
 Задача 3
 Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
 которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
 Задача - сообщить об ошибке в случае отсутствия показаний атмосферного давления.
*/

fun printPressureIsMissing(pressure: Double?) {
    val missing: String = "Pressure is missing"
    println(pressure ?: missing)
}

fun main() {
    printSoundIntensity(30.0, 2.5)
    printCalculatedDeliveryWithInsurance(5.0, null)
    printPressureIsMissing(null)
}
