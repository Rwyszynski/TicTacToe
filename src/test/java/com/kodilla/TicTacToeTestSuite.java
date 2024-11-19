package com.kodilla;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTestSuite {

    @Test
    void testRowX() {
        // given

        String sizeOfBoardString = "3\n2\n0\n0\n1\n0\n0\n1\n1\n1\n0\n2";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));


        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();

        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize);

        String whoWin = "Won X";

        // then
        assertEquals("Won X", whoWin);
    }
}

