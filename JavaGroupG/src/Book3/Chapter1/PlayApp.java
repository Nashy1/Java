package Book3.Chapter1;

public class PlayApp {
    public static void main(String[] args) {
        Player p = new Player();
        p.setHealth(-10);
        System.out.println("Player P's Health status is " +p.getHealth());

        Player z = new Player();
        z.setHealth(200);
        System.out.println("Player Z's Health status is " +z.getHealth());
    }
}
