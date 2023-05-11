package Calisma2;

import java.util.Scanner;

public class ForLoop10 {
    //0 (interview)- Kullanicidan bir String isteyin ve String’i tersine cevirip
    //kaydedin.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String newStr="";

        for (int i = str.length()-1; i >=0; i--) {

            newStr += str.substring(i,i+1);

        }
        str=newStr;
        System.out.println(str);


    }

}
