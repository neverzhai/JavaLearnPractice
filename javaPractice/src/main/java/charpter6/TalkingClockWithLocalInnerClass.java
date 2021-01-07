package charpter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class TalkingClockWithLocalInnerClass {
    public void start(int interval, boolean beep){
        class TimerPrinter implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("local inner class, the time is" + new Date());
                if(beep){
                    Toolkit.getDefaultToolkit().beep();
                }
            }
        }
        ActionListener printer = new TimerPrinter();
        Timer timer = new Timer(interval, printer);
        timer.start();
    }
}
