package erraysMultıDaımentionalErrays;

import java.util.Arrays;

public class Errays01 {
    public static void main(String[] args) {
        //binarySearch() Method: Bu method'u kullnarak bir elemanin Array'de olup olmadigini anlariz.
        //                       binarySearch() Method'unu kullanmadan once mutlaka "Arrays.sort()" kullanilmalidir.
        //                       binarySearch() Method'u aradiginiz eleman Array'de varsa o elemanin indexini return eder.

        //                       binarySearch() Method'u aradiginiz eleman Array'de yoksa "- a" seklinde bir negatif sayi alirsiniz.
        //                       Bu sayidaki "-" isaretinin anlami bu eleman Array'de yok dmeektir, "a" nin anlami olsaydi kacinci sirada olurdu demektir.

        //                       binarySearch() Method'u tekrarlayan elemanlar icin kullanilmaz.
        int arr[]={12, 31, 43, 14};
        int sayı=43;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int idx1=Arrays.binarySearch(arr,sayı);
        System.out.println(idx1);
        int sayı1=13;
        int idx=Arrays.binarySearch(arr,sayı1);
        System.out.println(idx);


    }
}
