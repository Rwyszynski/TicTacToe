package com.kodilla;

public class StartGame {

    public void runGame(int boardSize, int boardSize2) {
        RealUser realUser = new RealUser();
        Computer computer = new Computer();
        OutputComputer outputComputer = new OutputComputer();
        Board board = new Board(boardSize, boardSize);
        board.showFilledBoard();

        while(!board.whoIsWinner()){
            if (Board.getMoves() % 2 == 0){
                int row = realUser.yourMoveX();
                int col = realUser.yourMoveY();
                char val = board.getValue(row, col);
                if ((val == 'X') || (val == '0')){
                    outputComputer.wrongMove();
                } else {
                    board.addMove(row, col, 'X');
                    Board.move();
                }
            } else {
                int row = computer.yourMoveX();
                int col = computer.yourMoveY();
                char val = board.getValue(row, col);
                if ((val == 'X') || (val == '0')) {
                    System.out.println("Zły ruch");
                    continue;
                } else {
                    board.addMove(row, col, '0');
                    Board.move();
                }
            }
            board.showFilledBoard();
        }
    }
}
