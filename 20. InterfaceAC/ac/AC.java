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
public class AC implements InterfaceAC {
    int statusAC;
    boolean modeDingin;

    @Override
    public void hidupkanAC() {
        if (statusAC == KEADAAN_MATI) {
            statusAC = KEADAAN_HIDUP;
            System.out.println("Hidupkan AC! --> AC Hidup");
        } else {
            System.out.println("Hidupkan AC! --> AC Sudah Hidup Kok");
        }
    }

    @Override
    public void matikanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            statusAC = KEADAAN_MATI;
            System.out.println("Matikan AC! --> AC Mati");
        } else {
            System.out.println("Matikan AC! --> AC Sudah Mati Kok");
        }
    }

    @Override
    public void dinginkanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            if (!modeDingin) {
                modeDingin = true;
                System.out.println("Dinginkan AC! --> AC Sekarang Mode Dingin");
            } else {
                System.out.println("Dinginkan AC! --> AC Sudah Dalam Mode Dingin");
            }
        } else {
            System.out.println("Dinginkan AC! --> Hidupkan AC Dulu, Baru Bisa Dinginkan");
        }
    }

    @Override
    public void panaskanAC() {
        if (statusAC == KEADAAN_HIDUP) {
            if (modeDingin) {
                modeDingin = false;
                System.out.println("Panaskan AC! --> AC Sekarang Mode Panas");
            } else {
                System.out.println("Panaskan AC! --> AC Sudah Dalam Mode Panas");
            }
        } else {
            System.out.println("Panaskan AC! --> Hidupkan AC Dulu, Baru Bisa Panaskan");
        }
    }
}