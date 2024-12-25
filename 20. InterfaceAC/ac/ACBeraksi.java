/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ac;

/**
 *
 * @author USER
 */
public class ACBeraksi {
    public static void main(String[] args) {
        AC acKamar = new AC();

        System.out.println("Status AC Saat Ini: Mati");

        acKamar.hidupkanAC(); 
        acKamar.dinginkanAC(); 
        acKamar.panaskanAC(); 
        acKamar.dinginkanAC(); 
        acKamar.matikanAC(); 
        acKamar.dinginkanAC(); 
    }
}
