package Book2.Chapter5;

import java.util.Scanner;

public class GetABet3 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 5000;
        int bet;
        boolean validBet;
        System.out.println("You can bet between 1 an " + bank);

        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            validBet =true;
            if((bet <=0)||(bet > bank)){
                validBet=false;
                System.out.println("Invalid value");
            }
        } while (!validBet);
        System.out.println("Your money is Good here.");
    }
}
