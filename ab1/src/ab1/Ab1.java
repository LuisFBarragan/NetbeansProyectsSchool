package ab1;
import java.util.Scanner;

abstract class Act{
    abstract int metodo(int x); 
      
    Scanner read=new Scanner(System.in);
}
class A1 extends Act{
    int metodo(int x){
    int[]vector=new int[x];  
    vector[0]=0; vector[1]=1;
    System.out.print(" "+vector[0]); System.out.print(" "+ vector[1]);
       int a=0,b=1,c;
        for (int i = 2; i < x; i++) {
            c=a+b;
            vector[i]=c;
            System.out.print(" "+vector[i]);
            a=b;
            b=c;
        }
        System.out.println(" ");
        return 0;
    }
}
class A2 extends Act{
    int metodo (int x){
       int [] vector=new int [x]; int con=2;
               vector[0]=1;
        System.out.print(" "+vector[0]);
        for (int i = 1; i < x; i++) {
            if(con==2){
                vector[i]=vector[i-1]+4;
            con--;
            }
            else{        
                vector[i]=vector[i-1]+(-2);
          con++;
            }
                System.out.print(" "+vector[i]);
        }
        System.out.println(" ");
        return 0;
    }
}
class A3 extends Act{
    int metodo(int x){
        int [] vector=new int [x]; int co=0, suma=0;
        for (int z = 0; z < x; z++) {
           suma=suma+1; co++;
            vector[z]=suma; 
            if (co>20){
                System.out.println(" ");
            co=co-20;
            }
         System.out.print(" "+vector[z]);
        }
        System.out.println(" ");
        return 0;
    }
}
public class Ab1 {
    public static void main(String[] args) {
   Scanner read=new Scanner(System.in);
   A1 o1=new A1();
   A2 o2=new A2();    
   A3 o3=new A3();
      int x;
    System.out.println("da x");  
     x=read.nextInt();
        System.out.println("fubo");
     o1.metodo(x);
        System.out.println("aumento 4 resto 2");
     o2.metodo(x);
     System.out.println("1..20 y salta");
     o3.metodo(x);
    }
    
}

