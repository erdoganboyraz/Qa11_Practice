package practiceLoops;

import java.util.Scanner;

public class C02_ForLoops {
    public static void main(String[] args) {
          /*
     Interview Question
          Kullanicidan 100’den kucuk bir tamsayi isteyin.
          1’den baslayarak girilen sayiya kadar tum sayilari yazdirin.
          Ancak;
          - Sayi 3’un kati ise sayi yerine "Java" yazdirin.
          - Sayi 5’in kati ise sayi yerine "Guzeldir" yazdirin.
          - Sayi hem 3’un hem 5’in kati ise sayi yerine " ** Java Guzeldir ** " yazdirin.
     */
        Scanner input=new Scanner((System.in));
        System.out.println("lütfen 100 den kucuk bir tam sayı giriniz");
        int n= input.nextInt();
        for (int i = 1; i <=n ; i++) {
            if(i%3==0&&i%5==0){
                System.out.print(" ** Java Guzeldir **");
            }else if(i%3==0){
                System.out.print("Java");
            }else if(i%5==0){
                System.out.print("Guzeldir");
            }else
                System.out.print(i+" ");


        }

    }
}
