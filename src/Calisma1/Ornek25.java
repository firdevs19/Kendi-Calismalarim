package Calisma1;

import java.util.Scanner;

public class Ornek25 {

    public static void main(String[] args) {

        /*
           Soru 5- Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk harf
                   olarak yazdirin, yoksa girilen harfi yazdirin

         */



        Scanner scanner= new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char karakter = scanner.next().charAt(0);

        if(karakter>='a'&& karakter<='z'){

            System.out.println(  (char)   (karakter-32)          );

        }

        else {

            System.out.println(karakter);
        }

        }


}
