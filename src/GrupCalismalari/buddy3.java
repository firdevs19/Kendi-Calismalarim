package GrupCalismalari;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class buddy3 {

    /*
    Kullanicidan pozitif bir tamsayi alip, o tamsayidan kucuk Fibonacci sayilarini
    bir liste olarak bize donduren bir method olusturun.

     */

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);

        System.out.println("Lutfen bir tamsayi giriniz");

        int sayi = scanner.nextInt();
        System.out.println(fibanocciSayilari(sayi));


    }

    public static List<Integer> fibanocciSayilari(int sayi){

        List<Integer>fibanoccoList=new ArrayList<>();

        if (sayi==0){
            fibanoccoList.add(0);

        } else if (sayi==1) {
            fibanoccoList.add(0);
            fibanoccoList.add(1);

        }else{

            fibanoccoList.add(0);
            fibanoccoList.add(1);

            while (sayi>=(fibanoccoList.get(fibanoccoList.size()-1))+fibanoccoList.get(fibanoccoList.size()-2)){

                fibanoccoList.add((fibanoccoList.get(fibanoccoList.size()-1))+fibanoccoList.get(fibanoccoList.size()-2));


            }


        }

        return fibanoccoList;


    }
}
