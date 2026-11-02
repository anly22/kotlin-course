package lessons.lesson16.homework

enum class LogLevel {
    INFO,
    WARNING,
    ERROR,
    DEBUG
}

class Logger {

    // Обычное сообщение INFO
    fun log(message: String) {
        println("[INFO] $message")
    }

    // Сообщение с указанным уровнем
    fun log(level: LogLevel, message: String) {
        when (level) {
            LogLevel.INFO -> {
                println("[INFO] $message")
            }

            LogLevel.WARNING -> {
                println("\u001B[33m[WARNING] $message\u001B[0m")
            }

            LogLevel.ERROR -> {
                println("\u001B[37;41m[ERROR] $message\u001B[0m")
            }

            LogLevel.DEBUG -> {
                println("[DEBUG] $message")
            }
        }
    }

    // Список сообщений с уровнем INFO
    fun log(messages: List<String>) {
        for (message in messages) {
            log(message)
        }
    }

    // Логирование исключения
    fun log(exception: Exception) {
        log(LogLevel.ERROR, exception.message ?: "Unknown error")
    }
}

fun main() {
    val logger = Logger()

    // Обычный INFO
    logger.log("Application started")

    // Разные уровни логирования
    logger.log(LogLevel.WARNING, "Low disk space")
    logger.log(LogLevel.ERROR, "Database connection failed")
    logger.log(LogLevel.DEBUG, "User ID: 123")

    // Список сообщений
    logger.log(
        listOf(
            "User logged in",
            "Page opened",
            "Data loaded successfully"
        )
    )

    // Обработка исключения
    try {
        val result = 10 / 0
        println(result)
    } catch (exception: Exception) {
        logger.log(exception)
    }
}