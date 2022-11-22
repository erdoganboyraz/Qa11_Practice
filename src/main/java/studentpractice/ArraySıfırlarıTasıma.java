package studentpractice;


import java.util.ArrayList;
import java.util.List;

public class ArraySıfırlarıTasıma {
      /*
              Tüm sıfırları dizinin sonuna taşıyabilen bir program yazın
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
     */
      public static void main(String[] args) {

          int [] array =  {10, 0, 5, 0, 1, 0};
          List<Integer>listFornonzeros=new ArrayList<>();
          List<Integer>listForzeros=new ArrayList<>();
          for (int i = 0; i < array.length; i++) {
              if (array[i]!=0){
                  listFornonzeros.add(array[i]);

              }else {
                  listForzeros.add(array[i] );
              }

          }
          listFornonzeros.addAll(listForzeros);
          System.out.println(listFornonzeros);






      }
}
