package Calisma1;

import java.util.Scanner;

public class Ornek09 {

    public static void main(String[] args) {

        // Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen iki sayi giriniz");

        int sayi1 = scanner.nextInt();
        int sayi2 = scanner.nextInt();
        int sayi3 = sayi1;
        sayi1 = sayi2;
        sayi2=sayi3;

        System.out.println("Yeni sayi1 : " + sayi1 );
        System.out.println("Yeni sayi2 : " + sayi2 );
    }
}

