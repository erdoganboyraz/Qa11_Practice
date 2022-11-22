package errays;

import java.util.Arrays;

public class SsgArrays03 {
    public static void main(String[] args) {
         String str="Java gun gectikce guzellesiyor";
        String kelimeler1[]=str.split(" ");
        System.out.println(Arrays.toString(kelimeler1));
     String kelimeler2[]=str.split("");
        System.out.println(Arrays.toString(kelimeler2));
        String kelimeler3[]=str.split("gectikce");
        System.out.println(Arrays.toString(kelimeler3));

    }
}
