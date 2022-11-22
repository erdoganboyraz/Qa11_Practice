package errays;

import java.util.Arrays;
import java.util.Comparator;

public class Errays06 {
    public static void main(String[] args) {

        //Example 3: Size verilen bir cumledeki en uzun kelimeyi bulan kodu yaziniz
        //           "Java kolaydir calisana, ne kolay ki calismayana." ==> calismayana
        String sentence = "Java kolaydir calisana, ne kolay ki calismayana.";
        sentence=sentence.replaceAll("\\p{Punct}","");
        String words[]=sentence.split(" ");
        Arrays.sort(words,Comparator.comparingInt(String::length));
        System.out.println(words[words.length-1]);



    }
}
