
package est;

import java.util.Scanner;

public class Est {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int n;
        double suma=0, prom=0;
        String search;
         System.out.println("da la cantidad de alumnos a ingresar");
         n=leer.nextInt();
         
       String [] name=new String [n];
       double [] calf=new double [n];
        for(int x=0; x<n; x++){
            System.out.println("da el nombre "+x);
        name[x]=leer.next();
       
            System.out.println("da la calificacion "+x);
            calf[x]=leer.nextDouble();
            
            suma=suma+calf[x];
           System.out.print("estudiante: "+name[x]+" calificacion: "+calf[x]); 
        }
        prom=suma/n;
        System.out.println("el promedio es: "+prom);
            
        System.out.println("da el nomre a buscar");
        search=leer.next();
       
        for (int x=0;x<n;x++){
            if(name[x].equals(search)){
                System.out.println(" "+name[x]);
            }
                else{
                        System.out.println("no se encontro: "+name[x]+"  "+calf[x]);
                        
                        }
            
            
            }       
        } 
    }
