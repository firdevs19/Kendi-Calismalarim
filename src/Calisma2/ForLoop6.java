package Calisma2;

import java.util.Scanner;

public class ForLoop6 {

    public static void main(String[] args) {

        /*Kullanicidan 20’den kucuk bir sayi alip, bu sayinin faktoryel degerini
        hesaplayin. Konsolda faktoryel hesabinin yapilisini da yazdirin.
        Or : 6! = 6 * 5 * 4 * 3 * 2 * 1 = 720

         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi giriniz");

        int sayi = scanner.nextInt();
        long faktoriyel=1;

        for (int i = 1; i <=sayi ; i++) {

            faktoriyel*=i;

        }
        System.out.print(sayi+"! = "); // 6! =

        for (int i = sayi; i >=1 ; i--) {// 6 * 5 * 4 * 3 * 2 * 1
            System.out.print(i+" * ");
        }


        System.out.print("= "+faktoriyel); // = 720


    }
}
