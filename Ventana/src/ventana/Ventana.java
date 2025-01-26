package ventana;

import libmensaje.LibMensaje;
import libfechahora.LibreriaFechHora;
public class Ventana {
   
    public static void main(String[] args) {
       
        ProyVentana v=new ProyVentana();
        v.setVisible(true);
        LibMensaje.saludoPersonalizado("LUIS");
        LibreriaFechHora obj=new LibreriaFechHora();
        obj.hora(); obj.fech(); obj.horafech();
    
    }
    
}
