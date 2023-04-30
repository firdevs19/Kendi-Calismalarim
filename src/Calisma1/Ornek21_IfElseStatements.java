package Calisma1;

import java.util.Scanner;

public class Ornek21_IfElseStatements {

    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
        // “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir ucgenin kenar uzunluklarini giriniz");

        int sayi1= scanner.nextInt();
        int sayi2= scanner.nextInt();
        int sayi3= scanner.nextInt();

        if (sayi1==sayi2&&sayi2==sayi3){
            System.out.println("Eskenar ucgen");
        }
        else {
            System.out.println("Eskenar degil");
        }
    }
}
