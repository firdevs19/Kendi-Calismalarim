package Map_calismalar;

import java.util.*;

public class soru01 {

    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= new HashMap<>();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Cem-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Sevgi-Can-10-K-MF");

        // System.out.println(ogrenciMap);

        // soru : Map deki subesi H olan ogrencileri  isim ve soyisimlerini bir liste olarak yazdirin

        String sube="H";

        List<String> istenenSubedekiler = new ArrayList<>();  // 1
        Collection<String> ogrenciDegerler = ogrenciMap.values(); // 2

        String[] valueArr;
        for (String each: ogrenciDegerler
             ) {
            valueArr = each.split("-"); // [Ali,Can,11,H,MF] ornegin!!
            if (valueArr[3].equalsIgnoreCase(sube)){
                istenenSubedekiler.add(valueArr[0]+" "+valueArr[1]);
                //System.out.println(valueArr[0]+" "+valueArr[1]);
            }

        }
        System.out.println(istenenSubedekiler);






    }

}
