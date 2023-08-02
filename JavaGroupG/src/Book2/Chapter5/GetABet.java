package Book2.Chapter5;

import java.util.Scanner;

public class GetABet {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int bank = 5000;
        int bet;
        System.out.println("You can bet between 1 an " + bank);

        do {
            System.out.print("Enter your bet: ");
            bet = sc.nextInt();
            if((bet <=0)||(bet > bank)){
                System.out.println("Invalid value");
            }
        } while ((bet <= 0)||(bet > bank));
        System.out.println("Your money is Good here.");
    }
}
