package Book2.Chater4;

public class MainClass {
    public static void main(String[] args) {
        String msg = "You have " + appleCount + " apple"
                + ((appleCount>1) ? "s." : ".");
        System.out.println(msg);
    }
}
