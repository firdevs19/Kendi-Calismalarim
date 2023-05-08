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


        System.out.println(fibonacciSayilari(sayi));  // kendi..

        System.out.println(fibonacciListesi(sayi));  //  ChatGPT..

       // System.out.println(asalSayilariBul(fibonacciSayilari(sayi)));


    }

    public static List<Integer> fibonacciSayilari(int sayi){

        List<Integer> fibonacciList=new ArrayList<>(); // 0,1,1,2,3,5,8,13,21,34.....

        if (sayi<=1) {
            fibonacciList.add(0);// [0] kullanici "0" girerse listeye 0 ekle ve listeyi dondur

        }else {
            fibonacciList.add(0);
            fibonacciList.add(1);   // [0,1] kullanici 1'den buyuk sayi girerse sayiya esit veya kucuk olacak sekilde
                                    // fibonacci sayilarini listeye ekle ve dondur(once 0 ile 1 i ekleyerek basla..)

            while (sayi > (fibonacciList.get((fibonacciList.size() - 1))) + fibonacciList.get((fibonacciList.size() - 2))) { //

                fibonacciList.add((fibonacciList.get((fibonacciList.size() - 1)) + fibonacciList.get((fibonacciList.size() - 2))));

            }
        }


        return fibonacciList;
    }


    //ChatGPT cozumu:
    public static List<Integer> fibonacciListesi(int n) {
        List<Integer> fibListesi = new ArrayList<>();
        int a = 0, b = 1;
        while (b < n) {
            fibListesi.add(b);
            int temp = b;
            b = a + b;
            a = temp;
        }
        return fibListesi;
    }



 /*
    public static boolean asalMi(int sayi) {
        if (sayi <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> asalSayilariBul(List<Integer> sayilar) {
        List<Integer> asalSayilar = new ArrayList<>();
        for (int sayi : sayilar) {
            if (asalMi(sayi)) {
                asalSayilar.add(sayi);
            }
        }
        return asalSayilar;
    }
*/

}
