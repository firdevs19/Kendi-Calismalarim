package Calisma1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Market {
    /*
        ==================== WISE MARKET KASA PROGRAMI ===================================
        ilk programa girildiginde bizi bir menu karsilasin bu secenekler
            1 ŞARKÜTERİ ÜRÜNLERİ
            2 MANAV ÜRÜNLERİ
            3 MARKET
        secime gore ,
        4-urunleri listele ve
        5-fiyatlari gelsin
    */
static List<String> sarkuteriUrunler = new ArrayList<>();
static String[] marketUrunArr={"Deterjan","Kalem","Ekmek","Biskuvi","Gazoz","Su","Kagit Havlu"};
static double[] marketFiyatArr={15,5,3,6,7,1,11};
static String [] sarkuteriArr={"Dana Eti","Kuzu Eti","Kiyma","Beyaz Peynir","Kasar","Zeytin","Tavuk"};
static double[] sarkuteriFiyatArr={45,55,35,20,25,20,30};
static String[] manavArr={"Elma","Portakal","Sogan","Uzum","Patates","Marul","Havuc"};
static double[] manavFiyatArr={5,6,8,6,2,1,3};
static int menuSecim=0;
static Scanner scanner=new Scanner(System.in);

    //("Dana Eti","Kuzu Eti","Kiyma","Beyaz Peynir","Kasar","Zeytin","Tavuk");
    public static void main(String[] args) {

anaMenu();
    }
    public static void anaMenu(){
        menuSecim=0;
        System.out.println("===== WISE MARKET ANA MENU ====="+
        "\n\t1 SARKUTERI URUNLERI"+
                "\n\t2 MANAV URUNLERI"+
                "\n\t3 MARKET\nLutfen seciminizi yapiniz : " );
        menuSecim=scanner.nextInt();

switch (menuSecim){
    case 1:sarkuteriUrunleriGetir();break;
    case 2:manavUrunleriGetir();break;
    case 3:marketUruleriGetir();break;
    default:
        System.out.println("Hatali giris!");
        anaMenu();
}
    }
    private static void marketUruleriGetir() {
        System.out.println("Market Urunleri :");
        for (int i = 0; i < marketUrunArr.length; i++) {
            System.out.println(i+1+" - "+marketUrunArr[i]);
        }
    }
    private static void manavUrunleriGetir() {
        System.out.println("Manav Urunleri");
    }
    private static void sarkuteriUrunleriGetir() {
        System.out.println("Sarkuteri Urunleri");
    }


}
