package architexto;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
public class Architexto {
File ruta=new File("c:\\jueves\\carta.txt");
static BufferedReader teclado=new BufferedReader(new InputStreamReader(System.in));
Scanner leer=new Scanner(System.in);
String nombre,domicilio;
void escribirTexto(String texto1, String texto2){
    try{
        FileWriter accesoRuta=new FileWriter(ruta);
        BufferedWriter accesoArchivo=new BufferedWriter(accesoRuta);
        PrintWriter variableEscribir=new PrintWriter( accesoArchivo);
        variableEscribir.println("===============================");
        variableEscribir.println("     "+texto1+"   ");
        variableEscribir.println("     "+texto2+"   ");
        accesoArchivo.close();
    }
    catch(Exception e){
        System.out.println("error");
    }
}
void mostrarContenido(){
    try{
        FileInputStream ruta=new FileInputStream("c:\\jueves\\carta.txt");
        DataInputStream entrada=new DataInputStream(ruta);
        BufferedReader leer= new BufferedReader(new InputStreamReader(entrada));
        String lectura;
        while((lectura=leer.readLine())!=null){
            System.out.println("  "+lectura);
        }
    }
    catch(Exception e){
        
    }
}
    public static void main(String[] args) {
      Architexto objet=new Architexto();
      int opcion=0;
      Scanner leer=new Scanner(System.in);
      String texto1,texto2;
      do{
          System.out.println("1.-Escribir en archivo de texto");
          System.out.println("2.-mostrar contenidos del texto");
          System.out.println("3.-salir");
          opcion=leer.nextInt();
          switch(opcion){
              case 1:
                  System.out.println("capturar texto 1: ");
                  texto1=leer.next();
                  System.out.println("capturar texto 2: ");
                  texto2=leer.next();
                  objet.escribirTexto( texto1, texto2);
                  break;
              case 2:
                  objet.mostrarContenido();
                  break;
                  
          }
      }while(opcion!=3);
    }
    
}