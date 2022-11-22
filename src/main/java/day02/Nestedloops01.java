package day02;

import java.util.Scanner;

public class Nestedloops01 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            System.out.println("weeks:"+i);
            for(int k=1;k<8;k++){
               System.out.println("day:"+k);
            }
       }

        for(int i=1;i<4;i++){
            for(int k=1;k<5;k++){
                System.out.print("*");

            }
            System.out.println();
       }
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen satır sayısını giriniz");
        int satır= input.nextInt();
        System.out.println("lütfen sutun sayısını giriniz");
        int sutun=input.nextInt();
        System.out.println("karakter seçiniz");
        char c=input.next().charAt(0);
        for(int i=1;i<=satır;i++){
            for(int k=1;k<=sutun;k++){
                System.out.print(c);

            }
            System.out.println();

        }
        for(int i=1;i<7;i++){
            for(int k=1;k<i;k++){
                System.out.print(k+ "");
            }
            System.out.println();
        }
        /* asagıdaki şekli yazdıran kodu giriniz
        ****
        ***
        **
        *
         */
        System.out.println();
        int row=4;
        for(int i=1;i<=row;i++){
            for(int k=row;k>=i;k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
