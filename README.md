# Tests for `Wildberries.ru`

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


### Examples allure report :ghost:


<img src="https://github.com/vermontt/wildberries_example_tests/blob/master/notifications/Screenshot_003341.jpg" width="910" height="440"/>

<img src="https://github.com/vermontt/wildberries_example_tests/blob/master/notifications/Screenshot_003342.jpg" width="300" height="540"/>

