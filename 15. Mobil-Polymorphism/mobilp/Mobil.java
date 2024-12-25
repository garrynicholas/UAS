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
class Mobil {
	String warna;
	int tahunProduksi;

	public Mobil(String warna, int tahunProduksi){
	    this.warna = warna;
	    this.tahunProduksi = tahunProduksi;
	}
	
	public Mobil(){
	}
	
	void info(){
	     System.out.println("Warna: " + warna);
	     System.out.println("Tahun: " + tahunProduksi);
	}
}
