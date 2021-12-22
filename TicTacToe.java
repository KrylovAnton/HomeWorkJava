package ru.geekbrains.homework;


/**
 * Java 1. HomeWork # 4
 *
 * @author Anton Krylov
 * @version 22.12.2021
 */

import java.util.Random;
import java.util.Scanner;


public class TicTacToe {
    final char SIGN_X = 'x';
    final char SIGN_0 = '0';
    final char SIGN_EMPTY = '.';
    char[][] table;
    Scanner sc;
    Random random;

    public static void main(String[] args) {
        new TicTacToe().game();
    }

    TicTacToe() {
        table = new char[3][3];
        sc = new Scanner(System.in);
        random = new Random();
        System.out.println("|| ________________HELLO_____________ ||");
        System.out.println("|| __________Welcome in Game_________ ||");
        System.out.println("|| You will succeed. You are a winner ||");
    }

    void initTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                table[i][j] = SIGN_EMPTY;
            }
        }
    }

    void printTable() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    void humanMove() {
        int i, j;
        do {
            System.out.print("Enter a combination of numbers 1 .. 2 .. 3. To select a cell.");
            i = sc.nextInt() - 1;
            j = sc.nextInt() - 1;
        }
        while (!isCellValid(i, j));
        table[i][j] = SIGN_X;
    }

    void aiMove() {
        int i, j;
        do {
            i = random.nextInt(3);
            j = random.nextInt(3);
        }
        while (!isCellValid(i, j));
        table[i][j] = SIGN_0;
    }

    boolean isWin(char ch) {
        for (int i = 0; i < 3; i++)
            if ((table[i][0] == ch && table[i][1] == ch &&
                    table[i][2] == ch) ||
                    (table[0][i] == ch && table[1][i] == ch &&
                            table[2][i] == ch))
                return true;
        if ((table[0][0] == ch && table[1][1] == ch &&
                table[2][2] == ch) ||
                (table[2][0] == ch && table[1][1] == ch &&
                        table[0][2] == ch))
            return true;
        return false;
    }

    boolean isTableFull() {
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (table[i][j] == SIGN_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isCellValid(int i, int j) {
        if (i < 0 || j < 0 || i > 2 || j > 2) {
            return false;
        }
        return table[i][j] == SIGN_EMPTY;
    }

    void game() {
        initTable();
        printTable();
        while (true) {
            humanMove();
            if (isWin(SIGN_X)) {
                System.out.println("||______You Winner______||");
                System.out.println("||___Congratulations___||");
                break;
            }
            if (isTableFull()) {
                System.out.println("|| Draw ||");
                break;
            }
            aiMove();
            printTable();
            if (isWin(SIGN_0)) {
                System.out.println("|| You Looser ||");
                break;
            }
            if (isTableFull()) {
                System.out.println("|| Draw ||");
                break;
            }
        }
        printTable();
    }
}


 
