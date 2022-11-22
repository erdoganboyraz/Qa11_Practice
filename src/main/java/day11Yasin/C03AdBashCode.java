package day11Yasin;

import java.util.Scanner;

public class C03AdBashCode {
    /*
    Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.

    Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
    Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
    Örn: A-->Z, B-->Y ...

    "abcdefghijklmnopqrstuvwxyz";
    "zyxwvutsrqponmlkjihgfedcba";

   */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir String Giriniz");
        String str3= input.nextLine();
        String str1="abcdefghijklmnopqrstuvwxyz";
        String str2="zyxwvutsrqponmlkjihgfedcba";
        for (int i = 0; i <str3.length() ; i++) {
            for (int j = 0; j <str1.length() ; j++) {
                if (str3.charAt(i)==str1.charAt(j)){
                    System.out.print(str2.charAt(j));
                }

            }

        }
        // 2. yol
        System.out.println("Lütfen bir String Giriniz");
        String str= input.nextLine();
        for (int i = 0; i < str.length(); i++) {
            int index='z'-str.charAt(i);
            System.out.print((char) ('a'+index));

        }

    }
}
