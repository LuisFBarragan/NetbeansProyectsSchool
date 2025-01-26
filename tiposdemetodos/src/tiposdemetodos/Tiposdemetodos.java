
package tiposdemetodos;

import java.util.Scanner;

public class Tiposdemetodos {
 long r;
    double potencia(double n, double p){
        return Math.pow(n, p);
        
    }
     long resta(int x){ 
        r=x-1;
        return r;
    }
    float redondeo(int x){
        float redondeo=Math.round(7.3);
        return redondeo;
    }
    double suma(double n1, int n2){
        return n1+n2;
    }
    String cadena(String cad){
        return cad+cad;
    }
    boolean boleano(int x, int y){
        if(x==y)
            return true;
            else
            return false;
    }
    
    public static void main(String[] args) {
        
        double potencia;
        short num2; double resultado;
        long resta;
        Scanner leer=new Scanner (System.in);
        Tiposdemetodos objeto=new Tiposdemetodos();
        System.out.println("Return resta: "+objeto.resta(100));
        System.out.println("Return potencia "+objeto.potencia(1.1,2.5));
        System.out.println("Return de cadena "+objeto.cadena("-poo-"));
        System.out.println("return Boolean "+objeto.boleano(10,10));
        System.out.println(" "+objeto.suma(100.1,500));
        
    }
    
}
