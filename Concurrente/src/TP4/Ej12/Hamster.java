/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package TP4.Ej12;

/**
 *
 * @author Marcos
 */
public class Hamster implements Runnable {
private String nombre;
private Plato plato;
private Rueda rueda;
private Hamaca hamaca;

public Hamster(String n,Plato p,Rueda r,Hamaca h){
    nombre=n;
    plato=p;
    rueda=r;
    hamaca=h;
}

public void comer(){
    try{
    plato.usarPlato();
    System.out.println("El hamster "+nombre+" esta comiendo");
    Thread.sleep(2000);
   }catch(InterruptedException e){

    }
}
public void dejarComer(){
    System.out.println("El hamster "+nombre+" dejo de comer");
    plato.dejarPlato();
   }


public void ejercitarse(){
    try{
    rueda.usarRueda();
    System.out.println("El hamster "+nombre+" empezo a usar la rueda");
    Thread.sleep(2000);
    }catch(InterruptedException e){

    }
}
public void terminarEjercicio(){
   System.out.println("El hamster "+nombre+ " termino de usar la rueda");
    rueda.dejarRueda();
    
}

public void descansar(){
    try{
    hamaca.usarHamaca();
    System.out.println("El hamster "+nombre+" empezo a usar la hamaca");
    Thread.sleep(2000);
    }catch(InterruptedException e){

    }
}
public void despertar(){
   System.out.println("El hamster "+nombre+ " termino de usar la hamaca");
    hamaca.dejarHamaca();
    
}

public void run(){
    while(true){
    this.comer();
    this.dejarComer();
    this.ejercitarse();
    this.terminarEjercicio();
    this.descansar();
    this.despertar();
    
    }
    }
}
