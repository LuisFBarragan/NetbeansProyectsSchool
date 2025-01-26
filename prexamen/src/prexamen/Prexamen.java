
package prexamen;

import java.util.Scanner;

public class Prexamen {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        int a,b;
        
        
        int [][]impa=new int[3][3];
        int [][] in=new int [3][3];
        int [][] sum=new int [3][3];
      in[0][0]=1;
      in[0][1]=0;
      in[0][2]=0;
      in[1][0]=0;
      in[1][1]=1;
      in[1][2]=0;
      in[2][0]=1;
      in[2][1]=0;
      in[2][2]=1;
        for(a=0;a<3;a++){
           for(b=0;b<3;b++){
               System.out.println("dame un valor para el casillero "+a+","+b);
               impa[a][b]=leer.nextInt();
               if((impa[a][b]%2)!=0){
                   System.out.println("numero valido"); 
               }
               else{
                   System.out.println("numero no valido");
                   b=b-1;
               }
           }
        }
        System.out.println("los valores en la matriz son:");
         for(a=0;a<3;a++){
           for(b=0;b<3;b++){
               System.out.print(impa[a][b]+" ");
           }
             System.out.println(" ");
        
        
    }
         System.out.print("   ");
         System.out.println("  ");
       
         
         for(a=0;a<3;a++){
             for(b=0;b<3;b++){
                 System.out.print(" "+in[a][b]);
             }
             System.out.println("  ");
         }
         
         System.out.println(" ");
         
       
         System.out.println("SUMA");
         for(a=0; a<3; a++){
             for(b=0; b<3; b++){
                 sum[a][b]=impa[a][b]+in[a][b];
          System.out.print(sum[a][b]);
             }
             System.out.println(" ");
         }
         
        
       
                }
}

    

