
package vectores;

import java.util.Scanner;



public class Vectores {

    
   String bin (String binario, int num1){       
        if (num1>0) {            
            while (num1>0) {                
                if (num1%2==0) {
                    binario= "0 " + binario;
                }//if                 
                else {
                    binario= "1 "+ binario;
                }//else                
                num1=num1/2;            
            }//while       
        }//if       
         else 
            if (num1 == 0) {
            binario= "0 ";
        }//if             
            else {
            binario="No se puede convertir, ingrese solo # positivos ";
        }//else    
        return binario;
    }
   
   double dec(double num2){
       if(num2%2==0){
           System.out.println("no tiene decimales ");
           
       }
       else{
           System.out.println("tiene decimales ");}
       
   return num2;
   }
   
    
    public static void main(String[] args) {
        Vectores obj=new Vectores();
         Scanner read=new Scanner(System.in);
     double num2;
     int num1;
       System.out.println("da nalor a n2 para el decimal");
        num2=read.nextDouble();
        System.out.println("da valor n1 para el binario");
       num1=read.nextInt();
        System.out.println(" "+obj.bin("binario", num1));
        System.out.println(" "+obj.dec(num2));
    }
    }