/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sepedagunung;

/**
 *
 * @author USER
 */
public class SepedaGunung extends Sepeda{ 
	
	private int sadel;

	void setSadel (int jumlah) { 
		sadel = getGir() - jumlah;
	} 
	
	int getSadel(){
		return sadel;
	}
} 
