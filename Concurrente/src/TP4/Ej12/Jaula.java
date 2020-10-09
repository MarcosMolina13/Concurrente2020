/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TP4.Ej12;

import TP4.Ej12.Hamster;
import TP4.Ej12.Hamster;

/**
 *
 * @author Marcos
 */
public class Jaula {
public static void main(String [] args){
    Plato p= new Plato();
    Rueda r= new Rueda();
    Hamaca h=new Hamaca();

    Hamster h1=new Hamster("Hamster1",p,r,h);
    Hamster h2=new Hamster("Hamster2",p,r,h);
    Hamster h3=new Hamster("Hamster3",p,r,h);
    Hamster h4=new Hamster("Hamster4",p,r,h);
    Hamster h5=new Hamster("Hamster5",p,r,h);

    Thread t1=new Thread(h1);
    Thread t2=new Thread(h2);
    Thread t3=new Thread(h3);
    Thread t4=new Thread(h4);
    Thread t5=new Thread(h5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    

}
}
