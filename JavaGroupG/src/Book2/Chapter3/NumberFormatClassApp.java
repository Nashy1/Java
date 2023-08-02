package Book2.Chapter3;

import java.text.NumberFormat;
public class NumberFormatClassApp {
   static NumberFormat cf = NumberFormat.getCurrencyInstance();

    public static void main(String[] args) {
        printMyAllowance();
        printCostOfPainBallGun();
    }
    public static void printMyAllowance(){
        double myAllowance = 10.00;
        cf = NumberFormat.getCurrencyInstance();
        System.out.println("My Allowance: " + cf.format(myAllowance));
    }
    public static void  printCostOfPainBallGun(){
        
    }
}