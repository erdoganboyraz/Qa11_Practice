package tekrar;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 3: String bir array olusturunuz
        //           Bu Array'e 5 tane isim yerlestiriniz
        //           Bu isimlerdeki karakter sayilarinin toplamini ekrana yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ali";
        stdNames[1] = "Tom";
        stdNames[2] = "Veli";
        stdNames[3] = "Kemal";
        stdNames[4] = "Cem";
        String arr[]={"Ali", "Tom", "Veli", "Cem","Kemal"};
        int sum= 0;
        for (String w:arr) {
            sum+=w.length();

        }
        System.out.println(sum);
        //Example 4: Char bir array olusturunuz
        //           Bu array'e 5 eleman ekleyiniz
        //           Bu array;deki sadece buyk harfleri ekrana yazdiriniz

        char ch[] = { 'A', 'c', 'D', 'k', 'M' };
        for (char w:ch) {
            if(w>='A'&& w<='Z'){
                System.out.print(w);

            }

        }


    }
}
