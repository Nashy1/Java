package OCPBook.Chapter8;

import java.io.PrintWriter;
import java.util.function.Predicate;

public class FunctionalMethodTests {

    public static void main(String[] args) {
        Predicate<String> egg = s -> s.contains("egg");
        Predicate<String> brown = s -> s.contains("brown");

//        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
//        Predicate<String> otherEggs = s -> s.contains("eggs") && !s.contains("brown");

        Predicate<String> brownEggs = egg.and(brown);
        Predicate<String> otherEggs = egg.and(brown.negate());


        System.out.println(brownEggs.test("brown eggs"));
        System.out.println(otherEggs.test("scrambled eggs"));
    }
}
