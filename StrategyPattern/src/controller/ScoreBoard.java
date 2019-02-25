package controller;

public class ScoreBoard {
    public ScoreAlogrithmBase alogrithmBase;

    public void showScrore(int taps, int multiplier) {
        System.out.println(alogrithmBase.calculateScore(taps, multiplier));
    }
}
