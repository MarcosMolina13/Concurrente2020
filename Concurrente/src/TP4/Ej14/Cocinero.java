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
public class Cocinero implements Runnable {
    private String nombre;
    private Confiteria confiteria;
    
    public Cocinero (String n,Confiteria c){
        confiteria=c;
        nombre=n;
    }
    public void prepararComida(){
        
            int tiempoPreparacion=(int)(Math.random()*3)+7;// entre 7 y 9 segundos
        
            try {
                System.out.println("El cocinero esta preparando la comida");
            Thread.sleep(tiempoPreparacion*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void run(){
        while(true){
        confiteria.tomarOrden();
        this.prepararComida();
        confiteria.entregarComida();
        }
        
    }
    
    
}
