package interfacevector;
import java.util.Scanner;
interface Base{
  int[]vector=new int[5];
    Scanner read=new Scanner(System.in);
}
class Derivada1 implements Base{
    public void metodoVector(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Captura edad: ");
            vector[i]=read.nextInt();
        }
    }
}
class Derivada2 implements Base{
    public void metodoVector(){
        System.out.println("Mostrar datos");
        for (int i = 0; i < 5; i++) {
            System.out.println(" "+vector[i]);
        }
    }
}
public class Interfacevector {
    public static void main(String[] args) {
        Derivada1 o1=new Derivada1();
        Derivada2 o2=new Derivada2();
        o1.metodoVector();
        o2.metodoVector();
    }
    
}
