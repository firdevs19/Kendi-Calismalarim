package Calisma1;

import java.util.Scanner;

public class Ornek05 {
    public static void main(String[] args) {

        // Kullanicidan ismini, soyismini ve yasini alip, asagidaki formmatta yazdirin.
        //Isminiz : John
        //Soyisminiz : Doe
        //Yasiniz : 44
        //Kaydiniz basariyla tamamlanmistir.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen adinizi giriniz");

        String str1 = scanner.nextLine();

        System.out.println("Lutfen soyadinizi giriniz");

        String str2 = scanner.nextLine();

        System.out.println("Lutfen yasinizi giriniz");

        int sayi = scanner.nextInt();

        System.out.println(" adi : " + str1 + "\nsoyadi : " + str2 + "\nYasi : " + sayi);

        System.out.println("Kaydiniz basariyla tamamlanmistir");

    }
}
