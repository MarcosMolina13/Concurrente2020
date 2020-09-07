/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_7_9;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Marcos
 */
public class Prueba {
    public static void main(String[] args) {

Dato cuenta = new Dato();
PingPong t1 = new PingPong ("PING", (int) (Math.random() * 2300), cuenta);
PingPong t2 = new PingPong ("PONG", (int) (Math.random() * 2000), cuenta);

t1.start();
t2.start();

    try {
        t1.join();
        t2.join();
    } catch (InterruptedException ex) {
        Logger.getLogger(PingPong.class.getName()).log(Level.SEVERE, null, ex);
    }


System.out.println (Thread.currentThread() + " chau-chau.adios");
System.out.println (" dato " + cuenta.obtenerValor());


}   
}
