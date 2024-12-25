/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matematika;

import java.util.Scanner;

/**
 *
 * @author USER
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
        MatematikaCanggih matCanggih = new MatematikaCanggih();

        Scanner scanner = new Scanner(System.in);
        
        // Input angka
        System.out.println("====================================================");
        System.out.print("Masukkan Angka 1: ");
        int a = scanner.nextInt();

        System.out.print("Masukkan Angka 2: ");
        int b = scanner.nextInt();
        System.out.println("====================   Hasil  ======================");
        
        // Memanggil metode-metode
        int hasilPertambahan = matCanggih.pertambahan(a, b);
        int hasilPerkalian = matCanggih.perkalian(a, b);
        int hasilModulus = matCanggih.modulus(a, b);
        
        System.out.println("====================================================");
        System.out.println("Pertambahan: " +a+ " + " +b+ " = " + hasilPertambahan);
        System.out.println("Perkalian: " +a+ " * " +b+ " = " + hasilPerkalian);
        System.out.println("Modulus: " +a+ " % " +b+ " = " + hasilModulus);
        System.out.println("====================================================");
        
        scanner.close();
    }
}
