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
}
