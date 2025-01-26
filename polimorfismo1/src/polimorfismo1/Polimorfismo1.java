
package polimorfismo1;
import java.util.Scanner;
abstract class Act{
    abstract int metodo(int x); 
      
    Scanner read=new Scanner(System.in);
}
class A1 extends Act{
    int metodo(int x){
    int[]vector=new int[x];  
    vector[0]=0; vector[1]=1;
    System.out.println(" "+vector[0]); System.out.println(" "+ vector[1]);
       int a=0,b=1,c;
        for (int i = 0; i < x; i++) {
            c=a+b;
            vector[i]=c;
            System.out.println(" "+vector);
            a=b;
            b=c;
        }
        
        return 0;
    }
}
class A2 extends Act{
    int metodo (int x){
       int [] vector=new int [x]; int cont=1;
       vector[0]=1;
        for (int i = 1; i < x; i++) {
            if(cont==1){
                vector[i]=vector[i]+4;
            cont--;
            }
            else{
                vector[i]=vector[i]-2;
            cont++;
            }
                System.out.println(" "+vector[i]);
        }
        return 0;
    }
}
class A3 extends Act{
    int metodo(int x){
        int [] vector=new int [x]; int cont=0, suma=0;
        for (int i = 0; i < x; i++) {
            vector[i]=suma+1;
            if (cont==20){
                System.out.print(" ");
            }
        }
        return 0;
    }
}
public class Polimorfismo1 {
    public static void main(String[] args) {
   Scanner read=new Scanner(System.in);
   A1 o1=new A1();
   A2 o2=new A2();    
   A3 o3=new A3();
      int x;
    System.out.println("da x");  
     x=read.nextInt();
        System.out.println("nose");
     o1.metodo(x);
        System.out.println("da");
     o2.metodo(x);
     System.out.println("ka");
     o3.metodo(x);
    }
    
}
