package model;

import controller.ScoreAlogrithmBase;

public class Balloon extends ScoreAlogrithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
