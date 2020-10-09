/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej13;

/**
 *
 * @author Marcos
 */
import TP4.Ej14.*;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Confiteria {
    private Semaphore semLugar;
    private Semaphore semMozo;
    private Semaphore semOrdenLista;
    private String nombre;
    public Confiteria(String n){
        nombre=n;
        semLugar=new Semaphore(1,true);
        semMozo=new Semaphore(0,true);
        semOrdenLista=new Semaphore (0,true);
    }
    public void ocuparSilla() {
        try {
            semLugar.acquire();//el empleado ocupa la silla de la cafeteria
        System.out.println(Thread.currentThread().getName()+" ocupa la silla");
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public void desocuparSilla() {
        
            semLugar.release();//el empleado desocupa la silla de la cafeteria
        System.out.println(Thread.currentThread().getName()+" da las gracias y desocupa la silla");
        
    }
     public void hobbieMozo(){
        try {
            System.out.println(Thread.currentThread().getName()+" esta inventando recetas");
            semMozo.acquire();//el mozo esta esperando a los empleados
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }    
    
     public void esperar(){
        try {
            System.out.println(Thread.currentThread().getName() +"esta esperando su comida");
            semOrdenLista.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void ordenLista(){
         System.out.println(Thread.currentThread().getName()+" entrega orden a cliente");
         semOrdenLista.release();
     }
   public void pedirOrden(){
       System.out.println(Thread.currentThread().getName()+" pidio orden al mozo");
       semMozo.release();//el empleado llama al mozo para que lo atienda 
       
   }
    
}
