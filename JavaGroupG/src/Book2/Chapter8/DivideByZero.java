package Book2.Chapter8;

public class DivideByZero {
    public static void main(String[] args) {
        int  a= 20, b=0;
        try {
            int c = a/b;
            System.out.println(c);
        }catch (ArithmeticException e){
            System.out.println("You cant divide by 0");
        }
    }
}
