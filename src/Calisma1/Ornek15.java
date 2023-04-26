package Calisma1;

import java.util.Scanner;

public class Ornek15 {

    public static void main(String[] args) {

        //Kullanicidan bir double, bir tamsayi alin, double sayiyi ikinci sayiya bolun
       // ve bolum isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir ondalikli sayi giriniz");

        double dbl = scanner.nextDouble();

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println("Islem sonucu : " + (int) (dbl/sayi));
    }
}
