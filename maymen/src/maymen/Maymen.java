
package maymen;

import java.util.Scanner;

public class Maymen {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
       int n, x=0; 
        System.out.println("da la cantidad de datos a ingresar ");
        n=leer.nextInt();
       int [] vector=new int[n];

       for(x=0; x<n; x++){ 
       System.out.println("da el dato del casillro i");
        vector[x]=leer.nextInt();
        if (vector[x] <100){
           System.out.println("numero valido "+vector[x]);             
        }
        else{             
            System.out.println("# no valido");
            x=x-1;
        }       
    }
       for(x=0;x<n;x++){
           System.out.println(" "+vector[x]);
       }
}
}