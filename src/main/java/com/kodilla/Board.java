package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private char[][] values;
    private int rows;
    private int columns;
    private final InputSelector inputSelector;
    List<Character> winnersX = new ArrayList<>();
    List<Character> winnersO = new ArrayList<>();

    public Board(int rows, int columns, InputSelector inputSelector) {
        this.rows = rows;
        this.columns = columns;
        if(inputSelector != null) {
            this.inputSelector = inputSelector;
        } else {
            this.inputSelector = new InputSelector();
        }
        this.values = new char[rows][columns];
    }

    private static int moves;

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

    public boolean isWinner10(){
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                if (values[i][j] != 'X' || values[i][j] != '0') {
                    if (checkWin(i, j, 1, 0) ||
                            checkWin(i, j, 0, 1) ||
                            checkWin(i, j, 1, 1) ||
                            checkWin(i, j, 1, -1)) {
                        return true;
                    } else {
                        break;
                    }
                }

            }
        }
        return false;
    }

    public boolean checkWin(int row, int col, int rowDir, int colDir) {
        char symbol = values[row][col];
        int count = 0;

        for (int i = 0; i < 5; i++) {
            int r = row + i * rowDir;
            int c = col + i * colDir;
            if (r < 0 || r >= rows || c < 0 || c >= rows || values[r][c] != symbol) {
                return false;
            }
            count++;

        }
        if (symbol == 'X' || symbol == '0') {
            System.out.println("Wygrywa " + symbol);
            return true;
        }
        return false;
    }


    public char getValue(int rows, int columns) {
        return values[rows][columns];
    }

    public boolean whoIsWinner() {
        if (columns == 3) {
            boolean win = isWinner();
            return win;
        } else {
            boolean win = isWinner10();
            return win;
        }
    }

    public int computerOrHuman() {
        int ifHuman = inputSelector.computerOrHuman();
        return ifHuman;
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
            OutputComputer oc = new OutputComputer();
            oc.draw();
            return true;
        }
        return false;
    }
}
