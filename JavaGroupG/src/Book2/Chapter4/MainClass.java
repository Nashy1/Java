package Book2.Chapter4;

public class MainClass {
    public static void main(String[] args) {
        int appleCount = 5;
        String msg = "You have " + appleCount + " apple"
                + ((appleCount>1) ? "s." : ".");
        System.out.println(msg);

        String answer = "no";
        if (answer.equals("Yes"))
            System.out.println("The answer is Yes.");
    }
}
