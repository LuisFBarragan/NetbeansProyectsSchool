
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;


public class Archivo {
    Double peso;
    String Nombre;
    Double Estatura;
    Archivo(Double peso, String Nombre, Double Estatura){
        this.peso=peso;
        this.Nombre=Nombre;
        this.Estatura=Estatura;
        
    }
    public Double getPeso() {
        return peso;
    }
    public void setPeso(Double peso) {
        this.peso = peso;
    }
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public Double getEstatura() {
        return Estatura;
    }
    public void setEstatura(Double Estatura) {
        this.Estatura = Estatura;
    }
     
    ArrayList <Archivo> lista=new ArrayList();
    void almacenarRAM(){
        lista.add(new Archivo(getPeso(),getNombre(),getEstatura()));
    }
    static final String ArchName="Nutry.dat";
    FileOutputStream TexSalida;
    DataOutputStream BinSalida;  
      void almacenDisco() throws FileNotFoundException, IOException{
          TexSalida = new FileOutputStream(ArchName,true);
            BinSalida = new DataOutputStream(TexSalida);
            for(int i=0;i<lista.size();i++){
                System.out.println("...almacenandooooooo.....   ");
                BinSalida.writeDouble(lista.get(i).getPeso());
                BinSalida.writeUTF(lista.get(i).getNombre());
                BinSalida.writeDouble(lista.get(i).getEstatura());
            }
            BinSalida.close();
            TexSalida.close();  
      }
       FileInputStream TexEntrada; 
       DataInputStream BinEntrada;   
       void MostrarDisco() {
           
       }
}
