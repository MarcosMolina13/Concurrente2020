/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej13;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Empleado implements Runnable{
    private String nombre;
    private Confiteria confiteria;
    
    public Empleado (String n,Confiteria c){
        nombre=n;
        confiteria=c;
    }
     public void comer(){
        
            int tiempoPreparacion=(int)(Math.random()*4)+6;// entre 6 y 9 segundos
        
            try {
                System.out.println("El" +nombre+" esta comiendo");
            Thread.sleep(tiempoPreparacion*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        
        
    
    public void run(){
        confiteria.ocuparSilla();
        confiteria.pedirOrden();
        confiteria.esperar();
        this.comer();
        confiteria.desocuparSilla();
        
        
    }
    
    
}
