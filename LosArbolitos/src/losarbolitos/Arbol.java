
package losarbolitos;

import java.util.Scanner;

public class Arbol {
   Nodo raiz;
   public Arbol(){
       raiz=null;
   }
   public void insertNodo(int d, String n){
       Nodo nuevo=new Nodo(d,n);
       if (raiz==null) {
           raiz=nuevo;
       }
       else{
           Nodo aux=raiz;
           Nodo padre=null;
           while(true){
               padre=aux;
               if (d<aux.dato) {
                   aux=aux.hijoIzquierdo;
                   if (aux==null) {
                       padre.hijoIzquierdo=nuevo;
                       return;
                   }
               }
               else{
               aux=aux.hijoDerecho;    
                   if (aux==null) {
                       padre.hijoDerecho=nuevo;
                       return;
                   }
               }
           }//while
       }
   }
   
   public boolean arbolVacio(){
       return raiz==null;
   }
  
   public void inOrden(Nodo raiz){
       if (raiz!=null) {
           inOrden(raiz.hijoIzquierdo);
           System.out.print(raiz.dato+",");
           inOrden(raiz.hijoDerecho);
       }
   }
   
   public void preOrden(Nodo raiz){
       if (raiz!=null) {
           System.out.print(raiz.dato+",");
           preOrden(raiz.hijoIzquierdo);
           preOrden(raiz.hijoDerecho);
       }
   }
   
   public void posOrden(Nodo raiz){
       if (raiz!=null) {
          posOrden(raiz.hijoIzquierdo);
          posOrden(raiz.hijoDerecho);
          System.out.print(raiz.dato+",");
       }   
   }
   
   public int numNodos(Nodo raiz){
       if (raiz==null) {
           return 0;
       }
       else{
           return 1+numNodos(raiz.hijoIzquierdo)+numNodos(raiz.hijoDerecho);
       }
   }
  static  Scanner read=new Scanner(System.in);
   public Nodo Buscar(int d){
        Nodo aux=raiz;
        while(d!=aux.dato){
        if(d<aux.dato){
           aux=aux.hijoIzquierdo;
        }
        else{
           aux=aux.hijoDerecho;
        }
        if(aux==null){
            return null;
        }
        }
         return aux;
    }
}
