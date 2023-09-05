package Book5.Chapter1;

import java.util.ArrayList;
//
//public class CountDownApp3 {
//    public static void main(String[] args) {
//        CountDownClock2 clock2 = new CountDownClock2(20);
//
//    }
//    interface TimeMonitor
//    {
//        int getTime();
//    }
//    class CountDownClock2 extends Thread
//            implements TimeMonitor
//    {
//        private int t;
//public CountDownClock2(int start)
//        {
//            this.t = start;
//        }
//        public void run()
//        {
//            for (; t >= 0; t--)
//            {
//                System.out.println("T minus " + t);
//
//                try
//                {
//                    Thread.sleep(1000);
//                }
//                catch (InterruptedException e)
//                {}
//            }
//        }
//        public int getTime()
//        {
//            return t;
//        }
//    }
//
//    class LaunchEvent2 implements Runnable
//    {
//        private int start;
//        private String message;
//        TimeMonitor tm;
//public LaunchEvent2(int start, String message,
//            TimeMonitor monitor)
//        {
//            this.start = start;
//            this.message = message;
//            this.tm = monitor;
//        }
//        public void run()
//        {
//            boolean eventDone = false;
//            while (!eventDone)
//            {
//                try
//                {
//                    Thread.sleep(10);
//                }
//                catch (InterruptedException e)
//                {}
//                if (tm.getTime() <= start)
//                {
//                    System.out.println(this.message);
//                    eventDone = true;
//                }
//            }
//        }
//    }
//}
