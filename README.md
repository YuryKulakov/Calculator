# Bank application

## Описание

REST-приложение на JAVA предназначенное для организации процессов взаимодействия между клиентом и банком.

## Функционал

#### База Данных

![БД](https://user-images.githubusercontent.com/77917592/227283748-40c6948f-994a-4c74-b8a1-97ed0994cabb.jpg)


#### Клиенты могут:

* Переводить деньги со счёта на счёт
* Конвертировать валюту
* Оплачивать покупки
  
#### Менеджеры могут:
* Все то же, что и пользователи
* Регистрировать пользователя
* Открывать новый счет пользователю
* Открывать новую карту пользователю
* Пополнять счет пользователя
* Заблокировать счет пользователя


## Стек технологий

* Java 17 — язык программирования
* Spring Boot 2.7.9 version - фреймворк
* PostgreSQL - СУБД
* Gradle - сборщик проектов
* Liquibase - система управления миграциями базы данных
* OpenApi - спецификация для описания, создания, использования и      визуализации веб-сервисов REST
  

## Запуск приложения

* Поднять БД - docker
```yaml
version: '3'
services:
  database-postgres:
    image: postgres:14.7
    ports:
      - "5432:5432"
    restart: always
    environment:
      POSTGRES_USER: postgres
      POSTGRES_PASSWORD: postgres
 ```

* Any modifications needed to be made to files/folders

## Executing program

* How to run the program
* Step-by-step bullets
```
code blocks for commands
```
