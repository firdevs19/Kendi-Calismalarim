package Calisma3;

public class NestedIfElse {

    /*Soru – Asagidaki sekilleri yazdirin
        *               * * * * * * * *             * * * * * * * *
        * *             * * * * * * * *             * * * * * *
        * * *           * * * * * * * *             * * * *
        * * * *         * * * * * * * *             * *


     */
    /*
     * * * * * * * *
     * * * * * * * * *
     * * * * * * * * *
     * * * * * * * * *
     * * * * * * * * *
     */

    public static void main(String[] args) {

        int satir = 4;

        // Şekil 1
        for (int i = 1; i <= satir; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Şekil 2
        for (int i = satir; i >= 1; i--) {
            for (int j = 1; j <= satir - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // Şekil 3
        for (int i = satir; i >= 1; i--) {
            for (int j = 1; j <= satir - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}








