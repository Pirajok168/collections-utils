# sort-search-utils

Библиотека для работы с простыми алгоритмами сортировки и поиска на Java.

## Описание

Эта библиотека предоставляет базовые реализации алгоритмов сортировки (пузырьковая сортировка) и поиска (линейный поиск).  Она предназначена для демонстрационных и образовательных целей.

## Функциональность

•   **`bubbleSort(int[] array)`:**  Сортирует массив целых чисел с использованием алгоритма пузырьковой сортировки.
•   **`linearSearch(int[] array, int key)`:**  Выполняет линейный поиск элемента в массиве целых чисел.

## Использование

1.  **Добавьте зависимость в ваш Maven проект:**
```xml
    <dependency>
        <groupId>com.example</groupId>
        <artifactId>sort-search-utils</artifactId>
        <version>1.0-SNAPSHOT</version>
    </dependency>
```
2.  **Используйте классы и методы библиотеки в вашем коде:**
```java

    import com.example.sortsearch.SortSearchUtils;
    import java.util.Arrays;

    public class Example {
        public static void main(String[] args) {
            SortSearchUtils utils = new SortSearchUtils();
            int[] array = {5, 2, 8, 1, 9};
            utils.bubbleSort(array);
            System.out.println(Arrays.toString(array)); // Вывод: [1, 2, 5, 8, 9]
        }
    }
```
## Сборка

Для сборки библиотеки используйте Maven: 
```bash
mvn clean install
```

## Тестирование

Для запуска тестов используйте Maven:
```bash
mvn test
```
## Зависимости

•   JUnit (для тестирования)

## Автор

[Баир] - [sultumov]





    

    
