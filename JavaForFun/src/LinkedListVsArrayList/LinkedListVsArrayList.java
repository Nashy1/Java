package LinkedListVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListVsArrayList {

    /*The differences between this two class is how they are implemented behind the
      scenes and depending on what your specific program has to do. Using one over the other can
     impact the performance of your program.
     basically the arrayList uses an array as its underlyiing data structure
     */
    public static void main(String[] args) {
        LinkedList<String> nameLinkedlist = new LinkedList<>();
        nameLinkedlist.add("Ash");
        nameLinkedlist.add("Rey");
        nameLinkedlist.add("Edi");

        ArrayList<String> nameArraylist = new ArrayList<>();
        nameArraylist.add("Jol");
        nameArraylist.add("Pol");
        nameArraylist.add("Zol");


    }
}
