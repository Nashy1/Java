package Games.GuessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Random ran = new Random();//we create an instance of random which will genrate
        int randNum = ran.nextInt(100) + 1;
//        System.out.println(randNum);

        int tryCount = 0;

        while (true) {
            System.out.println("Guess a number between 1-100:");
            int guess = sc.nextInt();
            tryCount++;
            if (guess == randNum) {
                System.out.println("Correct you win!");
                System.out.println("It took you "+ tryCount + " tries");
                break;
            } else if (randNum > guess) {
                System.out.println("Nope, the real number is higher.Guess again");
            } else {
                System.out.println("Nope, the real number is lower.Guess again");
            }
        }
        sc.close();
    }
}