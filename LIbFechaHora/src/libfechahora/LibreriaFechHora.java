//LuisBarragan
package libfechahora;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;


public class LibreriaFechHora {
     
    /*
    private Date date;
    private DateFormat hour;
    private DateFormat fecha;
    private DateFormat hourfecha;
    
    public LibreriaFechHora(){
        date = new Date();
        hour = new SimpleDateFormat("HH:mm:ss");
        fecha = new SimpleDateFormat("dd/MM/yyyy");
        hourfecha = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        
    }
    
    public String Fecha(){
        return "fecha: "+fecha.format(date);
    }
    public String Hora(){
        return "Hora: "+hour.format(date);
    }
    public String HorFech(){
        return "Hora y Fecha: "+hourfecha.format(date);
    }
    
    */
    private Date date;
    public LibreriaFechHora(){
        
    date = new Date();
    }
    public void hora(){
        DateFormat hour=new SimpleDateFormat("HH:mm:ss");
        JOptionPane.showMessageDialog(null, ""+hour.format(date));
    }
    public void fech(){
    
        DateFormat fecha=new SimpleDateFormat("dd/MM/yyyy");
        JOptionPane.showMessageDialog(null, ""+fecha.format(date));
    }
    public void horafech(){
        //Date date = new Date();
        DateFormat hourfecha=new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
        JOptionPane.showMessageDialog(null, ""+hourfecha.format(date));
    }
    
}
