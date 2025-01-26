package no3;

import java.util.Scanner;
interface Base {
    void metodoVector();
        int[] vector=new int[5];
                Scanner leer=new Scanner(System.in);
    }
class Derivada1 implements Base{
    public void metodoVector(){
        for(int i=0;i<5;i++){
            System.out.println("captura los datos del ");
            vector[i]=leer.nextInt(); 
            
        }
    }
}
class Derivada2 implements Base{
    public void metodoVector(){
        Scanner read=new Scanner(System.in);
         int fa, fo=0;   
         System.out.println("que dato quieres ver");
        fa=read.nextInt();
        for (int i = 0; i <5; i++) {
            if(vector[i]==fa){
                fo++;
            }   
        }
        System.out.println("el numero "+fa+" se encontro en el casillro  "+fo); 

    }
}
class Derivada3 implements Base{
    public void metodoVector(){
        Scanner read=new Scanner(System.in);
         int ca, co=0;   
         System.out.println("que dato quieres ver");
        ca=read.nextInt();
        for (int i = 0; i <5; i++) {
            if(vector[i]==ca){
                co++;
            }   
        }
        System.out.println("el numero "+ca+" se repite  "+co+" veces "); 
        
    }
}

   class Derivada4 implements Base{
    public void metodoVector(){
        Scanner read=new Scanner(System.in);
        int borrar;
        System.out.println(" da numero casillero a borrar");
        borrar=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if(borrar==vector[i]){
                vector[i]=0;
            }
        }
    }   
   }
class Derivada5 implements Base{
    public void metodoVector(){
        Scanner read=new Scanner(System.in);
        int mod, cam;
        System.out.println(" da numero casillero a modificar");
        mod=read.nextInt();
        for (int i = 0; i < 5; i++) {
            if(mod==vector[i]){
                System.out.println("que numero deseas cambiar");
                cam=read.nextInt();
                vector[i]=cam;
            }
            System.out.println(" "+vector[i]);
        }
    }
}
class Derivada6 implements Base{
    public void metodoVector(){
        for (int i = 4; i>= 0; i--) {
            System.out.println(" "+vector[i]);
        }
    }
}
public class No3 {
public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        Derivada1 o1=new Derivada1();
        Derivada2 o2=new Derivada2();
        Derivada3 o3=new Derivada3();
        Derivada4 o4=new Derivada4();
        Derivada5 o5=new Derivada5();
        Derivada6 o6=new Derivada6();
        int op;
        do{
            System.out.println("1.- llenar");   
            System.out.println("2.- buscar");
            System.out.println("3.- contar");
            System.out.println("4.- eliminar");
            System.out.println("5.- modificar");
            System.out.println("6.- inversa"); 
            System.out.println("7.- salir");
            System.out.println("elije");
            op=read.nextInt();
            switch(op){
                case 1:
        o1.metodoVector();
        break;
                case 2:
        o2.metodoVector();
        break;
                case 3:
        o3.metodoVector();
        break;
                case 4:
        o4.metodoVector();
        break;
                case 5:
        o5.metodoVector();
        break;
                case 6:
        o6.metodoVector();
                    break;
        }
    }while(op!=5);
        }
    
}

