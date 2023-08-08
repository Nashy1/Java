package Book3.Chapter5;

public abstract class Ball {
    public abstract void hit(int batSpeed);

    public static void main(String[] args) {
        BaseBall x = new BaseBall();
        x.hit(200);

        BallFactoryInstance bf = new BallFactoryInstance();
        Ball newBall = bf.getBall("SoftBall");
        Ball newBall2 = bf.getBall("BaseBall");
        newBall.hit(550);
        newBall2.hit(100);
    }
}
 class  BaseBall extends Ball{
    public void hit(int batSpeed){
        System.out.println("The BaseBall is going at a speed of " + batSpeed);
    }
}

class SoftBall extends Ball{
    public void hit(int batSpeed){
        System.out.println("The SoftBall is going at a speed of " + batSpeed);
    }
}
