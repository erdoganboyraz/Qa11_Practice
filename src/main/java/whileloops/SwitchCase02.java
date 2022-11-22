package whileloops;

import java.util.Scanner;

public class SwitchCase02 {
    public static void main(String[] args) {
        // Kullanıcının yasadıgı güne  göre;
        // Kullanicinin verecegi gun kadar sonraki günun  hangi gün olduğunu yazdırınız.
        // pazartesi hafta başlangıcı
        //BulunanGun = (kacGunSonrasi + kacıncıGun) % 7;
        Scanner input=new Scanner(System.in);
        System.out.println("pazartesi:1\tsalı:2\tcarsamba:3\tpersembe:4\tcuma:5\tcumartesi:6\t pazar:\n7"+
                "lutfen haftanın kacıncı gununde oldıgunuzu giriniz ");
        int kacıncıgun= input.nextInt();

        if(kacıncıgun<0||kacıncıgun>7){
            System.out.println(" gecerli gun giriniz");
        }else
            System.out.println("kac gun sonrasını ogrenmek istiyorsunuz");
        int kacGunSonrası= input.nextInt();
        int bulunanGun=(kacıncıgun+kacGunSonrası)/7;
        switch (bulunanGun){
            case 1:
                System.out.println(kacGunSonrası +"gun sonra gunlerden pazartesi");
                break;
            case 2:
                System.out.println(kacGunSonrası +"gun sonra gunlerden salı");
                break;
            case 3:
                System.out.println(kacGunSonrası +"gun sonra gunlerden carsamba");
                break;
            case 4:
                System.out.println(kacGunSonrası +"gun sonra gunlerden persembe");
                break;
            case 5:
                System.out.println(kacGunSonrası +"gun sonra gunlerden cuma");
                break;
            case 6:
                System.out.println(kacGunSonrası +"gun sonra gunlerden cumartesi");
                break;
            case 0:
                System.out.println(kacGunSonrası +"gun sonra gunlerden pazar");
                break;
            default:
                System.out.println("lütfen gecerli gun gırınız");











        }

    }
}
