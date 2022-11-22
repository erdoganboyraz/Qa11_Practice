package practiceAdvence;

import java.util.Scanner;

public class advencedSubsString02 {
    public static void main(String[] args) {
        /* kullnıcıdan aldıgınız iki atri kelimeyi ad soyad ayri kelime olacak şekilde bir birinden ayıran codu yazın

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen ad ve soyadınızı ayrı ayrı giriniz");
        String str= input.nextLine();
        String ad=str.substring(0,str.indexOf(" "));
        String soyad=str.substring(str.indexOf(" ")+1);
        System.out.println("Ad:"+ad);
        System.out.println("Soyad:"+soyad);
    }
}
