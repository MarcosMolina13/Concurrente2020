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
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Confiteria {
    private Semaphore semLugar;
    private Semaphore semComida;// lo usaria el cocinero para avisar al mozo que esta la comida 
    private Semaphore semMozo;
    private Semaphore semBebida;
    private Semaphore semOrdenLista;
    private String nombre;
    public Confiteria(String n){
        nombre=n;
        semLugar=new Semaphore(2,true);
        semComida=new Semaphore (0,true);
        semBebida=new Semaphore (0,true);
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
            System.out.println(Thread.currentThread().getName()+" esta descansando");
            semMozo.acquire();//el mozo esta esperando a los empleados
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }    
     public void pedirBebida(){
        try {
            semBebida.acquire();// el empleado le pide una bebida
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void entregarBebida(){
         semBebida.release();
     }
     public void pedirComida(){
        try {
            semComida.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void entregarComida(){
         semComida.release();
         System.out.println(Thread.currentThread().getName()+" entrego comida");
     }
     public void tomarOrden(){
        try {
            semOrdenLista.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Confiteria.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
     public void despertarCocinero(){
         System.out.println(Thread.currentThread().getName()+" desperto al cocinero");
         semOrdenLista.release();
     }
   public void despertarMozo(){
       System.out.println(Thread.currentThread().getName()+" desperto al mozo");
       semMozo.release();//el empleado llama al mozo para que lo atienda 
       
   }
    
}
