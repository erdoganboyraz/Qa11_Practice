package dawhile;

import java.util.Scanner;

public class Grupcakılmaası {
    public static void main(String[] args) {
        //soru3
       // Kullanıcıdan 2 tamsayı girmesini ve ardından
//GCD (En Büyük Ortak Bölen) ve LCM'yi (En Küçük Ortak Kat)
        // bulmasını isteyin.
//Input :
//30
//40
//Beklenen Cikti:
//Beklenen Cikti:
//30 ve 40 icin GCD = 10
//30 ve 40 icin LCM = 120
        Scanner input=new Scanner(System.in);
        System.out.println("iki farklı tam sayı giriniz");
        int sayı1= input.nextInt();
        int sayı2= input.nextInt();
        int ebob=0;
        int ekok=0;

            for(int i=1;i<=sayı1;i++){
                if(sayı1%i== 0 && sayı2%i==0){
                  ebob=i;



                }

            }
        System.out.println("ebob="+ebob);

        ekok = (sayı1*sayı2)/ebob;

        System.out.println("ekok = " + ekok);

    }


    }

