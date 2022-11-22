package day18List;

import java.sql.Array;
import java.util.Arrays;

public class AdvencedArratİsaretdegistir {
    //Array içerisindeki elementlerin işaretlerini(+-) değiştiren bir kod yazınız.
    // input : 1,2,-3,4,-5,-6
    //output :-1,-2,3,-4,5,6

    public static void main(String[] args) {
        int arr[]={1,2,-3,4,-5,-6};
        int brr[]=new int[arr.length];
        int idx=0;
        for (int w:arr) {
          brr [idx] =w*-1;
          idx++;

        }
        System.out.println(Arrays.toString(brr));


                

            


    }
}
