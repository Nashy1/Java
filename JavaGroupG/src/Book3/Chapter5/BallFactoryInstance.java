package Book3.Chapter5;

class BallFactoryInstance {
    public static Ball getBall(String o) {
        if (o.equalsIgnoreCase("BaseBall")) {
            return new BaseBall();
        }
        if (o.equalsIgnoreCase("SoftBall")) {
            return new SoftBall();
        }
        return null;
    }
}
