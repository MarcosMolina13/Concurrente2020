/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej9;

/**
 *
 * @author Marcos
 */
public class Pasajero implements Runnable {
    private String nombre;
    private Taxi taxi;
    public Pasajero(String n,Taxi t){
        nombre=n;
        taxi=t;
    }
     public String getNombre(){
        return nombre;
    }
    public void run(){
        taxi.ocuparTaxi();
        taxi.despertarTaxista();
        taxi.esperar();
        taxi.desocuparTaxi();
        
    }
    
}
