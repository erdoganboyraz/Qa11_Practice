package practiceAdvence;

import java.util.Scanner;

public class Advenced_Dowhile01 {
    public static void main(String[] args) {
        /* 0-100 arasıda rastgele numara  tahmin yapan kodu yazın
        Girdiginiz numara rastgele numaradan kucukse ==> daha buyuk numara giriniz
        Girdiginiz numara rastgele numaradan buyukse==>daha kucuk numara giriniz
        Girdiginiz numara rastgele numaraya esitse ==>tebrikler kazandınız
         */
        Scanner input=new Scanner(System.in);
        int sayı;
        int rastgelesayı=(int) (Math.random()*100)+1;
        do {
            System.out.println("Lütfen 0-100arasında rastgele bir sayi giriniz");
             sayı= input.nextInt();
            if(rastgelesayı==sayı){
                System.out.println("tebrikler kazandınız");
            }

        }while(rastgelesayı!=sayı);
    }
}
