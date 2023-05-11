package Calisma2;

import java.util.Scanner;

public class ForLoop7 {

   // Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.

    public static void main(String[] args) {

        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        int tur=sayi;

        int toplam=0;
        int sonBasamak=0;

        for (int i = 0; i <tur ; i++) {  //123

            sonBasamak=sayi%10; //3

            toplam+=sonBasamak;

            sayi=sayi/10;



            if (sayi<1){

                break;
            }

        }
        System.out.println( sayi +" sayisinin rakamlar toplami: " + toplam + " dir.");
    }


}
