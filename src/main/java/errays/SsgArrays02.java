package errays;

import java.util.Arrays;

public class SsgArrays02 {
    public static void main(String[] args) {
        // bir arrayde herhangi bir elementin olup olmadıgini nasil buluruz
        int arr[]={32,14,2,11,8};
        // 1. yol
        for (int w:arr) {
            if (w==13){
                System.out.println(w+" var");
                break;
            }else
                System.out.println("aradiginiz numara arrayde bulunmamaktadir");

        }
        // 2. yol
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr,33));

            

    }
}
