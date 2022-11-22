package errays;

import java.util.Arrays;

public class Errays01 {
    public static void main(String[] args) {
          /*
        1)Ayni data tipinde, coklu data'i depolmaka icin Java'nin olusturdugu yapilar vardir.
          Bu yapilardan birisi de "Array" lerdir.
     */
        int stdAges []=new int[7];
        System.out.println(Arrays.toString(stdAges));
        // erraylere eleman nasıl yerleştirilir
        stdAges [1]=11;
        stdAges [0]=12;
        stdAges [2]=13;
        stdAges [3]=14;
        stdAges [4]=10;
        stdAges [5]=12;
        stdAges [6]=12;
        System.out.println(Arrays.toString(stdAges));
        //Erraydeki bir elemanı nasıl cagırırız
        System.out.println(stdAges[4]);
        // Erraysdeki elemanları en küçükten en büyüğe sıralayınız
        Arrays.sort(stdAges);
        System.out.println(Arrays.toString(stdAges));
        int ilk=stdAges[0];
        int son=stdAges[stdAges.length-1];
        System.out.println(ilk+son);
        //Note: "length()" String'lerde kullanilir, "length" Array'lerde kullanilir
        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        //1. yol
        int sum=0;
        for(int i=0;i< stdAges.length;i++){
            sum=sum+ stdAges[i];
        }
        System.out.println(sum);
        //2. yol
        int toplam=0;
        int i=0;
        while (i< stdAges.length) {
            toplam = toplam + stdAges[i];
            i++;
        }
        System.out.println(toplam);
        // 3.yol
        int k=0;
        int s=0;
        do{

            s=s+stdAges[k];
            k++;

        }while (k< stdAges.length);
        System.out.println(s);
        //4.yol for each loop erraylerde ve collections larda kullanılır
        int t=0;
        for(int w:stdAges){
            t=t+w;

        }
        System.out.println(t);
        //Example 3String bir array olusturunuz
        // Bu Array'e 5 tane isim yerlestiriniz
        // Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdNames []=new String[5];
        stdNames [0]="Ali";
        stdNames [1]="Tom";
        stdNames [2]="Veli";
        stdNames [3]="Kemal";
        stdNames [4]="Cem";
        System.out.println(Arrays.toString(stdNames));
        int karaktersayılarıtoplamı=0;
        for(String w:stdNames){
            karaktersayılarıtoplamı=karaktersayılarıtoplamı+w.length();
        }
        System.out.println(karaktersayılarıtoplamı);

        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz
        char ch[]={'A','c','D','k','M'};
        for(char w:ch){
            if(w>='A'&& w<'Z' ){
                System.out.print(w);
            }
        }










    }

}
