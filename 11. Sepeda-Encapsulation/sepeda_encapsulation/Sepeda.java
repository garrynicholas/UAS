/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepeda_encapsulation;

/**
 *
 * @author USER
 */
public class Sepeda{
	private int gir; // access modifier private pada instance variable
	
	void setGir(int pertambahanGir) {
	   	gir= gir+ pertambahanGir;
	}

	int getGir() {
	    	return gir;
	}
}
