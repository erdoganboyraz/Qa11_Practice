package tekrar;

public class C01Loops01 {
    // 14 ten 4 e kadar tüm cift sayilari ekrana yazdiran kodu yazin
    public static void main(String[] args) {
        for (int i = 14; i >4 ; i--) {
            if (i%2==0){
                System.out.println(i);
            }

        }
        System.out.println();
        // 28 den 157 e kadar tüm tek sayilari ekrana yazdiran kodu yazin
        for (int i = 28; i <=157 ; i++) {
            if (i%2!=0){
                System.out.print(i+" ");

            }

        }
        System.out.println();
        // Java Stringini J*A*V*A* SİTRİNGİNE CEVİREN KODU YAZİN
        String str="Java";
        for (int i = 0; i <str.length() ; i++) {
            System.out.print(str.charAt(i)+"*");


        }
        System.out.println();
        // Size verilen bir Stringte tekrarsiz olan harfleri yazdirin
        String s="Helloo Ali";
        for (int i = 0; i <s.length() ; i++) {

            char c=s.charAt(i);
            if (s.indexOf(c)==s.lastIndexOf(c)){
                System.out.print(c);
            }

        }


    }
}
