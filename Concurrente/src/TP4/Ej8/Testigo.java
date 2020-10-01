/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej8;

/**
 *
 * @author Marcos
 */
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Testigo {
    private Semaphore testigo;
    public Testigo(){
        testigo=new Semaphore(1);
    }
    public void tomarTestigo(){
        try {
            testigo.acquire();
        } catch (InterruptedException ex) {
            Logger.getLogger(Testigo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void soltarTestigo(){
            testigo.release();
         }    
}
