package Book3.Chapter5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class TickTock {
    public static void main(String[] args) {
        Timer t = new Timer(1000,new Thicker());
        t.start();
        JOptionPane.showMessageDialog(null,
                "Click OK to exit program");
    }
}
class Thicker implements ActionListener{
    boolean tick = true;
    @Override
    public void actionPerformed(ActionEvent e) {

       if (tick){
           System.out.println("tick...");
       }else {
           System.out.println("tock...");
       }
       tick = !tick;
    }
}
