import model.*;

public class HomeTheaterDrive {
    public static void main(String[] args) {
        PopcornPopper popcornPopper = new PopcornPopper();
        Projector projector = new Projector();
        Screen screen = new Screen();
        TheaterLights theaterLights = new TheaterLights();
        Tuner tuner = new Tuner();
        Amplifer amplifer = new Amplifer();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifer, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper);

        homeTheater.watchMovie("Infinity War End Game");
        homeTheater.endMovie();
    }
}
