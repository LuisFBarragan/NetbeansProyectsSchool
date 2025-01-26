
package ejemp;

import java.util.Scanner;

public class Ejemp {
    Scanner leer=new Scanner (System.in);
    double suma=0;
    String [] nom=new String[3];
    int [] pre=new int[3];
    double[] iva=new double[3];
    double [] total=new double[3];
    void almacenar(){
        for(int x=0; x<3;x++){
            System.out.print("\n Descripcion: ");
            nom[x]=leer.next();
            System.out.print("\n Precio: ");
            pre[x]=leer.nextInt();
            iva[x]=pre[x]*0.16;
            total[x]=iva[x]+pre[x];
        }
        
    }
    
    void mostrar(){
        System.out.println("\n \n imprimir dato");
        for(int y=0; y<3; y++){
            System.out.println(nom[y]+"  precio: "+pre[y]+"    iva: "+iva[y]+"    total: "+total[y]);
           
            suma=suma+total[y];
            
        }
        System.out.println(" Suma Total "+suma);
        
    }
    public static void main(String[] args) {
    Ejemp ob=new Ejemp();
    ob.almacenar();
    ob.mostrar();
    }
    
}
