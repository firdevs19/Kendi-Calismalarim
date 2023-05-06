package Calisma2;

import java.util.Scanner;

public class ForLoop4 {

    public static void main(String[] args) {

       /* Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin, sinirlar
        dahil olarak aralarindaki tum sayilarin toplamini yazdirin. Bitis degeri
        baslangic degerinden kucuk olsa da program calissin

        */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen bir baslangic sayisi giriniz");
        int baslangicDegeri = scanner.nextInt();
        System.out.println("Lutfen bir bitis sayisi giriniz");
        int bitisDegeri = scanner.nextInt();

        int toplam = 0;


        if (bitisDegeri < baslangicDegeri) {

            for (int i = bitisDegeri; i <= baslangicDegeri; i++) {

                toplam += i;


            }


        } else {


            for (int i = baslangicDegeri; i <= bitisDegeri; i++) {

                toplam += i;


            }

        }


        System.out.println(baslangicDegeri + " ile " + bitisDegeri + " arasindaki sayilarin toplami " + toplam);
    }
}
