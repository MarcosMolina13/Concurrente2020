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
public class Curandero implements Runnable {
    Vida vida;
    public Curandero(Vida v){
        vida=v;
    }
    public void run(){
        System.out.println("El "+Thread.currentThread().getName()+" cura al personajes con vida="+vida.conocerVida());
        vida.darVida(3);
        System.out.println("El "+Thread.currentThread().getName()+" curo al personaje: vida= "+vida.conocerVida());
}   
}
