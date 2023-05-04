package GrupCalismalari;

public class MultiDimensional4 {

    /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
                toplaminini yazdiran bir method olusturun.
     */

    public static void main(String[] args) {

        int[][] arr = {{3,1,2,4,1},{1,4,4},{3,4,5},{10,14},{2,7,15}};

        System.out.println("Array'in son elementleri toplami : " + sonElementleriTopla(arr)); //39
        System.out.println("\n=========For Each Loop ile===========\n");
        System.out.println("Array'in son elementleri toplami : " + sonElementleriToplaForEach(arr));  //39

    }

    public static int sonElementleriTopla(int [][]arr){
        int toplam=0;
        int sonElement=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                sonElement=arr[i][j];
                System.out.println(sonElement);
            }
            toplam+=sonElement;
        }

        return toplam;
    }
    public static int sonElementleriToplaForEach(int [][]arr){
        int toplam=0;
        int sonElement=0;

        for (int[] icArray : arr) {

            for (int element : icArray) {
                sonElement = element;
                System.out.println(sonElement);
            }
            toplam += sonElement;
        }

        return toplam;
    }
}
