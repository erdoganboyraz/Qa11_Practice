package practiceAdvence;

public class AdvenceRegexQuantifiers03 {
    public static void main(String[] args) {
        /* String bir degerin belirli bir sayida karakter içerip içermedigi ve
        belirli karakterler ile bitip bitmedigini gosteren kodu yazin

         */
        String str="as";
        System.out.println(str.matches(".s"));//matches metodu() regex ile calişir
                                                   // String degerin regex ile karsilastirmasini yapar

        // bir String in ikinci karakterinin belirli bir karakter icerip icermedigini yazan kodu yazin
        String str1=" asalakabdi";
        System.out.println(str1.trim().matches(".s.*"));

        // bir String degerin sadece harf içerip icermedigini yazan kodu yazin
        String str2="java";
        System.out.println(str2.matches("[a-zA-Z]*"));

        System.out.println("1234567894".matches("[0-9]*..."));
        System.out.println("1234567abc4567".matches("\\w{7,10}")); //  w=[ a-zA-Z] ve [0-9] arasini icerir
        // ilk karateri 1 olan ikinci karakteri ? işareti olan digerleri rakam olan toplam 10 karakter iceren kodu yazın
        System.out.println("1?123456781111".matches("[1][\\p{Punct}][0-9]*"));
    }
}
