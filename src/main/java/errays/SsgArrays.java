package errays;

import java.util.Arrays;

public class SsgArrays {
    public static void main(String[] args) {
        int arr1[]=new int[]{90,23,5,109,12,22,67,34};

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");

        }
        System.out.println();
        for (int w:arr1) {
            System.out.print(w+" ");
            
        }
        System.out.println();
        // yukaridaki arrayin en kucuk ve en buyuk elemanlarini toplayan codu yazin
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1[0]+arr1[arr1.length-1]);


    }
}
