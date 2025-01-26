package matriztry;
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
}
public class Matriztry {
    datos registro=new datos();
Scanner read=new Scanner(System.in);
    BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
int[][] matriz=new int[3][3];
void llenado() throws IOException{
    int dato; int f=0,c=0;
    try{
    for (f = 0; f < 3; f++) {
        for (c = 0; c < 3; c++) {
            System.out.println(" da el valor del casillero "+f+","+c);
            matriz[f][c]=read.nextInt();
            if (matriz[f][c]<=99) {
                throw new Exception("Exception marcada desde try");
            }
        }
    }
}
    catch(NumberFormatException z){
        System.out.println("Error lanzado  desde try");
       f=0; c=0;
       llenado();
    }
    catch (Exception y){
        System.out.println("Error lanzado  desde try");
       f=0; c=0;
        llenado();
    }
}
void mostrar(){
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
             System.out.print(" "+matriz[r][c]);
        }
        System.out.println(" ");
    }
    
    }
static final String Matriz="prueba.dat";
FileOutputStream Gtex;
DataOutputStream GtexB;
void GuardarD() throws FileNotFoundException, IOException{
    try{
    Gtex=new FileOutputStream(Matriz,true);
    GtexB=new DataOutputStream(Gtex);
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
           registro.numero=matriz[r][c]; 
           GtexB.writeInt(registro.numero);
        }
    }
    GtexB.close();
    Gtex.close();
}
    catch(FileNotFoundException er){
        System.out.println("error... "+er);
    }
    catch(Exception er2){
        System.out.println("ya....valio...kaka..."+er2);
    }
}
FileInputStream Mtex;
DataInputStream MtexB;
void MostrarDisco() throws FileNotFoundException, IOException{
    try{
        int cont=0,cont2=0;
    Mtex=new FileInputStream("prueba.dat");
    MtexB=new DataInputStream(Mtex);
    while(MtexB.available()!=0){
        System.out.print(" "+MtexB.readInt());
       cont++; cont2++;
        if (cont==3) {
            System.out.println(" ");
            cont=cont-3;
        }
        if (cont2==9) {
            System.out.println(" ");
            cont2=cont2-9;
        }
    } 
    MtexB.close();
    Mtex.close();
    }
    catch(Exception e){
         System.out.println("error");
    }  
}
void mayor(){
    int mayor=0;
    for (int r = 0; r < 3; r++) {
        for (int c = 0; c < 3; c++) {
            if (matriz[r][c]>mayor) {
                mayor=matriz[r][c];
            }
        }
    }
    System.out.println("el mayor es: "+mayor);
}
void posicion(){
    
    System.out.println(" "+matriz[0][2]);
}
    public static void main(String[] args) throws Exception {
    Scanner read=new Scanner(System.in);
    BufferedReader leer=new BufferedReader (new InputStreamReader(System.in));
        int opcion;
        Matriztry obj=new Matriztry();
        do {
            System.out.println("1.- Llenar");
            System.out.println("2.- Mostrar");
            System.out.println("3.- Mayor");
            System.out.println("4.- matiz[0][2]");
            System.out.println("5.- salir");
            System.out.println("Elije una opcion");
            opcion=read.nextInt();
            switch(opcion){
                case 1:
                    int k;
                    System.out.println("Normal=0/Disco=1");
                    System.out.println("elije");
                    k=read.nextInt();
                    if (k==0) {
                        
                        obj.llenado();
                    }
                    if (k==1) {
                        obj.GuardarD();
                    }
                     break;
                case 2:
                    int f;
                    System.out.println("Normal=0/Disco=1");
                    System.out.println("elije");
                    f=read.nextInt();
                    if (f==0) {
                     obj.mostrar();   
                    }
                    if (f==1) {
                        obj.MostrarDisco();
                    }
                    break;
                case 3:
                    obj.mayor();
                    break;
                case 4:
                    obj.posicion();
                    break;
            }
        } while (opcion!=5);   
    }
}