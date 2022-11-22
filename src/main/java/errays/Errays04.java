package errays;

import java.util.Arrays;
import java.util.Scanner;

public class Errays04 {
    public static void main(String[] args) {
        //Example 3: Bir ogretmenin sinfindaki ogrencilerin isimlerini application'a yuklemesini saglayan kodu yaziniz.
        //           ( Kullanici ile beraber bir Array olusturunuz ve icine data ekleyiniz )
        Scanner input = new Scanner(System.in);

      System.out.println("Kac ogrenci ismi gireceksiniz?");
    int numOfStd = input.nextInt();
    String names[] = new String[numOfStd];

        System.out.println("Girisi sonlandirmak icin Q harfine basiniz.");

        for(int i=1; i<=numOfStd; i++){
        System.out.println("Lutfen " + i + ". ogrencinin ilk ismini giriniz");
        String stdName = input.next();
        if(stdName.equalsIgnoreCase("Q")){
            break;
        }
        names[i-1] = stdName;
    }
        System.out.println(Arrays.toString(names));
    }

}
