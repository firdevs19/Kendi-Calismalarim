package Calisma1;

import java.util.Scanner;

public class Ornek06 {

    public static void main(String[] args) {

       // Kullanicidan bir dikdortgenin 2 kenar uzunlugunu alip,
        // dikdortgenin alanini  yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir dikdortgenin iki kenar uzunlugunu giriniz");

        double dbl1 = scanner.nextDouble();

        double dbl2 = scanner.nextDouble();

        System.out.println("Dikdortgenin alani : " + (dbl1*dbl2) + " m2");





    }
}
