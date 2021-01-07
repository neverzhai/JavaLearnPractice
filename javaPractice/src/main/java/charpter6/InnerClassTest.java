package charpter6;

import javax.swing.*;

public class InnerClassTest {
    public static void main(String args[]){

        //inner class
//        TalkingClock clock = new TalkingClock(1000, true);
//        clock.start();

        //method local inner class
//        TalkingClockWithLocalInnerClass localInnerClass = new TalkingClockWithLocalInnerClass();
//        localInnerClass.start(2000, true);

        // anonymous inner class
//        AnonmousInnerClass anonmousInnerClass = new AnonmousInnerClass();
//        anonmousInnerClass.start(3000, true);

        //static inner class
        StaticInnerClass staticInnerClass = new StaticInnerClass();
        double[] d = new double[20];
        for(int i = 0; i< d.length; i++){
            d[i] = Math.random();
        }
        StaticInnerClass.Pair pair = staticInnerClass.minMax(d);
        System.out.println("min:"+ pair.getFirst());
        System.out.println("max:" + pair.getSecond());

        // keep program running until user selects ok;
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }


}