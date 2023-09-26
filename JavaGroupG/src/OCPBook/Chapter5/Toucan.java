package OCPBook.Chapter5;

import java.awt.*;

public class Toucan {
//    public void fly(int[] lengths){
//        System.out.println("array of int");
//    }
    public void fly(int... lengths){
        System.out.println("array of int");
    }

    public static void main(String[] args) {
        Toucan t =new Toucan();
//        t.fly(new int[]{1,2,3});
        t.fly(1,2,3);
        t.ui(5);
    }

    private int ui(int i){
        return i;
    }

}
