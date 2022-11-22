package day18List;

import java.util.Arrays;

public class AdvencedForloop02 {
    public static void main(String[] args) {
         /*
    Tek bir String içerisinde verilen euro ve dolarların ayrı ayrı toplamların bulan bir kod yazınız.
    Ornek:
     String str ="$1 $12 €34 €56 $45 €78";
      dolarToplami: 58
      euroToplami: 168
     */
        String str ="$1 $12 €34 €56 $45 €78";
        String arr[]=str.split(" ");
        System.out.println(Arrays.toString(arr));
        int dolar=0;
        int euro=0;
        for (String w:arr) {
           if(w.contains("$")){
                dolar+=Integer.valueOf(w.replace("$",""));

            }else {
                euro+=Integer.valueOf(w.replace("€",""));
                            }

        }
        System.out.println("dolar toplamı:"+dolar);
        System.out.println("euro toplamı"+euro);


    }
}
