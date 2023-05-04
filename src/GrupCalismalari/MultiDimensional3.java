package GrupCalismalari;

public class MultiDimensional3 {
    /*
        Soru 4- Verilen 2 katli bir array’de bulunan tum sayilarin carpimini bize donduren bir
                method olusturun.
     */

    public static void main(String[] args) {
        int[][] arr = {  {3,1,2,4} ,  {1,2,2}  , {10,2} };

        System.out.println("Arraydeki tum elementlerin carpim sonucu : " +  elemanlariCarp(arr) ); //1920
    }
    public static int elemanlariCarp(int[] []arr){
        int carpim=1;

        for (int i = 0; i < arr.length; i++) { //arr.length =3

            for (int j = 0; j < arr[i].length; j++) {  //{3,1,2,4}=4  //{1,2,2} =3 //{10,2}=2

                carpim *=arr[i][j];
            }
        }

        return carpim;
    }

}
