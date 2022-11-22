package dowhile;

import java.util.Scanner;

public class C01DoWhile {
    public static void main(String[] args) {
        // Kullanıcıdan ismini alınız ilk harfinin büyük harf olup olmadığını kontrol edin
        Scanner input=new Scanner((System.in));
        do{
            System.out.println("lütfen isminizi giriniz");
            char ch=input.next().charAt(0);
            if(ch>='A' && ch<='Z'){
                System.out.println("ismi basarı ile girdiniz");

            }else{
                System.out.println("ismi yanlış girdiniz");
                break;
            }


        }while(true);



    }
}
