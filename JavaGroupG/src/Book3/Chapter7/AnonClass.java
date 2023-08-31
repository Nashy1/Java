package Book3.Chapter7;




public class AnonClass {
    public static void main(String[] args) {
        //concrete
        Ball b1 = new BaseBall();
        b1.hit();

        //Annon
        Ball b2 = new Ball(){
            public void hit(){
                System.out.println("You hit a Anonymous ball !");
            }
        };
        b2.hit();

       //Lambda
        Ball b3 = () -> System.out.println("You hit a lambda ball!");
        b3.hit();
    }


    }

    class BaseBall implements Ball {
    @Override
        public void hit() {
            System.out.println("You hitting a baseball");
        }

        }

    interface Ball {
        void hit();
    }









