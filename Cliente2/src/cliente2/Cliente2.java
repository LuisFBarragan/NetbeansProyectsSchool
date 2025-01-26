
package cliente2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Cliente2 {
class Cliente{
    
}
    
    public static void main(String[] args) {
        BufferedReader leerBuffer=new BufferedReader(new InputStreamReader(System.in));
     Scanner leer=new Scanner (System.in);
     Cliente2 objetoCte=new Cliente2(111," ","312-317-747-3");
     int opcion=0;
     int cuenta_cte, buscar;  String nombre; String celular;
        do{
        System.out.println("1.-Registrar ");
        System.out.println("2.-Mostrar ");
        System.out.println("3.- buscar");
        System.out.println("4.-Salir");
        System.out.println("selecciona una opcion ");
        opcion=leer.nextInt();
        switch(opcion){
            case 1:
                System.out.println("Num. de cuenta");
                cuenta_cte=leer.nextInt();
                System.out.println("Nombre del Cliente");
                nombre=leerBuffer.readLine();
                System.out.println("Celular");
                celular=leerBuffer.readLine();
                
                objetoCte.setCuenta(cuenta_cte);
                objetoCte.setNombre(nombre);
                objetoCte.setCelular(celular);
                
                objetoCte.registrarClientes();
                break;
                
            case 2:
                objetoCte.mostrarCliente();
                break;
                
            case 3:
                System.out.println("da numero de cuenta");
                buscar=leer.nextInt();
                objetoCte.buscarCliente(buscar);
                break;
        }
        
        }while(opcion!=3);
    }
    
}
