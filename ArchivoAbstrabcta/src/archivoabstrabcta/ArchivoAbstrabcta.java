package archivoabstrabcta;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

abstract class Abstracta{
    abstract void RegistrarRam(int clave, String nombre);
}
interface Inter{
    void almacenarDisco();
}
public class ArchivoAbstrabcta extends Abstracta  implements Inter{
int clave; String nombre;
ArchivoAbstrabcta(int clave, String nombre){
this.clave=clave;
this.nombre=nombre;
}
ArrayList<ArchivoAbstrabcta> lista=new ArrayList();
public void RegistrarRam(int clave, String nombre){
    lista.add(new ArchivoAbstrabcta(clave,nombre));
}
void mostrar(){
    for (int i = 0; i < 10; i++) {
        System.out.println(" "+lista.get(i).clave);   
    }
}
static final String Nombre_Archivo="prueba.dat";
FileOutputStream GtexS;
DataOutputStream GtexSB;
public void almacenarDisco(){
    try{
        GtexS=new FileOutputStream(Nombre_Archivo);
        GtexSB=new DataOutputStream(GtexS);
        for (int i = 0; i < lista.size(); i++) {
            GtexSB.writeInt(lista.get(i).clave);
            GtexSB.writeUTF(lista.get(i).nombre);
        }//for
        GtexSB.close();
        GtexS.close();
    }//try
    catch(FileNotFoundException er1){
        System.out.println("ya valio... "+er1);
    }
    catch(Exception er2){
        System.out.println("... "+er2);
    }
}
    FileInputStream TexMost;
    DataInputStream TexMostBi;
    void mostrarDisco(){
        try{
            
        }
        catch(Exception w){
            
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
    }    
}
