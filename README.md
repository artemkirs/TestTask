# StackexChange
StackexChange - приложение предназначено для работы с внешним ресурсом api.stackexchange.com

version '1.0'
Реализован функционал поиска вопросов по названию

# Используемый стэк

spring-boot 2.6.*
tomcat 9.*
springframework 5.*
junit 5.*
wiremock 2.32.*


# Основные модули
stackexChangeApi - модуль посредник, реализующий связь с бизнеслогикой посредстам REST api



modelsDTO - содержит транспортные модели
stackexChangeWorker - модуль бизнес-логики. реализует непосредственную обработку и взаимодействие с api.stackexchange.com
Основные классы
StackexChangeApiWorker - сервис работающий с api https://api.stackexchange.com/2.3/
Mapper<D, T> - маппер конвертации объектов полученные из https://api.stackexchange.com/2.3/ в необходимые объекты
QuestionService - сервис получающий параметры для взаимодействия c вопросами из api.stackexchange.com

# Тесты 
StackexChangeApiWorkerWireMockTest - интеграционные тесты с использованием wiremock и junit 5


# Публикация
Собрать war-файл проекта stackexChangeApi и разместить в tomcat в директорию \webapps

# Работа с сервисом

Обращение к сервису идет через проект stackexChangeApi
## Пример запроса:
"question/search?intitle=java"
"контроллер отвечающий за работу с вопросами/метод поиска по параметрам ? параметры"
search?intitle=java   - поиск вопросов где в загаловке содержится слово "java"
