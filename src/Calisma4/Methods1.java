package Calisma4;

import java.util.Scanner;

public class Methods1 {

    /*
        Kullanicidan input olarak verilen bir String, baslangic ve bitis indexlerine gore
        baslangic index'i dahil, bitis index'i haric olacak sekilde aradaki harfleri yazdiran
        bir method olusturun.
        - kullanici baslangic degeri olarak, bitis degerinden buyuk bir sayi girerse, hata
        mesaji verin
        - kullanici str'da olan index'lerden daha buyuk bir index girerse hata mesaji
        yazdirin

     */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lufen bir metin giriniz");

        String str = scanner.nextLine();

        System.out.println("Baslangic indexi giriniz");

        int baslangicIndex = scanner.nextInt();

        System.out.println("Bitis indexi giriniz");

        int bitisIndex = scanner.nextInt();

        if (baslangicIndex>bitisIndex){

            System.out.println("Hatali giris");


        } else if (bitisIndex>=str.length()) {

            System.out.println("Hatali giris");

        }else {

            aralikYazdir(str,baslangicIndex,bitisIndex);


        }

    }

    private static void aralikYazdir(String str,int baslangic, int bitis) {

        System.out.println(str.substring(baslangic,bitis));
    }

}


