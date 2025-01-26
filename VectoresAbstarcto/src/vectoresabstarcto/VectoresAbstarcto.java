package vectoresabstarcto;
import java.util.Scanner;

abstract class claseAbstracta{
    Scanner read=new Scanner(System.in); 
    static int[] vectores=new int[5];
    abstract int metodoVector();
} 
class Derivada1 extends claseAbstracta{
    public int metodoVector(){
        for (int i = 0; i < 5; i++) {
            System.out.println("dar un valor");
            vectores[i]=read.nextInt();
        }
        return 0;
    }
}
class Derivada2 extends claseAbstracta{
    public int metodoVector(){
        System.out.println("mostar datos");
        for (int i = 0; i < 5; i++) {
            System.out.println("vectores "+vectores[i]);
        }
        return 0;
    }
}
class Derivada3 extends claseAbstracta{
    public int metodoVector(){
        int b;
        System.out.println("da numero a buscar");
        b=read.nextInt();
        for (int i = 0; i < 5; i++) {
        if(b==vectores[i]){
            System.out.println("se encontro en el casillero "+vectores[i]);
        } }
        return 0;
    }
}
public class VectoresAbstarcto {
    public static void main(String[] args) {
    Derivada1 o1=new Derivada1();
    Derivada2 o2=new Derivada2();
    Derivada3 o3=new Derivada3();
    o1.metodoVector();
    o2.metodoVector();
    o3.metodoVector();
    }
    
}
