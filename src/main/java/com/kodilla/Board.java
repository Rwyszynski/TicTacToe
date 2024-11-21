package com.kodilla;

import java.util.ArrayList;
import java.util.List;

import static com.kodilla.OutputComputer.showWinner;

public class Board {

    private static final char CHAR_0 = '0';
    private static final char CHAR_X = 'X';
    private static int moves;
    private final char[][] values;
    private final int rows;
    private final int columns;
    private final InputSelector inputSelector;

    public Board(int rows, int columns, InputSelector inputSelector) {
        this.rows = rows;
        this.columns = columns;
        this.inputSelector = inputSelector;
        this.values = new char[rows][columns];
    }

    public static void move() {
        moves += 1;
    }

    public static int getMoves() {
        return moves;
    }

    public void addMove(int rows, int columns, char value) {
        values[rows][columns] = value;
    }

    public boolean isWinner() {
        for (int i = 0; i < 3; i++) {
            if ((values[i][0] == values[i][1] && values[i][1] == values[i][2]) && (values[i][0] == 'X' || values[i][0] == '0')) {
                showWinner(values[i][0]);
                return true;
            } else if ((values[0][i] == values[1][i] && values[1][i] == values[2][i]) && (values[0][i] == 'X' || values[0][i] == '0')) {
                showWinner(values[0][i]);
                return true;
            } else if ((values[0][0] == values[1][1] && values[1][1] == values[2][2]) && (values[0][0] == 'X' || values[0][0] == '0')) {
                showWinner(values[0][0]);
                return true;
            } else if ((values[2][0] == values[1][1] && values[1][1] == values[0][2]) && (values[2][0] == 'X' || values[2][0] == '0')) {
                showWinner(values[2][0]);
                return true;
            } else if (isAnyWinner()) {
                return true;
            }
        }
        return false;
    }

    public boolean isWinner10() {
        for (int i = CHAR_0; i < columns; i++) {
            for (int j = CHAR_0; j < rows; j++) {
                if (values[i][j] != CHAR_X || values[i][j] != CHAR_0) {
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

        for (int i = 0; i < 5; i++) {
            int r = row + i * rowDir;
            int c = col + i * colDir;
            if (r < 0 || r >= rows || c < 0 || c >= rows || values[r][c] != symbol) {
                return false;
            }
        }
        if (symbol == CHAR_X || symbol == CHAR_0) {
            showWinner(symbol);
            return true;
        }
        return false;
    }

    public boolean whoIsWinner() {
        if (columns == 3) {
            return isWinner();
        } else {
            return isWinner10();
        }
    }

    public int computerOrHuman() {
        return inputSelector.computerOrHuman();
    }

    public boolean isAnyWinner() {
        List<Character> noWinner = new ArrayList<>();
        for (char[] row : values) {
            for (char sign : row) {
                if (sign == CHAR_X || sign == CHAR_0) {
                    noWinner.add(sign);
                }
            }
        }
        if (noWinner.size() == 9) {
            OutputComputer oc = new OutputComputer();
            oc.draw();
            return true;
        }
        return false;
    }

    public char[][] getValues() {
        return values;
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public InputSelector getInputSelector() {
        return inputSelector;
    }

    public char getValue(int rows, int columns) {
        return values[rows][columns];
    }
}
