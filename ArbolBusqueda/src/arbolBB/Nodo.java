/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolBB;

/**
 *
 * @author Toloza XD
 */
public class Nodo {
    private int dato;
    private Nodo Hizq,Hder;

    public Nodo(int dato, Nodo izq, Nodo der) {
        this.dato = dato;
        this.Hizq = izq;
        this.Hder = der;
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
