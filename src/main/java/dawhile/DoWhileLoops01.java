package dawhile;

import java.util.Scanner;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //Bir ondalık sayının sadece ondalık kısımkarındaki sayıların rakamsal degerini toplayan kodu yazın
        double num=24.5673;
        String str=String.valueOf(num);
        String decimalpart=str.split("\\.")[1];
        int decimalint=Integer.valueOf(decimalpart);
        System.out.println(decimalint);
        int sum=0;
        for(int i=5673;i>0;i=i/10){
            sum=sum+i%10;

        }
        System.out.println(sum);
       // kullanıcıdan bır sayı alınız sayı100 den kucuk ise ekrana kazandınız yazdırın aksi halde kaybettiniz yazdırın
        //kullanıcı kazandıkca oyun devam etmeli
        Scanner input=new Scanner(System.in);


        int sayı=0;
        do{
            System.out.println("lütfen bir sayı giriniz");
            sayı=input.nextInt();
            if(sayı<100) {
                System.out.println("kazandınız");
            }

        } while(sayı<100);
        System.out.println("kaybettiniz");


   }
}
