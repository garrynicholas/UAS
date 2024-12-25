/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepedap;

/**
 *
 * @author USER
 */
public class SepedaGunung extends Sepeda{ 
    void setGir(int pertambahanGir) { 
	super.setGir(pertambahanGir);
        gir = 2*getGir();	
    }
} 

