package Book2.Chapter8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetInteger {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter an inteder: ");
        int i = GetAnInteger();
        System.out.println("You entered" + i);
    }
    public static int GetAnInteger(){
        while (true){
            try {
                return sc.nextInt();
            }catch (InputMismatchException e){
                sc.next();
                System.out.println("That's not " + "an integer. Try again: ");
            }
        }
    }
}
