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
public class Carrera {
    public static void main(String[] args) {
    Testigo testigo=new Testigo();
    Atleta a1=new Atleta("1",testigo);
    Atleta a2=new Atleta("2",testigo);
    Atleta a3=new Atleta("3",testigo);
    Atleta a4=new Atleta("4",testigo);
    Thread h1=new Thread (a1);
    Thread h2=new Thread (a2);
    Thread h3=new Thread (a3);
    Thread h4=new Thread (a4);
    h1.start();
    h2.start();
    h3.start();
    h4.start();
        try {
            h1.join();
            h2.join();
            h3.join();
            h4.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Carrera.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        System.out.println("finalizo la carrera");
      }
    
}
