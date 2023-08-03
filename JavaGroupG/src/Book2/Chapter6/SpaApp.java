package Book2.Chapter6;

import java.util.Scanner;

public class SpaApp {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("The Spa application!\n\n");
        System.out.print("Enter Your Massage package code: ");
        String s = sc.next();
        s = s.toLowerCase();
        char p = s.charAt(0);

        String details = "";
        switch (p){
            case 'c':
                details += "\tHead Massage\n";
            case 'b':
                details += "\tBody Massage\n";
            case 'a':
                details += "\tLeg Massage\n";
                break;
            default:
                details +="Well this is all we have.";
                break;
        }
        System.out.println("\nThis package includes: \n");
        System.out.println(details);
    }
}
