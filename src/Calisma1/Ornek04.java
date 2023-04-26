package Calisma1;

import java.util.Scanner;

public class Ornek04 {

    public static void main(String[] args) {

        // Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini
        //yazdirin

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lutfen ondalikli  bir sayi giriniz");
        double dbl = scanner.nextDouble();
        System.out.println(" Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        System.out.println("Girdiginiz sayilarin toplami : " + (dbl+sayi) + "\nGirdiginiz sayilarin carpimi : " + (dbl*sayi) );
    }
}
