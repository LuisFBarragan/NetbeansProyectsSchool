package sumatoria;
import java.util.Scanner;
public class Sumatoria {
Scanner leer=new Scanner(System.in);
       int suma=0,num=0;
void registrar(){
     
        for (int i = 0; i < 10; i++) {
            System.out.println("ingresa el  numero");
            num=leer.nextInt();
            suma=suma+num;
        }
    }
    void mostrar(){
        System.out.println("la suma es: "+suma);
    }
   
            
    public static void main(String[] args) {
    Sumatoria obj=new Sumatoria();
     long sumatoria=sumaEnteros(40);
        System.out.println("\n La sumatoria final de los "+" números enteros es: "+sumatoria);
       
    }
    public static long sumaEnteros(int n){
        if(n==1){
            System.out.println("\n"+n);
            return 1;
        }
        else{
            System.out.println("\n"+n);
            return n+ sumaEnteros(n-1);
        }
    }
}