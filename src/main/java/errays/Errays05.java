package errays;

import java.util.Arrays;

public class Errays05 {
    public static void main(String[] args) {
        // Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz
        //            [2, 3, 12, 0,  0,  0]
        int orginal[]={0, 2, 3, 0, 12, 0};
        int yeni[]=new int[orginal.length];
        int idx=0;
        for(int i=0;i<orginal.length;i++){
            if(orginal[i]!=0){
               yeni [idx]=orginal[i];
                idx++;

            }
        }
        System.out.println(Arrays.toString(yeni));
      // EXAMPLE 2

        //Example 2: Bir Array'in icinde herhangi bir elemanin olup olmadigini kontrol eden ve kac kere tekrarlandigini gosteren kodu yaziniz
        //           [ 2, 1, 2, -3, 2] ==> Kullanici 2'yi sordu ==> 2 elemani var ve 3 kere tekrarlandi
        //                             ==> Kullanici 6'yi sordu ==> 6 array'de yok
        int arr[]={2, 1, 2, -3, 0};
        int eleman=2;
        int counter=0;
        for(int w:arr){
            if(w==eleman){
                counter++;
            }
        }
        if(counter>0){
            System.out.println(eleman+ " arrayde" + counter + " defa var");
        }else
            System.out.println(eleman+"array de yok");

    }
}
