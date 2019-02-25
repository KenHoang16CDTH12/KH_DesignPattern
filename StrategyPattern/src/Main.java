import controller.ScoreBoard;
import model.Balloon;
import model.Clown;
import model.SquareBalloon;

public class Main {
    public static void main(String[] args) {
        ScoreBoard scoreBoard = new ScoreBoard();
        System.out.println("Balloon tap score: ");
        scoreBoard.alogrithmBase = new Balloon();
        scoreBoard.showScrore(10, 5);
        System.out.println("Clown tap score: ");
        scoreBoard.alogrithmBase = new Clown();
        scoreBoard.showScrore(10, 5);
        System.out.println("Square balloon score:");
        scoreBoard.alogrithmBase = new SquareBalloon();
        scoreBoard.showScrore(10, 5);
    }
}
