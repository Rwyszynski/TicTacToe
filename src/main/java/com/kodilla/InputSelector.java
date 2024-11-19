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

    public int inputValidator(int check) throws InputDataExeption{
        try{
            return check;
        } catch (RuntimeException e) {
            throw new InputDataExeption("You've put wrong value");
        }
    }

    public int computerOrHuman() {
        int computerOrHuman = Integer.parseInt(scanner.nextLine());
        return computerOrHuman;
    }

    public static int inputValidator2(int check) throws InputDataExeption{
        try{
            return check;
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new InputDataExeption("You've put wrong value");
        }
    }
}
