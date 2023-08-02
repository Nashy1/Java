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
        System.out.println("My Allowance: " + cf.format(myAllowance));
    }
    public static void  printCostOfPainBallGun(){
        double costOfGun = 69.95;
        System.out.println("Cost of PainBall Gun: " + cf.format(costOfGun));
    }
}