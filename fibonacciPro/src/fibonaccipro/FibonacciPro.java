
package fibonaccipro;

import java.util.Scanner;
public class FibonacciPro {


    public static void main(String[] args) {
       Scanner sca=new Scanner(System.in);    
        int n=10;
     
        int resta=Fibonacci(n);
        System.out.println(resta);
    }
    public static  int Fibonacci(int numero){
        int rest;
        if (numero==1) {
            return 1;
        }
        else{
            rest=numero+Fibonacci( numero-1);
        }
    
        return rest;
    }
    
}
