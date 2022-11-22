package errayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {
    public static void main(String[] args) {

    /*
        ArrayList'ler ayni data tipine sahip birden fazla data'yi depolamak icin kullanilir.

        Array ile ArrayList'in farki nedir?
            1)Array olustururken Array'in icine kac tane eleman koymamiz gerektigini soylemeliyiz, soyledigimiz eleman sayisindan fazla eleman koyamayiz.
              Array'ler eleman sayisinda "fixed" dirler.
              ArrayList'leri olustururken eleman sayisi soylemeye gerek yok, cunku ArrayList'ler eleman sayisinda "flexible"(esnek) dirlar.
            2)Array'lerin icine "primitive" ve "reference" lar konabilir.
              ArrayList'lerin icine ise sadece "non-primitive" ler konulur.
            3)Array'ler super fast, cok hizli. Array'ler memory i cok az kullanir.
            Note: Eleman sayisi kesin belli olan coklu datalari depolamak icin Array kullaniriz, ama
                  eleman sayisi degisken olan coklu datalar icin Array kullanma riskini almayin

     */
        ArrayList <Integer> ages=new ArrayList<Integer>();
        ArrayList <Integer> heıghts=new ArrayList<>();
        List<Integer> names=new ArrayList<Integer>();

        names.add(13);
        names.add(21);
        names.add(25);
        names.add(2,45);
        System.out.println(names);
        List<Integer>prices=new ArrayList<>();
        prices.add(47);
        prices.add(69);
        names.addAll(prices);
        System.out.println(names);
        System.out.println(prices);
        names.addAll(2,prices);
        System.out.println(names);
        // listlerin eleman sayısı
        int elemansayısı=names.size();
        System.out.println(elemansayısı);
        // get metodu index i kullanarak list içinden eleman akmaya yarar
        int i=names.get(3);
        System.out.println(i);
       boolean i1=names.isEmpty();
       //set metodu bir listtedeki bir elemanı degistirir
        names.set(3,45);
        System.out.println(names);

        //Example 1: nums ArrayList'indeki tum tek sayilari 11 artirdiktan sonra ekrana yazdiriniz
        //[21, 50, 23, 200, 18, 20, 23, 185]
        for(int w:names){
            if(w%2!=0){
                names.set(names.indexOf(w),w+11 );

            }
        }
        System.out.println(names);
        //remove() method'unu icine tamsayi koyarsaniz Java onu index olarak kabul eder
        Integer sayı=80;
        names.remove(sayı);
        System.out.println(names);
        //Example 2: ArrayList'den 34 elemaninin ilk gorunumunu siliniz
        //Note 1: Tum tamsayilar Java icin aksi soylenmedikce primitive'dir, yani "int" dir.
        //Note 2: "primitive" ler ArrayList'lerin elemani olamazlar.
        //Note 3: "primitive" i "Wrapper Class" a cevirirseniz, non-primitive olur ve non-primitive ler ArrayList'lerin elemani olur, index olamaz
        Integer sayi = 34;
        names.remove(sayi);
        System.out.println(names);// [32, 50, 200, 18, 20, 34, 196]

    }
}
