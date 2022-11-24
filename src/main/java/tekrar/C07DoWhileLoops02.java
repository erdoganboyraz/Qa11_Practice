package tekrar;

import java.util.Scanner;

public class C07DoWhileLoops02 {
    public static void main(String[] args) {
        //Example 2: Kullanicidan isimler aliniz ilk harfinin buyuk harf olup olmadigini kontrol ediniz
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("lütfen bir isim giriniz");
          char ilkharf = input.next().charAt(0);
          if(ilkharf >= 'A'&&ilkharf <= 'Z'){
              System.out.println("ismi basarı ile girdiniz");

          }else
              System.out.println("ismi kucuk harfle girdiniz tekrar deneyin");
          break;

        }while (true);

    }
}
