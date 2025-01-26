/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package losarbolitos;

/**
 *
 * @author Usuario
 */
public class Nodo {
    int dato;
    String nombre;
    Nodo hijoIzquierdo;
    Nodo hijoDerecho;
    public Nodo(int d, String n){
        dato=d;
        nombre=n;
        hijoIzquierdo=null;
        hijoDerecho=null;
    }
}
