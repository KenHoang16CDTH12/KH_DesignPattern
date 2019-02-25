package model;

import controller.ScoreAlogrithmBase;

public class Clown extends ScoreAlogrithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
