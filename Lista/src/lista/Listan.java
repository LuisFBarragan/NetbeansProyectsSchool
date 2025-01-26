/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

/**
 *
 * @author Usuario
 */
public class Listan{
    Nodo inicio, fin;
    int cont=0;
    public Listan(){
        inicio=null; 
        fin=null;
    }
    public boolean listaVacia(){
        if (inicio==null) { // return inicio==null;
            return true;
        }
        else{
            return false;
        }
    }
    public void AgregarInicio(int d){
        cont++; //se cuenta cuantos nodos hay
        if (listaVacia()) {//si aun no hay lista entra
            inicio=new Nodo(d,inicio); 
        fin=inicio;
        }
        else{
            inicio=new Nodo(d,inicio);//ya hay lista
        }
        System.out.println("Elementos lista enlazada "+cont);
    }
    public int cantidadNodod(){
        return cont;
    }
    public void mostrarLista(){
        Nodo aux=inicio;
        while(aux!=null){//haasta que auxiliar sea diferente de null
            System.out.println("["+aux.dato+"]->");
            aux=aux.sig; //esto es para que brinque al siguiente bloque
        }
    }
}
