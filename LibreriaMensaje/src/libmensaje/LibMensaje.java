//Clase LibMensaje
package libmensaje;

import javax.swing.JOptionPane;

public class LibMensaje {
    //Metodo estatico (static)
    public static void saludoPersonalizado(String nombre){
        //Mensaje de saludo
        System.out.println("Hola: "+nombre);
        
        //ventana grafica predeterminda
        JOptionPane.showMessageDialog(null, "Hola: "+nombre);
        
    }
}
