package tekrar;

import java.util.Scanner;

public class C06Do_WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: Bir ondalik sayinin ondalik kismindaki rakamlarinin toplamini bulunuz.
        //           24.5673 ==> 5+6+7+3 = 21
        double sayi= 24.5673;
        String str=String.valueOf(sayi);
       String decimalPart= str.split("\\.")[1];
       int decimalInt= Integer.valueOf(decimalPart);
       int sum=0;
       do {
           sum=sum+decimalInt%10;

          decimalInt= decimalInt/10;


       }while (decimalInt>0);
        System.out.println(sum);

        //Example 1: Kullanicidan bir sayi aliniz, sayi 100 den kucuk ise ekrana "Kazandiniz!" yazdiriniz
        //           Aksi halde ekrana "Kaybettiniz!" yazdiriniz.
        //           Kullanici kazandikca oyun devam etmeli.

        Scanner input = new Scanner(System.in);
        int num=0;
        do {
            System.out.println("lütfen bir tam sayı giriniz");
            num=input.nextInt();
            if (num<100){
                System.out.println("kazandiniz");
            }

        }while (num<100);
        System.out.println("kaybettiniz");
    }
}
