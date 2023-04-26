package Calisma1;

import java.util.Scanner;

public class Ornek08 {
    public static void main(String[] args) {

        //Kullanicidan bir cemberin yaricapini alip, cevresini ve alanini yazdirin.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen cemberin yaricapini girin");


        double yaricap = scanner.nextDouble();

        System.out.println("Lutfen cemberin alani : " + (3.14*yaricap*yaricap));
        System.out.println("Lutfen cemberin cevresi : " + (3.14*2*yaricap));



    }
}
