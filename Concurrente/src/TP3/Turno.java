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
public class Turno {
    private int identificador;
    
    public Turno(){
     identificador=1;
    }
    public  int getTurno(){
        return identificador;
    }
    public void setTurno(int i){
       identificador=i;
    
    }
}
