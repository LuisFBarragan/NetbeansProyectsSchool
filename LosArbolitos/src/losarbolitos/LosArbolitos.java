package losarbolitos;

import java.util.Scanner;

public class LosArbolitos {
    public static void main(String[] args) {
       Arbol obj=new Arbol();
       Scanner read=new Scanner(System.in);
       try{
           obj.insertNodo(4, "Cuatro");
           obj.insertNodo(7, "Siete");
           obj.insertNodo(8, "Ocho");
           obj.insertNodo(23, "Veintitres");
           obj.insertNodo(5, "Cinco");
           obj.insertNodo(1, "Uno");
       
           if (!obj.arbolVacio()) {
               System.out.println("inOrden");
               obj.inOrden(obj.raiz);
               
               System.out.println(" ");
               System.out.println("\npreOrden");
               obj.preOrden(obj.raiz);
                System.out.println(" ");
                
               System.out.println(" ");
               System.out.println("posOrden");
               obj.posOrden(obj.raiz);
               System.out.println(" ");
               
               System.out.println(" ");
               System.out.println("Mostrar todo");
               obj.numNodos(obj.raiz);
               System.out.println(" ");
               
               
               Nodo var1=obj.Buscar(23);
               if (var1==null) {
                   System.out.println("Dato no encontrado");
               }
               else{
                   System.out.println("Dato encontrado");
               }
           }
           
       }//try
       catch(NumberFormatException n){
             System.out.println("Error "+n.getMessage());           
          }
       
       }//main
    }//class
    

