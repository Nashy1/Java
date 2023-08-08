package Book3.Chapter5;

public class TicTacToe implements Playable,CardGame{
    @Override
    public void play() {
        System.out.println("Playing TicTacToe");
    }

    @Override
    public void shuffleCards() {
        System.out.println("Shuffling The CARDS");
    }

    public static void main(String[] args) {
//            TicTacToe g = new TicTacToe();
//            g.play();
//            g.shuffleCards();
            Playable g2 = new TicTacToe();
            g2.play();
    }
}
