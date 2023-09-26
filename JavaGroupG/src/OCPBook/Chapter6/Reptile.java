package OCPBook.Chapter6;

public class Reptile {
    protected int speed = 10;
}

class Crocodile extends Reptile{
    protected int speed =20;
    public int getSpeed(){
        return speed;
    }

    public static void main(String[] args) {
        var croc = new Crocodile();
        System.out.println(croc.getSpeed());
    }
}
