package Calisma1;


import java.util.Arrays;
import java.util.Scanner;

public class AdamAsmaca {
    /*
                        -------ADAM ASMACA OYUNU --------
        Kullanıcı, tahmin etmek istediği harfleri girebilir. Tahmin edilen harfler,
        kelimenin doğru harfleriyle yer değiştirilir ve kalan hak sayısı tutulur.
        Tahmin edilen kelimenin her aşaması ekrana yazdırılır.
        Kullanıcının tahmin hakkı bittiğinde, doğru kelime ekrana yazdırılır

        kelimeyi listeye aktar
        ayni liste kadar ** koy-gizli yap
        bir tahmin al
        tahmin dogruysa harfin oldugu yerlerdeki *lari harfle degistir
        gizli kelimenin son halini yazdir
        tahmin sayisini bir artir.
        kelime bilindiyse tahmin sayisini yazdir - * sayisi ==0
        kelime bilinmediyse tahmin hakki kadar islemi dondur- bir tahmin daha al
        tahmin hakki bittiyse
 */

    static String bilinenKelime="*";

    static String kelime = "istanbul";//aranacak kelimeyi burdan degistirin
    static int tahminSayisi=0;
    static String[] kelimeListe = kelime.split("");
    static String[] kelimeGizli = new String[kelimeListe.length];

    public static void main(String[] args) {
        kelime = kelime.toUpperCase();

        for (int i = 0; i < kelimeGizli.length; i++) {
            kelimeGizli[i] = "*";
        }
        System.out.println(Arrays.toString(kelimeGizli));
        oyunaGit();
    }
        public static void oyunaGit(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("bir harf girin:");
        String harf= scanner.next().toUpperCase().substring(0,1);

        if (kelime.contains(harf)){
            for (int i = 0; i < kelimeGizli.length; i++) {
                if(kelimeListe[i].equalsIgnoreCase(harf)){
                    kelimeGizli[i]=harf;
                }
            }
            System.out.print("dogru tahmin : ");
            bilinenKelime="";
            for (int j = 0; j < kelimeGizli.length; j++) {
                System.out.print(kelimeGizli[j]);
                bilinenKelime+=kelimeGizli[j];

            }
            System.out.println("");
        }else {tahminSayisi++;
            System.out.println("kalan hakkiniz : "+(10-tahminSayisi));
        }
        if (bilinenKelime.contains("*")&&tahminSayisi<10){
            oyunaGit();
        }else oyunBitti(tahminSayisi);

    }
    public static void oyunBitti(int a){
        if (a<=10&&!bilinenKelime.contains("*")){
            System.out.println("Tebrikler "+tahminSayisi+" hata ile bildiniz");
        }else {
            System.out.println("Maalesef kaybettiniz");
            System.out.println("Aranan kelime : " + kelime.toUpperCase());
        }
    }
}
