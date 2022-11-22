import java.util.Scanner;

public class Turnery_İf {
    public static void main(String[] args) {
         /*
        TASK :
         Kullanıcıdan sifirdan buyuk pozitif bir tamsayı girmesini isteyin.
         Girilen pozitif tamsayı 3 basamaklı ise ekrana “3 Basamaklı” yazdırın.
         3 basamaklı degilse çift olup olmadigini kontrol edin.
         Çift ise “3 basamaklı olmayan çift sayı” yazdırın.
         Çift sayı degilse “3 basamaklı olmayan tek sayı yazdırın.”
         */
        Scanner input = new Scanner((System.in));
        System.out.println("lütfen sıfırdan büyük bir tam sayı giriniz");
        int sayi = input.nextInt();

        String sonuc = (sayi > 0) ? (sayi > 99 && sayi < 1000) ? ("3 basamakli 0'dan buyuk sayi") ://0'dan buyuk 3 bas.Sayilari inceledik
                (sayi % 2 == 0) ? ("3 basamakli olmayan cift sayi") : ("3 basamakli olmayan tek sayi") ://0'dan buyuk 3 bas.olmayan sayilarin cift mi tek mi baktik
                "Lutfen sifirdan buyuk bir sayi giriniz";// 0 ve sifirdan kucuk olma ihtimalini inceledik


        // 2. yol if
        if (sayi > 0) {
            if (sayi > 99 && sayi < 1000) {
                System.out.println("üç basamaklı tam sayı");
            } else if (sayi % 2 == 0) {
                System.out.println("üç basmaklı olmayan çift sayı");
            } else
                System.out.println("üç basamaklı olmayan tek sayi");
        }else System.out.println("lütfen 0 dan büyük tam sayı giriniz");

    }
}




