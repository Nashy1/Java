package Book3.Chapter2;

public class PlayApp {
    public static void main(String[] args) {
        Player p = new Player();
        p.setHealth(55);
        System.out.println("Player P's Health status is " +p.getHealth());

        Player z = new Player();
        z.setHealth(20);
        System.out.println("Player Z's Health status is " +z.getHealth());
    }
}
