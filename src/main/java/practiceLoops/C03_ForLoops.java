package practiceLoops;

import java.util.Scanner;

public class C03_ForLoops {
    public static void main(String[] args) {
        /*
      Kullanicidan bir cumle ve bir harf alin,
      Cumlede verilen harfin kac kere
      kullanildigini bulup, yazdirin
      ORNEK:
      INPUT : Cumle: Java ogrenmek cok guzel. ==> Harf :e
      OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String cumle= input.nextLine().toLowerCase();
        System.out.println("cumlede bulmak istediginiz harfi giriniz");
        char ch=input.nextLine().toLowerCase().charAt(0);
         int sayac=0;
        for (int i = 0; i <cumle.length() ; i++) {
            if(cumle.charAt(i)==ch ){
                sayac++;
            }

        }
        System.out.println("girgiginiz cümlede "+ ch+" harfi "+ sayac+" tanedir");

    }
}
