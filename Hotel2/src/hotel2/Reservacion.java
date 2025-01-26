
package hotel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Reservacion extends recepcionista{
     int cuenta;
     String entrada;
     String salida;  
    public  Reservacion( int cuenta, String entrada, String salida,String namerep, 
            int nhab, String estado, String nombre, String telefono, String domicilio){
      super(namerep,nhab,estado,nombre, telefono,domicilio);
        this.cuenta=cuenta;
        this.entrada=entrada;
        this.salida=salida;
}
    public void setCuenta(int cuenta) {
        this.cuenta = cuenta;
    }
 
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setSalida(String salida) {
        this.salida = salida;
    }

    public int getCuenta() {
        return cuenta;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getSalida() {
        return salida;
    }
     
    Scanner read=new Scanner(System.in);
      ArrayList<Reservacion> rev=new ArrayList();
      
      void registrarRev(){
          rev.add(new Reservacion(getCuenta(),getEntrada(),getSalida(),getNamerep(),getNhab(),getEstado(),getNombre(),getTelefono(),getDomicilio()));
      }
      void mostrarRev(){
          for (int i = 0; i < rev.size(); i++) {
  System.out.println("cuenta: "+rev.get(i).getCuenta()+" nombre: "+rev.get(i).getNombre()+" habitacion "+rev.get(i).getNhab()+
  " entrada: "+rev.get(i).getEntrada()+ " salida "+rev.get(i).getSalida()+" telefono: "+rev.get(i).getTelefono()+" domicilio: "+rev.get(i).getDomicilio()+
 " atendio: "+rev.get(i).getNamerep());
          }
      }
      void removeRev(int cuentacan){
          for (int i = 0; i < rev.size(); i++) {
              if(cuentacan==rev.get(i).getCuenta()){
               rev.remove(i);
                  System.out.println("se elemino");
              }  
              else{
                  System.out.println("no se encontro registro");
              }
          }
      }
}
