/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esesame6;

/**
 *
 * @author besan
 */
public class ThPitMacchina2 extends Thread {

    DatiCondivisi datiC = new DatiCondivisi();

    public ThPitMacchina2(DatiCondivisi ptrDati) {
        datiC = ptrDati;
    }

    @Override
    public void run() {
        datiC.chiediPermesso4();
        System.out.println("MACCHINA 2 CAMBIO GOMME");

        System.out.println("MACCHINA 2 BENZINA");

        System.out.println("MACCHINA 2 REGOLAZIONE ALA");
        datiC.daiPermesso5();
    }
}
