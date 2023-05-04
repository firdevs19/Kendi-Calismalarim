package Calisma1;

import java.util.Random;
import java.util.Scanner;

public class DenemeTasKagitMakas {
    static Scanner scanner=new Scanner(System.in);
    static int kullaniciSayi=0;
    static int pc,oyuncu,pcPuan=0,oyuncuPuan=0;
    public static void main(String[] args) {
        oyunaBasla();
    }

    public static void oyunaBasla() {
        pc=pcSayiGetir();
        oyuncu=oyuncuSayiGetir();

        if (pc==oyuncu){
            System.out.println("Berabere yeniden deneyin!");

        } else if (pc==1&&oyuncu==3) {
            System.out.println("Pc 1 puan aldi");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );

        } else if (pc==2&&oyuncu==1) {
            System.out.println("Pc 1 puan aldi");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        } else if (pc==3&&oyuncu==2) {
            System.out.println("Pc 1 puan aldi");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        }else {
            System.out.println("Siz 1 puan aldiniz");
            oyuncuPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        }

        if (pcPuan<5 &&oyuncuPuan<5 ){
            oyunaBasla();
        }else oyunBitti(pcPuan,oyuncuPuan);
       
    }
    public static void oyunBitti(int pc, int oyuncu){
        if (pc<oyuncu){
            System.out.println("Tebrikler Siz kazandiniz!");
        }else System.out.println("Pc kazandi!");
    }

    public static int oyuncuSayiGetir() {

        System.out.println("Lutfen bir secim giriniz : \n" +
                "1:Tas / 2:Kagit / 3:Makas ");
        kullaniciSayi= scanner.nextInt();
        scanner.nextLine();//dummy
        while (kullaniciSayi<=0 || kullaniciSayi>3) {
            System.out.println("Hatali giris Lütfen 1-3 arsi secim yapiniz!");
            oyuncuSayiGetir();
        }
        int deger =kullaniciSayi;
        return deger;
    }

    public static int pcSayiGetir() {
        Random pcSayi=new Random();
        int pc=pcSayi.nextInt(3)+1;
        return pc;
    }


}
