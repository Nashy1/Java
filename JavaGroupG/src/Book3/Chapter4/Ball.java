package Book3.Chapter4;

public class Ball {
    public static void main(String[] args) {
        BaseBall b = new BaseBall();
        b.hit();

    }


    private double weight;

    protected double getWeight() {
        return this.weight;
    }

    protected void setWeight(double weight) {
        this.weight = weight;
    }

    public void hit() {
        System.out.println("You hit it a mile!");
    }
}

 class BaseBall extends Ball
    {
        public BaseBall()
        {
            setWeight(5.125);
        }
        public void hit()
        {
            System.out.println("You tore the cover off!");
            super.hit();
        }
    }

