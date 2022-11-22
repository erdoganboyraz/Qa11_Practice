package day19DateTime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class DateTime03 {
    public static void main(String[] args) {

        //Example 1: Japonya ile Almanya arasindaki zaman farkini saat olarak hesaplayan kodu yaziniz
        LocalDateTime japan=LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        LocalDateTime germany=LocalDateTime.now(ZoneId.of("Europe/Berlin"));
       Long fark= ChronoUnit.HOURS.between(germany,japan);
        System.out.println(fark);
        //ExaMPLE3:   USA için"Wow" ,UK için "Big", CANADA için "Cold" Turkey için "Vatan" Germany için "Araba" Rwanda için"Cay"
        Countrıes country=Countrıes.USA;
        switch (country){
            case USA:
                System.out.println("Wow");
                break;
            case UK:
                System.out.println("Big");
                break;
            case CANADA:
                System.out.println("Cold");
                break;
            case TURKEY:
                System.out.println("Vatan");
                break;
            case GERMANY:
                System.out.println("Araba");
                break;
            case RWANDA:
                System.out.println("Cay");
                break;
            default:
                System.out.println("tanımlanmamış ülke");

        }

    }
}
