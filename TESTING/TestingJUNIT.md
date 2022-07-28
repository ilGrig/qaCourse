## Что такое тестирование? 

* Тестирование -- процесс поиска ошибок в приложении/программе. Тестирование -- непрерывный процесс, 
* который может использоваться на каждом этапе производства приложения. Также это отслеживание вносимых в проект
* изменений: требований, функционала и т.д; 

## Исключения:

* В процессе разработки могут возникнуть непредвиденные ситуации. Такие ошибки называются _исключениями_. 
* Для обработки этого используются специальные функцие _try_, _catch_, _finally_.
* Метод catch (_Тип исключения_ **имя переменной**). **Базовый** тип исключения -- _Exception_. 
* Для вывода информации об ошибке используется команда excName._printStackTrace()_. 

## Виды исключений:

* ArithmeticException: исключение, возникающее при делении на ноль;
* IndexOutOfBoundException: индекс вне границ массива;
* IllegalArgumentException: использование неверного аргумента при вызове метода;
* NullPointerException: использование пустой ссылки;
* NumberFormatException: ошибка преобразования строки в число;

## Модульное тестирование:

* Модульное тестирование или Unit Test используется для проверки на работоспособность 
* маленьких частей кода: функций, методов, классов. 

## Правила создания классов тестирования:

* Для проверки работоспособности метода, функции и т.д. нам нужно создать класс. 
* У этого действия есть определенные правила:
* Название складывается из названия тестируемой функции и постфикса _Test_;
* Класс наследуется от спецкласса из инструмента модульного тестирования;
* Каждый тест является публичным методов с аннотацией **@Test**;

## Методы сравнения:

* Для проверки правильности выполнения кода используется метод **assertions** и его производные: 
* assertEquals()/NotEquals(), assertTrue()/False() и другие; 