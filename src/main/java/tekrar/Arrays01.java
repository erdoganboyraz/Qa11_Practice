package tekrar;

public class Arrays01 {
    public static void main(String[] args) {
        //Example 2: stdAges Array'i icindeki tum elemanlarin toplamini ekrana yazdiran kodu yaziniz.
        int arr[]={12, 11, 13, 14, 10, 12, 12};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];

        }
        System.out.println(sum);

        int toplam= 0;
        int i=0;
        while (i < arr.length) {
            toplam=toplam+arr[i];
            i++;
        }
        System.out.println(sum);

        int sum1= 0;
        int k=0;
        do {
            sum1=sum1+arr[k];
            k++;

        }while (k < arr.length);
        System.out.println(sum1);

        int hesap= 0;

        for (int w  : arr) {
            hesap=hesap+w;
            
        }
        System.out.println(hesap);
    }
}
