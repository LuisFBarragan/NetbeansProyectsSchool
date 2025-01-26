package try1;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
abstract class claseAbstracta{
    static int [] vector=new int[5];
    abstract int metodoVector();
}//abstracta
class Derivada1 extends claseAbstracta{
   BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
   Scanner leer2=new Scanner (System.in);
    int metodoVector(){
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println("Dar un entero para el casillero "+i+": ");
                vector[i]=Integer.parseInt(leer.readLine());
                if(vector[i]<100)
                    throw new Exception ("Excepcion lanzada desde try");
            }
            catch(NumberFormatException z){
                System.out.println("SE ATRAPA UN ERROR DE FORMATO.....");
                System.out.println("SOLO SE ACEPTAN NUMEROS ENTEROS");
                i--;
            }//catch
            catch(ArrayIndexOutOfBoundsException w){
                System.out.println("UN ERROR DE LIMITE DE ARRAYS... "+w);
            }//catch
            catch(Exception w){
                System.out.println("ERROR enviado por trow new.. "+w);
                System.out.println("No se almaceno el dato "+vector[i]);
            }//catch
        }//for
        
       return 0; 
    }
}
class Derivada2 extends claseAbstracta{
    int metodoVector(){
        System.out.println("mostrar datos ");
        for (int i = 0; i < 10; i++) {
            System.out.println("El dato del casillero "+i +" Es: "+vector[i]);
        }
        return 0;
    }
}
public class Try1 {
    public static void main(String[] args) {
       Derivada1 objeto1=new Derivada1();
       Derivada2 objeto2=new Derivada2();
       objeto1.metodoVector();
       objeto2.metodoVector();
    }
    
}