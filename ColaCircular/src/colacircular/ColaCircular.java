package colacircular;
import java.util.Scanner;
public class ColaCircular {
  static Scanner read=new Scanner(System.in);
    int[] cola=new int[5];
    int pi=0, pf=0, x;
    public void Insertar(){
        x=0;
        for (int i = 0; i < cola.length; i++) {
            if (cola[i]!=0) {
                x++;
            }
        }
        if (pi==5 && pf==5) {
            pi=0;
            pf=0;
        }
        if(pi>0 && pf==5){ 
            pf=0;
        }
        if (x!=5) {
            System.out.println("Da el valor a insertar");
            cola[pf]=read.nextInt();
            pf++;
        }
        else{
            System.out.println("cola llena");
        }
    }
    public void Eliminar(){
        x=0;
        for (int i = 0; i < cola.length; i++) {
            if (cola[i]==0) {
                x++;
            }
        }
        if (x!=5 && pi!=5) {
            cola[pi]=0;
            pi++;
        }
        else if(x!=5 && pi==5){
            pi=0;
            cola[pi]=0;
            pi++;
        }
        else{
            System.out.println("La cola está vacia");
        }
    }
    public void Imprimir(){
        for (int i = pi; i < cola.length; i++) {
            System.out.println(cola[i]);
        }
        for (int i = 0; i < pi; i++) {
            System.out.println(cola[i]);
        }
    }
    public static void main(String[] args) {
     Scanner read=new Scanner(System.in);
      ColaCircular  obj=new ColaCircular();
     int op=0;
        do {
            System.out.println("1.- Insertar");
            System.out.println("2.- Eliminar");
            System.out.println("3.- Mostrar");
            System.out.println("4.- Salir");
            System.out.println("Elije una opcion");
            switch(op){
                case 1: obj.Insertar(); break;
                case 2: obj.Eliminar(); break;
                case 3: obj.Imprimir(); break;
            }
        } while (op!=4);
        
    }
    
}
