package Book5.Chapter1;

public class LaunchEvent implements Runnable{
    private int start;
    private String message;
    public LaunchEvent(int start, String message) →6
    {
        this.start = start;
        this.message = message;
    }
    public void run()
    {
        try
        {
            Thread.sleep(20000 - (start * 1000)); →16
        }
        catch (InterruptedException e)
        {}
        System.out.println(message); →20
    }
}
