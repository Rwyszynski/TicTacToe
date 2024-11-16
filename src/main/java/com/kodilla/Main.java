package com.kodilla;

public class Main {
    public static void main(String[] args) {

        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize);
        outputComputer.gameOver();

    }
}