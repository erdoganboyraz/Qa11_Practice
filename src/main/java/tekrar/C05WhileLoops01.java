package tekrar;

import java.util.Scanner;

public class C05WhileLoops01 {
    //Example 1: 3 den 10 a kadar tamsayilari ayni satirda ekrana yazdiran kodu yaziniz

    public static void main(String[] args) {
        //1.Yol:
        for (int i = 3; i <= 10; i++) {
            System.out.print(i);


        }
        System.out.println();
        //2.yol:
        int i = 3;
        while (i<=10){
            System.out.print(i);
            i++;

        }
        System.out.println();
        //Example 2: 17 den 4 e kadar tum cift sayilari ekrana ayni satirda yazdiran kodu yaziniz
        int k = 17;
        while(k>3){
            if(k%2==0){
                System.out.print(k +" ");
            }
            k--;
        }

        System.out.println();

        //Example 3: 12 den 67 e kadar sayilarin toplamini veren kodu yaziniz
        int sum = 0;
        int a = 12;
        while (a<68){
            sum +=a;

            a++;
        }
        System.out.println(sum);
        //Example 4: Size verilen bir tamsayinin rakamlari toplamini ekrana yazdiran kodu yaziniz
        int sum1= 0;

        int s=-575;
        s=Math.abs(s);
        while (s>0){

            sum1=sum1+s%10;
            s=s/10;

        }
        System.out.println(sum1);

        //Example 5: Kullanicidan aldiginiz bir sayinin carpim tablosunu ekrana yazdiriniz
        //          3 ==> 3x1=3   3x2=6  3x3=9  ...  3x10=30
        Scanner input = new Scanner(System.in);
        System.out.println( "Lütfen carpim tablosu icin bir numara giriniz");
        int sayi= input.nextInt();
        int n=1;

        while (n<11){
            System.out.println(sayi + "*" + n + "=" + sayi*n);
           n++;
        }









    }
}
