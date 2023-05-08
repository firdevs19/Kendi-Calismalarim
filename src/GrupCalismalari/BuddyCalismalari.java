package GrupCalismalari;

import java.util.Scanner;

public class BuddyCalismalari {



    public class AdamAsmaca {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String[] kelimeler = {"elma", "armut", "muz", "çilek", "portakal", "kivi", "şeftali", "karpuz", "üzüm", "erik"};

            String secilenKelime = kelimeler[(int) (Math.random() * kelimeler.length)];
            int canSayisi = 6;
            StringBuilder bulunanHarfler = new StringBuilder();
            boolean oyunBitti = false;

            while (!oyunBitti) {
                System.out.println("Kelime: " + kelimeyiGizle(secilenKelime, bulunanHarfler));
                System.out.println("Kalan can sayısı: " + canSayisi);
                System.out.print("Harf girin: ");
                String harf = scanner.nextLine();

                if (harf.length() != 1) {
                    System.out.println("Lütfen sadece bir harf girin.");
                } else if (bulunanHarfler.toString().contains(harf)) {
                    System.out.println("Bu harfi zaten girdiniz.");
                } else if (secilenKelime.contains(harf)) {
                    bulunanHarfler.append(harf);
                    if (kelimeyiGizle(secilenKelime, bulunanHarfler).equals(secilenKelime)) {
                        System.out.println("Kelime: " + kelimeyiGizle(secilenKelime, bulunanHarfler));
                        System.out.println("Tebrikler, kazandınız!");
                        oyunBitti = true;
                    }
                } else {
                    canSayisi--;
                    if (canSayisi == 0) {
                        System.out.println("Kalan can sayısı: " + canSayisi);
                        System.out.println("Maalesef, kaybettiniz. Doğru kelime: " + secilenKelime);
                        oyunBitti = true;
                    }
                }
            }
        }

        public static String kelimeyiGizle(String kelime, StringBuilder bulunanHarfler) {
            StringBuilder gizliKelime = new StringBuilder();
            for (int i = 0; i < kelime.length(); i++) {
                if (bulunanHarfler.toString().contains(String.valueOf(kelime.charAt(i)))) {
                    gizliKelime.append(kelime.charAt(i));
                } else {
                    gizliKelime.append("_");
                }
            }
            return gizliKelime.toString();
        }
    }



















}
