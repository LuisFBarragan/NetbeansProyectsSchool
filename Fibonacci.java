
package fibonacci;


public class Fibonacci {
 int a=1,b=0,suma=0;
    long suma(int x){
     
     if(x==1){
         return x;
     }
     else{
         suma=a+b;
         System.out.print(" "+suma+",");
     a=b;
     b=suma;
         return x +suma(x-1);
     }
         
 }
    
    public static void main(String[] args) {
      Fibonacci obj=new Fibonacci();
      obj.suma(12);
    }
    
}
