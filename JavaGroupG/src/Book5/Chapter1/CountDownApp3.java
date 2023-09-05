package Book5.Chapter1;

import java.util.ArrayList;

public class CountDownApp3 {
    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock();
        ArrayList<Runnable> events =
                new ArrayList<Runnable>(); →10
        events.add(new LaunchEvent(16, →12
                "Flood the pad!", clock));
        events.add(new LaunchEvent(6,
                "Start engines!", clock));
        events.add(new LaunchEvent(0,
                "Liftoff!", clock));
        clock.start(); →19
        for (Runnable e : events) →21
        new Thread(e).start();
    }
}
