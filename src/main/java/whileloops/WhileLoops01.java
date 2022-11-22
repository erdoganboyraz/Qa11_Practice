package whileloops;

import java.util.Scanner;

public class WhileLoops01 {
    public static void main(String[] args) {
        // 3 tn 10 a kadar olan sayıları ekrana yazdıran kodu ekrana yazdırın
        for(int i=3;i<11;i++){
            System.out.println(i);
        }
        System.out.println();
        int i=3;
        while(i<11){
            System.out.print(i+ " ");
            i++;
        }
        System.out.println();
        // 17 den 4 e kadar tüm çift sayıları yazdıran kodu yazın
        int k=17;
        while(k>3){
            if(k%2==0){
                System.out.println(k+" ");
            }
            k--;

        }
        System.out.println();
        // 12 den 67 e kadar olan tam sayıların toplamını yazan kodu yazın
        int sum=0;
        int n=12;
        while(n<68){
            sum=sum+n;
            n++;
        }
        System.out.println(sum);
        System.out.println();
        // size verilen bir tam sayının rakamları toplamını ekrana yazdıran kodu yazın
        int sum1=0;
        int n1=385;
        while(n1>0){
            sum1=sum1+n1%10;
            n1=n1/10;
        }
        System.out.println(sum1);
        // kullanıcıdan aldığınız bir sayıdan çarpım tablosu yazdırın
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int s=input.nextInt();
        int no=1;
        while(no<11){

            System.out.println(s + "*" + "=" +s*no );

            no++;
        }

    }
}
