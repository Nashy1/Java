package Book4.Chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for(int i = 0; i < 6; i++){
            lotto[i] = (int)(Math.random() * 10);
            Arrays.sort(lotto);
        }
        System.out.println("Enter a lucky number between 1 and 10: ");
        int lucky = sc.nextInt();
        int foundAt = Arrays.binarySearch(lotto, lucky);
        if (foundAt > -1)
            System.out.println("My number came up!");
        else
            System.out.println("I'm not lucky today.");
    }
}
