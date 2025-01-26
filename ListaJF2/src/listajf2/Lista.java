/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listajf2;

/**
 *
 * @author Usuario
 */
public class Lista {
     Nodo inicio, fin;
    int cont=0;
    public Lista(){
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
   
    public int AgregarInicio(int d){
        cont++; //se cuenta cuantos nodos hay
        if (listaVacia()) {//si aun no hay lista entra
            inicio=new Nodo(d,inicio); 
        fin=inicio;
        }
        else{
            inicio=new Nodo(d,inicio);//ya hay lista
        }
       return cont;
    }
    
    public void AgregarFinal(int d){
        cont++;
        if (listaVacia()) {
            inicio=new Nodo(d);
            fin=inicio;
        }
        else{
        fin.siguiente=new Nodo(d);
        fin=fin.siguiente;
                    }
    }//void Agregar
    
    public void mostrarLista(){
        Nodo aux=inicio;
        while(aux!=null){
            System.out.print("["+aux.dato+"]-->");
            aux=aux.siguiente;
        }
    }
    
    public boolean buscarDatos(int d){
    boolean encontrado=false;
    Nodo aux=inicio;
    while(encontrado!=true&&aux!=null){
        if (d==aux.dato) {
            encontrado=true;
        }
        else{
            aux=aux.siguiente;
        }        
    }
    return encontrado;
}    
    
    public void eliminarInicio(){
    int eliminado=inicio.dato;
    if (cont==1) {
        inicio=null;
        fin=null;
    }
    else{
        inicio=inicio.siguiente;
    }
    cont--;
}

    public void eliminarFin(){
   int eliminado2=fin.dato;
    Nodo aux=inicio;
    while(aux.siguiente!=fin){
        aux=aux.siguiente;
    }
fin=aux;
fin.siguiente=null;
cont--;
}
    
    public  int eliminarNodo(int d){
    if (!listaVacia()) {
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
       
}
