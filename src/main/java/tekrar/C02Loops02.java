package tekrar;

import java.util.Scanner;

public class C02Loops02 {
    public static void main(String[] args) {
        //Example 1: 3 den 6 a kadar tamsayilarin toplamini bulan kodu yaziniz
        int sum=0;
        for (int i = 3; i <=6; i++) {
            sum=sum+i;



        }
        System.out.println(sum);
        //Example 2: 6 den 3 a kadar tamsayilarin carpimini bulan kodu yaziniz
        int mul=1;
        for (int i = 6; i > 2; i--) {
            mul=mul*i;

        }
        System.out.println(mul);
        //Example 3: Size verilen bir tamsayinin rakamlari toplamini bulunuz
        Scanner in = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int sayı= in.nextInt();
        sayı=Math.abs(sayı);
        int count=0;
        for (int i = sayı; i >0; i=i/10) {
            count=count+i%10;


        }
        System.out.println(count);

        //Example 4: Size verilen bir String'i ters ceviren kodu yaziniz.
        //           "Kaba" ==> "abaK"
        String str="Kaba";
        String ters="";
        for (int i =str.length()-1 ; i >= 0; i--) {
            char c=str.charAt(i);
            ters=ters+c;


        }
        System.out.println(ters);


    }
}
