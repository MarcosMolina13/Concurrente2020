/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion_7_9;

/**
 *
 * @author Marcos
 */


public class RunnableCdor implements Runnable {

Dato unContador;  

public RunnableCdor (Dato elCdor){

unContador = elCdor;

}


@Override
public void run() {

for (int x=0; x<10000; ++x){

unContador.contar();

}
    System.out.println("en Hilo"+Thread.currentThread().getName()+": "+unContador.obtenerValor());
}
}

