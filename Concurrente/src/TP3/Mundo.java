/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3;

/**
 *
 * @author Marcos
 */
public class Mundo {
    public static void main(String[] args) {
        Vida personaje= new Vida();
        Orco o=new Orco(personaje);
        Curandero c= new Curandero(personaje);
        Thread hilo1=new Thread(o,"Orco");
        Thread hilo2=new Thread(c,"Curandero");
        System.out.println("Inicia el juego: ");
        hilo1.start();
        hilo2.start();
        try{
        hilo1.join();
        hilo2.join();
        }catch(InterruptedException e){
            
        }
        System.out.println("fin");
    }
 
}
