package Book4.Chapter2;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
     static Scanner sc  = new Scanner(System.in);
    public static void main(String[] args) {
//        String name = new String[10];
//        String names[] = new String[100];
//        System.out.print("How many players? ");
//        int count = sc.nextInt();
//        String[] players = new String[count];
//        System.out.println(players.length);

//        String[] Days = new String[7];
//        Days[0] = "Sunday";
//        Days[1] = "Monday";
//        Days[2] = "Tuesday";
//        Days[3] = "Wednesday";
//        Days[4] = "Thursday";
//        Days[5] = "Friday";
//        Days[6] = "Saturday";

//        String[] days = { "Sunday", "Monday", "Tuesday",
//                "Wednesday", "Thursday",
//                "Friday", "Saturday" };
//        int[] numbers = new int[100];
//        for (int i = 0; i < 100; i++) {
//            numbers[i] = (int) (Math.random() * 100) + 1;
//            System.out.println(numbers[i]);
//        }

//        System.out.print("How many players? ");
//        int count = sc.nextInt();
//        sc.nextLine();
//        String[] players = new String[count];
//        for (int i = 0; i < count; i++)
//        {
//            System.out.print("Enter player name: ");
//            players[i] = sc.nextLine();
//        }
//        System.out.println("The players are :");
//        for (int i = 0; i < count; i++){
//            System.out.println(players[i]);
//        }


//        int[] startValues = new int[10];
//        Arrays.fill(startValues, 100);
//        for (int i :startValues){
//            System.out.println(i);
//        }

        int[] ran = new int[1000];
        Arrays.fill(ran, (int)(Math.random() * 100) + 1);
        for (int i: ran) {
            System.out.println(i);
        }

    }

}
