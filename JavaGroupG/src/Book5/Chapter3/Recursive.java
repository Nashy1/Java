package Book5.Chapter3;

import java.util.Scanner;

public class Recursive {
    private static Scanner sc = new Scanner(System.in);

    private static long factorial(int n){
        if (n == 1){
            return 1;
        }else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a number to get its Factorial:");
        int x = sc.nextInt();
        long fact;
        fact = factorial(x);
        System.out.println("The Factorial of " + x+ " is " + fact);
    }
}
