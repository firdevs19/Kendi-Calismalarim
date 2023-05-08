package GrupCalismalari;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buddy3 {

    /*
    Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    bir liste olarak bize donduren bir method olusturun.

     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        System.out.println(fibonacciSayilari(sayi));


    }

    public static List<Integer> fibonacciSayilari(int sayi){

        List<Integer> fibonacciList=new ArrayList<>(); //(1,1),2,3,5,8,13,21,34.....

        if (sayi==0) {
            fibonacciList.add(0);
        }else if(sayi==1) {
            fibonacciList.add(0);
            fibonacciList.add(1);
        }else {
            fibonacciList.add(0);
            fibonacciList.add(1);  //[0,1
            // ]

            while (sayi >= (fibonacciList.get((fibonacciList.size() - 1))) + fibonacciList.get((fibonacciList.size() - 2))) { //

                fibonacciList.add((fibonacciList.get((fibonacciList.size() - 1)) + fibonacciList.get((fibonacciList.size() - 2))));

            }
        }


        return fibonacciList;
    }


}
