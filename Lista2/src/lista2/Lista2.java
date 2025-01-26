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
public class Lista2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Lista obj=new Lista();
       obj.AgregarFinal("Paris");
       obj.AgregarFinal("Venecia");
       obj.AgregarFinal("Roma");
       obj.AgregarFinal("Marcella");
       obj.mostrarLista();
        
        if (obj.ListaVacia()) {
            System.out.println("LLista Vacia");
        }
        else{
            System.out.println("Weas raras");
        }
            System.out.println(" Elementos "+obj.cantidadNodos());
             //System.out.println("\n elementos en la lista "+obj.buscarDatos("Paris"));
            // System.out.println("\n elemento inicial eliminado "+obj.eliminarInicio());
             //obj.mostrarLista();
             //System.out.println("\n Elemento final eliminado "+obj.eliminarFin());
             //obj.mostrarLista();
             System.out.println("\n "+obj.eliminarNodo("Venecia "));
             obj.mostrarLista();
             System.out.println(" ");
             
    }
    
}
