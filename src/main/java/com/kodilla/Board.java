package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private char[][] values;
    private int rows;
    private int columns;
    List<Character> winnersX = new ArrayList<>();
    List<Character> winnersO = new ArrayList<>();

    public Board(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.values = new char[rows][columns];
    }

    private static int moves;

    public void showBoard() {

        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print("|" + values[i][j] + " ");
            }
            System.out.println("|");
        }
    }

    public void showFilledBoard() {
        System.out.print("   ");
        for (int i = 0; i < rows; i++) {
            System.out.print(" " + (i));
        }
        System.out.println();
        for (int i = 0; i < rows; i++) {
            System.out.print(" " + (i) + " ");
            for (int j = 0; j < rows; j++) {
                char a = values[i][j];
                if (a == 'X' || a == '0') {
                    System.out.print("|" + values[i][j]);
                } else {
                    System.out.print("|" + " ");
                }
            }
            System.out.println("|");
        }
    }

    public static int move() {
        moves += 1;
        return moves;
    }

    public static int getMoves() {
        return moves;
    }

    public void addMove(int rows, int columns, char value) {
        if (value == '0') {
            values[rows][columns] = '0';
        } else if (value == 'X') {
            values[rows][columns] = 'X';
        }
    }

    public boolean isWinner() {
        for (int i = 0; i < 3; i++) {
            if ((values[i][0] == values[i][1] && values[i][1] == values[i][2]) && (values[i][0] == 'X' || values[i][0] == '0')) {
                System.out.println("Wygrywa " + values[i][0]);
                return true;
            } else if ((values[0][i] == values[1][i] && values[1][i] == values[2][i]) && (values[0][i] == 'X' || values[0][i] == '0')) {
                System.out.println("Wygrywa " + values[0][i]);
                return true;
            } else if ((values[0][0] == values[1][1] && values[1][1] == values[2][2]) && (values[0][0] == 'X' || values[0][0] == '0')) {
                System.out.println("Wygrywa " + values[0][0]);
                return true;
            } else if ((values[2][0] == values[1][1] && values[1][1] == values[0][2]) && (values[2][0] == 'X' || values[2][0] == '0')) {
                System.out.println("Wygrywa " + values[2][0]);
                return true;
            } else if (isAnyWinner()) {
                return true;
            }
        }
        return false;
    }

    public char getValue(int rows, int columns) {
        return values[rows][columns];
    }

    public boolean whoIsWinner() {
        boolean win = isWinner();
        return win;
    }

    public boolean isAnyWinner() {
        List<Character> noWinner = new ArrayList<>();
        for (char[] row : values) {
            for (char sign : row) {
                if (sign == 'X' || sign == '0') {
                noWinner.add(sign);}
            }
        }
        if (noWinner.size() == 9) {
            System.out.println("It is a draw");
            return true;
        }
        return false;
    }
}