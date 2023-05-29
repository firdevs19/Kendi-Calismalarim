package GrupCalismalari;
import java.lang.*;
import java.util.Arrays;

public class Arrays0 {

    public static void main(String[] args) {

        // Verilen bir int array in elemanlarini 2 arttirip bize donduren
        // bir method olusturun.Eski arrayi yeni haliyle kaydedin.

        int [] arr ={1,2,3,4,5,6};
        int[] yeniArr=arrArttir(arr);

        System.out.println("yeni array :" + Arrays.toString(yeniArr));

    }




    public static int[] arrArttir(int[] arr){

        int[] yeniArr= new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            yeniArr[i]=arr[i]+2;



        }
        return yeniArr;
    }
}
