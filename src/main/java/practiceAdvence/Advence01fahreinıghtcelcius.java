package practiceAdvence;

import java.text.ChoiceFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Advence01fahreinıghtcelcius {
    public static void main(String[] args) {
        //fahrenight ı celciusa ceviren codu yazın
        Scanner input=new Scanner((System.in));
        System.out.println("lütfen fahrenıght degeri giriniz");
        double f= input.nextDouble();
        double c=(f-32)*5/9;
        System.out.println(c);
        NumberFormat numberFormat=new DecimalFormat(".##");

        numberFormat.format(c);
        System.out.println(c);
        String formatedc=numberFormat.format(c);
        System.out.println(formatedc+1);



    }
}
