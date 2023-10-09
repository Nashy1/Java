package OCPBook.Chapter8;

import java.io.PrintWriter;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionalMethodTests {

    public static void main(String[] args) {
//        Predicate<String> egg = s -> s.contains("egg");
//        Predicate<String> brown = s -> s.contains("brown");
//
////        Predicate<String> brownEggs = s -> s.contains("egg") && s.contains("brown");
////        Predicate<String> otherEggs = s -> s.contains("eggs") && !s.contains("brown");
//
//        Predicate<String> brownEggs = egg.and(brown);
//        Predicate<String> otherEggs = egg.and(brown.negate());
//
//
//        System.out.println(brownEggs.test("brown eggs"));
//        System.out.println(otherEggs.test("scrambled eggs"));


//        Consumer<String>c1 = x -> System.out.print("1: " +x);
//        Consumer<String>c2 =x -> System.out.print(",2: "+x);
//        Consumer<String>combined = c1.andThen(c2);
//        combined.accept("Car");


//        Function<Integer,Integer>before = x -> x+400;
//        Function<Integer,Integer>after =x->x/2;
//
//        Function<Integer,Integer> combined = after.compose(before);
//        System.out.println(combined.apply(8));

        counts(( a, b)->"hello");
        count2((int x , int y) -> true);
        count3((String x, Double y,Integer i )->true);




    }
    static void counts(TestingA a){
        System.out.println(a.testTest(2,5));
    }
    static void count2(testing2 a){
        System.out.println(a.tt2(5,5));
    }
    static void count3(testing3 a){
        System.out.println(a.tt3("sf",5.5,7));
    }


   public void variables(int a){
        int b=1;
        Predicate<Integer>p1 =a2->  {
            String color ="red";
            System.out.println(color);
            return testingMethod();
        };
    }

    static boolean testingMethod(){
        int b2=0;
        int c=0;
        return b2==c;
    }
}


interface TestingA{
    String testTest(int n1, int n2);
}

interface  testing2{
    boolean tt2(int n1,int n2);
}

interface testing3{
    boolean tt3(String n1,Double n2,Integer n3);
}
