package Book3.Chapter4;

public class Ball2 {
    public double weight;
    public double height;
    public static void main(String[] args) {

//        Bassball2 b2 = new Bassball2(5.22);
//        System.out.println(b2);
//        Softball2 s2 = new Softball2(99);
//        System.out.println(s2);
//        Ball2 b3 = new Bassball2(55);
//        System.out.println(b3);
//        Bassball2.hit(b2);

        Bassball2 b = new Bassball2(55);
        b.hit(b);
        Ball2 bb = new Bassball2(77);
        b.hit((Bassball2) bb);





    }
    public Ball2(double weight,double height)
    {
        System.out.println(
                "Hello from the Ball constructor");
        this.weight = weight;
        this.height = height;
    }
    public String toString(){
        return "Weight of : " +weight + " " + " and Height of: " +height;
    }
}

class  Bassball2 extends Ball2
{
    public Bassball2( double weight){
        super(weight,9);
        System.out.println("Hello from the BaseBall constructor");
    }
    public  void hit(Bassball2 bassball2){
        System.out.println("Im hitting a Ball with a " + bassball2);
    }
}
class Softball2 extends Ball2{
    public Softball2( double weight){
        super(weight,5);
        System.out.println("Hello from the SoftBall constructor");
    }
}

