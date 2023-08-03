package Book2.Chapter8;

import java.util.Scanner;

public class GetInteger2 {
    static Scanner sc = new Scanner(System.in);
    

    public static void main(String[] args) {
        System.out.print("Enter an Integer: ");
        int i = GetAnIntegr();
        System.out.println("You entered "+ i);
    }
    public static int GetAnIntegr(){
        while (!sc.hasNextInt()){
            sc.nextLine();
            System.out.println("That's not an integer. \nTry again:");
        }
        return sc.nextInt();
    }
}

