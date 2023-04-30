package Calisma1;

import java.util.Scanner;

public class Ornek17 {

    public static void main(String[] args) {

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        // NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf = scanner.next().toLowerCase().charAt(0);

        if(harf=='o'){
            System.out.println("ocak");
        }

        if(harf=='s'){
            System.out.println("subat");
        }

        if(harf=='m'){
            System.out.println("mart-mayis");

        }if(harf=='n'){
            System.out.println("nisan");

        }if(harf=='h'){
            System.out.println("haziran");

        }if(harf=='t'){
            System.out.println("temmuz");

        }if(harf=='a'){
            System.out.println("agustos-aralik");

        }if(harf=='e'){
            System.out.println("eylul-ekim");

        }if(harf=='k'){
            System.out.println("kasim");



    }
        }

}
