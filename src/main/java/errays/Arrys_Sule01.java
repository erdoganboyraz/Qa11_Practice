package errays;

import java.util.ArrayList;
import java.util.List;

public class Arrys_Sule01 {
    public static void main(String[] args) {
        //EX:Size verilen ArrayListte 8 (inclusive-dahil) ve 8 den onceki tum elemanlari 2 katina cikariniz
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        for (int i = 1; i <nums.size() ; i++) {
            if(nums.get(i)==0){
                nums.set(i,nums.get(i)*2);
                break;
            }
            nums.set(i,nums.get(i)*2);

        }
        System.out.println("degistirimis hali:"+nums);



    }
}
