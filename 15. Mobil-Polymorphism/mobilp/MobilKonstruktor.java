/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobilp;

/**
 *
 * @author USER
 */
public class MobilKonstruktor{
   public static void main(String[] args){
	Mobil mobilku = new Mobil("Merah", 2003);
	mobilku.info();

	Mobil mobilmu = new Mobil();
	mobilmu.info();
	}
}
