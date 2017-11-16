# dance-api

## Tasks
1. Initialization of project.
2. Add entities structure.
3. Add logic by step number definition.
4. Add limitation.
5. Add interfaces.
6. Add comments and description.
7. Add tests.

## Description
Программа имеет следующую структуру.
1. На верхней границе иерархии находится интерфейс Tournament (Соревнование).
От него наследуется интерфейс DanceTournament (Танцевальное соревнование).
От которого наследуется интерфейс TaskTournament (Соревнование по условию задачи) содержащий методы для решения задания.
Класс Tournament реализует интерфейс TaskTournament.
2. Также есть иерархия интерфейсов AttemptUtil (Попытка) --> TaskAttempt (Попытка по условию задачи).
Класс Attempt реализует интерфейс TaskAttempt.
3. Точно так же: Participant (Участник соревнований) --> TaskDancer (Танцор по условию задачи) --< Dancer.
4. Точно так же: ResultUtil (Результат) --> TaskResult (Результат по условию задачи) --< Result.
5. A также есть класс Platform (Площадка).

Выполнение програмы происходит следующим способом:
1. Для участия в соревнованиях нужно зарегистрировать танцора (**Dancer**) и присвоить ему имя (**name**) и порядковый номер (**serialNumber**).
2. Для этого танцора ему нужно сообщить площадку (**Platform**) которая состоит из последовательности чисел (**sequenceNumber**).
3. Тогда танцор становится на площадку и совершает попытку (**Attempt**).
4. После чего получает результат (**Result**) в виде количества пройденных шагов (**steps**).
5. Тогда в соревнование (**Tournament**) записывается список попыток (**List<Attempt> attempts**), где для каждой попытки записан танцоро, площадка и результат.
После чего все попытки можно отсортировать, например, по количеству шагов пройденными участниками и определить победителя.

Реализация на абстрактом уровне (на уровне интерфейсов):
1. Регистрируется участник.
2. Он совершает попытку.
3. Получает результат.
4. Попытка, с записанным результатом, добавляется в список попыток соревнования.

