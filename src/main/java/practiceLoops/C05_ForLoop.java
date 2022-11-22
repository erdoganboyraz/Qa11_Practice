package practiceLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
           /*
      Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
      tekrarlayan kodu yaziniz
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay
     */
        Scanner input=new Scanner(System.in);
        System.out.println("lütfen bir kelime giriniz");
        String kelime=input.nextLine();
        System.out.println("kelimeyi kac kez tekrar etmek istiyorsun");
        int tkr= input.nextInt();
        String ilkson=kelime.substring(0,1)+kelime.substring(kelime.length()-1);
        String cıktı="";
        for (int i = 1; i <=tkr ; i++) {
            cıktı+=ilkson;

        }
        System.out.println(cıktı);
    }
}
