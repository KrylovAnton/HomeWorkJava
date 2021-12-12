package ru.geekbrains.homework;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.Collection;

/**
 * Javan 1. HomeWork # 2
 *
 * @author Anton Krylov
 *
 * @version 12.12.2021
 *
 */

public class LessonTwo {
    public static void main(String[] args) {
        System.out.println(checkingTwoNumbers(8, 15));
        integer(-5);
        System.out.println(wholeNumber(-10));
        repeatWords();
        System.out.println(whatYear( 2022));
    }

    /**
     * 1. Написать метод, принимающий на вход два целых числа и проверяющий,
     * что их сумма лежит в пределах от 10 до 20 (включительно),
     * если да – вернуть true, в противном случае – false.
     */

    static boolean checkingTwoNumbers(int a, int b) {
        int sum = a + b;
        return  (10 <= sum) && (sum <= 20);
    }

    /**
     * 2. Написать метод, которому в качестве параметра передается целое число,
     * метод должен напечатать в консоль, положительное ли число передали или отрицательное.
     * Замечание: ноль считаем положительным числом.
     */

    static void integer(int a) {
        System.out.println((a >= 0)? "positive number" : "negative number");
    }

    /**
     * 3. Написать метод, которому в качестве параметра передается целое число.
     * Метод должен вернуть true, если число отрицательное,
     * и вернуть false если положительное.
     */

    static boolean wholeNumber(int a) {
        return (a < 0);
    }

    /**
     * 4. Написать метод, которому в качестве аргументов передается строка и число,
     * метод должен отпечатать в консоль указанную строку, указанное количество раз;
     */

    static void repeatWords () {
        for (int a = 0; a < 5; a++) {
            System.out.println("Hello");
        }
    }

    /**
     * 5. * Написать метод, который определяет, является ли год високосным,
     * и возвращает boolean (високосный - true, не високосный - false).
     * Каждый 4-й год является високосным, кроме каждого 100-го,
     * при этом каждый 400-й – високосный.
     */

    static boolean whatYear(int a) {
        return a % 4 == 0 && a % 100 != 0 || a % 400 == 0;
    }

}
