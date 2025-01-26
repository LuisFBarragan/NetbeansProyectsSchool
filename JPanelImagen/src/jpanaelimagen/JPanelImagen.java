//panel que permita agregar fondo
package jpanaelimagen;

import java.awt.Graphics;
import java.io.File;
import java.io.Serializable;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
//construc sin parametros
//atributo priv y acce por get y set nomenclatura estandar
//Serializable
public class JPanelImagen extends JPanel implements Serializable{
    private File rutaImagen;
    public JPanelImagen(){}

    public File getRutaImagen() {
        return rutaImagen;
    }

    public void setRutaImagen(File rutaImagen) {
        this.rutaImagen = rutaImagen;
    }

    @Override
    protected void paintComponent(Graphics grphcs) {
        super.paintComponent(grphcs);
        if (rutaImagen!=null && rutaImagen.exists()) {
            ImageIcon imagenIcono = new ImageIcon(rutaImagen.getAbsolutePath());
            grphcs.drawImage(imagenIcono.getImage(), 0, 0, null);
        }
    }
    
}
