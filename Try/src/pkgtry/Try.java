package pkgtry;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class Try {
    Scanner leer = new Scanner(System.in);
    BufferedReader leer2 = new BufferedReader(new InputStreamReader(System.in));
    int i=0,j=0;
    int [] vector = new int[5];
    String [] nombres = new String[5];
    double [] saldos = new double[5];
    void almacenar() throws IOException{
        try{   i++;
            System.out.println("Dar un clave: "+(i-1)+" :");
            vector[i-1]=Integer.parseInt(leer2.readLine());
            System.out.println("Dar Nombre: ");
            nombres[i-1]=leer2.readLine();
            System.out.println("Dar saldo");
            saldos[i-1]=Double.parseDouble(leer2.readLine());
            if (saldos[i-1]<=0) {
                throw new Exception ("Exepcion lanzada desde try");
            }
        }
        catch(NumberFormatException z){
            System.out.println("Se atrapo un error de formato....."+z);
            i--;
        }
        catch(ArrayIndexOutOfBoundsException w){
            System.out.println("Atrapo un error que: rebaso el limite de Vectores...."+w);
        }
        catch(Exception y){
            System.out.println("Atrapo un error .... saldo igual a cero "+y);
            i--;
            almacenar();
        }
    }
    void mostrar(){
        try{
            for (int j = 0; j < 10; j++) {
                System.out.println("Numero: "+vector[j]+" Nombre: "+nombres[j]+" Saldo: "+saldos[j]);
            }
        }
        catch(ArrayIndexOutOfBoundsException x){
            System.out.println(" "+x);
            System.out.println("el "+"liminte es de 3 casillas "+3+" casilleros, quieres imprimir:"+i);
        }
    }
    public static void main(String[] args) throws IOException {
        Scanner leer = new Scanner(System.in);
        Try ojb = new Try();
        char op='1';
        do {
            System.out.println("1.-Almacenar");
            System.out.println("2.-Mostrar");
            System.out.println("3.-Salir");
            System.out.println("Seleccionar una opcion 1-3");
            op=leer.next().charAt(0);
            switch(op){
                case '1':
                    ojb.almacenar();
                    break;
                case '2':
                    ojb.mostrar();
                    break;
                case '3':
                    System.out.println("Saliendo.............");
                    break;
                default:
                    System.out.println("Na prro no sabes seguir las indicaciones, masticas agua verdad");
                    break;
            }
        } while (op!='3');
    }
    
}
