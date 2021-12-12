package ru.geekbrains.homework;

/**
 * Javan 1. HomeWork # 1
 *
 * @author Anton Krylov
 *
 * @version 12.12.2021
 *
 */

public class LessonOne {
        public static void main(String[] args) {
            printThreeWords();
            checkSumSign();
            printColor();
            compareNumbers();
        }

        static void printThreeWords() {
            String multipleLines = "Orang"
                    + System.lineSeparator() + "Banana"
                    + System.lineSeparator() + "Apple";
            System.out.println(multipleLines);
        }

        static void checkSumSign() {
            int a = 17;
            int b = 21;
            System.out.println((a + b >= 0)? "sum positive" : "sum negative");
        }

        static void printColor() {
            int value = 35;
            if (value <= 0) {
                System.out.println("red");
            }
            else if (value <= 100) {
                System.out.println("yellow");
            }
            if (value >100) {
                System.out.println("green");
            }
        }

        static void compareNumbers() {
            int a = 50;
            int b = 45;
            System.out.println((a >= b)? "a >= b" : "a < b");
        }
    }
