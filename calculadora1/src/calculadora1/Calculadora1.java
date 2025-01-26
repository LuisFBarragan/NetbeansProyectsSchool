
package calculadora1;

import java.util.Scanner;

class sencilla{
 int n1,n2;
 sencilla(){
 n1=9;
 n2=10;
 }
 int sumar(int n){
     return n1+n2;
 }
}//clase sencilla

class cientifica extends sencilla{
    double raiz(int n1){
        return Math.sqrt(n1);//raiz cuadrada
        
    }
}

//clase principal
public class Calculadora1 extends cientifica {    
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Calculadora1 objeto=new Calculadora1();
        int n;
        System.out.println("da valor");
        n=read.nextInt();
        System.out.println("sumar: "+objeto.sumar(n));
        System.out.println("raiz: "+objeto.raiz(n));
    }
    
}
