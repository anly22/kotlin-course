package lessons.lesson16.homework

abstract class Printer {
    abstract fun print(text: String)
}

class LaserPrinter : Printer() {

    override fun print(text: String) {
        val words = text.trim().split(Regex("\\s+"))

        for (word in words) {
            println("\u001B[30;47m$word\u001B[0m")
        }
    }
}

class InkjetPrinter : Printer() {

    private val colorPairs = listOf(
        "\u001B[31;43m", // красный текст, жёлтый фон
        "\u001B[34;42m", // синий текст, зелёный фон
        "\u001B[35;46m", // фиолетовый текст, голубой фон
        "\u001B[30;45m", // чёрный текст, фиолетовый фон
        "\u001B[33;44m"  // жёлтый текст, синий фон
    )

    override fun print(text: String) {
        val words = text.trim().split(Regex("\\s+"))

        for ((index, word) in words.withIndex()) {
            val color = colorPairs[index % colorPairs.size]

            println("$color$word\u001B[0m")
        }
    }
}

fun main() {
    val text = """
        Kotlin is a modern programming language.
        It supports object oriented programming and functional programming.
        We are learning inheritance polymorphism and method overriding.
    """.trimIndent()

    val printers: List<Printer> = listOf(
        LaserPrinter(),
        InkjetPrinter()
    )

    for (printer in printers) {
        println("\nPrinting with ${printer::class.simpleName}:")
        printer.print(text)
    }
}