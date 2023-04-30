package Calisma1;

import java.util.Scanner;

public class Ornek22 {

    public static void main(String[] args) {

        //Soru 2- Kullanicidan notunu alin 50 veya daha buyukse ”Sinifi Gectin”, 50’den
        //kucukse “Maalesef kaldin” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        int sayi = scanner.nextInt();

        if(sayi>=50){
            System.out.println("Sinifi gectin");
        }

        else {

            System.out.println("Maalesef kaldin");

        }
    }
}
