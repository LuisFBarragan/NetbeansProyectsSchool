package empresavector;

import java.util.ArrayList;
import java.util.Scanner;

interface Base{
    void metodoVector();
    Scanner read=new Scanner(System.in);
    String []nombre=new String [10];
    int[]edad=new int[10];
    String []numero=new String [10];
    void mostrar();
}
 
class Cliente implements Base{
    public void metodoVector(){
    int c=1; int x;
        System.out.println("da la cantidad de clientes a ingresar");
        x=read.nextInt();
        String []numero=new String [5];
           for (int i = 0; i < x; i++) {
            System.out.println("da nombre del cliente: "+c);
                                    nombre[i]=read.next();
                                    System.out.println("da la edad");
                                    edad[i]=read.nextInt();
                                    System.out.println("da numero de cel");
                                    numero[i]=read.next(); 
                                    c++;
        }
        }public void mostrar(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            System.out.println("Cel: "+numero[i]);
        }
    }
}
class Empleado implements Base{
    double[] sueldobruto=new double[5]; int tipo,c=1 ,x;
    String[] Clase=new String[5];
    public void metodoVector(){
        System.out.println("cantidad de empleados a registrar");
        x=read.nextInt();
     System.out.println("da los datos del empleado a registrar");
        for (int i = 5; i < x; i++) {               
            System.out.println("da los datos del empleado "+c+" a registrar");
     System.out.println("sueldo: ");                       
     sueldobruto[i]=read.nextDouble();
     
                            System.out.println("da nombre");
                            nombre[i]=read.next();
                            System.out.println("da la edad");
                            edad[i]=read.nextInt();
                          
            System.out.println("es directicvo (si=1/no=2): ");    
            tipo=read.nextInt();
            if (tipo==1) {
                System.out.println("que tipo de directico es");
                Clase[i]=read.next();
            }
            if(tipo==2){
                Clase[i]="empleado-normal";
            }
c++;
        }
}
    public void mostrar(){
        for (int i = 5; i < 10; i++) {
            System.out.println("Nombre: "+nombre[i]);
            System.out.println("Edad: "+edad[i]);
            System.out.println("Sueldo: "+ sueldobruto[i]);
            System.out.println("Tipo de emleado: "+Clase[i]);
        }
}
}


public class Empresavector {
    public static void main(String[] args) {
Scanner read=new Scanner(System.in);
Cliente ob1=new Cliente();
Empleado ob2=new Empleado(); 
        int po=0; int tipo; String nombre;  double sueld; int ed; String cell; String cat;
        do{
            System.out.println("1.- llenar datos del cliente");
            System.out.println("2.- llenar datos del empleado");
            System.out.println("3.- mostrar datos de los clientes");
            System.out.println("4.- mostrar datos de los empleados");
            System.out.println("5.- salir");
            System.out.println("elije una opcion");
            po=read.nextInt();
            switch(po){
                    case 1:
                       ob1.metodoVector();
                            break;
                    case 2:
                                    ob2.metodoVector();
                                break;
                    case 3:
                        ob1.mostrar();
                        break;
                    case 4:
                        ob2.mostrar();
                        break; 
      }//switch
    }while(po!=4);   
    }
}
