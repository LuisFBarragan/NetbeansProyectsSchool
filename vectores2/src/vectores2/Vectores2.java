
package vectores2;
import java.util.Scanner;
public class Vectores2 {
    double prom=0;
    Scanner read=new Scanner(System.in);
    double esta []=new double[5];
    void estatura(){
        System.out.println("Da 5 estaturas en cm");
        for (int x = 0; x < 5; x++) 
             esta[x]=read.nextDouble();           
       
       vector2(esta);
       vector2(esta,0);
       vector3(esta);
       vector4(esta);
       
       
    }
    
int vector2(double vector[]){
   int sum=0;
   //estaturas    
    for (int i = 0; i < 5; i++) {
         System.out.println("["+i+"]"+vector[i]);
        }
        System.out.println(" ");
return 0;
}

    
double vector2(double vector [], int w){
    double sum=0;
    
    for (int y = 0; y < 5; y++) {
    sum=sum+vector[y];       
    }
    prom=sum/5;
    
     System.out.println("La media es "+prom);
     return prom;
}
    
void vector3(double vector[]){
    int sum=0;
    System.out.println("Los mayores a la media son: ");
    for (int x = 0; x < 5; x++) {
        if(vector[x]>prom)
           System.out.println("["+x+"]"+vector[x]);
        
    }
    System.out.println(" ");
}
  

double  vector4(double vector[]){
    
    
    System.out.println("Los menores a la media son:  ");
    for (int i = 0; i < 10; i++) {
        if(vector[i]<prom){
            System.out.println("["+i+"]"+vector[i]);
            return vector[i];
            
        }
    }
    System.out.println(" ");
    return 0;
}

    public static void main(String[] args) {
       Vectores2 o=new Vectores2();
        o.estatura();
        
       
    
    }    
}
