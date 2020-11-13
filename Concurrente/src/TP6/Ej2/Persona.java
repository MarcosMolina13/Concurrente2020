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
public class Persona implements Runnable {

    private String nombre;
    private boolean esJubilado;
    private GestorSala sala;

    public Persona(String n, boolean j, GestorSala s) {
        nombre = n;
        esJubilado = j;
        sala = s;
    }

    public void run() {

        while (true) {
            try {
                if (esJubilado) {
                    System.out.println(nombre + "desea entrar a la sala y es jubilado");
                    sala.entrarSalaJubilado();

                } else {
                    System.out.println(nombre + "desea entrar a la sala");
                    sala.entrarSala();
                }
                System.out.println(nombre + "entro a la sala");
                Thread.sleep((int) (Math.random() + 10) * 1000);

                sala.salirSala();
                System.out.println(nombre + "salio de la sala");
            } catch (InterruptedException ex) {
                Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
