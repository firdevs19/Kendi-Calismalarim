package Calisma4;

import java.util.Scanner;

public class Methods3 {

    /*

    Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin. Girilen sayinin asal sayi
    olup olmadigini kontrol edip, sonuc olarak “asal sayi” veya “asal sayi degil”
    sonuclarini donduren bir method olusturun.


     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println(asalSayiMI(sayi));
        boolean asalMi = asalSayiMI(sayi);


        if (asalMi){
            System.out.println(sayi + " asal bir sayidir.");

        }else {
            System.out.println(sayi + " asal bir sayi degildir.");
        }

    }

    public static boolean asalSayiMI(int sayi){
        boolean asalMi = true;

        for (int i = 2; i < sayi  ; i++) {

            if (sayi % i==0){

                asalMi=false;

                break;
            }
        }
        return asalMi;
    }


}
