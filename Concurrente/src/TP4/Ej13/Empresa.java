/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TP4.Ej13;

/**
 *
 * @author Marcos
 */
public class Empresa {
    public static void main(String[] args) {
        Confiteria confiteria=new Confiteria("Los pollos hermanos");
        Mozo m1=new Mozo("Mozo1",confiteria);
        Cocinero c1=new Cocinero("Cocinero1",confiteria);
        Cocinero c2=new Cocinero("Cocinero2",confiteria);
        Empleado e1=new Empleado("Empleado1",confiteria);
        Empleado e2=new Empleado("Empleado2",confiteria);
        Empleado e3=new Empleado("Empleado3",confiteria);
        Empleado e4=new Empleado("Empleado4",confiteria);
        Empleado e5=new Empleado("Empleado5",confiteria);
        Empleado e6=new Empleado("Empleado6",confiteria);
        
        Thread h0=new Thread(m1,"Mozo");
        Thread h1= new Thread(c1,"Cocinero1");
        Thread h2= new Thread(c2,"Cocinero2");
        Thread h3= new Thread(e1,"Empleado1");
        Thread h4= new Thread(e2,"Empleado2");
        Thread h5= new Thread(e3,"Empleado3");
        Thread h6= new Thread(e4,"Empleado4");
        Thread h7= new Thread(e5,"Empleado5");
        Thread h8= new Thread(e6,"Empleado6");
       
        
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
        h6.start();
        h7.start();
        h8.start();
       
        
        
        
        
        
        
    }
}
