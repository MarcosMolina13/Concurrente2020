/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej14;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Mozo implements Runnable {

    private String nombre;
    private Confiteria confiteria;

    public Mozo(String n, Confiteria c) {
        nombre = n;
        confiteria = c;
    }

    public void prepararbebida() {

        int tiempoPreparacion = (int) (Math.random() * 3) + 5;// entre 5 y 7 segundos

        try {
            System.out.println("El mozo esta preparando la bebida");
            Thread.sleep(tiempoPreparacion * 1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void run() {
        while (true) {
            confiteria.hobbieMozo();
            this.prepararbebida();
            confiteria.entregarBebida();
        }

    }

}
