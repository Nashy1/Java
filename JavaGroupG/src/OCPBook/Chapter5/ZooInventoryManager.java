package OCPBook.Chapter5;

public class ZooInventoryManager {
    private static final String[] treat =new String[10];
    public static void main (String[] args){
//        treat = new String[15]; //since treat is final we can't change the capacity of the array
        treat[0] = "popcorn";//we can change the values in the array
        System.out.println(treat[0]);
    }


}
