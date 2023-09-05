package Book5.Chapter1;

import java.util.ArrayList;

public class CountDownApp3 {
    public static void main(String[] args) {
        CountDownClock clock = new CountDownClock();
        ArrayList<Runnable> events = new ArrayList<Runnable>();
        events.add(new LaunchEvent(16,"Flood the pad!", clock));
        events.add(new LaunchEvent(6, "Start engines!", clock));
        events.add(new LaunchEvent(0, "Liftoff!", clock));
        clock.start();
        for (Runnable e : events) {
            new Thread(e).start();
        }
    }
    interface TimeMonitor →26
    {
        int getTime();
    }
    class CountDownClock extends Thread
            implements TimeMonitor →31
    {
        private int t; →33
public CountDownClock(int start) →35
        {
            this.t = start;
        }
        public void run()
        {
            for (; t >= 0; t--) →42
            {
                System.out.println("T minus " + t);
                Programming Threads
                CHAPTER 1 Programming Threads 487
                try
                {
                    Thread.sleep(1000);
                }
                catch (InterruptedException e)
                {}
            }
        }
        public int getTime() →54
        {
            return t;
        }
    }
}
