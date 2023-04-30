package Calisma1;

import java.util.Scanner;

public class Ornek26 {

    public static void main(String[] args) {

        /*
            Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli
            olabilir.
            Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman
            gerekir” yazdirin.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println(" Lutfen cinsiyetini(E/K) ve yasinizi giriniz");

        char karakter = scanner.next().toUpperCase().charAt(0);
        int yas = scanner.nextInt();

        if(karakter=='E'){

            if(yas>=65){

                System.out.println("Emekli olabilirsin");
            }

            else{
                System.out.println("Calisman gereken yil : " + (65-yas) );

            }


        }

        else {

            if(yas>=60){

                System.out.println("Emekli olabilirsin");
            }

            else{
                System.out.println("Calisman gereken yil : " + (60-yas) );

            }



        }


    }
}
