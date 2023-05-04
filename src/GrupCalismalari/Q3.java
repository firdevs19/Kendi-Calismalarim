package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;

public class Q3 {
    public static void main(String[] args) {

        /*soru 3- Verilen String bir array’deki her bir elementi kontrol edip,

        - Kelimenin uzunlugu cift sayi ise ilk yarisini
        - Kelimenin uzunlugu tek sayi ise ortadaki harf dahil ikinci yarisini
        yeni bir listeye ekleyip yazdirin.

         */

        String[] kelimeler ={"elma","kiraz","uzum","seftali"};

        List<String> list=new ArrayList<String>();
        for (String each:kelimeler) {

            if(each.length()%2==0){

            list.add(each.substring(0,each.length()/2));



            }

            else {

                list.add(each.substring(each.length()/2));
            }

        }

        System.out.println("Kelimenin ilk yarisi ve ikinci yarisi : " + list);



    }
}
