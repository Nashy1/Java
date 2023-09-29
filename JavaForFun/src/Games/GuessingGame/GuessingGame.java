package Games.GuessingGame;

import java.util.Scanner;

public class GuessingGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int num = (int)Math.floor(Math.random()*10+1);
        System.out.println("Guess a number between 0-10: ");
        int guess = sc.nextInt();
        if(guess == num){
            System.out.println("wow you got it");
        }else {
            System.out.println("Sorry try again");
        }
    }
}
