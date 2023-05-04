package GrupCalismalari;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {

    public static void main(String[] args) {

        /*Soru 4- Kullanicidan bir cumle ve bir harf alin, harf cumlede kullanilmissa kac kere
        kullanildigini yazdirin, kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("lutfen bir cumle giriniz :");
        
        String cumle = scanner.nextLine();

        System.out.println("Lutfen bir harf giriniz : ");
        
        String harf = scanner.next();

        String[]arr = cumle.split("");

        //System.out.println(Arrays.toString(arr));

        int sayac = 0;

        for (String each:arr) {

            if (each.equalsIgnoreCase(harf)){

                sayac++;

            }
        }

        if (sayac==0){

            System.out.println("Aradiginiz harf cumlede kullanilmamistir ");

        }
        else {

            System.out.println("Aradiginiz harf cumlede " + sayac + " adet kullanilmistir ");
        }


    }

}
