import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VentasInventario extends javax.swing.JFrame {

    static Scanner leer = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/sistemaventas?useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true&useSSL=false";
    String username = "root";
    String password = "12345";

    public VentasInventario() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel2Icono = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        jButtonLogin = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        Cargo = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(420, 620));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(0, 51, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cancelar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 30, -1));

        jLabel2Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usuario3.png"))); // NOI18N
        getContentPane().add(jLabel2Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, 260, 260));

        jLabel3.setBackground(new java.awt.Color(0, 102, 153));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Username :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 102, 153));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password :");
        jLabel4.setToolTipText("");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jTextFieldUsuario.setBackground(new java.awt.Color(0, 51, 102));
        jTextFieldUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextFieldUsuario.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jTextFieldUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 400, 190, -1));

        jButtonLogin.setBackground(new java.awt.Color(153, 153, 0));
        jButtonLogin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButtonLogin.setText("Login");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 550, -1, -1));

        jPasswordField1.setBackground(new java.awt.Color(0, 51, 102));
        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 190, -1));

        Cargo.setBackground(new java.awt.Color(0, 102, 153));
        Cargo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Cargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado", "Gerente" }));
        Cargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargoActionPerformed(evt);
            }
        });
        getContentPane().add(Cargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 420, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
        opciones op = new opciones();
        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT*FROM gerente");

            int cont = 0;
            if (Cargo.getSelectedIndex() == 1) {
                while (rs.next()) {
                    int idGerente = rs.getInt("idGerente");
                    String nombre = rs.getString("Nombre");
                    String contra = rs.getString("Contraseña");
                    String user = rs.getString("UserName");
                    String pass = "";
                    char[] pass1 = jPasswordField1.getPassword();
                    for (int i = 0; i < pass1.length; i++) {
                        pass += pass1[i];
                    }

                    if ((user.equals(jTextFieldUsuario.getText())) && (contra.equals(pass))) {
                        JOptionPane.showMessageDialog(this, "Bienvenido Gerente: " + nombre);
                        cont = 1;
                        op.index(user, 1);
                        SistemaVentas objven = new SistemaVentas();
                        objven.index2(user, 1);
                        op.setVisible(true);
                        dispose();
                    }//if
                }//while
                if (cont == 0) {
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña no valido");
                }
            }
            ResultSet rs1 = statement.executeQuery("SELECT*FROM empleado");
            if (Cargo.getSelectedIndex() == 0) {
                while (rs1.next()) {
                    int idEmpleado = rs1.getInt("idEmpleado");
                    String nombre = rs1.getString("Nombre");
                    String contra = rs1.getString("Contraseña");
                    String user = rs1.getString("UserName");
                    String pass = "";
                    char[] pass1 = jPasswordField1.getPassword();
                    for (int i = 0; i < pass1.length; i++) {
                        pass += pass1[i];
                    }

                    if ((user.equals(jTextFieldUsuario.getText())) && (contra.equals(pass))) {
                        JOptionPane.showMessageDialog(this, "Bienvenido Empleado: " + nombre);
                        cont = 1;
                        SistemaVentas objven = new SistemaVentas();
                        objven.setVisible(true);
                        objven.index2(user, 0);
                        dispose();
                    }
                }
                if (cont == 0) {
                    JOptionPane.showMessageDialog(this, "Usuario o Contraseña no valido");
                }
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error de conexion" + ex);
        }
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void CargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CargoActionPerformed

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
            java.util.logging.Logger.getLogger(VentasInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentasInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentasInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentasInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentasInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cargo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2Icono;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
