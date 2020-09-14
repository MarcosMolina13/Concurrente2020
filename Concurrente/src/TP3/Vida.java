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
public class Vida {
   private int vida;
   
   public Vida(){
       vida=10;
   }
   public synchronized int conocerVida(){
       return vida;
   }
   public synchronized void quitarVida(int i){
       vida=vida-i;
   }
   public synchronized void darVida(int i){
       vida=vida+i;
   } 
   
   
}
