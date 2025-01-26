
package hotel2;

import java.util.ArrayList;
import java.util.Scanner;

public class Habitacion extends cliente {
      int nhab;
      String estado;
      Habitacion(int nhab, String estado, String nombre, String telefono, String domicilio){
        super(nombre, telefono, domicilio);
        this.nhab=nhab;
        this.estado=estado;
       }    

    public void setNhab(int nhab) {
        this.nhab = nhab;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getNhab() {
        return nhab;
    }

    public String getEstado() {
        return estado;
    }
      Scanner read=new Scanner(System.in);
      ArrayList<Habitacion> hab=new ArrayList();
      void registrarHab(){
          hab.add(new Habitacion(getNhab(),getEstado(), getNombre(), getTelefono(), getDomicilio()));
      }
      void mostrarHab(){
          for (int i = 0; i < hab.size(); i++) {
              System.out.println(" "+hab.get(i).getNhab()+" "+
              hab.get(i).getEstado());
          }
      }
      int asignarHab(){
           int habit=0;
       for (int i = 0; i < hab.size(); i++) {
            if (hab.get(i).getEstado()!="0"){  
               habit=i;
               hab.get(i).estado="0"; 
              break;
            }
      }
       return habit;
}
      void mostaraOcupadas(){
          for (int i = 0; i <hab.size(); i++) {
              if(hab.get(i).getEstado().charAt(0)=='0'){
                  System.out.println(" "+hab.get(i).getNhab()+" "+hab.get(i).getEstado());
              }
              
          }
      }
}
