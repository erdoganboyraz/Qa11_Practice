package practiceAdvence;

import java.util.Scanner;

public class Advenced_İfStatement01 {
    public static void main(String[] args) {
        //Kullanicidan uc adet sayi alarak bu sayilarin bir dik ucgen oluşturup olusturmadıklarini yazan kodu yazin
        Scanner iput=new Scanner(System.in);
        System.out.println("lütfen birinci kenar icin numara giriniz");
        int kenar1= iput.nextInt();
        System.out.println("lütfen ikinci kenar icin numara giriniz");
        int kenar2= iput.nextInt();
        System.out.println("Lütfen ucuncu kenar icin numara giriniz");
        int kenar3= iput.nextInt();
        // bir ücgen olup olmadıgını su sekilde buluruz
        // a2+b2=c2 pisagor baglantısı


        if(kenar1*kenar1+kenar2*kenar2==kenar3*kenar3){
            System.out.println("Bu bir Dik ucgendir");
        } else if (kenar1*kenar1+kenar3*kenar3==kenar2*kenar2) {
            System.out.println("Bu bir Dik ucgendir");


        } else if ((kenar2*kenar2+kenar3*kenar3==kenar1*kenar1)) {
            System.out.println("Bu bir Dik ucgendir");

        }else
            System.out.println("Bu bir Dik ucgen degildir");


    }
}
