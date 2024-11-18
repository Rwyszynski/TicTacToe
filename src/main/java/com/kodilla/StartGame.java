package com.kodilla;

public class StartGame {

    public void runGame(int boardSize, int boardSize2) {
        RealUser realUser = new RealUser();
        Computer computer = new Computer();
        OutputComputer outputComputer = new OutputComputer();
        Board board = new Board(boardSize, boardSize);
        outputComputer.computerOrHuman();
        int compOrHum = board.computerOrHuman();
        board.showFilledBoard();

        while(!board.whoIsWinner()){
            if (Board.getMoves() % 2 == 0){
                int row = realUser.yourMoveX(boardSize);
                int col = realUser.yourMoveY(boardSize);
                char val = board.getValue(row, col);
                if ((val == 'X') || (val == '0')){
                    outputComputer.wrongMove();
                } else {
                    board.addMove(row, col, 'X');
                    Board.move();
                }
            } else {
                if (compOrHum == 1) {
                    int row = computer.yourMoveX(boardSize);
                    int col = computer.yourMoveY(boardSize);
                    char val = board.getValue(row, col);
                    if ((val == 'X') || (val == '0')) {
                        System.out.println("Zły ruch");
                        continue;

                    } else {
                        board.addMove(row, col, '0');
                        Board.move();
                    }
                } else if (compOrHum == 2) {
                    int row = realUser.yourMoveX(boardSize);
                    int col = realUser.yourMoveY(boardSize);
                    char val = board.getValue(row, col);
                    if ((val == 'X') || (val == '0')){
                        outputComputer.wrongMove();
                    } else {
                        board.addMove(row, col, '0');
                        Board.move();
                    }

                }
            }
            board.showFilledBoard();
        }
    }
}
