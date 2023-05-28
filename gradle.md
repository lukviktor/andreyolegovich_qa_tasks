# JUnit 5 и Selenium – Настройте проект с помощью Gradle, JUnit 5 и Jupiter Selenium
## Java и JUnit 5
Для базовой конфигурации проекта Java с JUnit 5 добавьте следующее содержимое в build.gradle :
```
plugins {
id 'java'
}

repositories {
mavenCentral()
}

dependencies {
testImplementation('org.junit.jupiter:junit-jupiter:5.9.2')
}

test {
useJUnitPlatform()
testLogging {
events "passed", "skipped", "failed"
}
}
```

* Конфигурация может быть проверена путем выполнения сборки Gradle в терминале:
```sh
./gradlew build
```

## Юнит Юпитер
Чтобы упростить настройку Selenium WebDriver в проекте, я собираюсь использовать Selenium Jupiter, который является расширением JUnit 5, предназначенным для облегчения использования Selenium (WebDriver и Grid) в тестах JUnit 5. Он представляет собой отдельную зависимость, которую необходимо добавить в список зависимостей в build.gradle :
```
dependencies {
testImplementation('io.github.bonigarcia:selenium-jupiter:4.3.4')
}
```

    Примечание: не удивляйтесь, увидев много библиотек в вашем проекте.
    Селний Юпитер имеет много зависимостей.
    Чтобы увидеть все зависимости проекта (включая транзитивные зависимости),
    выполните следующую команду:

```sh
./gradlew dependencies
```