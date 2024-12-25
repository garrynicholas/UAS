/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mobilkonstruktor;

/**
 *
 * @author USER
 */
public class Mobil {
	String warna;
	int tahunProduksi;
	public Mobil(String warna, int tahunProduksi){
		this.warna = warna;
		this.tahunProduksi = tahunProduksi;
	}
	public void info(){
		 System.out.println("Warna: " + warna);
	  	System.out.println("Tahun: " + tahunProduksi);
	}
}

