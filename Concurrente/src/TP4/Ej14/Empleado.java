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
                System.out.println("El empleado esta comiendo");
            Thread.sleep(tiempoPreparacion*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Mozo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void pedirOrden(){
        int orden=(int)(Math.random()*2);
        switch(orden){
            case 0:System.out.println(nombre+" Solo pedira una bebida");confiteria.despertarMozo(); confiteria.pedirBebida();break;
            case 1:System.out.println(nombre+" Solo pedira comida");confiteria.despertarCocinero();confiteria.pedirComida();break;
            case 2:System.out.println(nombre+" Solo pedira una bebida y comida");confiteria.despertarMozo();confiteria.pedirBebida();confiteria.despertarCocinero();confiteria.pedirComida();break;
        }
        
        
    }
    public void run(){
        confiteria.ocuparSilla();
        this.pedirOrden();
        this.comer();
        confiteria.desocuparSilla();
        
        
    }
    
    
}
