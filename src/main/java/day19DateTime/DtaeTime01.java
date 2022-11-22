package day19DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DtaeTime01 {
    public static void main(String[] args) {
        //Example 1: Java'dan aldiginiz Date'i "ay/gun/yil" olarak yaziniz
        LocalDate currentDate= LocalDate.now();
        System.out.println(currentDate);
        //Example 2: "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalTime currentTime=LocalTime.now();
        System.out.println(currentTime);
        //Example 3: "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTime=LocalDateTime.now();
        System.out.println(currentDateTime);
        //Example 4: Japonya'daki "Anlik tarihi"(Current Date) ve "Anlik zamani"(Current Time) ekrana yazdiran kodu yaziniz
        LocalDateTime currentDateTimeJapan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(currentDateTimeJapan);
        LocalDateTime currentDateTimeIstanbul=LocalDateTime.now(ZoneId.of("Europe/Istanbul"));
        System.out.println(currentDateTimeIstanbul);
        //Example 6: Bugunden 789 gun sonra emekli olacaginiza gore, emeklilik tarihini hesaplayan kodu yaziniz.
        LocalDate count=LocalDate.of(2022,10,22);
        LocalDate retire=count.plusDays(789);
        System.out.println(retire);

        //Example 7: Iki cocugunuzun dogum tarihleri arasindaki farki gun olarak hesaplayan kodu yaziniz
        LocalDate dobAli = LocalDate.of(2005, 5, 17);
        LocalDate dobVeli = LocalDate.of(2013, 2, 8);
        Long diff= ChronoUnit.DAYS.between(dobAli,dobVeli);
        System.out.println(diff);
        //Example 8: Istanbul'un Fethi ile, Cumhuriyet'in kurulmasi arasinda kac ay oldugunu gosteren kodu yaziniz.
        //           29 Mayis 1453 ==> Istanbul'un Fethi              29 Ekim 1923 ==> Cumhuriyet'in kurulusu
        LocalDate istfth=LocalDate.of(1453,5,29);
        LocalDate cmhrt=LocalDate.of(1923,10,29);
        Long frk=ChronoUnit.MONTHS.between(istfth,cmhrt);
        System.out.println(frk);
        //Example 9: Verilen tarih'in hangi burcta oldugunu gosteren kodu yaziniz
        LocalDate myDate = LocalDate.of(1989, 5, 13);
        int day=myDate.getDayOfMonth();
        int month= myDate.getMonthValue();
        System.out.println(month+"-"+day);
        if(day<=21&&month==3){
            System.out.println("koc");

        } else if (day<=21&&month==4) {
            System.out.println("koc");

        } else if (day<=21&&month==4) {
            System.out.println("boga");

        } else if (day<=21&&month==5) {
            System.out.println("boga");

        }
        // 2. yol
        if((day<=21&&month==3)||(day<=21&&month==4)){
            System.out.println("koc");

        } else if ((day<=21&&month==4)||(day<=21&&month==4)) {
            System.out.println("koc");

        }



    }
}
