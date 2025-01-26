
package hotel2;

import java.util.ArrayList;
import java.util.Scanner;


public class recepcionista extends Habitacion {
  String namerep;
  recepcionista(String namerep,int nhab, String estado, String nombre, String telefono, String domicilio){
      super(nhab, estado,nombre, telefono, domicilio);
      this.namerep=namerep;
  }

    public String getNamerep() {
        return namerep;
    }
    public void setNamerep(String namerep) {
        this.namerep = namerep;
    }
    
    ArrayList<recepcionista> rec=new ArrayList();
    Scanner read=new Scanner (System.in);
    
    void registrarRec(){
        rec.add(new recepcionista(getNamerep(),getNhab(),getEstado(), getNombre(), getTelefono(), getDomicilio()));
    }
    void mostrarRec(){
        for (int i = 0; i < rec.size(); i++) {
            System.out.println(" "+rec.get(i).getNamerep()+" "+rec.get(i).getNombre()+" "+rec.get(i).getTelefono()+" "+
            rec.get(i).getDomicilio());
        }
    }
}
