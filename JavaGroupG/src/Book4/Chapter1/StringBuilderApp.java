package Book4.Chapter1;

import java.util.Scanner;

public class StringBuilderApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);

        int vowelCount=0;
        for (int i = 0; i < sb.length(); i++){
            char c = Character.toLowerCase(sb.charAt(i));
            if (c=='a'|| c=='e' || c=='i' || c=='o' ||c=='u'){
                sb.setCharAt(i,'*');
                vowelCount ++;
            }
        }
        System.out.println(s);
        System.out.println(sb.toString());
        System.out.println("vowels changed: " + vowelCount);
    }
}
