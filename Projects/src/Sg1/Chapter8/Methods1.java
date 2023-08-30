package Sg1.Chapter8;

public class Methods1 {
    public static void main(String[] args){
        Item item1 = new Item();

        // Call the setColor method on item1. Print an appropriate message,
        //  depending upon the return value.

        if (item1.setColor('B')){
            System.out.println("Item1.color = "+item1.color);
        }else System.out.println("Invalid color");
    }
}
 class Item {
    char color;

    // Declare and code the setColor method.

    public boolean setColor(char colorCode){
        if (colorCode == ' '){
            return false;
        }
        else {
            this.color = colorCode;
            return true;
        }
    }
}