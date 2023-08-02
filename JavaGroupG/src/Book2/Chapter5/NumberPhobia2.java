package Book2.Chapter5;

import java.util.Scanner;

public class NumberPhobia2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 2;
        String input = "y";
        while (input.equalsIgnoreCase("Y")){
            System.out.println(n + " ");
            System.out.print("Do you want to Keep counting?" + "(Y or N)");
            input= sc.next();
            n +=2;
        }
        System.out.println("\n You Quite!. \n");

    }
//    System.out.println("You Quite");
}
