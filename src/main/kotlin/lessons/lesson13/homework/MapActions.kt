package lessons.lesson13.homework

fun main() {

//Для решения каждой задачи постарайтесь использовать наиболее подходящий метод, не повторяясь с решением других задач.
//1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
    val testDuration: MutableMap<String, Double> =
        mutableMapOf("loginTest" to 2.2, "checkoutTest" to 1.1, "searchTest" to 0.9, "logoutTest" to 2.3)
    val avgTestDuration = testDuration.values.average()
    print("Task 1: ")
    println(avgTestDuration)

//2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов,
// а значения - строка с метаданными. Выведите список всех тестовых методов.
    val testMetadata: MutableMap<String, String> = mutableMapOf(
        "loginTest" to "Smoke, Critical, Login",
        "checkoutTest" to "Regression, High, Checkout",
        "searchTest" to "Functional, Medium, Search",
        "logoutTest" to "Smoke, Low, Logout"
    )
    print("Task 2: ")
    println(testMetadata.keys)

//3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val testResult: MutableMap<String, String> = mutableMapOf(
        "loginTest" to "passed",
        "checkoutTest" to "failed",
        "searchTest" to "skipped",
        "logoutTest" to "passed"
    )
    testResult["filterTest"] = "passed"
    print("Task 3: ")
    println(testResult)

//4. Посчитайте количество успешных тестов в словаре с результатами
// (ключ - название, значение - результат из passed, failed, skipped).
    print("Task 4: ")
    println(testResult.filterValues { it == "passed" }.count())
    println(testResult.count { it.value == "passed" })


//5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
// (ключ - название, значение - статус исправления).
    val bugs: MutableMap<String, String> = mutableMapOf(
        "Login button not working" to "fixed",
        "Incorrect password error" to "in progress",
        "Broken logo" to "fixed",
        "Slow page loading" to "open"
    )

    val fixedBugs = bugs.filterValues { it == "fixed" }.keys
    fixedBugs.forEach {
        bugs.remove(it)
    }
    print("Task 5: ")
    println(bugs)

//    bugs.entries.removeIf { it.value == "fixed" }


//6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
    val webPages: Map<String, Int> = mapOf(
        "https://example.com" to 200,
        "https://example.com/login" to 200,
        "https://example.com/profile" to 403,
        "https://example.com/admin" to 404
    )
    print("Task 6: ")
    webPages.forEach { (url, status) ->
        println("URL: $url, status code: $status")
    }

//7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val serviceResponseTime: Map<String, Double> = mapOf(
        "AuthService" to 120.5,
        "PaymentService" to 450.8,
        "UserService" to 210.3,
        "SearchService" to 680.1
    )
    val threshold = 300
    print("Task 7: ")
    println(serviceResponseTime.filter { it.value > threshold })

//8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val apiResults: Map<String, String> = mapOf(
        "/api/login" to "200 OK",
        "/api/users" to "200 OK",
        "/api/products" to "404 Not Found",
        "/api/orders" to "500 Internal Server Error"
    )

    print("Task 8: ")
    println(apiResults.getOrElse("/api/login") { "Not tested" })
    println(apiResults.getOrElse("/api/logout") { "Not tested" })

//9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации,
// значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val testEnvironmentConfig: Map<String, String> = mapOf(
        "browserType" to "Chrome",
        "browserVersion" to "151",
        "environment" to "staging",
        "baseUrl" to "https://staging.example.com"
    )
    print("Task 9: ")
    println(testEnvironmentConfig.getValue("browserType"))

//10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val softwareVersions: Map<String, String> = mapOf(
        "previous" to "2.4.1",
        "stable" to "2.3.0"
    )

    val softwareVersionsUpdated = softwareVersions + ("latest" to "2.5.0")
    print("Task 10: ")
    println(softwareVersionsUpdated)

//11. Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели
// или верните настройки по умолчанию.
    val mobileDeviceSettings: Map<String, String> = mapOf(
        "iPhone 16" to "iOS 18, Safari, 390x844",
        "Samsung A56" to "Android 16, Chrome, 1080x2340",
        "Samsung A51" to "Android 14, Chrome, 1080x2400",
        "Pixel 9" to "Android 16, Chrome, 1080x2424"
    )
    print("Task 11: ")
    println(mobileDeviceSettings.getOrDefault("Samsung A55", "Default value"))

//12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки, значение - описание ошибки) определенный код ошибки.
    val testErrors: Map<Int, String> = mapOf(
        404 to "Page not found",
        401 to "Unauthorized",
        500 to "Internal server error",
        503 to "Service unavailable"
    )

    print("Task 12: ")
    println(testErrors.containsKey(401))

//13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped").
// Отфильтруйте словарь, оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов,
// то-есть в ключе содержится требуемая версия.
    val testScenarios: Map<String, String> = mapOf(
        "LoginTest_v1" to "Passed",
        "PaymentTest_v1" to "Failed",
        "SearchTest_v2" to "Passed",
        "ProfileTest_v2" to "Skipped",
        "CheckoutTest_v2" to "Passed",
        "LogoutTest_v3" to "Failed"
    )

    print("Task 13: ")
    println(testScenarios.filterKeys { it.contains("v2") })

//14. У вас есть словарь, где ключи — это названия функциональных модулей приложения, а значения — результаты их тестирования.
// Проверьте, есть ли модули с неудачным тестированием.
    val functionalModules: Map<String, String> = mapOf(
        "Authentication" to "Passed",
        "Payments" to "Failed",
        "Search" to "Passed",
        "UserProfile" to "Passed",
        "Notifications" to "Failed"
    )
    print("Task 14: ")
    println(functionalModules.containsValue("Failed"))

//15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val testEnvironment: MutableMap<String, String> = mutableMapOf(
        "browser" to "Chrome",
        "environment" to "staging",
        "timeout" to "30"
    )

    val additionalEnvironment: Map<String, String> = mapOf(
        "headless" to "true",
        "platform" to "Linux",
        "language" to "en"
    )

    print("Task 15: ")
    testEnvironment.putAll(additionalEnvironment)
    println(testEnvironment)

//16. Объедините два неизменяемых словаря с данными о багах.
    val bugsFirst: Map<Int, String> = mapOf(
        101 to "Login page is broken",
        102 to "Incorrect validation message",
        103 to "User cannot logout"
    )

    val bugsSecond: Map<Int, String> = mapOf(
        104 to "Search returns wrong results",
        105 to "Payment timeout",
        106 to "Profile image is not displayed"
    )
    val fullBugs: Map<Int, String> = bugsFirst + bugsSecond
    print("Task 16: ")
    println(fullBugs)

//17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val temporaryTestData: MutableMap<String, String> = mutableMapOf(
        "lastTestRunId" to "RUN-2026-10-18",
        "startTime" to "10:30",
        "environment" to "staging",
        "browser" to "Chrome",
        "temporaryToken" to "abc123"
    )
    temporaryTestData.clear()
    print("Task 17: ")
    println(temporaryTestData)

//18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены (имеют статус “skipped”).
// Ключи - название теста, значения - статус.
    val automationReport: Map<String, String> = mapOf(
        "Login test" to "passed",
        "Registration test" to "passed",
        "Payment test" to "skipped",
        "Search test" to "failed",
        "Logout test" to "skipped",
        "Profile test" to "passed"
    )

    print("Task 18: ")
    println(automationReport.filterNot { it.value == "skipped" })

//19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val testConfigurations: Map<String, String> = mapOf(
        "Chrome desktop" to "Chrome, Windows, 1920x1080",
        "Firefox desktop" to "Firefox, Windows, 1920x1080",
        "Safari desktop" to "Safari, macOS, 1440x900",
        "Chrome mobile" to "Chrome, Android, 1080x2400",
        "Safari mobile" to "Safari, iOS, 390x844"
    )

    val testConfigurationsWithoutSafari = testConfigurations - listOf("Safari desktop", "Safari mobile")
    print("Task 19: ")
    println(testConfigurationsWithoutSafari)

//20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования (ключ — идентификатор теста, значение — результат)
// в список строк формата "Test ID: результат".
    val testResultsForReport: Map<String, String> = mapOf(
        "TEST-001" to "Passed",
        "TEST-002" to "Failed",
        "TEST-003" to "Skipped",
        "TEST-004" to "Passed"
    )
    val testReport: List<String> = testResultsForReport.map { "${it.key}: ${it.value}" }
    print("Task 20: ")
    println(testReport)

//21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val testResults: MutableMap<String, String> = mutableMapOf(
        "TEST-001" to "Passed",
        "TEST-002" to "Failed",
        "TEST-003" to "Skipped",
        "TEST-004" to "Passed"
    )
    val testResultsToArchive: Map<String, String> = testResults.toMap()
    print("Task 21: ")
    println(testResultsToArchive)

//22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val testExecutionTime: Map<Int, Double> = mapOf(
        101 to 1.25,
        102 to 2.40,
        103 to 0.85,
        104 to 3.15
    )

    print("Task 22: ")
    val testExecutionTimeTransformed: Map<String, Double> = testExecutionTime.mapKeys { it.key.toString() }
    println(testExecutionTimeTransformed)

//23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия,
// значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%, чтобы учесть новые условия тестирования.
    val performanceScores: Map<String, Double> = mapOf(
        "1.0.0" to 120.5,
        "1.1.0" to 135.2,
        "1.2.0" to 98.7,
        "2.0.0" to 156.4
    )

    print("Task 23: ")
    println(performanceScores.mapValues { it.value * 1.1 })

//24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val compilationErrors: Map<String, String> = mapOf(
        "LoginTest.kt" to "Unresolved reference",
        "PaymentTest.kt" to "Type mismatch"
    )

    print("Task 24: ")
    println(compilationErrors.isEmpty())

//25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val loadTestResults: Map<String, String> = mapOf(
        "100 users" to "Passed",
        "500 users" to "Passed",
        "1000 users" to "Failed"
    )

    print("Task 25: ")
    println(loadTestResults.isNotEmpty())

//26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.

    print("Task 26: ")
    println(testResults.all { it.value == "Passed" })

//27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.

    print("Task 27: ")
    println(testResults.any { it.value == "Failed" })

//28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно
// и содержат в названии “optional”.
    val serviceTestResults: Map<String, String> = mapOf(
        "Login optional test" to "Failed",
        "Payment required test" to "Failed",
        "Search optional test" to "Passed",
        "Notification optional test" to "Failed",
        "Profile required test" to "Passed",
        "Logout optional test" to "Skipped"
    )

    print("Task 28: ")
    println(serviceTestResults.filter { it.value == "Failed" && it.key.contains("optional", true) })
}