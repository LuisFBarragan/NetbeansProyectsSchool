package libreriad;

import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
//extends JFrame implements KeyListener
public class LibD  {
    boolean f=false;
    
    public boolean Key(char caracter){
         if ( (caracter<'0'|| caracter>'9') && (caracter!=KeyEvent.VK_BACK_SPACE) && (caracter!='.')) {
            Toolkit.getDefaultToolkit().beep(); 
            
         f=true;   
        }
         return f;
    }

   
}
