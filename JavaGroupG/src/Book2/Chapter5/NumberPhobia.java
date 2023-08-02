package Book2.Chapter5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class NumberPhobia {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 2;
        String input;
        while (true){
            System.out.println(n + " ");
            System.out.print("Do you want to Keep counting?" + "(Y or N)");
            input= sc.next();
            if (input.equalsIgnoreCase("N")){
                break;
            }
            n +=2;
            System.out.println("\n Whew! That was close. \n");
        }
        System.out.println("You Quite");
    }
}
