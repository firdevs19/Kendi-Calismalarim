package Calisma1;

import java.util.Scanner;

public class Ornek07 {

    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        //girilen bilgiler : J Doe, 44

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");

        String str1 = scanner.next().toUpperCase().substring(0,1);

        System.out.println("Lutfen soyadinizi giriniz");

        String str2 = scanner.next();

        System.out.println("Lutfen yasinizi giriniz");

        int sayi = scanner.nextInt();

        str2 = str2.substring(0,1).toUpperCase()+ str2.substring(1).toLowerCase();

        System.out.println(str1+" " + str2 + ", " + sayi);





    }
}
