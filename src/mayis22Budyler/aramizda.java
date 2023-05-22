package mayis22Budyler;

import java.util.Arrays;

public class aramizda {

    public static void main(String[] args) {

       // Tamsayılardan oluşan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı

       // bulunuz.
        //    Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2

        System.out.println("******* 1. Yol (binarySearch ile)*******");

        int[] a=new int[]{-12,-1,5,3,0, 18, -5, 23, -2};
        Arrays.sort(a);

        int sifirIndex=Arrays.binarySearch(a,0); // 0 degerinin index ini elde edelim, yoksa negatif donecektir.

        if (Arrays.binarySearch(a,0)>0){
            System.out.println("En küçük pozitif : "+  a[sifirIndex]);
            System.out.println("En büyük negatif : "+  a[sifirIndex-1]);

        }else {
         System.out.println("En küçük pozitif : "+  a[sifirIndex * -1  - 1 ]);
         System.out.println("En büyük negatif : "+  a[  sifirIndex * -1  - 2 ]);
        }
        System.out.println("******* 2. Yol (Math.min - max ile)*******");

       // int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        Integer minPositive = a[a.length-1];
        Integer maxNegative = a[0];
        for(Integer w : a){
            if(w>=0){
                minPositive = Math.min(minPositive, w);
            }
            if(w<0){
                maxNegative = Math.max(maxNegative, w);
            }
        }
        System.out.println("Minimum positive: " +minPositive);
        System.out.println("Maximum negative: " + maxNegative);


        System.out.println("******* 3. Yol (For Loop ve if() ile)*******");

        //int[] a = new int[]{-12, 18, -5, 23, -2};
        Arrays.sort(a);
        for (Integer i=0;i<a.length;i++){
            if (a[i]<0 && a[i+1]>=0) {
                System.out.println("Minimum positive: " + a[i+1]);
                System.out.println("Maximum negative: " + a[i]);
            }
        }

    }
}
