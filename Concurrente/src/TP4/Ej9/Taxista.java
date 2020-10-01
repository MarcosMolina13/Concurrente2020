/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Taxista implements Runnable{
    private String nombre;
    private Taxi taxi;
    
    public Taxista(String n,Taxi t){
        nombre=n;
        taxi=t;
    }
    public String getNombre(){
        return nombre;
    }
    public void conduciendo(){
        int cant=(int)(Math.random()*20);
        try {
           System.out.println("El "+Thread.currentThread().getName()+" esta conduciendo");
            Thread.sleep(cant*1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxista.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void run(){
       while(true){
        taxi.dormirTaxista();
       this.conduciendo();
       taxi.avisarFinRecorrido();
       }
    }
}
