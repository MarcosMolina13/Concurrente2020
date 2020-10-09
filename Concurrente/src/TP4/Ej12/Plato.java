/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TP4.Ej12;

/**
 *
 * @author Marcos
 */
import java.util.concurrent.Semaphore;
public class Plato {
private Semaphore semPlato;

public Plato(){
    semPlato= new Semaphore(1,true);
}

public void usarPlato(){
    try{
    semPlato.acquire();
    }catch(InterruptedException e){

    }
    }
public void dejarPlato(){
   
        semPlato.release();
    }
}
