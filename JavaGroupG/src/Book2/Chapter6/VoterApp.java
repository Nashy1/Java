package Book2.Chapter6;

import java.util.Scanner;

public class VoterApp {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args)
    {
        System.out.println
                ("Welcome to the voting machine "
                        + "error code decoder.\n"
                        + "If your voting machine generates "
                        + "an error code,\n"
                        + "you can use this program to determine "
                        + "the exact\ncause of the error.\n");
        System.out.print("Enter the error code: ");
        int err = sc.nextInt();
        String msg = switch (err) {
            case 1 -> "Voter marked more than one " + "candidate.\nBallot rejected.";
            case 2 -> "Box checked and write-in candidate " + "entered. \nBallot rejected";
            case 3 -> "Entire ballot was blank. \n" + "Ballot filled in according to " + "secret plan.";
            case 4 -> "Nothing unusual about the ballot.\n"
                    + "Voter randomly selected for tax audit.";
            case 5 -> "Voter filled in every box.\n"
                    + "Ballot counted twice.";
            case 6 -> "Voter drooled in voting machine.\n"
                    + "Beginning spin cycle.";
            case 7 -> "Voter lied to pollster after voting.\n"
                    + "Voter's ballot changed "
                    + "to match polling data.";
            default -> "Voter filled out ballot correctly.\n"
                    + "Ballot discarded anyway.";
        };
        System.out.println(msg);
        }

    }

