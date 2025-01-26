package polimorfismo;
import java.util.Scanner;

abstract class Act{
    abstract double metodo(double x);    
}
class Area1 extends Act{
    double metodo(double x){
        return x*x;
    }
}
class Area2 extends Act{
    double metodo(double x){
       double y;
       Scanner read=new Scanner(System.in); 
       System.out.println("da valor de la altura");
        y=read.nextDouble();
        return x*y ;
    }
}
class Area3 extends Act{
    double metodo(double x){
       Scanner read=new Scanner(System.in); 
       double y;
       System.out.println("da valor de la altura");
        y=read.nextDouble();
        return x*y/2;
    }
}
public class Polimorfismo {
    public static void main(String[] args) {
       Area1 objeto1=new Area1();
       Area2 objeto2=new Area2();
       Area3 objeto3=new Area3();
       Scanner read=new Scanner(System.in);
       double x, y; 
        System.out.println("da valor de la base");
        x=read.nextDouble();       
        System.out.println("Area del cuadrado  "+objeto1.metodo(x)); 
        System.out.println("Area de rectangulo "+objeto2.metodo(x));
        System.out.println("Area del triangulo "+objeto3.metodo(x));
    }
    
}
