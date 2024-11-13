package com.kodilla;

public class Board {

    private char[][] values = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
    };
    private static int moves;

    public void showBoard() {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print("|" + values[i][j]);
            }
            System.out.println("|");
        }
    }

    public void showFilledBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int o = i*3 + j + 1;
                System.out.print("|" + o);
            }
            System.out.println("|");
        }
    }
    public static int move() {
        moves +=1;
        return moves;
    }

    public static int getMoves() {
        return moves;
    }

    public void addMove(int moveNow, char xo){
        int row = (moveNow - 1) / 3;
        int col = (moveNow - 1) % 3;
        if (xo == 0){
            values[row][col] = 'X';
        } else if (xo == 1){
            values[row][col] = 'O';
        }
    }
/*
    public void checkWinner() {
        for (int row = 0; row < 3; row++) {
            char first = values[row][0];
            for (int column = 0; column < 3; column++) {
                if (values[row][column] == first) {
                    true;
                }
            }
        }
    }

*/


}