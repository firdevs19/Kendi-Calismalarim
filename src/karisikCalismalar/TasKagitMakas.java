package karisikCalismalar;

import java.util.Random;
import java.util.Scanner;
public class TasKagitMakas {
    static Scanner scanner = new Scanner(System.in);

    // Bilgisayara karsi tas kagit makas oyunu oynayacağımız kodları yazınız
    // Kural: 5 puana ilk ulasan oyunu kazanir.

    public static void main(String[] args) {



        System.out.println("Lutfen bir sayi giriniz :");

        int sayi = scanner.nextInt();


    }

    public static String oynat(){
        String kazanan="";
        int pcSayi;
        int userSayi;

        Random rnd = new Random();
        pcSayi=rnd.nextInt(3)+1;
        System.out.println("Lutfen bir sayi giriniz : \n1:Tas 2:Kagit 3:Makas");
        userSayi=scanner.nextInt();


        return kazanan;
    }

    public static String harfUret(int sayi){
        String harf ="";

        return harf;
    }


}
