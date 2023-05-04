package Calisma1;

import java.util.Random;
import java.util.Scanner;

public class DenemeTasKagitMakas2 {
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
            System.out.print("Pc 1 puan aldi.(PC:Tas / Siz:Makas) ");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        } else if (pc==2&&oyuncu==1) {
            System.out.print("Pc 1 puan aldi.(PC:Kagit / Siz:Tas) ");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        } else if (pc==3&&oyuncu==2) {
            System.out.print("Pc 1 puan aldi.(PC:Makas / Siz:Kagit) ");
            pcPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        }else {
            System.out.print("Siz 1 puan aldiniz.(PC:"+yaziGetir(pc)+" / Siz:"+yaziGetir(oyuncu)+") ");
            oyuncuPuan++;
            System.out.println("Durum = Pc:"+pcPuan+" / Siz :"+oyuncuPuan );
        }

        if (pcPuan<5 &&oyuncuPuan<5 ){
            oyunaBasla();
        }else oyunBitti(pcPuan,oyuncuPuan);

    }
    public static String yaziGetir(int sayi){
        return switch (sayi) {
            case 1 -> "Tas";
            case 2 -> "Kagit";
            case 3 -> "Makas";
            default -> "";
        };
    }
    public static void oyunBitti(int pc, int oyuncu){
        if (pc<oyuncu){
            System.out.println("Tebrikler Siz kazandiniz!");
        }else System.out.println("Pc kazandi!");
    }

    public static int oyuncuSayiGetir() {

        System.out.println("Seciminizi yapin : " +
                "(1:Tas / 2:Kagit / 3:Makas )");
        kullaniciSayi= scanner.nextInt();
        scanner.nextLine();//dummy
        while (kullaniciSayi<=0 || kullaniciSayi>3) {
            System.out.println("Hatali giris Lütfen 1-3 arsi secim yapiniz!");
            oyuncuSayiGetir();
        }
        return kullaniciSayi;
    }

    public static int pcSayiGetir() {
        Random pcSayi=new Random();
        return pcSayi.nextInt(3)+1;
    }


}
