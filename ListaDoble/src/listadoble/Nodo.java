/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;

/**
 *
 * @author Usuario
 */
public class Nodo {
   
    public String dato;
    Nodo anterior;
    Nodo siguiente;
   
    public Nodo(String d, Nodo sig, Nodo ant){
        dato=d;
        siguiente=sig;
        anterior=ant;
    }
    public Nodo(String d){
        dato=d;
        siguiente=null;
        anterior=null;
    }
}
