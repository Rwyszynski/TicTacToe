package com.kodilla;

public class RealUser implements User {
    private final InputSelector in;

    public RealUser(InputSelector inputSelector) {
        if(inputSelector != null) {
            this.in = inputSelector;
        } else {
            in = new InputSelector();
        }
    }

    @Override
    public int yourMoveX(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnX();
        int value = in.moveX();
        return value;
    }

    @Override
    public int yourMoveY(int board) {
        OutputComputer oc = new OutputComputer();
        oc.playerTurnY();
        int value = in.moveY();
        return value;
    }
}
