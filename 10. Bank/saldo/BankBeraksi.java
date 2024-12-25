/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package saldo;

/**
 *
 * @author USER
 */
public class BankBeraksi {
    public static void main(String[] args) {
        Bank myAcc = new Bank(100000);
    
    System.out.println("Selamat datang di Bank BRI");
    System.out.println("Saldo saat ini: "+myAcc.getSaldo());
    myAcc.simpanUang();
    System.out.println("Simpan Uang: Rp.500000");
    System.out.println("Saldo saat ini: "+myAcc.getSaldo());
    myAcc.ambilUang();
    System.out.println("Ambil Uang: Rp.150000");
    System.out.println("Saldo saat ini: "+myAcc.getSaldo());
    }    
}
