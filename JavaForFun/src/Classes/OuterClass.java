package Classes;

public class OuterClass {
    int number =6;
    public void heyThere(){
        System.out.println("Hey there!");
    }

    public static   class InnerClass{
        //An innerClass is a class that is defined in side a class
        //this innerclass is non static. so to excess it we have to excess it under outerclass
        int innerNumber = 8;
        public void whatsUp(){
            System.out.println("whats up from the inner class");
        }
    }
}
