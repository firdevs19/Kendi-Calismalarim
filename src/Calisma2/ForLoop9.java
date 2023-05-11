package Calisma2;

import java.util.Scanner;

public class ForLoop9 {
    //(interview sorusu)- Kullanicidan bir String isteyin ve String’i tersten yazdirin.
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr="";

        for (int i = str.length()-1; i >=0; i--) {

            newStr += str.substring(i,i+1);

        }
        System.out.println(newStr);


    }
}
