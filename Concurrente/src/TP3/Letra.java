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
public class Letra implements Runnable{
    private char letra;
    private Turno turno;
    private int id;
    private int cant;
    
    public Letra(char l,Turno t,int i,int c){
        letra=l;
        turno=t;
        id=i;
        cant=c;
    }
    
    public void run(){
        int aux=10;
        while(aux>0){
        if(id==turno.getTurno()){
            for (int i = 0; i < cant; i++) {
            System.out.print(letra);    
            }
            if(letra=='A'){
             turno.setTurno(2);
            }else{
                if(letra=='B'){
                 turno.setTurno(3);
                }else{
                    if(letra=='C'){
                        turno.setTurno(1);
                    }
                }
              }
            
        }else{
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                
              }
          }
        aux--;
        }
        
        
        
    }
}
