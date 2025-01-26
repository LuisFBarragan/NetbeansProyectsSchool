
package maycienimpar;

import java.util.Scanner;

public class Maycienimpar {

    
    public static void main(String[] args) {
       Scanner leer=new Scanner (System.in);
       char otra='s';
       int num, suma=0, mod;
       while(otra=='s'){
           System.out.println("ingresa el numero");
        num=leer.nextInt();
        mod=num%2;
        if((num>=100)&&(mod !=0)){
            System.out.println("numero valido");
            suma=suma+num;
            
       }
        else{
            System.out.println("# no valido");
            System.out.println("deseas ingresar otro #");
            System.out.println("selecciona s=si o n=nel pastel");
            otra=leer.next().charAt(0);
        }
        System.out.println("la suma es de: "+suma);
           
       }
    }
    
}
