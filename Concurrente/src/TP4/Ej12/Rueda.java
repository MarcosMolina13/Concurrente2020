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
public class Rueda {
private Semaphore semRueda;

public Rueda (){
    semRueda= new Semaphore(1,true);
}

public void usarRueda(){
    try{
    semRueda.acquire();
    }catch(InterruptedException e){

    }
    }
public void dejarRueda(){
    
        semRueda.release();
    
    }
}

