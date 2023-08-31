package Book3.Chapter7;

import javax.swing.*;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TickTockAnon {
    private String tickMessage = "Tick....";
    private String tockMessage = "Tock....";

    public static void main(String[] args) {
        TickTockAnon t = new TickTockAnon();
        t.go();

    }
    private void go(){
        Timer t = new Timer(1000, new ActionListener() {
           private boolean tick = true;
           public void actionPerformed(ActionEvent event){
               if (tick){
                   System.out.println(tickMessage);
               }else {
                   System.out.println(tockMessage);
               }
               tick = !tick;
           }
        });
        t.start();

        JOptionPane.showMessageDialog(null,"Click Ok to exit program");
        System.exit(0);
    }

}
