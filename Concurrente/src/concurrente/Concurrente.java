/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concurrente;

/**
 *
 * @author Marcos
 */
public class Concurrente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       PingPong t1=new PingPong("Ping",33);
       PingPong t2=new PingPong("Pong",10);
       
       //Activacion
       t1.start();
       t2.start();
       
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            
        }
       
    } 
    
    
}
