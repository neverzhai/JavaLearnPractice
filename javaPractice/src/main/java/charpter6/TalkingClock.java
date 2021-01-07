package charpter6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

;

public class TalkingClock {

    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public void start(){
        ActionListener timerPrinter = new TimerPrinter();
        Timer timer = new Timer(interval, timerPrinter);
        timer.start();
    }

    public class TimerPrinter implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("At the tone, the time is "+ new Date());
            if(beep) Toolkit.getDefaultToolkit().beep();
        }
    }
}
