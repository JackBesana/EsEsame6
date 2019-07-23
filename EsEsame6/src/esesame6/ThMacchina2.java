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
public class ThMacchina2 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThMacchina2(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        datiC.chiediPermesso3();
        System.out.println("MACCHINA 2 INGRESSO PIT");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThMacchina2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("MACCHINA 2 INIZIO SOSTA");
        datiC.daiPermesso4();
        datiC.chiediPermesso5();
        System.out.println("MACCHINA 2 FINE SOSTA");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(ThMacchina2.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("MACCHINA 2 USCITA PIT");
    }
}
