package lessons.lesson04.homework

// Для каждой переменной добавь тип через двоеточие.
// Если в строке обнаружишь ошибку в синтаксисе - закомментируй эту строку и над ней напиши что с ней не так.

val v1: Byte = 42
val v2: Long = 98765432123456789L
val v3: Float = 23.45f
val v4: Double = 0.123456789
val v5: String = "Kotlin & Java"

// Boolean type's value FALSE should be written in lowercase letters
val v6: Boolean = false

val v7: Char = 'c'
val v8: Short = 500
val v9: Long = 4294967296L
val v10: Float = 18.0f
val v11: Double = -0.001
val v12: String = "OpenAI"
val v13: String = "true"
val v14: List<Byte> = listOf(3, 14)
val v15: Char = '9'
val v16: Short = 2048
val v17: Long = 10000000000L
val v18: Set<String> = setOf("OpenAI", "Quantum Computing")
val v19: Float = 5.75f

// String is always in double quotes ("), or it can be Float 1.414f or Double 1.414
val v20: String = "1.414"

val v21: String = "Artificial Intelligence"

// "A" looks like Char 'A', or we can use Array<Any> to keep arrayOf('x', "A")
val v22: Array<Char> = arrayOf('x', 'A')

val v23: String = "Android Studio"
val v24: Char = '@'
val v25: Short = 1024
val v26: Long = 1234567890123L
val v27: Float = 10.01f
val v28: Double = -273.15
val v29: String = "SpaceX"

// Boolean type's value FALSE should be written in lowercase letters
val v30: Boolean = false

val v31: Double = 0.007

// Emodji require String; incorrect double quotes “” from text redactor
val v32: String = "🤯"

val v33: Map<String, Int> = mapOf("true" to 2, "false" to 34)

// ‘’ incorrect quotes from text redactor; '' require 1 symbol, so it should be either String "65535" or Short/Int 65535
val v34: String = "65535"

val v38: String = "Quantum Computing"
val v39: Map<Int, String> = mapOf(2 to "true", 34 to "false")
val v40: Char = 'x'
val v41: Short = 314
val v42: Long = 123456789123456789L
val v43: Float = 6.626f

// Boolean type's value TRUE should be written in lowercase letters
val v44: Boolean = true


//Подбери подходящий тип который будет:
//Хранить букву, на которую указывает палец медиума во время спиритического сеанса.
var letter: Char? = null

//Хранить количество ложек сахара, которые я кладу в одну чашку чая.
var sugarToOneCup: Byte = 2 // can be Int, Short

//Хранить список расходов на доставку еды, чтобы ещё раз убедиться, что готовить было дешевле.
val deliveryExpenses: List<Double> = listOf(12.5, 8.3, 15.7)

//Хранить длину очереди в столовой до миллиардной доли сантиметра.
var queque: Double? = null

//Хранить факт, закрыт ли баг после того, как его просто переименовали в фичу.
var isBugClosed: Boolean = false

//Хранить количество свистков чайника за день.
var number: Short? = 0 // can be Int

//Хранить количество нажатий котом на клавиатуру ноутбука за всё время твоей работы.
var catClicks: Long? = 0

//Хранить количество попыток пересчитать звёзды на небе за всю историю человечества.
var starCountAttempts: Long = 123456789L

//Хранить массу воздуха в спускающем матрасе после нападения кота в долях грамма.
var air: Double? = null

//Хранить словарь «название стартапа → сумму потерь инвесторов».
var startupsToLosses: Map<String, Double> = mapOf(
    "Startup1" to 0.00,
    "Startup2" to 10208776.80
)

//Хранить строку «починилось само», чтобы закрывать тикеты без лишних слов.
val commentToCloseTicket: String = "починилось само"

//Хранить список тем для митингов, которые на самом деле никому не нужны.
var meetingTopicsList: List<String>? = null // listOf("Topic1", "Topic2")