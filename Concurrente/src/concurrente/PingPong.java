/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrente;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class PingPong extends Thread{
    private String cadena;//lo que va a escribir
    private int delay;//tiempo de escritura
    
    public PingPong (String cartel,int cantMs){
        cadena=cartel;
        delay=cantMs;
    }
    public void run(){
        for(int i=1;i<delay*10;i++){
            
                System.out.println(cadena+" ");
                try {Thread.sleep(delay);
            } catch (InterruptedException ex) {
                  
            }
        }
    }
    
}
