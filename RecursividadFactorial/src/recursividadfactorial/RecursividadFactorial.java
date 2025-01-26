
package recursividadfactorial;

import java.util.Scanner;

public class RecursividadFactorial {



    public static void main(String[] args) {
       Scanner sca=new Scanner(System.in);
      int n=0; int j;
        System.out.println("Numero a factorizar");
        n=sca.nextInt();
        j=AFactorizar(n);
        System.out.println(" ");
    }
 static int w=1; 
    public static int AFactorizar(int n){
 
        if (n==1) {
            return 1;
        }
        else{
       
        w=w*(n);  
            System.out.println(""+w);
        return n+AFactorizar(n-1);  
           
        }
    }
    
}
