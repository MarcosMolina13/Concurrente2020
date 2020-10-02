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
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Taxi {
    private Semaphore semTaxi;
    private Semaphore semTaxista;
    private Semaphore semFinRecorrido;
 public Taxi(){
     semTaxi=new Semaphore(1,true);
     semTaxista=new Semaphore(0,true);
     semFinRecorrido=new Semaphore (0,true);
 }   
 public void despertarTaxista(){
     System.out.println(Thread.currentThread().getName()+" avisa al taxista");
     semTaxista.release();
 }
 public void desocuparTaxi(){
     System.out.println(Thread.currentThread().getName()+" desocupo el taxi");
     semTaxi.release();
 }
 public void dormirTaxista(){
        try {
            System.out.println(Thread.currentThread().getName()+" se pone a dormir");
            semTaxista.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 public void ocuparTaxi(){
     System.out.println(Thread.currentThread().getName()+" ocupo el taxi");
     semTaxi.tryAcquire();
 }
 public void avisarFinRecorrido(){
     System.out.println("El taxista avisa que termino el recorrido");
     semFinRecorrido.release();
 }
 public void esperar(){
        try {
            System.out.println(Thread.currentThread().getName()+" espera hasta llegar a destino");
            semFinRecorrido.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Taxi.class.getName()).log(Level.SEVERE, null, ex);
        }
 }
 
}

