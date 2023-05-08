package GrupCalismalari;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buddy2 {

   /* Kullanicidan pozitif bir tamsayi alip, o tamsayiyi tam bolebilen tum pozitif
    tamsayilari bir liste olarak bize donduren bir method olusturun.

    */


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi = scanner.nextInt();

        System.out.println(bolenliste(sayi));


    }

    public static List<Integer> bolenliste(int sayi){


        List<Integer> bolenListe=new ArrayList<>();

        for (int i =1 ; i <= sayi ; i++) {

            if (sayi%i==0){

                bolenListe.add(i);
            }



        }



        return bolenListe;

    }










}
