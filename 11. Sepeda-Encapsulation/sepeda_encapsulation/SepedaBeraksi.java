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
public class SepedaBeraksi{
    public static void main(String[] args) {
	Sepeda sepedaku = new Sepeda();
	     
	sepedaku.setGir(1);
	/* Variabel bisa diubah atau tidak sengaja diubah.
	     Hal ini berbahaya dan sering menimbulkan bug.
	     Berikan access modifier private pada instance variable */
	sepedaku.gir = 3; 			
	System.out.println("Gir saat ini: " + sepedaku.getGir());
    }
}
