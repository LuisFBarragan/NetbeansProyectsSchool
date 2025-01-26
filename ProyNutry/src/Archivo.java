import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Archivo {
    Double Peso;
    String Nombre;
    Double Estatura;
    double PesoIdeal;
    double SobrePeso;
    double BajoPeso;
    Archivo(Double peso, String Nombre, Double Estatura,Double PesoIdeal,Double SobrePeso,Double BajoPeso){
        this.Peso=peso;
        this.Nombre=Nombre;
        this.Estatura=Estatura;
        this.PesoIdeal=PesoIdeal;
        this.SobrePeso=SobrePeso;
        this.BajoPeso=BajoPeso;   
    }
    public Double getPeso() {
        return Peso;
    }
    public void setPeso(Double peso) {
        this.Peso = peso;
    }
    public String getNombre() {
        return Nombre;
    }
    public double getPesoIdeal() {
        return PesoIdeal;
    }
    public void setPesoIdeal(double PesoIdeal) {
        this.PesoIdeal = PesoIdeal;
    }
    public double getSobrePeso() {
        return SobrePeso;
    }
    public void setSobrePeso(double SobrePeso) {
        this.SobrePeso = SobrePeso;
    }
    public double getBajoPeso() {
        return BajoPeso;
    }
    public void setBajoPeso(double BajoPeso) {
        this.BajoPeso = BajoPeso;
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
        lista.add(new Archivo(getPeso(),getNombre(),getEstatura(),getPesoIdeal(),getSobrePeso(),getBajoPeso()));
    }
    static final String ArchName="Nutry.dat";
    static FileOutputStream TexSalida;
    static DataOutputStream BinSalida;  
    void almacenDisco() throws FileNotFoundException, IOException{
           TexSalida = new FileOutputStream(ArchName,true);
            BinSalida = new DataOutputStream(TexSalida);
            for(int i=0;i<lista.size();i++){
                JOptionPane.showMessageDialog(null, "Almacenando...");
                BinSalida.writeDouble(lista.get(i).getPeso());
                BinSalida.writeUTF(lista.get(i).getNombre());
                BinSalida.writeDouble(lista.get(i).getEstatura());
                BinSalida.writeDouble(lista.get(i).getPesoIdeal());
                BinSalida.writeDouble(lista.get(i).getSobrePeso());
                BinSalida.writeDouble(lista.get(i).getBajoPeso());
            }
            BinSalida.close();
            TexSalida.close();  
      }
       static FileInputStream TexEntrada; 
       static DataInputStream BinEntrada;   
       
    void MostrarDisco() throws FileNotFoundException, IOException {
           TexEntrada = new FileInputStream("Nutry.dat");
           BinEntrada = new DataInputStream(TexEntrada);
     System.out.println("archivo en disco es: " +ArchName);     
     while (BinEntrada.available()!=0){
          System.out.println(" "+BinEntrada.readDouble());
          System.out.println(" "+BinEntrada.readUTF());
          System.out.println(" "+BinEntrada.readDouble());
          System.out.println(" "+BinEntrada.readDouble());
          System.out.println(" "+BinEntrada.readDouble());
          System.out.println(" "+BinEntrada.readDouble());
          
          
     }
      BinEntrada.close();
      TexEntrada.close();
    }
}
