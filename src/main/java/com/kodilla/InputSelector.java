package com.kodilla;

import java.util.Scanner;

public class InputSelector {
    Scanner scanner = new Scanner(System.in);

    public int boardType() {
        int board = Integer.parseInt(scanner.nextLine());
        return board;
    }

    public int moveX() {
        int youMoveX = Integer.parseInt(scanner.nextLine());
        return youMoveX;
    }

    public int moveY() {
        int youMoveY = Integer.parseInt(scanner.nextLine());
        return youMoveY;
    }
}
