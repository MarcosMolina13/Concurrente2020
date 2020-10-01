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
public class Ciudad {
    public static void main(String[] args) {
        Taxi taxi=new Taxi();
        Taxista taxista=new Taxista("Taxista",taxi);
        Pasajero p1=new Pasajero("Pasajero",taxi);
        
        Thread h1=new Thread(taxista,taxista.getNombre());
        Thread h2=new Thread(p1,p1.getNombre());
      
        
        h1.start();
        h2.start();
  
        
        
        
    }
}
