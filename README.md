# Tests For `Wildberries.ru`

### Configuration

Java 17

### The project was created to demonstrate working with tools:
- Selenide
- Selenoid
- Gradle
- Owner
- Allure
- JUnit5
- Pattern PageObject
- AssertJ
- Notification telegram bot

### Run
`./gradlew clean test -Dhost=local`

где в -Dhost прописывается один из вариантов запуска:

* `local` - стоит по умолчанию, можно не указывать
* `remote` - удаленный Selenoid

`./gradlew clean smoke_tests`

для запуска таски смоук тестов
