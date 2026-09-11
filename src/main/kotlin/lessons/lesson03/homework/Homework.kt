package lessons.lesson03.homework

// 1. Название мероприятия (неизменяемая публичная переменная известная на момент написания)
val eventName: String = "Hackathon Survival"

// 2. Дата проведения (публичная переменная известная на момент написания, но может быть изменена из-за переноса)
var date: String = "Sep 12, 2026"

// 3. Место проведения
val place: String = "Varna"

// 4. Подробный бюджет мероприятия, включая расходы на оборудование, кейтеринг и другие операционные расходы. (приватная неизменяемая переменная - её не должны увидеть и бюджет уже запланирован и утверждён и не должен изменяться)
private val detailedBudget: String = "Detailed data with a lot of characters"

// 5. Количество участников
var participantsNumber: Int = 0

// 6.Длительность хакатона
val eventDurationHours: Int = 8

// 7. Контактная информация и условия соглашений с поставщиками пищи, оборудования и других услуг.
private val agreement: String = "Contact information and agreement points"

// 8. Текущее состояние хакатона (статус)
var eventStatus: String = "planned"

// 9. Список спонсоров
val sponsors: String = "Sponsor1, Sponsor2, Sponsor3"

// 10. Бюджет мероприятия
private val budget: String = "Event budget"

// 11. Текущий уровень доступа к интернету
lateinit var internetConnectionLevel: String

// 12. Информация о транспортировке оборудования, распределении ресурсов и координации между различными командами поддержки.
private val transportationInfo: String = "Information about transportation, resources and support teams"

// 13. Количество команд
var teamsNumber: Int = 0

// 14. Перечень задач
private val tasks: String = "All tasks"

// 15. План эвакуации
val evacuationPlan: String = "Some plan"

// 16. Список доступного оборудования (всё, что выделено для использования на мероприятии)
val equipmentAvailable: String = "Equipment list"

// 17.Список свободного оборудования (всё, что можно взять прямо сейчас и что не занято другими участниками)
var equipmentFree: String = "Free equipment list"

// 18. График питания участников (зависит от поставщика питания, определяемого за неделю до начала) (публичная изменяемая переменная с отложенной инициализацией, так как на момент создания поставщик и график не известны)
lateinit var mealSchedule: String

// 19. План мероприятий на случай сбоев
private val contingencyPlan: String = "Some contingency plan"

// 20. Список экспертов и жюри
val expertsAndJury: String = "Expert1, Expert2, Expert3"

// 21. Политика конфиденциальности
val privacyPolicy: String = "Privacy Policy"

// 22. Приватные отзывы (фидбэк) участников и зрителей для анализа проблем.
private lateinit var feedback: String

// 23. Текущая температура в помещении
private var temperature: Double = 25.0

// 24. Данные мониторинга и анализ производительности сетевого оборудования и интернет-соединения для целей отладки своих приложений командами
private lateinit var networkMonitoringData: String

// 25. Регулятор скорости интернета (понижающий коэффициент, например 0.5)
private var internetSpeedCoefficient: Double = 0.5

// 26. Уровень освещения
private var lightLevel: Int = 0

// 27. Лог событий мероприятия
private lateinit var eventLog: String

// 28. Возможность получения медицинской помощи прямо на мероприятии (да/нет)
var medicalAssistance: Boolean = true

// 29. Планы и процедуры для обеспечения безопасности мероприятия, включая планы эвакуации и протоколы чрезвычайных ситуаций.
private val securityPlans: String = "Security plans and protocols"

// 30. Регистрационный номер мероприятия
const val EVENT_ID: Int = 123

// 31. Максимально допустимый уровень шума в помещении хакатона.
val noiseMaxLevel: Int = 3

// 32. Индикатор превышения уровня шума в помещениях (превышен или не превышен в данный момент)
var isTooNoisy: Boolean = false

// 33. План взаимодействия с прессой
private var mediaCommunication: String = "Plan how to communicate with media"

// 34. Детальная публичная информация о проектах каждой команды, сбор данных включает в себя компиляцию кода и сбор статистики прогона автоматизированных проверок.
lateinit var publicTeamsInfo: String

// 35. Статус получения всех необходимых разрешений для проведения мероприятия
var permitsStatus: String = "pending"

// 36. Индикатор доступности специализированного оборудования в данный момент (например, специальному оборудованию)
var isSpecializedEquipmentAvailable: Boolean = true

// 37. Список партнеров мероприятия
val partners: String = "Partner1, Partner2"

// 38. Отчет, включающий фотографии, видео и отзывы, генерируется и становится доступен после завершения мероприятия.
lateinit var finalReport: String

// 39. Внутренние правила распределения призов
private val rules: String = "Event rules"

// 40. Список разыгрываемых призов
val prizes: String = "Prize1, Prize2, Prize3"

// 41. Контактная информация экстренных служб, медицинского персонала и других важных служб, для внутреннего пользования.
private val emergencyContacts: String = "Emergency and medical contacts"

// 42. Особые условия для участников с ограниченными возможностями
val accessibilityRules: String = "Accessibility rules"

// 43. Общее настроение участников (определяется опросами)
lateinit var participantsMood: String

// 44. Подробный план хакатона, включающий время и содержание каждого сегмента, инициализируется непосредственно перед началом мероприятия, так как зависит от фактического состава команд и взятых в работу задач.
lateinit var detailedEventSchedule: String

// 45. Имя знаменитого специального гостя, которое будет объявлено за день до мероприятия, но в момент инициализации неизвестно.
lateinit var specialGuest: String

// 46. Максимальное количество людей, которое может вместить место проведения.
val attendeesMax: Int = 100

// 47. Количество часов, отведенное каждой команде для работы над проектом.
val hoursPerTeam: Int = 24
