package com.kodilla;

public class OutputComputer {

    public void gameStart() {
        System.out.println("Welcome to TicTacToe!");
    }

    public void gameOver() {
        System.out.println("Game Over!");
    }

    public void gameType () {
        System.out.println("Choose a type of game. Type 3 or 10");
    }

    public void playerTurnX() {
        System.out.println("Select row");
    }

    public void playerTurnY() {
        System.out.println("Select column");
    }

    public void wrongMove() {
        System.out.println("You can not move here. Select different row and column");
    }

    public void draw() {
        System.out.println("Draw");
    }

    public void computerOrHuman() {
        System.out.println("Do you want to play with computer(1) or human(2)?");
    }

    public void showFilledBoard(Board board) {
        System.out.print("   ");
        for (int i = 0; i < board.getRows(); i++) {
            System.out.print(" " + (i));
        }
        System.out.println();
        for (int i = 0; i < board.getRows(); i++) {
            System.out.print(" " + (i) + " ");
            for (int j = 0; j < board.getRows(); j++) {
                char a = board.getValues()[i][j];
                if (a == 'X' || a == '0') {
                    System.out.print("|" + board.getValues()[i][j]);
                } else {
                    System.out.print("|" + " ");
                }
            }
            System.out.println("|");
        }
    }

    public void showError () {
        System.out.println("You've put wrong value");
    }

    public static void showWinner(char whoWon) {
        System.out.println("Wygrywa " + whoWon);
    }

    public static void wrongMoves () {
        System.out.println("Zły ruch");
    }
}
