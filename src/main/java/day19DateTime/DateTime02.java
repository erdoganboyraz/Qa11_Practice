package day19DateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("MM/dd/yy");
        String formatedDate1=dtf1.format(currentDate);
        System.out.println(formatedDate1);
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("MMM/dd/yy");
        String formatedDate2=dtf2.format(currentDate);
        System.out.println(formatedDate2);

        DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("MMMMdd/yy");
        String formatedDate3=dtf3.format(currentDate);
        System.out.println(formatedDate3);

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("MMMMdd/yy");
        String formatedDate4=dtf4.format(currentDate);
        System.out.println(formatedDate4);

        DateTimeFormatter dtf5=DateTimeFormatter.ofPattern("MMMMdd/yy");
        String formatedDate5=dtf5.format(currentDate);
        System.out.println(formatedDate5);

        //Example 2: Java dan aldiginiz time'in formatini degistiriniz
        LocalTime myTime=LocalTime.of(18,01,29,12456);
        System.out.println(myTime);

        DateTimeFormatter dtf7=DateTimeFormatter.ofPattern("hh:mm a");
        String formatedmyTime=dtf7.format(myTime);
        System.out.println(formatedmyTime);


    }
}
