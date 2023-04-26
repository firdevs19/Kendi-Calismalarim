package Calisma1;

import java.util.Scanner;

public class Ornek12 {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        Scanner scanner=new Scanner(System.in);

        System.out.println("Lutfen bir harf giriniz");

        char harf = scanner.next().charAt(0);
        char sonrakiHarf = (char) (harf+1);



        System.out.println("Girilen harften sonraki harf " + (char) (harf+1) + " " + (char) (harf+2) + " " + (char) (harf+3) );

    }
}
