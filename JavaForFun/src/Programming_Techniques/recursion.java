package Programming_Techniques;

public class recursion {
    /*recursion is when you have a method that calls its self*/
    public static void main(String[] args) {
        sayHi();

    }
    private static void sayHi(){
        System.out.println("Hi");
        /*to make this method recursive, we will call it in of its self*/
        sayHi();
    }

}
