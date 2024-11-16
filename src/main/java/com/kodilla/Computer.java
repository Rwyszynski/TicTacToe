package com.kodilla;

public class Computer implements User {

    @Override
    public int yourMoveX() {
        int randomDigitX = (int) (Math.random() * 3) ;
        System.out.println(randomDigitX);
        return randomDigitX;
    }

    @Override
    public int yourMoveY() {
        int randomDigitY = (int) (Math.random() * 3) ;
        System.out.println(randomDigitY);
        return randomDigitY;
    }
}
