package Binario;
import java.util.Scanner;
public class Binario {
     
   Binario(){  
   
   
   
}//clas. bin
    
    public static void main(String[] args) {
           Scanner read=new Scanner(System.in);    

        System.out.println("da un # positivo ");       
        int numero = read.nextInt();
        String binario = "";
        
        if (numero>0) {            
            while (numero>0) {                
                if (numero%2==0) {
                    binario= "0" + binario;
                }//if                 
                else {
                    binario= "1"+ binario;
                }//else                
                numero=numero/2;            
            }//while       
        }//if
        
         else 
            if (numero == 0) {
            binario= "0";
        }//if             
            else {
            binario="No se puede convertir, ingrese solo # positivos";
        }//else
        
        System.out.println("El número convertido a binario es: "+binario);
    }
}