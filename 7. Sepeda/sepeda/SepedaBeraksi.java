/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sepeda;

/**
 *
 * @author USER
 */
public class SepedaBeraksi {
    public static void main(String[] args) {
        Sepeda sepedaku = new Sepeda();
        
        sepedaku.setGir(1); // menset nilai gir = 1 (sebelumnya 0)
        System.out.println("Gir saat ini: "+ sepedaku.getGir());
        
        sepedaku.setGir(3); // Menambahkan 3 pada posisi gir saat ini (1)
        System.out.println("Gir saat ini: "+ sepedaku.getGir());
    }
}
