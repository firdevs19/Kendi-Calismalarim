package Calisma2;

import java.util.Scanner;

public class ForLoop5 {
    /*
        Soru 5- Kullanicidan 20’den kucuk bir sayi alip,
                bu sayinin faktoryel degerini hesaplayin.
     */
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Lutfen 20'den kucuk bir sayi giriniz : ");
        int sayi= scanner.nextInt();
        long faktoriyel=1;

        for (int i = 1; i <= sayi ; i++) {

            faktoriyel*=i;

        }

        System.out.println(sayi+ "!= " + faktoriyel );






    }
}
