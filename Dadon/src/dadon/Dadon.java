package dadon;
import java.util.Scanner;
public class Dadon {
   public static void main(String[] args) {
 Scanner read=new Scanner(System.in);
Dadon obj=new  Dadon();
 int n; 
       System.out.println("Da n");
       n=read.nextInt();
       obj.Modulo(n);
       System.out.println(""+obj.Modulo(n));
    }
    long Modulo(int n){
       if (n<=9) {
         return n;  
       }else{
return Modulo(n/10)+(n%10);          
   }
       }
       }
