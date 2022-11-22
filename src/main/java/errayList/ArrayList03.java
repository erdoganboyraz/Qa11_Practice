package errayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        //Example 1: Verilen bir listteki elemanlari tekrarsiz olarak yaziniz
        //           [2, 3, 2, 2, 5] ==> [2, 3, 5]
        List<Integer> a = new ArrayList<>();
        a.add(2);
        a.add(3);
        a.add(2);
        a.add(2);
        a.add(5);
        List<Integer>yeni=new ArrayList<>();
        for(Integer w:a){
            if(!yeni.contains(w)){
                yeni.add(w);
            }

        }
        System.out.println(yeni);
        //Example 2: Kullanicidan bir harf aliniz, harf sizdeki List'in icinde varsa o harfi "Bulundu" ya ceviriniz yoksa o harfi List'e ekleyiniz
        //           [A, K, R, S]  ==> R  ==> [A, K, Bulundu, S]
        //           [A, K, R, S]  ==> X  ==> [A, K, R, S, X]


    }
}
