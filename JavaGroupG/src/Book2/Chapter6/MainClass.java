package Book2.Chapter6;

import java.util.Locale;
import java.util.Scanner;

public class MainClass {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter your Class");
        String c = sc.nextLine();
        c = c.toLowerCase();
        char salesClass = c.charAt(0);
        double commissionRate;
        switch (salesClass)
        {

            case 'a':
                commissionRate = 0.02;
                break;

            case 'b':
                commissionRate = 0.035;
                break;

            case 'c':
                commissionRate = 0.05;
                break;
            default:
                commissionRate = 0.0;
                break;
        }
        System.out.println("Your commission is " + commissionRate);
    }
}
