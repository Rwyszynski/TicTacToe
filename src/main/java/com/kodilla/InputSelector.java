package com.kodilla;

import java.util.Scanner;

public class InputSelector {
    Scanner scanner = new Scanner(System.in);

    public int boardType() {
        return Integer.parseInt(scanner.nextLine());
    }

    public int moveX() {
        return Integer.parseInt(scanner.nextLine());
    }

    public int moveY() {
        return Integer.parseInt(scanner.nextLine());
    }

    public int inputValidator(int check) throws InputDataException {
        try{
            return check;
        } catch (RuntimeException e) {
            throw new InputDataException("You've put wrong value");
        }
    }

    public int computerOrHuman() {
        return Integer.parseInt(scanner.nextLine());
    }

}
