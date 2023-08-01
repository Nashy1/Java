package Book2.Chapter2;

public class EnumTest {
    public enum CardSuit{HEARTS,SPADES,CLUBS,DIAMONDS}
    public enum RPS{ROCK,PAPER,SCISSORS}

    public static void main(String[] args) {
//        CardSuit suit;
//        suit = CardSuit.DIAMONDS;
//        System.out.println("The suit is " + suit);

        RPS choice;
        choice = RPS.PAPER;
        System.out.println(choice);
    }
}
