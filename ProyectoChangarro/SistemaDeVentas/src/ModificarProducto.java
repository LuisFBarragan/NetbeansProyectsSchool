import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author luisf
 */
public class ModificarProducto extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form ModificarProducto
     */
    public ModificarProducto() {
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

        modelo.addColumn("id");
        modelo.addColumn("Precio venta");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Stock ");
        modelo.addColumn("Stock minimo");
        modelo.addColumn("Tipo");
        modelo.addColumn("Costo");
        modelo.addColumn("Check");
        this.tabla.setModel(modelo);

        tabla.getTableHeader().setResizingAllowed(false);
        tabla.getTableHeader().setReorderingAllowed(false);// evita que se muevan las columnas de la tabla

        addCheckBox(7, tabla);

        jButCancelar.setEnabled(false);
        Buscar();

    }
    String[] vector = new String[7];
    String[] vectorR = new String[7];

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButGuardar = new javax.swing.JButton();
        jButCancelar = new javax.swing.JButton();
        jButRegresa = new javax.swing.JButton();
        icono = new javax.swing.JLabel();
        jbutInfo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modificar producto");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Código del producto:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 150, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 160, 30));

        jButBuscar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vidrio-de-aumento.png"))); // NOI18N
        jButBuscar.setText("Buscar");
        jButBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(jButBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, 120, 30));

        tabla.setModel(new javax.swing.table.DefaultTableModel(
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
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 720, 200));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        jButGuardar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/salvar.png"))); // NOI18N
        jButGuardar.setText("Guardar");
        jButGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGuardarActionPerformed(evt);
            }
        });

        jButCancelar.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        jButCancelar.setText("Cancelar");
        jButCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButGuardar)
                .addGap(18, 18, 18)
                .addComponent(jButCancelar)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButGuardar)
                    .addComponent(jButCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, -1, 60));

        jButRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        jButRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(jButRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 50, 30));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shop-icon_34368.png"))); // NOI18N
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jbutInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion-de-la-informacion.png"))); // NOI18N
        jbutInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutInfoActionPerformed(evt);
            }
        });
        jPanel1.add(jbutInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 40, 30));

        Fondo.setBackground(new java.awt.Color(255, 35, 1));
        Fondo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setText("   Modificar produto");
        Fondo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Fondo.setOpaque(true);
        jPanel1.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 50));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents
     String parametro4 = "";
    int parametro3 = 0;

    String index2(String par, int par2) {
        parametro4 = par;
        parametro3 = par2;

        return par;
    }

    static Scanner leer = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/sistemaventas?useTimezone=true&serverTimezone=UTC&useSSL=false";
    String username = "root";
    String password = "12345";

    private void jButRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButRegresaActionPerformed
        opciones obj = new opciones();
        obj.index(parametro4, parametro3);
        obj.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButRegresaActionPerformed

    private void jButBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButBuscarActionPerformed
        Buscar();
    }//GEN-LAST:event_jButBuscarActionPerformed

    private void jButGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGuardarActionPerformed
        String SQL;

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();

            if (tabla.getSelectedRow() != -1) {
                String id = (String) modelo.getValueAt(tabla.getSelectedRow(), 0);
                String prev = (String) modelo.getValueAt(tabla.getSelectedRow(), 1);
                String desc = (String) modelo.getValueAt(tabla.getSelectedRow(), 2);
                String stock = (String) modelo.getValueAt(tabla.getSelectedRow(), 3);
                String stockm = (String) modelo.getValueAt(tabla.getSelectedRow(), 4);
                String tipo = (String) modelo.getValueAt(tabla.getSelectedRow(), 5);
                String cost = (String) modelo.getValueAt(tabla.getSelectedRow(), 6);
                
                       
           boolean isNumeric2 = stock.matches("\\d*");           
           boolean isNumeric3 = stockm.matches("\\d*");           
           boolean isNumeric4 = prev.matches("\\d*(\\.\\d+)?");           
           boolean isNumeric5 = cost.matches("\\d*(\\.\\d+)?");
                
                if (isNumeric2 && isNumeric3 && isNumeric4 && isNumeric5) {
                    
                
                int id1 = Integer.parseInt(id);
                float prev1 = Float.parseFloat(prev);
                int stock1 = Integer.parseInt(stock);
                int stockm1 = Integer.parseInt(stockm);
                float cost1 = Float.parseFloat(cost);

                ResultSet rs = statement.executeQuery("SELECT*FROM productos WHERE idproductos = " + id1);
                while (rs.next()) {
                    vectorR[0] = String.valueOf(rs.getInt("idproductos"));
                    vectorR[1] = Float.toString(rs.getFloat("PrecioVenta"));
                    vectorR[2] = rs.getString("Descripcion");
                    vectorR[3] = String.valueOf(rs.getInt("Stock"));
                    vectorR[4] = String.valueOf(rs.getInt("StockMinimo"));
                    vectorR[5] = rs.getString("TipoProducto");
                    vectorR[6] = String.valueOf(rs.getInt("Costo"));
                }//while

                SQL = "UPDATE productos SET PrecioVenta = '" + prev1 + "',Descripcion = '" + desc
                        + "',Stock = '" + stock1 + "', StockMinimo = '" + stockm1 + "', TipoProducto = '"
                        + tipo + "', Costo = '" + cost1 + "' WHERE idproductos = " + id1;

                statement.execute(SQL);
                Buscar();
                jButCancelar.setEnabled(true);
                JOptionPane.showMessageDialog(null, "Se modificó correctamente.");
                }else{
                    JOptionPane.showMessageDialog(null, "Uno o más campos tienen valores invalidos");
                    Buscar();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Selecciona una fila.");
            }

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }

    }//GEN-LAST:event_jButGuardarActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked

        if (tabla.getSelectedColumn() == 0 && evt.getClickCount() == 2) {
            JOptionPane.showMessageDialog(null, "No se puede modificar este campo");
        }

    }//GEN-LAST:event_tablaMouseClicked

    private void jButCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCancelarActionPerformed
        String SQL;

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();

            int id2 = Integer.parseInt(vectorR[0]);
            float prev2 = Float.parseFloat(vectorR[1]);
            String desc2 = (vectorR[2]);
            int stock2 = Integer.parseInt(vectorR[3]);
            int stockm2 = Integer.parseInt(vectorR[4]);
            String tipo2 = (vectorR[5]);
            float cost2 = Float.parseFloat(vectorR[6]);

            SQL = "UPDATE productos SET PrecioVenta = '" + prev2 + "',Descripcion = '" + desc2
                    + "',Stock = '" + stock2 + "', StockMinimo = '" + stockm2 + "', TipoProducto = '"
                    + tipo2 + "', Costo = '" + cost2 + "' WHERE idproductos = " + id2;

            statement.execute(SQL);
            Buscar();
            JOptionPane.showMessageDialog(null, "Se ha cancelado la operación.");
            jButCancelar.setEnabled(false);

        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }//GEN-LAST:event_jButCancelarActionPerformed

    private void jbutInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutInfoActionPerformed
        JOptionPane.showMessageDialog(null, "En esta ventana se va a modificar los productos, para esto: \n"
                + "1.- Selecciona una fila del producto que quieras modifcar y da doble click en el campo deseado. \n "
                + "2.- Después de que modificar dicho producto seleccina el check box y dale click. \n"
                + "3.- Ahora da click en el botón guardar."
                + "\n"
                + "En caso de querer cancelar la modificación da click en el botón cancelar.");

    }//GEN-LAST:event_jbutInfoActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarProducto().setVisible(true);
            }
        });
    }

    public void addCheckBox(int column, JTable table) {
        TableColumn tc = table.getColumnModel().getColumn(column);
        tc.setCellEditor(table.getDefaultEditor(Boolean.class));
        tc.setCellRenderer(table.getDefaultRenderer(Boolean.class));
    }

    public void Buscar() {
        String busca = jTextField1.getText();
        modelo.getDataVector().removeAllElements();//Limpia la tabla
        tabla.updateUI();

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            ResultSet rs = statement.executeQuery("SELECT*FROM productos WHERE descripcion LIKE '%" + busca + "%'");
            while (rs.next()) {
                vector[0] = String.valueOf(rs.getInt("idproductos"));
                vector[1] = Float.toString(rs.getFloat("PrecioVenta"));
                vector[2] = rs.getString("Descripcion");
                vector[3] = String.valueOf(rs.getInt("Stock"));
                vector[4] = String.valueOf(rs.getInt("StockMinimo"));
                vector[5] = rs.getString("TipoProducto");
                vector[6] = String.valueOf(rs.getInt("Costo"));
                modelo.addRow(vector);
            }//while
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JButton jButBuscar;
    private javax.swing.JButton jButCancelar;
    private javax.swing.JButton jButGuardar;
    private javax.swing.JButton jButRegresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton jbutInfo;
    private javax.swing.JTable tabla;
    // End of variables declaration//GEN-END:variables
}
