package Map_calismalar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Soru02 {
    public static void main(String[] args) {
        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        Set<Map.Entry<Integer,String>> ogrenciSetMap = ogrenciMap.entrySet();

        Integer tempKey;
        String tempValue;
        String[] tempValueArr ;

        // Soru: 10. siniftaki ogrencilerin no, isim, soyisim, bolumlerini bir liste olarak yazdirin

        for (Map.Entry<Integer , String> each : ogrenciSetMap
        ) {

            tempKey = each.getKey();
            tempValue = each.getValue();
            tempValueArr = tempValue.split("-");

            if (tempValueArr[2].equals("10")){

                System.out.println(
                        tempKey+ " "+
                        tempValueArr[0] + " " +
                                tempValueArr[1]+" "+
                                 tempValueArr[4]
                );

            }

        }




    }
}
