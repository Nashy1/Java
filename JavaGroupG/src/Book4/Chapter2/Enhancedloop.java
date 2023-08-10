package Book4.Chapter2;

import javax.sound.midi.Soundbank;

public class Enhancedloop {
    public static void main(String[] args) {
        String[] days =getDaysOfWeeks();
        printStringArray(days);
    }

    public static String[] getDaysOfWeeks(){
        String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        return days;
    }

    public static void printStringArray(String[] strings){
        for(String s: strings){
            System.out.println(s);
        }
    }


}
