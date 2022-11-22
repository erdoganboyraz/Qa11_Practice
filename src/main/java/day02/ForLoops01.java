package day02;

public class ForLoops01 {
    public static void main(String[] args) {
        // 3 ten altıya kadar olan tam sayıların toplamını yazalım
        int sum=0;
        for(int i=3;i<7;i++){
            sum=sum+i;

        }

        System.out.println(sum);
        System.out.println();
        //6 dan üçe jadar tam sayıların carpımını hesaplayan kodu yazın
        int mul=1;
        for(int i=6;i>2  ;i--  ){
            mul=mul*i;
        }
        System.out.println(mul);
        System.out.println();
        //size verilen bir tam sayının rakamları toplamını hesap eden kodu yazın
        int num =-1258789;
        num=Math.abs(num);
        int sonuc=0;
        for(int i=num;i>0;i=i/10){
            sonuc=sonuc+i%10;
        }
        System.out.println(sonuc);
        // size verilen bir Stringi ters ceviren kodu yazın.
        String str="Kaba";
        String ters="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            ters=ters+ch;

        }
        System.out.println(ters);

    }
}
