import java.util.Scanner;

public class Turnery {
    public static void main(String[] args) {
            /*
    Kullanicidan Final notunu 'A' ,'B' ,'C' seklinde  girmesini isteyiniz,
    'A'  ->  "Cok Basarili"
    'B'  ->  "Basarili"
    'C'  ->  "Orta"    bu notlar disindakilere de
             Digerleri..
                yazdiriniz.Nested Ternary ile cozunuz
     */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen Final notunuzu Giriniz");
        String finalnotu=input.next();
        String result=(finalnotu.equalsIgnoreCase("A"))? "cok basarılı":
                        (finalnotu.equalsIgnoreCase("B")? "basarılı"   :
                                (finalnotu.equalsIgnoreCase("C"))?"Orta":
                                        "Digerleri");
        System.out.println(result);




    }
}
