package GrupCalismalari;

public class Q2 {

    public static void main(String[] args) {

        //Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
        //yazdiran bir method olusturun.


        int[] arr = { 2,3,5,0,1};

        karelerinToplami(arr);


    }

    public static void karelerinToplami(int[]arr){

        int karelerToplami = 0;

        for (int each:arr) {

            karelerToplami += each*each;
        }

        System.out.println(karelerToplami);
    }
}
