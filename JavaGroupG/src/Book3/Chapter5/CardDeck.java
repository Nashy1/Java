package Book3.Chapter5;

public class CardDeck implements Dealable{
    @Override
    public void deal(int cards) {
        System.out.println("Dealing Cards " + cards + " cards");
    }
    private static void startGame(Dealable deck, String game)
    {
        if (game.equalsIgnoreCase("Poker"))
            deck.deal(5);
        else if (game.equalsIgnoreCase("Hearts"))
            deck.deal(13);
        else if (game.equalsIgnoreCase("Gin"))
            deck.deal(10);
    }

    public static void main(String[] args) {
//        CardDeck d = new CardDeck();
        Dealable d = new CardDeck();
        startGame(d,"hearts");
        startGame(d,"Gin");
        startGame(d,"poker");


    }
}
