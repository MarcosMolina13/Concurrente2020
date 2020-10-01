/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej8;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Atleta implements Runnable {

    private String nombre;
    private Testigo testigo;
    public Atleta(String n,Testigo t){
        nombre=n;
        testigo=t;
    }
    
    private void correr(){
        int tiempo=(int)(Math.random()*3)+9;
        try {
            Thread.sleep(tiempo*1000);
            System.out.println("El atleta "+nombre+"tardo "+tiempo+"segundos");
        } catch (InterruptedException ex) {
            Logger.getLogger(Atleta.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run(){
        testigo.tomarTestigo();
        System.out.println("el atleta "+ nombre+" toma el testigo y comienza a correr");
        this.correr();
        testigo.soltarTestigo();
    }

    
}
