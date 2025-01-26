
package pruebaa;

import java.util.Scanner;

public class PruebaA {

    public static void main(String[] args) {
      Scanner read=new Scanner(System.in);
        Lista obj=new Lista();
     int op=0;
        do {
            System.out.println("1.- Llenar inicio");
            System.out.println("2.- Llenar fin");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Buscar");
            System.out.println("5.- Eliminar Inicio");
            System.out.println("6.- Eliminar fin");
            System.out.println("7.- Eliminar nodo");
            System.out.println("8.- Lista ordenada");
            System.out.println("9.- Salir");
            op=read.nextInt();
            switch(op){
                
                case 1: 
                    int x; 
                        System.out.println("Da el numero a ingresar");
                        x=read.nextInt();
                        obj.AgregarInicio(x);
                    break;
                case 2:
                      int y; 
                        System.out.println("Da el numero a ingresar");
                        y=read.nextInt();
                        obj.AgregarFinal(y);
                        break;
                case 3:  obj.mostrarLista(); System.out.println("c"); break;
                case 4: 
                    int z;
                    System.out.println("Da el numero a buscar");
                    z=read.nextInt();
                    obj.buscarDatos(z);
                    break;
                case 5: obj.eliminarInicio(); break;
                case 6: obj.eliminarFin(); break;
                case 7: 
                    System.out.println("Da en nodo que quieres eliminar");
                    int w=read.nextInt();
                    obj.eliminarNodo(w);
                    break;
                case 8: 
                    System.out.println("Da el numero agregar");
                    int v=read.nextInt();
                    //obj.
                    break;
            }
        } while (op!=9);
    }
}
