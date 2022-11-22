package practiceLoops;

import java.util.Scanner;

public class C01_Loops {
    public static void main(String[] args) {
        //Kullanicidan baslangic , bitis ve artis miktarini alarak
        // aradaki tum sayilari aralarina virgul koyarak yazdirin
        Scanner input=new Scanner((System.in));
        System.out.println("lutfen baslangıc, bitis ve artıs miktarini giriniz");
        int baslangıc= input.nextInt();
        int bitis= input.nextInt();
        int artis=input.nextInt();
        for(int i=baslangıc;i<=bitis;i+=artis){

            if(i<bitis){
                System.out.print(i+",");
            }else
                System.out.print(i);


        }




    }
}
