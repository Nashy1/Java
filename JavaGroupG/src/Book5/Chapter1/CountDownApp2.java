package Book5.Chapter1;

public class CountDownApp2 {
    public static void main(String[] args)
    {
        Thread clock = new CountDownClock(); →5
        Runnable flood, ignition, liftoff; →7
        flood = new LaunchEvent(16, "Flood the pad!");
        ignition = new LaunchEvent(6, "Start engines!");
        liftoff = new LaunchEvent(0, "Liftoff!");
        clock.start(); →12
        new Thread(flood).start(); →14
        new Thread(ignition).start();
        new Thread(liftoff).start();
    }
}
