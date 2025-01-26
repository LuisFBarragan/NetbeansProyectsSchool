package calculadora;

import java.util.Scanner;

public class Calculadora {
 long r;
 
 
 
 double potencia(double n, double p){
        return Math.pow(n, p);
    }
    
    long resta(long x1, long y1){
        r=x1-y1;
        return r;
    }
    
    float redondeo(float x){
        float redondeo=Math.round(x);
        return redondeo;
    }
    
    double suma(double x,double y){
        return x+y;
    }
    
    String cadena(String cad){
        return cad+cad;
    }
    
    double multiplicacion(double x,double y){
        return x*y;
    }
    
    double division(double x,double y){
        return x/y;
    }

    double raiz(double x){
        return Math.sqrt(x);
    }  
    byte p(int n ){
        if(n>0)
            return 1;
        else 
        
        return 0;
    
  
    }
    
    char caracter(char x){
        return x;
    }
    
    double arcontangente(double x){
       double angulo=x*Math.PI/180; 
       return Math.atan(angulo);
    }

    double floor(double x){
      double redondeom=Math.floor(x);
      return redondeom;
    }

    double ceil(double x){
       double  redondeoma=Math.ceil(x);
       return redondeoma;
    }

    boolean boleano(int x,int y){
        if(x==y)
            return true;
        
        else
            return false;
        
    }
    public static void main(String[] args) {
       Scanner leer=new Scanner(System.in);
       
       Calculadora obj=new Calculadora();
       
       int opcion=0, n;
       double x,y;
       float a;
       long x1,y1;
       char b;
       
       while(opcion!=13){
           System.out.println("elije una opcion");
           System.out.println("1.-Suma");
           System.out.println("2.-resta");
           System.out.println("3.-multiplicacion");
           System.out.println("4.-division");
           System.out.println("5.-Potencia");
           System.out.println("6.-raiz");
           System.out.println("7.-redondeo");
           System.out.println("8.-atan");
           System.out.println("9.-redondeo menor");
           System.out.println("10.-redondeo mayor");
           System.out.println("11.- char ");
           System.out.println("12.- byte");
           System.out.println("13.-salir");
           opcion=leer.nextInt();
           switch(opcion){
               
               case 1:
                   System.out.println("deme el primer numero");
                   x=leer.nextDouble();
                   System.out.println("dame el seundo numero");
                   y=leer.nextDouble();
                   System.out.println("la suma es de: "+obj.suma(x, y));
                   break;
               
               case 2:
                   System.out.println("deme el primer numero");
                   x1=leer.nextLong();
                   System.out.println("dame el seundo numero");
                   y1=leer.nextLong();
                   System.out.println("la resta es de: "+obj.resta(x1, y1));
                   break;
               
               case 3:
                 System.out.println("deme el primer numero");
                   x=leer.nextDouble();
                   System.out.println("dame el seundo numero");
                   y=leer.nextDouble();
                   System.out.println("la multiplicacion es de: "+obj.multiplicacion(x, y));
                   break;
               
               case 4:
                 System.out.println("deme el primer numero");
                   x=leer.nextDouble();
                   System.out.println("dame el seundo numero");
                   y=leer.nextDouble();
                   System.out.println("la division es de: "+obj.division(x, y));
                   break;
               
               case 5:
               System.out.println("deme el numero");
                   x=leer.nextLong();
                   System.out.println("dame el numero de potencia");
                   y=leer.nextLong();
                   System.out.println("el resultado de la potencia es de: "+obj.potencia(x, y));
                   break;
               
               case 6:
                   System.out.println("deme el numero");
                   x=leer.nextDouble();
                   System.out.println("la raiz es de: "+obj.raiz(x));
                   break;
               
               case 7:
                   System.out.println("dame el numero a redondear");
                   a=leer.nextFloat();
                   System.out.println("el numero redondeado es: "+obj.redondeo(a));
                   break;
               
               case 8:
                   System.out.println("dame un angulo");
                   x=leer.nextDouble();
                   System.out.println("el atang del angulo es de: "+obj.arcontangente(x));
               
               case 9:
                   System.out.println("da numero");
                   x=leer.nextDouble();
                   System.out.println("el redondeo menor es: "+obj.floor(x));
                   break;
               
               case 10:
                   System.out.println("da numero a rendondear ");
                   x=leer.nextDouble();
                   System.out.println("el redondeo mayor es: "+obj.ceil(x));
                   break;
                   
               case 11:
                   System.out.println("da caracter ");
                   b=leer.next().charAt(0);
                   System.out.println("el caracter es "+obj.caracter(b));
                   break;
                   
               case 12:
                   System.out.println("da valor que sea 0 o 1");
                   n=leer.nextInt();
                   System.out.println("eres puto "+obj.p(n));
                   break;
                   
           }
       }
    }   
}