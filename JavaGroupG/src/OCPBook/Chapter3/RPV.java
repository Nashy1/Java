package OCPBook.Chapter3;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;

public class RPV {
    public static void main(String[] args) {
       double number = 9.0;

//        compareIntegers(number);
        printIntegerTwice(number);
    }
//    static void compareIntegers(Number number) {
//        if(number instanceof final Integer data&& data.compareTo(5)>0) {
//            System.out.print("Number is greater then 5 " +data);
//        }
//    }



//    void printIntegersOrNumbersGreaterThan5(Number number) {
//        if(number instanceof final Integer data || data.compareTo(5)>0)
//            System.out.print(data);
//    }


    static void printIntegerTwice(Number number) {
        if (!(number instanceof Integer data)) {
            System.out.println("Not an instance of Integer");
        }else
            System.out.print(data.intValue());
    }



}
