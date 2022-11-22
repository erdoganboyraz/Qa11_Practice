package tekrar;

public class C04NestedLoops01 {
    public static void main(String[] args) {
           /*
            Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
         */
        for (int i = 1; i <5 ; i++) {
            System.out.println("Week:"+i);
            for (int j = 1; j <8 ; j++) {
                System.out.println("Day:"+j);

            }


        }
        System.out.println();

        //Example 1: Asagidaki sekli ekrana yazdiran kodu yaziniz
        //          ****
        //          ****
        //          ****
        for (int i = 1; i <4 ; i++) {

            for (int j = 1; j < 5; j++) {
                System.out.print("*");

            }
            System.out.println();


        }
           /*
                Example 2: Asagidaki sekil cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */
        for (int i = 1; i <6 ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
          /*
                Example 3: Asagidaki sekil cizen kodu yaziniz

                            * * * *
                            * * *
                            * *
                            *
         */

        int satir=4;
        for (int i = 1; i <=satir ; i++) {
            for (int j = satir; j >=i ; j--) {
                System.out.print("*"+" ");

            }
            System.out.println();

        }
    }
}
