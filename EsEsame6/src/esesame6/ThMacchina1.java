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
public class ThMacchina1 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThMacchina1(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        System.out.println("MACCHINA 1 INGRESSO PIT");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThMacchina1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("MACCHINA 1 INIZIO SOSTA");
        datiC.daiPermesso1();
        datiC.chiediPermesso2();
        System.out.println("MACCHINA 1 FINE SOSTA");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThMacchina1.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("MACCHINA 1 USCITA PIT");
        datiC.daiPermesso3();
    }
}
