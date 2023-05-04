package GrupCalismalari;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ScheduledFuture;

public class Q05 {

    public static void main(String[] args) {
        //Soru 5- Kullanicidan array’in boyutunu ve elementlerini alip array’i olusturan ve bize
        //donduren bir method olusturun.

        System.out.println(Arrays.toString( arrayOlustur() ));

    }

  public static String [] arrayOlustur(){

      Scanner scanner=new Scanner(System.in);

      System.out.println("Lutfen array in boyutunu giriniz : ");
      int arrayBoyut= scanner.nextInt();

      scanner.nextLine(); //dummy

      String [] arr=new String[arrayBoyut];

      for (int i = 0; i <arr.length ; i++) {
          System.out.println("Eleman giriniz : ");
          arr[i]= scanner.nextLine();
      }

        return arr;
  }
}
