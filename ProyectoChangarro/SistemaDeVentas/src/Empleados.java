import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

public class Empleados extends javax.swing.JFrame {
DefaultTableModel modelo;
    
    public Empleados() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel() {
             @Override
             public boolean isCellEditable(int row, int colum) {
               if (colum == 0) {
                    return false;
                    //bloqueamos las columnas 
                }
                return true;
            }
        };
        
        modelo.addColumn("ID Empleado");
        modelo.addColumn("Nombre");
        modelo.addColumn("Dirección");
        modelo.addColumn("Teléfono");
        modelo.addColumn("Sueldo");
        modelo.addColumn("Contraseña");
        modelo.addColumn("User Name");
        modelo.addColumn("Check");
        this.jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.getTableHeader().setResizingAllowed(false);
        addCheckBox(7,jTable1);

        Buscar();
        butCancelar.setEnabled(false);
    }
  String[] vector = new String[7];
  String[] vectorR = new String[7];
  int x = 0;
  
  static Scanner leer = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/sistemaventas?useTimezone=true&serverTimezone=UTC&useSSL=false";
    String username = "root";
    String password = "12345";

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        butRegresa = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        fondofeo = new javax.swing.JLabel();
        txtUN = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtContra = new javax.swing.JTextField();
        txtDic = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtTel = new javax.swing.JTextField();
        txtMoney = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        butSave = new javax.swing.JButton();
        butDelete = new javax.swing.JButton();
        butMod = new javax.swing.JButton();
        butCancelar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(null);

        butRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        butRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(butRegresa);
        butRegresa.setBounds(0, 521, 50, 30);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shop-icon_34368.png"))); // NOI18N
        jPanel1.add(icono);
        icono.setBounds(0, 0, 64, 64);

        fondofeo.setBackground(new java.awt.Color(255, 35, 1));
        fondofeo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        fondofeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        fondofeo.setText("Gestión de Empleados");
        fondofeo.setOpaque(true);
        jPanel1.add(fondofeo);
        fondofeo.setBounds(0, 0, 730, 60);

        txtUN.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtUN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUNActionPerformed(evt);
            }
        });
        jPanel1.add(txtUN);
        txtUN.setBounds(360, 190, 130, 30);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 30);

        txtName.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtName);
        txtName.setBounds(100, 70, 320, 30);

        txtContra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtContra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraActionPerformed(evt);
            }
        });
        jPanel1.add(txtContra);
        txtContra.setBounds(120, 190, 110, 30);

        txtDic.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtDic);
        txtDic.setBounds(330, 130, 360, 30);

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("User Name:");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(270, 190, 90, 30);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dirección:");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(230, 130, 80, 30);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Télefono");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(450, 70, 70, 30);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Sueldo:");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(30, 130, 60, 30);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña:");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(20, 190, 90, 30);

        txtTel.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jPanel1.add(txtTel);
        txtTel.setBounds(530, 70, 180, 30);

        txtMoney.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtMoney.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoneyActionPerformed(evt);
            }
        });
        jPanel1.add(txtMoney);
        txtMoney.setBounds(100, 130, 90, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 700, 200);

        butSave.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        butSave.setText("Guardar");
        butSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butSaveActionPerformed(evt);
            }
        });
        jPanel1.add(butSave);
        butSave.setBounds(290, 240, 130, 40);

        butDelete.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash-can_115312.png"))); // NOI18N
        butDelete.setText("Eliminar");
        butDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(butDelete);
        butDelete.setBounds(130, 500, 140, 41);

        butMod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        butMod.setText("Modificar");
        butMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModActionPerformed(evt);
            }
        });
        jPanel1.add(butMod);
        butMod.setBounds(280, 500, 140, 40);

        butCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        butCancelar.setText("Cancelar");
        butCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarActionPerformed(evt);
            }
        });
        jPanel1.add(butCancelar);
        butCancelar.setBounds(430, 500, 140, 40);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        jPanel1.add(Fondo);
        Fondo.setBounds(0, 60, 730, 490);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 723, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents
 String parametro4 = "";
    int parametro3 = 0;
    String index2(String par, int par2){
    parametro4 = par;
    parametro3 = par2;
    
        return par;
    }
    private void butRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegresaActionPerformed
        opciones obj = new opciones();
        obj.index(parametro4,parametro3);
        obj.setVisible(true);
        dispose();

    }//GEN-LAST:event_butRegresaActionPerformed

    private void txtContraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraActionPerformed
       
    }//GEN-LAST:event_txtContraActionPerformed

    private void txtMoneyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoneyActionPerformed
       
    }//GEN-LAST:event_txtMoneyActionPerformed

    private void txtUNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUNActionPerformed
       
    }//GEN-LAST:event_txtUNActionPerformed

    private void butSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butSaveActionPerformed
    String SQL, name, dic,tel,contra,user;
        float pay;
        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT*FROM empleado");
            //Parametros de validación
             boolean isNumeric = txtTel.getText().matches("\\d*");
             boolean isNumeric2 = txtContra.getText().matches("\\d*");
             boolean isNumeric3 = txtMoney.getText().matches("\\d*(\\.\\d+)?");
             boolean isLetras = txtName.getText().matches("([A-Z][a-z]+\\s?)+");
            
            if (isNumeric && isNumeric2 && isNumeric3 && isLetras) {//Aqui se valida
            name = (txtName.getText());
            dic = (txtDic.getText());
            tel = txtTel.getText();
            pay = Float.parseFloat(txtMoney.getText());
            contra = (txtContra.getText());
            user = (txtUN.getText());
  
            SQL = "INSERT INTO empleado (Nombre,Direccion,Telefono,Sueldo,Contraseña,UserName)"
                    + "Values("
                    
                    + "\"" + name + "\","
                    + "\"" + dic+ "\","
                    + "\"" + tel + "\","
                    + "\"" + pay + "\","
                    + "\"" + contra + "\","
                    + "\"" + user + "\")";

            statement.execute(SQL);
            
            JOptionPane.showMessageDialog(null, "Se Agrego Trabajador correctamente");
            Buscar();
            
            txtName.setText("");
            txtDic.setText("");
            txtTel.setText("");
            txtMoney.setText("");
            txtContra.setText("");
            txtUN.setText("");
            }//if
            else{
                JOptionPane.showMessageDialog(this, "Algo no esta bien, revisa los campos nuevamente");
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }//GEN-LAST:event_butSaveActionPerformed

    private void butDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butDeleteActionPerformed
       String SQL;

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();

            if (jTable1.getSelectedRow() != -1) {
                String id = (String) modelo.getValueAt(jTable1.getSelectedRow(), 0);
                int id1 = Integer.parseInt(id);
                ResultSet rs = statement.executeQuery("SELECT*FROM empleado WHERE idEmpleado = " + id1);
                while (rs.next()) {
                    vectorR[0] = String.valueOf(rs.getInt("idEmpleado"));
                    vectorR[1] = rs.getString("Nombre");
                    vectorR[2] = rs.getString("Direccion");
                    vectorR[3] = rs.getString("Telefono");
                    vectorR[4] = Float.toString(rs.getFloat("Sueldo"));
                    vectorR[5] = rs.getString("Contraseña");
                    vectorR[6] = rs.getString("UserName");
                }//while

                SQL = "DELETE FROM empleado WHERE idEmpleado = " + id1 + "";

                statement.execute(SQL);
                Buscar();
                JOptionPane.showMessageDialog(null, "Se eliminó correctamente.");

                butCancelar.setEnabled(true);
                x=1;

            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fila.");
            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }//GEN-LAST:event_butDeleteActionPerformed

    private void butCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarActionPerformed
        String SQL = "";

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();

            int id2 = Integer.parseInt(vectorR[0]);
            String name = (vectorR[1]);
            String Dic = (vectorR[2]);
            String tel = (vectorR[3]);
            Float sueld = Float.parseFloat(vectorR[4]);
            String contra = (vectorR[5]);
            String user = (vectorR[6]);
            if (x == 1) {
                // Elimina
                 SQL = "INSERT INTO empleado (Nombre,Direccion,Telefono,Sueldo,Contraseña,UserName)"
                    + "Values("
                    + "\"" + name + "\","
                    + "\"" + Dic+ "\","
                    + "\"" + tel + "\","
                    + "\"" + sueld + "\","
                    + "\"" + contra + "\","
                    + "\"" + user + "\")";
                 x=0;
            }else if(x == 2){
                // Modifica
            SQL = "UPDATE empleado SET Nombre = '" + name + "',Direccion = '" + Dic
                    + "',Telefono = '" + tel + "', Sueldo = '" + sueld + "', Contraseña = '"
                    + contra + "', UserName= '" + user + "' WHERE idEmpleado = " + id2;
            x=0;
            }//ifelse
            statement.execute(SQL);
            Buscar();
            JOptionPane.showMessageDialog(null, "Se ha cancelado la operación.");
            butCancelar.setEnabled(false);
            

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
        
    }//GEN-LAST:event_butCancelarActionPerformed

    private void butModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModActionPerformed
        String SQL;

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            if (jTable1.getSelectedRow() != -1) {
                String id = (String) modelo.getValueAt(jTable1.getSelectedRow(), 0);
                String name1 = (String) modelo.getValueAt(jTable1.getSelectedRow(), 1);
                String dic = (String) modelo.getValueAt(jTable1.getSelectedRow(), 2);
                String tel1 = (String) modelo.getValueAt(jTable1.getSelectedRow(), 3);
                String sueld1 = (String) modelo.getValueAt(jTable1.getSelectedRow(), 4);
                String contra1 = (String) modelo.getValueAt(jTable1.getSelectedRow(), 5);
                String usern = (String) modelo.getValueAt(jTable1.getSelectedRow(), 6);
                
                boolean isNumeric = tel1.matches("\\d*");
             boolean isNumeric2 = contra1.matches("\\d*");
             boolean isNumeric3 = sueld1.matches("\\d*(\\.\\d+)?");
             boolean isLetras = name1.matches("([A-Z][a-z]+\\s?)+");
                if (isNumeric && isNumeric2 && isNumeric3 && isLetras) {
                    
                
                int id1 = Integer.parseInt(id);
                float sueld = Float.parseFloat(sueld1);
                
                ResultSet rs = statement.executeQuery("SELECT*FROM empleado WHERE idEmpleado = " + id1);
                while (rs.next()) {
                    vectorR[0] = String.valueOf(rs.getInt("idEmpleado"));
                    vectorR[1] = rs.getString("Nombre");
                    vectorR[2] = rs.getString("Direccion");
                    vectorR[3] = rs.getString("Telefono");
                    vectorR[4] = Float.toString(rs.getFloat("Sueldo"));
                    vectorR[5] = rs.getString("Contraseña");
                    vectorR[6] = rs.getString("UserName");
                }

            SQL = "UPDATE empleado SET Nombre = '" + name1 + "',Direccion = '" + dic
                    + "',Telefono = '" + tel1 + "', Sueldo = '" + sueld1 + "', Contraseña = '"
                    + contra1 + "', UserName= '" + usern + "' WHERE idEmpleado = " + id1;
            
            

            statement.execute(SQL);
            Buscar();
            JOptionPane.showMessageDialog(null, "Se ha modificado correctamente.");
            butCancelar.setEnabled(true);
            x=2;
            }else{
                JOptionPane.showMessageDialog(this, "Algo no está bien, se metio valores no validos, revisa los campos de nuevo");
                Buscar();
                }
        }//if 1
            else{
                JOptionPane.showMessageDialog(this, "Favor de seleccionar una fila.");
            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }

    }//GEN-LAST:event_butModActionPerformed

    public void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }
     public void Buscar() {
        modelo.getDataVector().removeAllElements();//Limpia la tabla
        jTable1.updateUI();

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT*FROM empleado");
            while (rs.next()) {
                vector[0] = String.valueOf(rs.getInt("idEmpleado"));
                vector[1] = rs.getString("Nombre");
                vector[2] = rs.getString("Direccion");
                vector[3] = rs.getString("Telefono");
                vector[4] = Float.toString(rs.getFloat("Sueldo"));
                vector[5] = rs.getString("Contraseña");
                vector[6] = rs.getString("UserName");
                modelo.addRow(vector);

            }//while
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
     }    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton butCancelar;
    private javax.swing.JButton butDelete;
    private javax.swing.JButton butMod;
    private javax.swing.JButton butRegresa;
    private javax.swing.JButton butSave;
    private javax.swing.JLabel fondofeo;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtContra;
    private javax.swing.JTextField txtDic;
    private javax.swing.JTextField txtMoney;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTel;
    private javax.swing.JTextField txtUN;
    // End of variables declaration//GEN-END:variables
}
