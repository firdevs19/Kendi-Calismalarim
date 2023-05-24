import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WomensPower2 {

    public static void main(String[] args) {

        //Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?


        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();

        //int[] arr = {12,21,12,13,12,21,35};

        for (Integer each : myList
             ) {

            if (myMap.containsKey(each)){
                myMap.put(each, myMap.get(each)+1 );

            }else {
                myMap.put(each,1);
            }
        }
        System.out.println(myMap);
            /*
                Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
                bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
                Map<String, Integer> product = new HashMap<>();
                product.put("Laptop", 82);
                product.put("TV", 53);
                product.put("Refrigerator", 12);
                product.put("Music System", 87);
                product.put("Mobile Phone", 53);
            */

        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

            
        }

        
    }

