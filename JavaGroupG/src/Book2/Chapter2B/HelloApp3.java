package Book2.Chapter2B;

import Book2.Chapter2.HelloApp1;

public class HelloApp3 {
    public static void main(String[] args) {
        HelloApp1 c = new HelloApp1();//creating instance of HelloApp1 to use and print its instance variable
        c.helloMessage = "Hi there";
        System.out.println(c.helloMessage);


        System.out.println(HelloApp1.helloMessage1);//printing a class/static variable from HelloApp1 using its class name in front of it


        HelloApp1.main(args);//running every method inside the main function from our HelloApp1 class
    }
}
