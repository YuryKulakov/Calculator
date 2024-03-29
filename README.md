# Bank application

## Описание

REST-приложение на JAVA предназначенное для организации процессов взаимодействия между клиентом и банком.

## Функционал

#### База Данных

![image](https://user-images.githubusercontent.com/77917592/227549331-53dd3c6d-e309-4945-88f8-8d950625b795.png)


#### Клиенты могут:

* Переводить деньги со счёта на счёт
* Конвертировать валюту
* Оплачивать покупки
* Подтверждать списание средств с помощью Telegram-бота
  
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
* OpenApi 1.6.15 - спецификация для описания, создания, использования и      визуализации веб-сервисов REST
* Swaggwer 2.2.8 version
  

## Запуск приложения

* Склонировать репозиторий и открыть его в IntelliJ IDEA
* Поднять БД в Docker - docker-compose.yaml
* Создать таблицы с помощью скриптов миграции
* В классе BankappApplication запустить соответствующий main метод.
