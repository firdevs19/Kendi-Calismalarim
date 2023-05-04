package GrupCalismalari;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1 {

    public static void main(String[] args) {

        //Soru 1- Verilen bir array’de tekrar eden elementler icin, mukerrer olanlari silip, tum
        //elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer[] arr={2,3,4,6,6,8,9,3,0,7};

        List<Integer> list= new ArrayList<>();

        for (int each :arr) {

            if(!list.contains(each)){
                list.add(each);

            }

        }
        arr=new Integer[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=list.get(i);

        }

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
