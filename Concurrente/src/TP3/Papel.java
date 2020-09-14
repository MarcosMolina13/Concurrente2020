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
public class Papel {
    public static void main(String[] args) {
        Turno t=new Turno();
        Letra a=new Letra('A',t,1,1);
        Letra b=new Letra('B',t,2,2);
        Letra c=new Letra('C',t,3,3);
        Thread h1=new Thread(a);
        Thread h2=new Thread(b);
        Thread h3=new Thread(c);
        h1.start();
        h2.start();
        h3.start();
    }
}
