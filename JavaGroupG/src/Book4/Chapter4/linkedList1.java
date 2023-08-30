package Book4.Chapter4;

import java.util.LinkedList;

public class linkedList1 {
    public static void main(String[] args) {
        String jake = "Jake";
        LinkedList<String> officers= new LinkedList<>();
        //add
        officers.add("Mike");
        officers.add("Piko");
        officers.add("Zeke");
        officers.add("Walo");
        //addFirst
        officers.addFirst("Blake");
        officers.addFirst("Burns");
        officers.addFirst("Houlihan");
        officers.addFirst("Pierce");

        //adding in a specific index
        officers.add(2,jake);

        //updating an index using set
//        String removedItem = officers.set(2,"Murdock");




//        for (String s : officers) {
//            System.out.println(s);
//        }
//        System.out.println("Removed item is: " + removedItem);


        //removing
        System.out.println( "R:"+officers);
        officers.remove("Mike");
        System.out.println( "R1:"+officers);
        officers.remove(4);
        System.out.println("R2:" +officers);
        officers.remove((jake));
        System.out.println("R3:" +officers);
        officers.remove();
        System.out.println("R4:" +officers);
        officers.clear();
        System.out.println("R5:" +officers);


    }
}
