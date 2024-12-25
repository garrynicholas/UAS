/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulator;

/**
 *
 * @author USER
 */
public class Matematika {
    int hasil;

    void setTambah(int a, int b) {
        hasil = a + b;
    }

    void setKurang(int a, int b) {
        hasil = a - b;
    }

    void setKali(int a, int b) {
        hasil = a * b;
    }

    void setBagi(int a, int b) {
        hasil = a / b;
    }

    int getHasil() {
        return hasil;
    }
}

