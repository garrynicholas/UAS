/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

import java.util.Scanner;

/**
 *
 * @author GUNAWAN WIDYA NUGRAHA
 */

public class MatematikaBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matCanggih = new MatematikaCanggih();

        // Uji angka pecahan
        System.out.println("Uji Parameter Pecahan:");
        System.out.printf("Pertambahan: %.2f%n", matCanggih.pertambahan(12.5, 28.7, 14.2));
        System.out.println("Pertambahan: " + matCanggih.pertambahan(12, 28, 14));
        System.out.println("Pertambahan: " + matCanggih.pertambahan(23, 34));
        System.out.printf("Pertambahan: %.2f%n", matCanggih.pertambahan(3.4, 4.9));

        // Uji operasi tiga angka
        System.out.println("\nOperasi Gabungan Tiga Angka:");
        System.out.printf("12.5 + 28.7 - 14.2 = %.2f%n", matCanggih.operasiTigaAngka(12.5, 28.7, 14.2));
    }
}
