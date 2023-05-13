package Calisma2;

import java.util.Scanner;

public class ForLoop11 {

    //Kullanicidan pozitif bir tamsayi isteyip, sayinin asal sayi olup olmadigini
    //kontrol edin ve sonucu yazdirin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi = scanner.nextInt();

        boolean asalMi = true;

        for (int i = 2; i < sayi  ; i++) {

            if (sayi % i==0){

                asalMi=false;

                break;


        }


            }

        if (asalMi){
            System.out.println(sayi + " asal bir sayidir.");

        }else {
            System.out.println(sayi + " asal bir sayi degildir.");
        }

    }

        }




