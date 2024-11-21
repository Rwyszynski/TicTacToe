package com.kodilla;

public class Computer implements User {

    @Override
    public int yourMoveX(int value) {
        int randomDigitX = (int) (Math.random() * value);
        System.out.println(randomDigitX);
        return randomDigitX;
    }

    @Override
    public int yourMoveY(int value) {
        int randomDigitY = (int) (Math.random() * value);
        System.out.println(randomDigitY);
        return randomDigitY;
    }
}
