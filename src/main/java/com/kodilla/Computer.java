package com.kodilla;

public class Computer implements User {

    @Override
    public int yourMove() {
        int randomDigit = (int) (Math.random() * 9) + 1;
        System.out.println(randomDigit);
        return randomDigit;
    }
}
