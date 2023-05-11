package GrupCalismalari;

import java.util.ArrayList;
import java.util.Scanner;

public class Mayis10_YusufBey {
     /*

    kullanicidan bir sayi alıp, icindeki cift sayilari basa yazdiran bir java programi yaziniz

    input : 13247, output: 24137

     */

    static Scanner scan = new Scanner(System.in);



    public static void main(String[] args) {

        String sayi;
        int basSayi;
        int swap;
        char chr;

        System.out.println("Lutfen bir sayi giriniz");
        sayi=scan.nextLine();
        basSayi=sayi.length();

        ArrayList<Integer> liste= new ArrayList<>();


        for(int i=0; i<basSayi; i++){

            chr =sayi.charAt(i);

            liste.add(Integer.parseInt(Character.toString(chr)));

        } System.out.println(liste);
        int offSet=0;

        for (int i=0; i<basSayi; i++){

            if (liste.get(i)%2==0){

                swap= liste.get(i);

                liste.remove(i);
                //System.out.println(liste);

                liste.add(0+offSet,swap);
                //System.out.println(liste);
               // i++;
                //offSet++;
            }
           /* System.out.print(" flag : "+flag +" i: "+i);
            if (flag>liste.size()/2){
                break;
            }
         */
        }

        System.out.println(liste);
    }
}
