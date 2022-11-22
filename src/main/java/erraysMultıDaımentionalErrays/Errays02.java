package erraysMultıDaımentionalErrays;

import java.util.Arrays;

public class Errays02 {
    public static void main(String[] args) {
       // Example1
        //Example 1: Size verilen pozitif ve negatif sayilar iceren bir integer array'deki "en buyuk negatif" ve "en kucuk pozitif" elemani bulunuz.
        int arr[] = { -12, 18, -5, 23, 0 };
        Arrays.sort(arr);
        int maxNegative=arr[0];
        int minPositve=arr[arr.length-1];
        for(int w:arr){
            if(w<0){
                maxNegative=Math.max(maxNegative,w);
            }
            if(w>0){
                minPositve=Math.min(minPositve,w);

            }
        }
        System.out.println(maxNegative + " ve " + minPositve);

    }
}
