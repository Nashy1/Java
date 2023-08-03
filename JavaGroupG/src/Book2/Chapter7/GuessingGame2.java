package Book2.Chapter7;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Locale;
import java.util.Scanner;

public class GuessingGame2 {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        System.out.println("Lets play a guessing game");
        do{
            playAround();
        }while (askForAnotherRound());
        System.out.println("\nThank you for playing");

    }

    public static void playAround(){
        boolean validInput;
        int number,guess;
        String answer;

        //This will pick a random number
        number = getRandomNumber();

        //This wil get the guess
        System.out.println("\nI'm thinking of a number "
                + "between 1 and 10.");
        System.out.print("What do you think it is? ");
        guess = getGuess();

        //This will check the guess
        if(guess == number){
            System.out.println("Your are right.Well Done");
        } else {
            System.out.println("You're wrong!" + "The number was " + number);
        }
    }


    //this method will generate a random number
    public static int getRandomNumber(){
        return (int)(Math.random()*10) +1;
    }

    //this method gets the guess and checks if the guess input is between 1-10
    public static int getGuess(){
        while (true){
            int guess = sc.nextInt();
            if((guess<1)||(guess>10)){
                System.out.println("Your number should be between 1-10" + "Please Try Again:");
            }else {
                return guess;
            }
        }
    }

    //this method will ask you if you are interested in playing again.
    public static boolean askForAnotherRound(){
        System.out.print("\nDo you want to Play again? (Y or N)");

        do {

            String answer;
            answer = sc.nextLine();

            if (answer.equalsIgnoreCase("Y")){
                return true;
            }
             else if (answer.equalsIgnoreCase("N")) {
            return false;
        }
        else {
            System.out.println("Please ans 'Y' or 'N'");
        }
        } while (true);

        }
    }

