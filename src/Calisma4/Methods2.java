package Calisma4;

import java.util.Scanner;

public class Methods2 {

    /*

    Soru 2- Kullanicidan main method icinde ayri ayri isim ve soyismini alin
    Isim ve soyismi ilk harfleri buyuk diger harfler kucuk olacak sekilde duzenleyip,
    isim bosluk soyisim seklinde bize donduren bir method olusturun
    input : isim : Ali soyisim :YILMAZ. output : Ali Yilmaz

     */
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {


      System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();


       // fullName2(isim,soyisim);

        System.out.println(fullName(isim, soyisim));

        //fullName3();

    }

    public static String fullName (String isim,String soyisim){
        String adSoyad="";
        adSoyad=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "+soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

       return adSoyad;
    }
    public static void fullName2 (String isim,String soyisim){
        String adSoyad="";
        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                +soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());

    }
    public static void fullName3 (){
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim = scanner.nextLine();

        System.out.println(isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase()+" "
                +soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase());

    }

}