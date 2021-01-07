package charpter4;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class CalendarTest {

    public static void main(String[] args){
        LocalDate date = LocalDate.now();

        int today = date.getDayOfMonth();
        int month = date.getMonthValue();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int weekdayValue = weekday.getValue();
        System.out.println(weekdayValue);

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i = 1; i < weekdayValue; i++){
            System.out.printf("%4s", " ");
        }

        while(date.getMonthValue()  == month) {
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1) {
                System.out.println();
            }
        }
        if(date.getDayOfWeek().getValue() != 1) {
            System.out.println();
        }

    }
}
