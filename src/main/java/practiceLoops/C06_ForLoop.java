package practiceLoops;

public class C06_ForLoop {
    public static void main(String[] args) {

        /*
           *
          * *
         *   *
        *     *
       *********
         */
        // Sekilde gorulen ucgeni yazdiriniz

        for (int i = 1; i <=5 ; i++) {

            for (int j = 1; j <=9 ; j++) {
                if((i==1&&j==5)||(i==2&&(j==4||j==6))||(i==3&&(j==3||j==7))||(i==4&&(j==2||j==8))||i==5){
                    System.out.print("*");

                }else
                    System.out.print(" ");

            }

            System.out.println();
        }


        //Asagidaki sekli yazdiran kodu yaziniz
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6
//
        for (int i = 1; i <=6; i++) {
            for (int j = 1; j <=6; j++) {
                if((i==1)||(i==2&&(j==1||j==2||j==3||j==4||j==5))||(i==3&&(j==2||j==3||j==4||j==5))||(i==4&&(j==2||j==3||j==4))||(i==5&&(j==3||j==4))||(i==5&&j==6)){
                    System.out.print("123456");
                }else
                    System.out.print(" ");

            }
            System.out.println();

        }

    }
}
