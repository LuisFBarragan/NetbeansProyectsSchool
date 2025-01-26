
package hotel2;

import java.util.ArrayList;
import java.util.Scanner;

public class cliente {
String nombre;
String telefono;
String domicilio;
public  cliente(String nombre, String telefono, String domicilio){
    this.nombre=nombre;
    this.telefono=telefono;
    this.domicilio=domicilio;
}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }
    
    Scanner read=new Scanner(System.in);
      ArrayList<cliente> hab=new ArrayList();
      
      void registrarCte(){
          hab.add(new cliente(getNombre(),getTelefono(),getDomicilio()));
      }
      void mostrarCte(){
          for (int i = 0; i <hab.size(); i++) {   
          System.out.println(" "+hab.get(i).getNombre()+" "+
          hab.get(i).getTelefono()+" "+hab.get(i).getDomicilio());
      }
      }
      
}
