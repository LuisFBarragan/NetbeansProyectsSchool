
package impaiffor;

import java.util.Scanner;

public class Impaiffor {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int a,b,f,c,d=0;
        String busq;
        System.out.println("cuantas columas quieres");
        c=leer.nextInt();
        System.out.println("cuantas filas quieres");
        f=leer.nextInt();
        int [][]matriz=new int[c][f];
        for(a=0;a<c;a++){
           for(b=0;b<f;b++){
               System.out.println("dame un valor para el casillero "+a+","+b);
               matriz[a][b]=leer.nextInt();
               if((matriz[a][b]%2)!=0){
                   System.out.println("numero valido"); 
               }
               else{
                   System.out.println("numero no valido");
                   b=b-1;
               }
           }
        }
        System.out.println("los valores en la matriz son:");
         for(a=0;a<c;a++){
           for(b=0;b<f;b++){
               System.out.print(matriz[a][b]+" ");
           }
             System.out.println(" ");
             
          
           }

        
    }
    
}
