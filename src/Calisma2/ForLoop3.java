package Calisma2;

import java.util.Scanner;

public class ForLoop3 {

    public static void main(String[] args) {

        /*Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin

         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen baslangic degerini giriniz");
        int baslangicSayi = scanner.nextInt();

        System.out.println("Lutfen bitis degerini giriniz");
        int bitisSayi = scanner.nextInt();
        int toplam = 0;

        if (baslangicSayi>bitisSayi){
            System.out.println(" Yanlis deger girdiniz");

        }else {

            for (int i = baslangicSayi; i <=bitisSayi ; i++) {

            toplam+=i;

        }

        System.out.println(    baslangicSayi +" ile " +     bitisSayi+ " arasindaki sayilarin toplami  : "+ toplam            );  // 3 + " ile " + 10 +  " arasindaki sayilarin toplami "  + 154  +  " dir."


    }

    }
}
