package com.kodilla;

import static com.kodilla.OutputComputer.wrongMoves;

public class StartGame {

    public void runGame(int boardSize, InputSelector inputSelector) {
        RealUser realUser = new RealUser(inputSelector);
        Computer computer = new Computer();
        OutputComputer outputComputer = new OutputComputer();
        Board board = new Board(boardSize, boardSize, inputSelector);
        outputComputer.computerOrHuman();
        int compOrHum = board.computerOrHuman();
        outputComputer.showFilledBoard(board);

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
                        wrongMoves();
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
            outputComputer.showFilledBoard(board);
        }
    }
}
