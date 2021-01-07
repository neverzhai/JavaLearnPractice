package charpter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class AnonmousInnerClass {
    public void start(int interval, boolean beep){

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("anonymous inner class,the time is " + new Date());
                if (beep) Toolkit.getDefaultToolkit().beep();
            }
        };

        Timer timer = new Timer(interval, listener);
        timer.start();
    }
}
