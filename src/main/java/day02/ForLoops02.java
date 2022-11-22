package day02;

public class ForLoops02 {
    public static void main(String[] args) {
        // Bize verilen bir String te 'M' KARAKTERİ HARİÇ TÜM KARAKTERLERİ YAZDIRAN KODU YAZIN
        String str = "Andromeda";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != 'm') {
                System.out.print(c);

            }
        }
        System.out.println();
        //2. yol
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == 'm') {
                continue;

            }

            System.out.print(c);
        }
        System.out.println();
        // Birden 100 e kadar 6 ile bölünenler hariç tüm tam sayıları ekrana yazdırın
        for(int i=1;i<101;i++){
            if(i%6==0){
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println();
        // Size verilen bir Stringdeki 'm' den önceki tüm karakterleri yazdıran kodu yazın
        String s="lüksemburg";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='m'){
                break;
            }
            System.out.print(c);
        }

    }
}
