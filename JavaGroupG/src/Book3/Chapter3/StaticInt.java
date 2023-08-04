package Book3.Chapter3;

public class StaticInt {
    public static int x;
    static {
        x =32;
        System.out.println("x is " + x);
    }
    public StaticInt(){
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        System.out.println(StaticInt.x);
    }
}
