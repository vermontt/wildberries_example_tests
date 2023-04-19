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


### Example allure report :ghost:


<img src="https://github.com/vermontt/wildberries_example_tests/blob/master/notifications/%D0%A1%D0%BA%D1%80%D0%B8%D0%BD%D1%88%D0%BE%D1%82%20900.jpg" width="850" height="440"/>
