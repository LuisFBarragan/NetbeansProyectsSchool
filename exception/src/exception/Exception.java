
package exception;

import java.util.Scanner;

class Errrores{
   int []saldos=new int [5];
   int [] clave=new int[5];
   String []nombre=new String[5];
   int i=0,j=0; 
   Scanner read=new Scanner (System.in);
   void almacenar(){
    try{
        saldos[0]=0;
        System.out.println("dar clave  "+(i+1)+":");
        clave[i]=read.nextInt();
        System.out.println("Da nombre "+(i+1)+":");
        nombre[i]=read.next();
        System.out.println("Da saldo "+(i+1)+":");
        saldos[i]=read.nextInt();
        if(saldos[i]<=0){
            
        }
    }
    catch(NumberFormatException z){
        
    }
}
}
public class Exception {
    public static void main(String[] args) {
        Scanner read=new Scanner (System.in);
    }
    
}
