package OCPBook.Chapter5;

public class OverloadingMethodsWithArrays {
//    public static void walk(int[] ints) {}
//    public static void walk(Integer[] integers) {}

    public static void walk(int[] integers){}

    public static void main(String[] args) {
        walk(new int[2]);
    }
}
