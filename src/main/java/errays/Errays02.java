package errays;

public class Errays02 {
    public static void main(String[] args) {


        //Arrays'lerin icine "primitive data type" leri ve "reference"(adres) lar konabilir.


        //Example 1: String bir Array olusturunuz ve "Tom" ve "Tom" dan onceki tum elemanlari ekrana yazdiriniz

        String arr[] = {"Jane", "Mark", "Christopher", "Tom", "Ali", "Rojda"};
        for (String w : arr) {
            System.out.println(w+" ");
            if (w.equals("Tom")) {
                break;
            }

        }



        }
}