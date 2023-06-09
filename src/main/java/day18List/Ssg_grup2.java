package day18List;

public class Ssg_grup2 {
    public static void main(String[] args) {

      /*  Döngüler, belirli bir koşul sağlandığı sürece tekrarlanması gereken işler için kullanılan
        programlama kodlarıdır. Döngü deyimleri, bahsedilen komut parçalarının belirtilen şartlar
        gerçekleştikçe tekrar tekrar işlenmesini sağlar. Java'da for, while ve do-while , for-each olmak üzere
        4 adet döngü deyimi bulunmaktadır.

        Kısacası : Döngü yapıları kodumuzun belirli kısımlarının döngüye girmesini ve birden fazla
        kez çalışmasını sağlar. Döngüler bir koşula bağlanır ve bu koşul var olduğu sürece aynı kod
        bloğu çalışmaya devam eder. Koşul artık sağlanmıyorsa döngü sona erer.


        while: Java programla dilinde while döngüleri yapacağımız işin ne zaman biteceğiniz bilmediğimiz
        durumlarda kullanışlı olabilmektedir.


                ******************************************************

        while(kosul){

            //kod bloğu

        }

        int i = 1;
        while (i <= 5) {
            System.out.print(i + ',');
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;

        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();

            if(customerPassword.contentEquals(typedPassword)) {
                passwordSuccessfull = true;
                System.out.println("Sisteme başarılı giriş yaptınız!");
            }
        }


*****************************
        Do-While Döngüsü
        Do-while döngüsünün çalışma mantığı while döngüsü ile aynıdır , fakat while döngüsünde
        parantez içerisindeki koşul sağlandığı sürece kod bloğu çalışacaktır. Ama Do-while
        döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır. Bu tür durumlar
        için Do-while kullanılır.


        do {
            kodlar//
        } while (kosul);



        int year = 2020;
        do
        {
            System.out.println("Döngü işletiliyor..");
            year++;
        } while (year < 2020);

*********************************************


        Java While ve Do-While Arasındaki Farklar ?
        Java'da Do-While ve While döngüleri arasındaki tek fark , Do-while döngüsünde, döngü bloğu
        içindeki kod kesimi en az bir kez mutlaka işletilecektir. Çünkü önce döngü bloğu işletilip
        sonra koşul denetlenmektedir. While döngüsünde ise önce koşula bakılıp sonra döngü bloğu
        işletildiği için, döngüye hiç girilmemesi olasıdır.

                ***************************************************


        For Döngüsü
        Java'da döngüler konusunda öğrendiğimiz gibi For döngüsü ile bir koşul belirterek
        döngülerimizi oluşturabiliriz.

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        Bu döngüler uygun şekilde tasarlandıkları sürece aynı işi yapabilirler. Ama genellikle, kaç kere döneceği belli olmayan,
        koşulun bir girdiye göre denetlendiği durumlarda While ya da do-while döngüsü kullanılırken, diziler gibi,
                tekrar sayısı belirli olan durumlarda ise for döngüsü kullanılması tercih edilir. Ama yine bu yazılımcının
        kendisine bağlıdır.

  *******************************************


        For-Each Döngüsü

        dizilerdeki ve listelerdeki elemanları daha hızlı şekilde ulaşmak için kullanılan kısa bir yöntemdir.
                Kısacası for döngüsünün modifiye edilmiş halidir.

        for (veritipi degisken: diziAdi) {
            // kod bloğu
            
       */
    }
}
