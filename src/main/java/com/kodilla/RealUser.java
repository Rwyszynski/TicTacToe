package com.kodilla;
import java.util.Scanner;

public class RealUser implements User {

    @Override
    public int yourMoveX(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnX();
        InputSelector in = new InputSelector();
        int value = in.moveX();
        return value;
    }

    @Override
    public int yourMoveY(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnY();
        InputSelector in = new InputSelector();
        int value = in.moveY();
        return value;
    }
}
