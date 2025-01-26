//ventana Grafica
package ventana;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import libreriad.LibD;
// Heredo de la clase JFrame
public class ProyVentana extends JFrame implements ActionListener,KeyListener{
 

    // Datos miembros de la clase Ventana
    private JLabel et1,et2,et3,et4,et5,et6;
    private JTextField txtNomServicio, txtCosto,txtIva,txtTotal;
    private JButton butCal,butClean;
    private JComboBox comServicio;
    private JRadioButton rv5,rb10,rb20,rb0;
    private ButtonGroup bgDescuento;
   
    // Métodos de la clase ventana
    //Constructor
    public ProyVentana(){
      //llamar al método inicializar
      //LibMensaje.saludoPersonalizado("LUIS");
      
        
      inicializar();
      iniControles();
   }
   
    //Método de inicialización de la ventana
    private void inicializar(){
        //Colocar valores iniciales a la ventana
        this.setSize(400, 400);
        //Cierra el proceso
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Coloca un titulo a la ventana
        this.setTitle("PRIMER VENTANA GRÁFICA");
        //tamaño minimo de la ventana
        this.setMinimumSize(new Dimension(200,200));
        //Difinir un tamaño fijo de la ventana
        this.setResizable(false);
        //centrar la ventana
        this.setLocationRelativeTo(null);
        //Cambiar el color a la ventana
        this.getContentPane().setBackground(Color.lightGray);
         
    }
   
    private void iniControles(){
        this.setLayout(null);
        //Etiquetas
        //Construir la etiqueta
        et1=new JLabel();
        //Definir los limites de la etiqueta
        et1.setBounds(50, 20, 200, 20);
        et1.setText("Nombre del servicio: ");
        //
        this.add(et1);
       
        //uso de combo box
        comServicio=new JComboBox();
        comServicio.setModel(new DefaultComboBoxModel(new String[]{"Afinacion","Frenos","Cambio de aceite"}));
        comServicio.setBounds(170, 20, 100, 20);
        this.add(comServicio);
        // objeto de texto
        // txtNomServicio=new JTextField();
        //txtNomServicio.setBounds(170, 20, 100, 20);
        //this.add(txtNomServicio);
       
        // costo de servicio
        et2=new JLabel();
        et2.setBounds(60, 40, 200, 20);
        et2.setText("Costo de servicio $");
        this.add(et2);
       
        txtCosto=new JTextField();
        txtCosto.setBounds(170, 40, 100, 20);
        this.add(txtCosto);
        txtCosto.addKeyListener(this);//Agregar un key listener
       
        //Iva
        et3=new JLabel();
        et3.setBounds(144, 60, 100, 20);
        et3.setText("Iva $");
        this.add(et3);
       
        txtIva=new JTextField();
        txtIva.setEnabled(false);
        txtIva.setBounds(170, 60, 100, 20);
        this.add( txtIva);
       
        //Total a pagar
        et4=new JLabel();
        et4.setBounds(85, 80, 200, 20);
        et4.setText("Total a pagar $");
        this.add(et4);
       
        txtTotal=new JTextField();
        txtTotal.setEnabled(false);
        txtTotal.setBounds(170, 80, 100, 20);
        this.add(txtTotal);
       
        //Botón calcular
        butCal = new JButton("Calcular");
        butCal.setBounds(70, 140, 100, 30);    
        this.add(butCal);
        butCal.addActionListener(this);//Colocar un escuchador
        
        butClean = new JButton("Limpiar");
        butClean.setBounds(200, 140, 100, 30);
        this.add(butClean);
        butClean.addActionListener(this);
       
        rb0 = new JRadioButton("0%",false);
        rb0.setBounds(40, 200, 43, 30);
        this.add(rb0);
       
        rv5 = new JRadioButton("5%",false);
        rv5.setBounds(90, 200, 43, 30);
        this.add(rv5);
       
        rb10 = new JRadioButton("10%",false);
        rb10.setBounds(140, 200, 50, 30);
        this.add(rb10);
       
        rb20 = new JRadioButton("20%",false);
        rb20.setBounds(200, 200, 50, 30);
        this.add(rb20);
       
        bgDescuento = new ButtonGroup();
        bgDescuento.add(rb0);
        bgDescuento.add(rv5);
        bgDescuento.add(rb10);
        bgDescuento.add(rb20);
       
        et5 = new JLabel();
        et5.setBounds(300, 30, 80, 20);
        et5.setText("Descuento");
        et5.setBackground(Color.white);
        et5.setOpaque(true);
        this.add(et5);
       
        et6 = new JLabel();
        et6.setBounds(300, 60, 80, 20);
        et6.setBackground(Color.white);
        et6.setText("");
        et6.setOpaque(true);
        this.add(et6);
       
    }
   
    @Override
    public void actionPerformed(ActionEvent ae) {
        double costo=0, iva=0,total=0,Totaldesc=0,Desc=0;
        
        if (ae.getSource()==butClean) {
            JOptionPane.showMessageDialog(null, "Se limpio correctamente");
            et6.setText("");
            txtCosto.setText("");
            txtCosto.setText("");
            txtTotal.setText("");
            txtIva.setText("");
            
        }
        
        if(ae.getSource()==butCal){
        try{if (et2.getText().equals("")) {
                JOptionPane.showMessageDialog(null,"Ingresa Datos ");}
        
            //variables de trabajo
            costo=Double.valueOf(txtCosto.getText());
            iva=costo*0.16;
            total=costo+iva;
            txtIva.setDisabledTextColor(Color.BLACK);
            txtTotal.setDisabledTextColor(Color.BLACK);
            txtIva.setText(Double.toString(iva));
            if (rb0.isSelected()) {
                Desc=costo*0;
                et6.setText(Double.toString(Desc));
                txtTotal.setText(Double.toString(total));
            }else if (rv5.isSelected()) {
                Desc=costo*.05;
                total=costo-Desc+iva;
                et6.setText(Double.toString(Desc));
                txtTotal.setText(Double.toString(total));
            }else if (rb10.isSelected()) {
                Desc=costo*.10;
                total=costo-Desc+iva;
                et6.setText(Double.toString(Desc));
                txtTotal.setText(Double.toString(total));
            }else if (rb20.isSelected()) {
                Desc=costo*.20;
                total=costo-Desc+iva;
                et6.setText(Double.toString(Desc));
                txtTotal.setText(Double.toString(total));
            }else{
                JOptionPane.showMessageDialog(null, "Elije una opcion");
            }
            
            }catch(NumberFormatException t){
               JOptionPane.showMessageDialog(null, "Ingresa valores numericos "+t);
        }              
     }    
   }

    @Override
    public void keyTyped(KeyEvent ke) {
        
        char caracter = ke.getKeyChar();
        LibD obj=new LibD();
        if (obj.Key(caracter)) {
            ke.consume();
        }

       
    }

    @Override
    public void keyPressed(KeyEvent ke) {
        //JOptionPane.showMessageDialog(null,"KeyPressed");
    }

    @Override
    public void keyReleased(KeyEvent ke) {
        //JOptionPane.showMessageDialog(null,"KeyReleased");
    }
}