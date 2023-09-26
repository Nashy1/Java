package OCPBook.Chapter5;

public class BoxingAndUnboxing {
    public static void main(String[] args) {
        int quack =5;
        Integer quackquack = quack; //Autoboxing
        int quackquackquack =quack; //Unboxing

        Short tail =8;              //Autoboxing
        Character p = Character.valueOf('p');
        char paw = p;              //Unboxing
        Boolean nose = true;      //Autoboxing
        Integer e = Integer.valueOf(9);
        long ears =e;             // Unboxing, then implicit casting

    }

}
