package nestedforloop;

import java.util.Scanner;

public class C03_ForLoop {
    public static void main(String[] args) {
        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun
         /* tac uzunlugu -> 6 iken
            ^
            ^^
            ^^^
            ^^^^
            ^^^^^
            ^^^^^^
            |||
            |||
            |||
            |||
            |||
     */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen agacın tac uzunlugunu giriniz");
        int tacuzunluk= input.nextInt();
        String yaprak="";
        System.out.println(yaprak);
        for (int i = 0; i < tacuzunluk; i++) {
            yaprak+="^";
            System.out.println(yaprak);


            }
        for (int j = 0; j < 6; j++) {
            System.out.println("|||");
            
        }



    }
}
