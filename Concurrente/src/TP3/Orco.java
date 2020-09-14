/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP3;

/**
 *
 * @author Marcos
 */
public class Orco implements Runnable {
    Vida vida;
    public Orco(Vida v){
        vida=v;
    }
    public void run(){
    if(vida.conocerVida()>0){
        System.out.println("El "+Thread.currentThread().getName()+" va a dañar al personaje con vida= "+vida.conocerVida());
        vida.quitarVida(3);
        System.out.println("El "+Thread.currentThread().getName()+" Daño al personaje: vida= "+vida.conocerVida());
    }
}
}
