package Book3.Chapter5;

public interface CardGame {
    void shuffleCards();
    default void deck(){
        System.out.println();
    }
}
