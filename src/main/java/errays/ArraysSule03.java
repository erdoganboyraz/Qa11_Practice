package errays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysSule03 {
       /*
    INTERWIEW QUESTIONS
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
       public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
           System.out.println("lutfen bir String giriniz");
           String str= input.nextLine();

           // split
           String arr[]=str.split("");
           Arrays.sort(arr);
           int counter=0;
           for (int i = 1; i < args.length ; i++) {
               if(arr[i-1].equals(arr[i])){
                   counter++;
               }else{
                   System.out.println(arr[i-1]+"eleman sayisi"+counter+1);
                   counter=0;

               }

               if( i==arr.length-1){
                   System.out.println(arr[i-1]+"eleman sayisi"+counter+1);



               }


           }
       }

}
