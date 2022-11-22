package day18List;

import java.util.ArrayList;
import java.util.List;

public class C01_arrayList {
    public static void main(String[] args) {
        // bir array de 7 hariç tum sayıları iki arttırın
        List<Integer> ages=new ArrayList<>();
        ages .add(12);
        ages .add(7);
        ages .add(21);
        ages .add(78);
        ages .add(9);
        for (Integer w : ages) {
            if(w==7){
                continue;
            }
            ages.set(ages.indexOf(w),w+2 );

            }
        System.out.println(ages);
        // example 2 bir array de 8 ve 8 den onceki tüm elemanları iki katına cıkarın
        List<Integer> names=new ArrayList<>();
        names .add(12);
        names.add(7);
        names.add(21);
        names .add(8);
        names.add(9);
        for(Integer w:names){
            names.set(names.indexOf(w),w*2 );

            if(w==8){
                break;


            }

        }
        System.out.println(names);

    }
}
