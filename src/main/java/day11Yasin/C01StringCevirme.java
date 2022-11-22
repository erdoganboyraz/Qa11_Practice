package day11Yasin;

public class C01StringCevirme {

    /*
     Array olarak verilen bir cümleyi String olarak negatif anlamıyla yazdıran bir kod yazınız.
     Input:
     String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
     Output:
     String output ="JavaIsNOTDifficult";
      */
    public static void main(String[] args) {
        String[] arr={"J","a","v","a","I","s","D","i","f","f","i","c","u","l","t"};
        String str="";
        for (String w:arr) {
            str+=w;
            
        }
        System.out.println(str);
        String negativeStr=str.replace("Is","Isnot");
        System.out.println(negativeStr);

    }

}
