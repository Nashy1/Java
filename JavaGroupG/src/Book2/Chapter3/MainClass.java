package Book2.Chapter3;
import java.text.NumberFormat;

public class MainClass {
    public static void main(String[] args) {
//        int a = 21, b = 6;
//        double answer = a / b; // answer = 3.0
//        System.out.println(answer);



//        int a = 5; // a is 5
//        int b = -a; // b is -5
//        int c = -b; // c is +5
//        System.out.println( c);


//        int a = -5; // a is -5
//        int b = +a; // b is -5
//        a = 5; // a is now 5
//        int c = +a; // c is 5

        //square root
//        double x = Math.sqrt(9);
//        System.out.println(x);


//        NumberFormat cf = NumberFormat.getCurrencyInstance();
//
//        double salesTax = 12.425;
//        System.out.println(cf.format(salesTax));

//        NumberFormat nf = NumberFormat.getNumberInstance();
//        double x = 19923.32;
//        nf.setMinimumFractionDigits(3);
//        nf.setMaximumFractionDigits(3);
//        System.out.println(nf.format(x));

//        NumberFormat pf = NumberFormat.getPercentInstance();
//        double grade = .92;
//        System.out.println(pf.format(grade));

        float x = 0.1f;
        NumberFormat nf = NumberFormat.getNumberInstance();
        nf.setMinimumFractionDigits(10);
        System.out.println(nf.format(x));





   }
}
