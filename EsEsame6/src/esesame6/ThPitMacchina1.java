/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame6;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author besan
 */
public class ThPitMacchina1 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThPitMacchina1(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        datiC.chiediPermesso1();
        System.out.println("MACCHINA 1 CAMBIO GOMME");

        System.out.println("MACCHINA 1 BENZINA");

        System.out.println("MACCHINA 1 REGOLAZIONE ALA");
        datiC.daiPermesso2();
    }
}
