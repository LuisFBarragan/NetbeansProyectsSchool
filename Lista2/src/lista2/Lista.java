/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2;

/**
 *
 * @author Usuario
 */
public class Lista {
    Nodo inicio,fin; 
    int cont=0;
    public Lista(){
        inicio=null;
        fin=null;
    }
    public boolean ListaVacia(){
        //if (inicio==null) {
          //  return true;
          return inicio==null;
    }
    public void AgregarFinal(String d){
        cont++;
        if (ListaVacia()) {
            inicio=new Nodo(d);
            fin=inicio;
        }
        else{
        fin.siguiente=new Nodo(d);
        fin=fin.siguiente;
                    }
    }//void Agregar
    public int cantidadNodos(){
        return cont;
    }
    public void mostrarLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.print("["+aux.dato+"]-->");
            aux=aux.siguiente;
        }
    }
public boolean buscarDatos(String d){
    boolean encontrado=false;
    Nodo aux=inicio;
    while(encontrado!=true&&aux!=null){
        if (d.equals(aux.dato)) {
            encontrado=true;
        }
        else{
            aux=aux.siguiente;
        }        
    }
    return encontrado;
}    
public String eliminarInicio(){
    String eliminado=inicio.dato;
    if (cont==1) {
        inicio=null;
        fin=null;
    }
    else{
        inicio=inicio.siguiente;
    }
    cont--;
    return eliminado;
}
public String eliminarFin(){
    String eliminado=fin.dato;
    Nodo aux=inicio;
    while(aux.siguiente!=fin){
        aux=aux.siguiente;
    }
fin=aux;
fin.siguiente=null;
cont--;
return eliminado;
}
public  String eliminarNodo(String d){
    if (!ListaVacia()) {
        if (inicio==fin&&d==inicio.dato) {
            inicio=fin=null;
        }
        else if (d==inicio.dato) {
            inicio=inicio.siguiente;
        }else{
            Nodo anterior=inicio;
            Nodo temporal=inicio.siguiente;
            while(temporal!=null&&temporal.dato!=d){
                anterior=anterior.siguiente;
                temporal=temporal.siguiente;
            }
            if (temporal!=null) {
                anterior.siguiente=temporal.siguiente;
                if (temporal==fin) {
                    fin=anterior;
                }
            }
        }
    }
    return d;
}
    }//class
    
