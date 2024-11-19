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
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won X";

        // then
        assertEquals("Won X", whoWin);
    }

    @Test
    void testColumnX() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n1\n1\n0\n1\n1\n2\n0";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won X";

        // then
        assertEquals("Won X", whoWin);
    }

    @Test
    void testDiagonalX() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n1\n1\n1\n1\n0\n2\n2";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won X";

        // then
        assertEquals("Won X", whoWin);
    }

    @Test
    void testRow0() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n1\n0\n2\n1\n1\n1\n0\n2\n1\n2";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won 0";

        // then
        assertEquals("Won 0", whoWin);
    }

    @Test
    void testColumn0() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n2\n1\n1\n2\n2\n2\n0\n1\n2";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won 0";

        // then
        assertEquals("Won 0", whoWin);
    }

    @Test
    void testDiagonal0() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n2\n1\n2\n1\n1\n2\n1\n1\n2\n2\n0";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Won 0";

        // then
        assertEquals("Won 0", whoWin);
    }

    @Test
    void testDraw() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n1\n0\n2\n1\n0\n1\n2\n2\n2\n2\n0\n1\n1\n2\n1";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Draw";

        // then
        assertEquals("Draw", whoWin);
    }

    @Test
    void testException() {
        // given
        String sizeOfBoardString = "3\n2\n0\n0\n0\n1\n0\n3";
        ByteArrayInputStream inputStream = new ByteArrayInputStream(sizeOfBoardString.getBytes());
        System.setIn(new ByteArrayInputStream(sizeOfBoardString.getBytes()));

        // when
        OutputComputer outputComputer = new OutputComputer();
        outputComputer.gameStart();
        outputComputer.gameType();
        InputSelector inputSelector = new InputSelector();
        int boardSize = inputSelector.boardType();
        StartGame startGame = new StartGame();
        startGame.runGame(boardSize, boardSize, inputSelector);

        String whoWin = "Exception";

        // then
        assertEquals("Exception", whoWin);
    }
}

