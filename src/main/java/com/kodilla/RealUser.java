package com.kodilla;
import java.util.Scanner;

public class RealUser implements User {

    @Override
    public int yourMoveX() {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnX();
        InputSelector in = new InputSelector();
        int value = in.moveX();
        return value;
    }

    @Override
    public int yourMoveY() {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnY();
        InputSelector in = new InputSelector();
        int value = in.moveY();
        return value;
    }
}
