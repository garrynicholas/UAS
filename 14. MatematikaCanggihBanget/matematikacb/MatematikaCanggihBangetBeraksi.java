/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package matematikacb;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        MatematikaCanggihBanget matCanggihBanget = new MatematikaCanggihBanget();

        Scanner scanner = new Scanner(System.in);

        // Input angka
        System.out.println("====================================================");
        System.out.print("Masukkan Angka 1: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan Angka 2: ");
        int b = scanner.nextInt();

        System.out.print("Masukkan Angka 3: ");
        int c = scanner.nextInt();

        System.out.println("====================   Hasil  ======================");

        // Memanggil metode-metode
        int hasilPertambahan = matCanggihBanget.pertambahan(a, b);
        int hasilPerkalian = matCanggihBanget.perkalian(a, b);
        int hasilModulus = matCanggihBanget.modulus(a, b);
        int hasilPertambahanTiga = matCanggihBanget.pertambahanTiga(a, b, c);

        System.out.println("====================================================");
        System.out.println("Pertambahan: " + a + " + " + b + " = " + hasilPertambahan);
        System.out.println("Perkalian: " + a + " * " + b + " = " + hasilPerkalian);
        System.out.println("Modulus: " + a + " % " + b + " = " + hasilModulus);
        System.out.println("Pertambahan Tiga: " + a + " + " + b + " + " + c + " = " + hasilPertambahanTiga);
        System.out.println("====================================================");

        scanner.close();
    }
}