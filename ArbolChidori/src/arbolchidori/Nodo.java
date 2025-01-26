/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolchidori;

/**
 *
 * @author Usuario
 */
public class Nodo {
    int dato;
    Nodo Hizq;
    Nodo Hder;
    public Nodo(int d){
        dato=d;
        Hizq=null;
        Hder=null;
    }

    public int getDato() {
        return dato;
    }
    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getHizq() {
        return Hizq;
    }
    public void setHizq(Nodo Hizq) {
        this.Hizq = Hizq;
    }

    public Nodo getHder() {
        return Hder;
    }
    public void setHder(Nodo Hder) {
        this.Hder = Hder;
    }
    
}
