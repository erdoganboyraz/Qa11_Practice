package day01practice;

import java.beans.JavaBean;

public class Practice01 {
    public static void main(String[] args) {
        //14 ten 5 e kadar tum tam sayıları yazdıran kodu yazın
        for(int i=14;i>4;i--){
            System.out.print(i+" ");
        }
        System.out.println();
        //14 ten 5 e kadar tüm çift sayıları ekrana yazdıran kodu yazın
        for(int i=14;i>4;i=i-2){

                System.out.print(i+" ");
            }
        System.out.println();
        //2. yol
        for(int i=14;i>4;i--){
            if(i%2==0){
                System.out.print(i+" " );
            }
        }
        System.out.println();
        // 28 den 157 e kadar olan tek sayıları ekrana yazdırın
        for(int i=28;i<158;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        // "Java" Stringini "J*a*v*a* Stringine çeviren kodu yazın
        String str=" Java";
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+"*");
        }
        System.out.println();
        // size verilen Stringdeki tekrarsız olan harfleri ekrana yazdırın
      String s=  "Hellooo ali";
        for(int i=0; i<s.length(); i++ ){
            char ch=s.charAt(i);
            if(s.indexOf(ch)==s.lastIndexOf(ch))
                System.out.print(ch);
        }
    }

    }



