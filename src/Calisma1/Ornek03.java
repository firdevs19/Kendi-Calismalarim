package Calisma1;

import java.util.Scanner;

public class Ornek03 {

    public static void main(String[] args) {

        // Kullanicidan 3 farkli data turunde deger alip,
        // bunlari aciklamalariyla yazdirin.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str = scanner.nextLine();

        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scanner.nextInt();


        System.out.println("Lutfen bir karakter giriniz");
        char chr = scanner.next().charAt(0);

        System.out.println("Girdiginiz String : " + str);
        System.out.println("Girdiginiz int : " + sayi);
        System.out.println("Girdiginiz karakter : " + chr);


    }

}
