
package barraganluis;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener {
    ventana(){
        inControles();
        cosas();
    }
    private JLabel datos,name,edad,estatura,area;
    private JButton acep,clean;
    private JComboBox estado;
    private JRadioButton mar,infa,aer;
    private JTextField et1,et2,et3;
    private void inControles(){  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Reclutamiento ");        
        this.setMinimumSize(new Dimension(800,800));
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //this.getContentPane().setBackground(Color.lightGray);
   
    }
    private void cosas(){
        this.setLayout(null);
     datos=new JLabel("Ingrese sus datos");
     datos.setBounds(0, 0, 200, 10);
     this.add(datos);
     
     name=new JLabel();
     name.setText("nombre");
     name.setOpaque(false);
     name.setBounds(20, 30, 100, 20);
     this.add(name);
     edad=new JLabel("Edad");
     edad.setBounds(20, 50, 100, 20);
     this.add(edad);
     estatura=new JLabel("Estatura");
     estatura.setBounds(20, 70, 100, 20);
     this.add(estatura);
     
     et1=new JTextField();
     et1.setBounds(50, 30, 100, 20);
     et1.setText("hola");
     this.add(et1);
     et2=new JTextField();
     et2.setBounds(50, 50, 100, 20);
     this.add(et2);
     et3=new JTextField();
     et3.setBounds(50, 70,100 , 20);
     this.add(et3);
     
     acep=new JButton("Aceptar");
     acep.setBounds(89, 200, 80,80);
     acep.addActionListener(this);
     this.add(acep);
     clean=new JButton("Limpiar");
     clean.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
     this.add(clean);
     
     
    estado=new JComboBox();
    estado.setModel(new DefaultComboBoxModel(new String[]{"Afinacion","Frenos","Cambio de aceite"}));     
    estado.setBounds(150, 159, 89, 99);
  this.add(estado);
     
     mar=new JRadioButton("Marina");
     mar.setBounds(80, 300, 80, 80);
     this.add(mar);
     infa=new JRadioButton("Infanteria");
     infa.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
     this.add(infa);
     aer=new JRadioButton("Aereo");
     aer.setBounds(WIDTH, WIDTH, WIDTH, WIDTH);
     this.add(aer);
     
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        char et33;
        int i=Integer.parseInt(et3.getText());
        try{
            if (ae.getSource()==acep) {
                if(mar.isSelected()){
                    if (i<=170) {
                        System.out.println("");
                        JOptionPane.showMessageDialog(null, "No vas para la marina");
                    }
                }
            }
        }catch(Exception e){
            
        }
    }
    
}
