package pruebasfac;

import java.util.Scanner;

public class PruebasFac {

    public static void main(String[] args) {
        PruebasFac obj=new PruebasFac();
        Scanner read=new Scanner(System.in);
        int n,f,op;
        do {
            System.out.println("1.- Suma");
            System.out.println("2.- Factorial");
            System.out.println("3.- Recorrey Array");
            System.out.println("4.- Bucar en Array");
            System.out.println("5.- Recorrer Matriz");
            System.out.println("6.- Fibonacci");
            System.out.println("7.- ");
            System.out.println("8.- suma digitos");
            
            op=read.nextInt();
            switch(op){
                case 1:
                    System.out.println("Da n");
                    n=read.nextInt();
                    f=obj.suma(n);
                    System.out.println(" "+f);
                    break;
                case 2:
                    System.out.println("Da n");
                    n=read.nextInt();
                    f=obj.Factorial(n);
                    System.out.println(" "+f);
                    break;
                case 3:
                    int Array[]={1,2,3,4,5};
                    obj.RecorrerArray(Array,0);
                    break;
                case 4: 
                    System.out.println("Da elemento a buscar");
                    int Array2[]={1,2,3,4,5};
                    n=read.nextInt();
                    obj.BuscarRecursiva(Array2, n, 0);
                    break;
                case 5:
                    int matriz[][]={{1,2,3},{4,5,6},{7,8,9}};
                    obj.MatrizRecursiva(matriz, 0, 0);
                    System.out.println(" ");
                    break;
                case 6: 
                    System.out.println("Da la n");
                    n=read.nextInt();
                    f=obj.FibonacciRecursivo(n);
                    System.out.println(f);
                    break;
                case 7:
                    long p=obj.Fibo(8);
                    break;
                case 8:
                    f=obj.sumaDigitos(243);
                    System.out.println(" "+f);
                    break;
            }
            
        } while (op!=0);
       }
    public int suma(int n){
        int resultado;
        if (n==0||n==1) {
            return n;
        }else{
             resultado=n+suma(n-1);
             return resultado;
        }
    }
    
    public int Factorial(int n){
        int mult;
        if (n==0) {
            return 1;
        }
        else{
            mult = n*Factorial(n-1);
            return mult;
        }
    }
    
    public void RecorrerArray(int []Array, int z){
           if (z != Array.length){
            System.out.print(Array[z]);
            RecorrerArray(Array, z+1);
        }
    }
       static int cont=0;  
    public void BuscarRecursiva(int Array[], int n, int z){
            if (z!=Array.length) {
                if (n==Array[z]) {
                    int f=0;
                    System.out.println("Se encotro "+cont);
                    return;
                }
                cont ++;
                BuscarRecursiva(Array,n,z+1);
            }
            else{
                System.out.println("ya valio");
            }
        }
        
    public void MatrizRecursiva(int matriz[][],int i,int j){
            System.out.print(" "+matriz[i][j]);
        if (i != matriz.length - 1 || j != matriz[i].length - 1) {
            if (j == matriz[i].length - 1) {
                i++;
                j = 0;
                System.out.println("");
            } else {
                j++;
            }
            MatrizRecursiva(matriz, i, j);
        }
        }
    
    public int FibonacciRecursivo(int n){
       if (n==0) {
           return 0;
       }else if(n==1){
           return 1;
       }
       else{
           return  FibonacciRecursivo(n-1)+FibonacciRecursivo(n-2);
           
       }
       
   }
    
    int a=1,b=0,suma=0;
   long Fibo(int x){
     
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
   
   public  int sumaDigitos(int numero){
        if(numero < 10){ 
            return numero;
        }else{
            return (numero % 10) + sumaDigitos(numero/10);
        }  
    }
 
}

    
    

