package Book5.Chapter3;

import java.util.Scanner;

public class Recursion {
    private static   Scanner sc = new Scanner(System.in);
    private static long factorial(int n){
        long f = 1;
        for (int i = 1; i<=n; i++){
            f= f * i;
        }  return f;

    }
    public static void main(String[] args) {
        System.out.println("Enter a number to get its Factorial:");
        int x = sc.nextInt();
        long fact;
        fact = factorial(x);
        System.out.println("The Factorial of " + x+ " is " + fact);
    }
}
