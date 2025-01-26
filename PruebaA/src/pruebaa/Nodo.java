/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaa;

/**
 *
 * @author Usuario
 */
public class Nodo {//este es el bueno
    int dato; 
   
    Nodo siguiente;//puntero
 
    Nodo(int d, Nodo sig){//inicio
        dato=d;
        siguiente=sig;
    }
    public Nodo(int d){
        dato=d;
       
    }
}
