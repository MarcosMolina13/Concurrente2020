/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP6.Ej2;

import java.util.Random;

/**
 *
 * @author Marcos
 */
public class Main {

    public static void main(String[] args) {
        GestorSala sala = new GestorSala();
        Termometro controlador = new Termometro("Controlador", sala);

        Random r = new Random();
        Thread hiloControl = new Thread(controlador);
        hiloControl.start();
        Thread[] personas = new Thread[50];
        for (int i = 0; i < personas.length; i++) {
            personas[i] = new Thread(new Persona("Visitante " + i, r.nextBoolean(), sala));
        }
        for (int i = 0; i < personas.length; i++) {
            personas[i].start();
        }

    }

}
