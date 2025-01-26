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
public class Arbol {
    Nodo raiz;
    public Arbol(){
    raiz=null;
}

    public Nodo getRaiz() {
        return raiz;
    }
    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    
     public boolean arbolVacio(){
       return raiz==null;
   }
    
 public void insertar(Nodo nuevo, Nodo aux) {
        if (this.raiz == null) {
            raiz = nuevo;
        } else {
            if (nuevo.getDato() <= aux.getDato()) {
                if (aux.getHizq() == null) {
                    aux.setHizq(nuevo);
                } else {
                    insertar(nuevo, aux.getHizq());
                }
            } else {
                if (aux.getHder() == null) {
                    aux.setHder(nuevo);
                } else {
                    insertar(nuevo, aux.getHder());
                }
            }
        }
    }//void
    
    public void inOrden(Nodo raiz){
        if (raiz!=null) {
            inOrden(raiz.Hizq);
            System.out.println(raiz.dato+",");
            inOrden(raiz.Hder);
        }
    }
}
