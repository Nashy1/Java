package Book4.Chapter2;

import javax.sound.midi.Soundbank;

public class Enhancedloop {
    public static void main(String[] args) {
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        for(String day: days){
            System.out.println(day);
        }
    }

    public static String[] getDaysOfWeeks(){
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday"};
        return days;
    }


}
