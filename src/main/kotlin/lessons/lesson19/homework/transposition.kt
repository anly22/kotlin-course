package lessons.lesson19.homework

/*
Создай функцию transposition с двумя дженериками, которая принимает словарь с дженериками и возвращает словарь,
 в котором ключ и значения поменялись местами.
 */

fun <K, V> transposition(map: Map<K, V>): Map<V, K> {
    return map.map { (key, value) -> value to key }.toMap()
}