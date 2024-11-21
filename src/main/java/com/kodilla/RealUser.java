package com.kodilla;

public class RealUser implements User {
    private final InputSelector in;

    public RealUser(InputSelector inputSelector) {
        this.in = inputSelector;
    }

    @Override
    public int yourMoveX(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnX();
        return in.moveX();
    }

    @Override
    public int yourMoveY(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnY();
        return in.moveY();
    }
}
