/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.Ej2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Termometro implements Runnable {

    private String nombre;
    private int temperatura;
    private GestorSala sala;

    public Termometro(String n, GestorSala s) {
        nombre = n;
        temperatura = 0;
        sala = s;
    }

    private void controlarTemperatura() {
        temperatura = (int) (Math.random() * 20 + 50);
    }

    public void run() {
        while (true) {
            try {
                this.controlarTemperatura();
                sala.notificarTemperatura(temperatura);
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Termometro.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
