package vectorarchivo;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class datos{
    int numero;
    String nombre;
}

public class Vectorarchivo {
static String Nombre_Archivo="prueba.dat";

FileOutputStream abrirEscrituraArchivotexto;
DataOutputStream abrirFicheroBinarioEscribir;
datos registro=new datos();
Scanner read=new Scanner(System.in);
BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
int[] vector1=new int[5];
int[] c=new int[5];
String[] nombre=new String[5];
void llenar() throws IOException {
    for (int i = 0; i < 5; i++) {
        System.out.println("Captura["+i+"]");
        System.out.println("numero");
        vector1[i]=read.nextInt();
        System.out.println("nombre");
        nombre[i]=leer.readLine();
    }
}
void mostrar(){
    System.out.println("Contenido");
    for (int i = 0; i < 5; i++) {
        System.out.println(" ["+i+"] "+vector1[i]+" "+nombre[i]);
        
    }
}
void buscar(){
    int buscar;
    System.out.println("dato buscar");
    buscar=read.nextInt();
    for (int i = 0; i < 5; i++) {
        if (buscar==vector1[i]) {
            System.out.println(" En la posicion"+i);
            System.out.println(" "+vector1[i]+" "+nombre[i]);
        break;
        }
    }
}
void modificar() throws IOException{
    int buscar;
    boolean respuesta;
    System.out.println(" Dato modificar ?");
    buscar=read.nextInt();
    for (int i = 0; i < 5; i++) {
        if (buscar==vector1[i]) {
            System.out.println(" Dato a modificar: "+vector1[i]);
            System.out.println("dar #");
            vector1[i]=read.nextInt();
            System.out.println("Dar nombre");
            nombre[i]=leer.readLine();
        }
    }
}
void guardarDisco() throws FileNotFoundException, IOException{
    abrirEscrituraArchivotexto=new FileOutputStream(Nombre_Archivo,true);
    abrirFicheroBinarioEscribir=new DataOutputStream(abrirEscrituraArchivotexto);
    for (int i = 0; i < 5; i++) {
        registro.numero=vector1[i];
        registro.nombre=nombre[i];
            abrirFicheroBinarioEscribir.writeInt(registro.numero);
            abrirFicheroBinarioEscribir.writeUTF(registro.nombre);
    }
    abrirFicheroBinarioEscribir.close();
    abrirEscrituraArchivotexto.close();
}
DataInputStream abrirficheroBinarioLectura;
FileInputStream abrirLecturaArchivodetesto;
void mostrarleerElDisco() throws FileNotFoundException, IOException{
    abrirLecturaArchivodetesto=new FileInputStream("prueba.dat");
    abrirficheroBinarioLectura=new DataInputStream (abrirLecturaArchivodetesto);
    System.out.println("Contenido del archivo "+ "Nombre_Archivo");
     try{
         while(abrirficheroBinarioLectura.available()!=0){
             System.out.println(" "+abrirficheroBinarioLectura.readInt());
             System.out.println(" "+abrirficheroBinarioLectura.readUTF());
         }
     }
     catch(Exception e){
         System.out.println("error");
     }
     abrirficheroBinarioLectura.close();
     abrirLecturaArchivodetesto.close();
}

    public static void main(String[] args) throws IOException {
    Vectorarchivo obj=new Vectorarchivo();
    Scanner read=new Scanner(System.in);
BufferedReader leer=new BufferedReader(new InputStreamReader(System.in));
    int op;   
    do {
            System.out.println("1.- Llenar");
            System.out.println("2.- mostrar");
            System.out.println("3.- Buscar");
            System.out.println("4.- Modificar");
            System.out.println("5.- guardar en disco");
            System.out.println("6.- mostrar disco");
            System.out.println("7.- salir");
           System.out.println("elije");
           op=read.nextInt();
           switch(op){
               case 1: obj.llenar(); break;
               case 2: obj.mostrar(); break;
               case 3: obj.buscar(); break;
               case 4: obj.modificar(); break;
               case 5: obj.guardarDisco(); break;
               case 6: obj.mostrarleerElDisco(); break;
           }
        } while (op!=7);
        
    }
    
}
