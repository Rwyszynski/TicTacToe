package com.kodilla;

public class Main {
    public static void main(String[] args) {

        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        try {
            int boardSize = inputSelector.inputValidator(inputSelector.boardType());
            StartGame startGame = new StartGame();
            startGame.runGame(boardSize, boardSize, null);
        }catch (InputDataExeption e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("You've put wrong value");
        }
        outputComputer.gameOver();
        //dd
    }
}
