package Calisma1;

import java.util.Scanner;

public class Ornek14 {

    public static void main(String[] args) {

        //Kullanicidan iki double sayi alin, ilk sayiyi ikinci sayiya bolun ve bolum
        //isleminin sonucununun tamsayi kismini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen ondalikli iki sayi giriniz");

        double dbl1 = scanner.nextDouble();
        double dbl2 = scanner.nextDouble();

        System.out.println("Islemin tamsayi sonucu :" + (int)(dbl1/dbl2) );




    }
}
