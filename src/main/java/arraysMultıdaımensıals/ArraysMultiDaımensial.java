package arraysMultıdaımensıals;

import java.util.Arrays;

public class ArraysMultiDaımensial {
    public static void main(String[] args) {
        //Example 1: String bir Multidimesional Array olusturunuz.
        //           Elemanlari ekleyiniz
        //           Toplam eleman sayisini ekrana yazdiran kodu yaziniz

        //String bir Multidimesional Array olusturunuz.
        String brr[][] = new String[4][3];

        //Elemanlari ekleyiniz
        String arr[][]=new String[4][3];
        arr[0][0]="A";
        arr[0][1]="B";
        arr[0][2]="C";

        arr[1][0]="D";
        arr[1][1]="E";
        arr[1][2]="F";

        arr[2][0]="G";
        arr[2][1]="H";
        arr[2][2]="I";

        arr[3][0]="J";
        arr[3][1]="K";
        arr[3][2]="L";
        System.out.println(Arrays.deepToString(arr));//[[A, B, C], [D, E, F], [G, H, I], [J, K, L]]
        int sum=0;
        for(String[] w:arr){
            sum=sum + w.length;
        }
        System.out.println(sum);






    }
}
