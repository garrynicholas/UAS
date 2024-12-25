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
public class Bank {
    int saldo;
    
    public Bank(int saldo) {
        this.saldo = saldo;
    }
            
    void simpanUang() {
        saldo = saldo + 500000;
    }
    
    void ambilUang() {
        saldo = saldo - 150000;
    }
    
    int getSaldo() {
        return saldo;
    }
}
