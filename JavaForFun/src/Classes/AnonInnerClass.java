package Classes;

public class AnonInnerClass {
    /*an anonymous inner class is a class with no name that you use to instantiate
    * only one object ever*/
    /*anon inner class we always be defining that that class and instantiating the single object
    * the same time */
    public static void main(String[] args) {
        /* they can either extend an existings class or implement any existing interface*/

        Animal myAn = new Animal();
        myAn.makeNoise();

        Animal bigfoot = new Animal(){
            /*this is what anoninnerclass allows you to do,they allow you to create unnamed
            subclass of some other class,and create one single object of that AC*/
            public void makeNoise(){
                System.out.println("Grrrrrrrrr");
            }
        };
        bigfoot.makeNoise();

    }
}
 class Animal{
    public void makeNoise(){
        System.out.println("mooooo mooooo");
    }
}