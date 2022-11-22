package day18List;

import java.util.Scanner;

public class Advencedforloop {
    public static void main(String[] args) {
          /* TASK :
      Kullanıcıdan 5 adet sayı isteyiniz
      Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.

           */
        Scanner input=new Scanner(System.in);
        int toplam=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Bir sayı giriniz " );
            int sayi=input.nextInt();
            if (sayi>5 && sayi<10){
                System.out.println("girdiginiz sayi 5 ile 10 arasinda oldugundan toplamaya dahil edilmemistir");
                continue;
            }
            toplam+=sayi;


        }
        System.out.println(toplam);

    }
}
