package Map_calismalar;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Soru3 {
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

        // Soru:Map deki soyisimleri buyuk harfe cevirin.
        System.out.println(ogrenciMap);

        for (Map.Entry<Integer , String> each : ogrenciSetMap
        ) {
            tempValue = each.getValue();
            tempValueArr = tempValue.split("-");
            tempValueArr[1]=tempValueArr[1].toUpperCase(); // Can=CAN

            tempValue=tempValueArr[0]+"-"+
                    tempValueArr[1]+"-"+
                    tempValueArr[2]+"-"+
                    tempValueArr[3]+"-"+
                    tempValueArr[4];

           each.setValue(tempValue) ;

        }

        System.out.println(ogrenciMap);

    }
}
