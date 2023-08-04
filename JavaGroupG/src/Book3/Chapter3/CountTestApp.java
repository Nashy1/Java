package Book3.Chapter3;

import javax.swing.*;

public class CountTestApp {
    public static void main(String[] args) {
        printCount();
        for (int i = 0; i < 10; i++) {
            CountTest c1 = new CountTest();
            printCount();
        }
    }
        private static void printCount(){
            System.out.println("There are now " + CountTest.getInstanceCount()
            + " instance of the CountTest class");
        }

    }
    class CountTest{
        private static int instanceCount = 0;
        public CountTest(){
            instanceCount++;
        }
        public static int getInstanceCount(){
            return instanceCount;
        }
    }
