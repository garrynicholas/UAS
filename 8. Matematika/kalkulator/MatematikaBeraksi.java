/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;

/**
 *
 * @author USER
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        Matematika kalkulatorsimple = new Matematika();

        kalkulatorsimple.setTambah(20, 20);
        System.out.println("Pertambahan: 20 + 20 = " + kalkulatorsimple.getHasil());

        kalkulatorsimple.setKurang(10, 5);
        System.out.println("Pengurangan: 10 - 5 = " + kalkulatorsimple.getHasil());

        kalkulatorsimple.setKali(10, 20);
        System.out.println("Perkalian: 10 * 20 = " + kalkulatorsimple.getHasil());

        kalkulatorsimple.setBagi(21, 2);
        System.out.println("Pembagian: 21 / 2 = " + kalkulatorsimple.getHasil());
    }
}
