package com.kodilla;

public class Main {
    public static void main(String[] args) {

    Board board = new Board();
    System.out.println("Witaj w grze kółko i krzyżyk, poniżej jest tablica wybierz pole od 1 do 9, zaczynamy!");
    board.showFilledBoard();

    RealUser realUser = new RealUser();
    Computer computer = new Computer();
    GameState gameState = new GameState();

    while (gameState.getArraySize() < 9 ) {

        char playerValue;
        if (Board.getMoves() % 2 == 0) {
            int yourMove = computer.yourMove();
            if (!gameState.getGameState().contains(yourMove)) {
                gameState.addValue(yourMove);
                board.addMove(yourMove, playerValue = 1);
            } else {
                continue;
            }
        } else {
            int yourMove = realUser.yourMove();
            gameState.addValue(yourMove);
            board.addMove(yourMove, playerValue = 0);
        }
        Board.move();
        gameState.getGameState();
        board.showBoard();
    }
        board.checkWinner();
        System.out.println("Koniec gry");
    }
}