package com.kodilla;

import java.util.ArrayList;
import java.util.List;

public class GameState {
    private List gameState = new ArrayList();

    public int getArraySize() {
    return gameState.size();
    }

    public List getGameState() {
        System.out.println(gameState);
        return gameState;
    }

    public void addValue(int value) {
        if (!gameState.contains(value)) {
            gameState.add(value);
        } else {
            System.out.println("Już ktoś stoi na tym polu, wybierz inne");
        }
    }
}
