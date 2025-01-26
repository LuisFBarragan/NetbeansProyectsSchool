
package prom;

import java.util.Scanner;

public class Prom {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int na, np, d=0;
        double suma=0, prom, sumiva=0, tot=0;
        String busq;
                 System.out.println("da la cantidad de articulos a ingresar ");
        na=leer.nextInt();
        String [] articulo=new String [na];
        double [] precio=new double [na];
        double [] iva=new double [na];
  do{     
      System.out.println("1.- iva y prom");
      System.out.println("2.- buscar");
      System.out.println("3.- salir");
      System.out.println("elije una opcion");
      np=leer.nextInt();
     
           switch(np){
                 case 1:  
                    for(int i=0; i<na; i++){
            System.out.println("da el nombre de articulos ");
            articulo [i]=leer.next();
            System.out.println("da el precio ");
            precio[i]=leer.nextDouble();
            iva [i]=precio[i]*0.16;
            suma=suma+precio[i];
         sumiva=sumiva+iva[i]; 
            tot=tot+precio[i];
             System.out.print(i+1+" articulo: "+articulo[i]+" precio: "+precio[i]+" iva: "+iva[i]);
        }
                   
              System.out.print("el total es: "+tot+" + iva total: "+sumiva);      
        
       
  prom=suma/na;
  System.out.println("el promedio es: "+prom);
  break;
 
                 case 2:
       System.out.println("que articulo desea buscar");
           busq=leer.next();
           for(int i=0; i<na;i++){
               if (articulo[na].equals(busq)){
                   d++;
               }
           }
           System.out.println("el dato: "+busq+"se repitio "+d);
 break; 
  }
    }while(np!=3);
}   
}




