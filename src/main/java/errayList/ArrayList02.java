package errayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Tomas");
        names.add("Tahsin");
        names.add("Trump");
        names.add("Tacettin");
        System.out.println(names);//[Tom, Tomas, Tahsin, Trump, Tacettin]

        List<String> cities = new ArrayList<>();
        cities.add("Tom");
        cities.add("Tomas");
        cities.add("Tahsin");
        names.removeAll(cities);
        System.out.println(names);

        List<String> myNames = new ArrayList<>();
        myNames.add("Thomas");
        myNames.add("Tahsin");

        boolean sonuc1 = names.containsAll(myNames);//Bir listin icinde coklu elemanlarin var olup olmadigini kontrol eder.
        //Hepsi varsa true, en az biri yoksa false veriri
        List<String> a = new ArrayList<>();
        a.add("Shoes");
        a.add("TV");
        a.add("Radio");
        a.add("Laptop");
        a.add("Shoes");
        a.add("Book");
        a.add("Shoes");
        System.out.println(a);

        //Example 1: "a" listinde "Shoes" elemaninin ilk gorunumunu siliniz
        a.remove("Shoes");
        System.out.println(a);
        //Example 2: "a" listinde "Shoes" elemaninin tum gorunumlerini siliniz
        List<String> silinecekler = new ArrayList<>();
        silinecekler.add("Shoes");
        a.removeAll(silinecekler);
        System.out.println(a);
        //Example 3: Bir tane salary listi olusturun, eger salary 10000'den az ise %20 10000 ve 10000'den cok ise %10 zam yapiniz.
        List<Double> salary = new ArrayList<>();
        salary.add(12345.00);
        salary.add(8674.50);
        salary.add(15000.75);
        salary.add(9500.00);
        salary.add(20500.00);
        System.out.println(salary);
        for (double w : salary) {
            if (w > 10000) {
                salary.set(salary.indexOf(w), w * 1.2);
            } else
                salary.set(salary.indexOf(w), w * 1.1);
        }
        System.out.println(salary);

        //Example 4: Iki ArrayList'in esit olup olmadigini kontrol eden kodu yaziniz
        //Note: Iki ArrayList'in esit olabilmesi icin,elemanlar esit olmali ve ayni elemanlar ayni index'te olmali
        List<Character> m = new ArrayList<>();
        m.add('x');
        m.add('y');
        m.add('z');

        List<Character> n = new ArrayList<>();
        n.add('x');
        n.add('y');
        n.add('z');
        // 1.yol
        int counter = 0;
        for (int i = 0; i < m.size(); i++) {
            if (m.size() != n.size()) {
                counter++;
                System.out.println("eleman sayıları birbirine esit degildir");
                break;
            } else if (m.get(i) != n.get(i)) {
                counter++;
                System.out.println("elemanlar bir birine eşit degildir");
                break;
            }

        }
        if(counter==0){
            System.out.println("elemanlar bir birine eşittir");
        }
        //2. yol
        boolean esitMi=m.equals(n);
        if(esitMi){
            System.out.println("eleman sayıları bibirine esit");
        }else
            System.out.println("eleman sayıları birbirine esit degildir");


    }
}
