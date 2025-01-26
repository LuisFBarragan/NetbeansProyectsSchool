package recursividadfibonacci;
import java.util.Scanner;
public class RecursividadFibonacci {
     public static void main(String[] args) {
        Scanner sca=new Scanner(System.in); 
       
        int n;
         System.out.println("Da n");
         n=sca.nextInt();
         if (n>1) {
             System.out.print("1");
        }
         int j=Fibonacci(n);
         
         System.out.println(" ");
    }
     public static int a=0,b=1,c=0,cont=0;
    public static int Fibonacci(int n){
        if (n==0) {
            return 0;
        }else{
            if (n==1) {
                return 1;
            }else{
            c=a+b;
                System.out.print(" "+c);
            a=b;
            b=c;
            }
        }
        return Fibonacci(n-1);
    }   
}
