package day18List;

public class Ssg_Grup {
    public static void main(String[] args) {
        int i=1;
        while(i<=5){
            System.out.println(i+" ");
            i++;

        }
        System.out.println();
        int a=1;
        do{
            a++;
            System.out.print(a);
        }while(a<=5);
        System.out.println();
        int carp=1;
        for (int k= 1; k <=5 ; k++) {
            carp=k*carp;

        }
        System.out.println(carp+" =carpım sonucu");

        int arr[]={1,2,3,4};

        for (int w  : arr ) {
            System.out.print(w+ " ");

        }

        int arr2[][]={{1, 2, 3, 4},{2,6,9}};

        for(int[] w : arr2){
            for(int y : w){
                System.out.println(y+ " ");



    }
}
    }
}
