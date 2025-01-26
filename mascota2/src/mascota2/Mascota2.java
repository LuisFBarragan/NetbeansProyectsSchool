package mascota2;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;
import java.util.ArrayList;
class Historial{
   short codigo;
   String enfermedad;

    public short getCodigo() {
        return codigo;
    }

    public void setCodigo(short codigo) {
        this.codigo = codigo;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

    public void setEnfermedad(String enfermedad) {
        this.enfermedad = enfermedad;
    }
   
}
public class Mascota2 extends Historial{
    String raza;
    String nombre;
    double peso;
    long edad;
    float estatura;
    char sexo;
    
    Mascota2(String nombre,String raza,double peso,long edad,float estatura,char sexo,short codigo,String enfermedad){
        this.raza=raza;
        this.peso=peso;
        this.edad=edad;
        this.nombre=nombre;
        this.codigo=codigo;
        this.estatura=estatura;
        this.sexo=sexo;
        this.enfermedad=enfermedad;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public long getEdad() {
        return edad;
    }

    public void setEdad(long edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    ArrayList<Mascota2> lista=new ArrayList();
    void almacenar(){
        lista.add(new Mascota2(getNombre(),getRaza(),getPeso(),getEdad(),getEstatura(),getSexo(),getCodigo(),getEnfermedad()));
    }
    void mostrar(){
        System.out.println("DATOS ALMACENADOS");
        for (int i = 0; i <lista.size(); i++) {
            
        }
    }
    
static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) {

    }
    
}
