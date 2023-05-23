package mayis22Budyler;

public class WomensPower1 {

    public static void main(String[] args) {

/*
    120'den 11'e kadar 4 ile bölünebilen ve 6 ile bölünebilen tüm tam sayıları aynı satırda iki
ardışık tam sayı arasında boşluk bırakarak yazınız

Bir String’ de tekrarlanan karakterleri yazdırmak için kod yazınız.
Örneğin; accessories ´ ces
 */

int adet=0;
        for (int i = 120; i >= 11; i--) {

            if (i % 4 == 0 && i % 6 == 0) {

                System.out.print(i + "(4/6) ");
                adet++;

            } else if (i % 4 == 0) {
                System.out.print(i + "(4) ");
                adet++;
            } else if (i % 6 == 0) {
                System.out.print(i + "(6) ");
                adet++;
            }
            if (adet>0 && adet%10==0){
                System.out.println("");
                adet=0;
            }

        }
        System.out.println("");
        String str = "accessoriesiessderfetrescerftoackt";
        System.out.print("Tekrarlanan karakterler: ");

        for (int i = 0; i < str.length(); i++) {

            char harf = str.charAt(i);


            if (i>0 && str.substring(0,i).contains(String.valueOf(str.charAt(i)))){
                continue;
            }

            for (int j = i + 1; j < str.length(); j++) {
                if (harf == str.charAt(j)) {
                    System.out.print(harf + " ");
                    break;
                }
            }
        }
    }
}