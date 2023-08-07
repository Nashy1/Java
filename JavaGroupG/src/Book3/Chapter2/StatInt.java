package Book3.Chapter2;

import java.util.Scanner;

public class StatInt {
    private Scanner sc = new Scanner(System.in);
    public int x ;

    {
        System.out.print("Enter the starting value "
                + "for x: ");
        x= sc.nextInt();
    }
    public StatInt(){
        System.out.println("In default constructor");
    }


}
