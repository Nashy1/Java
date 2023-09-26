package OCPBook.Chapter5;
import java.util.Arrays;

//import static java.util.Arrays; // DOES NOT COMPILE
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // this won't compile because import has to come first
public class BadZooParking {
    public static void main(String[] args) {
        Arrays.asList("one");
    }
}
