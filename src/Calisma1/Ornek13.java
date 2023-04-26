package Calisma1;

import java.util.Scanner;

public class Ornek13 {

    public static void main(String[] args) {

        //Kullanicidan bir sayi alin, kullanici kac degerini girerse girsin, o sayiyi -128
        //ile 127 arasindaki bir sayiya donusturup yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz");

        int sayi = scanner.nextInt();

        int  sayi1 = (byte) (sayi);

        System.out.println("Sayinin byte karsiligi :" +(sayi1) );

    }
}
