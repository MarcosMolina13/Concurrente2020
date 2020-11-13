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
public class GestorSala {

    private int temperatura;
    private static int tUmbral = 30;
    private int cantPersonas;
    private int maxCapacidad;
    private int jubiladosEsperando;

    public GestorSala() {
        temperatura = 25;
        cantPersonas = 0;
        maxCapacidad = 50;
        jubiladosEsperando = 0;
    }

    public synchronized void entrarSala() {
        while (cantPersonas == maxCapacidad || jubiladosEsperando > 0) {
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cantPersonas++;

    }

    public synchronized void entrarSalaJubilado() {
        while (cantPersonas == maxCapacidad) {

            try {
                jubiladosEsperando++;
                this.wait();
                jubiladosEsperando--;
            } catch (InterruptedException ex) {
                Logger.getLogger(GestorSala.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        cantPersonas++;
    }

    public synchronized void salirSala() {
        cantPersonas--;
        this.notifyAll();
    }

    public synchronized void notificarTemperatura(int temp) {
        temperatura = temp;
        System.out.println("La temperatura de la sala es de: " + temperatura + "°C"+"\u001B[31m");
        if (temperatura > tUmbral) {
            System.out.println("Se reduce la capacidad por superar la tUmbral a 35 personas"+"\u001B[31m");
            maxCapacidad = 35;
        } else {
            System.out.println("la capacidad de la sala es de 50 persona"+"\u001B[31m");
            maxCapacidad = 50;
        }
    }
}
