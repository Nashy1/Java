package Book3.Chapter5;

public class TestBall implements Playable2 {
    public static void main(String[] args) {
        TestBall p = new TestBall();
        p.catchBall();
        p.throwBall();
        p.dropBall();
        p.kickBall();

    }

    @Override
    public void throwBall() {
        System.out.println("Throwing ball");
    }

    @Override
    public void kickBall() {
        System.out.println("Kicking the ball");
    }

    @Override
    public void catchBall() {
        System.out.println("Catching the Ball");
    }

    @Override
    public void dropBall() {
        System.out.println("Dropping the Ball");
    }

}


