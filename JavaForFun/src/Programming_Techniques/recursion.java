package Programming_Techniques;

public class recursion {
    /*recursion is when you have a method that calls its self*/
    public static void main(String[] args) {
        sayHi(3);

    }
    private static void sayHi(int count){
        System.out.println("Hi");
        /*we need an exit plan*/
        if (count <= 1){
            return;
        }
        /*to make this method recursive, we will call it in of its self*/
        sayHi(count - 1);
    }

}
