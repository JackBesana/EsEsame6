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
public class EsEsame6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            DatiCondivisi datiC = new DatiCondivisi();

            ThMacchina1 th1 = new ThMacchina1(datiC);
            ThMacchina2 th2 = new ThMacchina2(datiC);
            ThPitMacchina1 th3 = new ThPitMacchina1(datiC);
            ThPitMacchina2 th4 = new ThPitMacchina2(datiC);

            th1.start();
            th2.start();
            th3.start();
            th4.start();

            th1.join();
            th2.join();
            th3.join();
            th4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(EsEsame6.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
