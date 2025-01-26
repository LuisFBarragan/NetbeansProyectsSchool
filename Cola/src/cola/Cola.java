
package cola;

import java.util.Scanner;


public class Cola {

static int puntero=0;
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        System.out.println("DE cuanto");
        int x=read.nextInt();  int op=0;
int[] PilaR=new int[x];       
int[] Pila=new int[x];
            do {
                System.out.println("1.- Agregar elemento");
                System.out.println("2.- Eliminar Elemento");
                System.out.println("3.- Mostrar");
                System.out.println("4.- Limpiar");
                System.out.println("5.- Mostrar");
                System.out.println("6.- Salir");
                System.out.println("Elije una opcion");
              op=read.nextInt();
                switch(op){
                    case 1:
                        if (puntero<x) {
                        System.out.println("Da elemento del casillero "+puntero);
                        Pila[puntero]=read.nextInt();
                        puntero=puntero+1;
        }
                         else{
                             System.out.println("Ya no hay espacio");
                         }
                        break;
                    case 2://eliminar //
                      
                        if(puntero!=0){
                            for (int i = 0; i < puntero; i++) {
                                Pila[i]=Pila[i+1];
                            }
                            puntero--;
                        }
                        break;
                    case 3://mostrar
                    for (int j = 0; j < x; j++) {
                        System.out.println(" "+Pila[j]); 
                    }  
                        break;
                case 4:
                    for (int j = 0; j < x; j++) {
                       Pila[j]=0;
                    }  
                break;
                }               
            } while (op!=5);
    }
    
}
