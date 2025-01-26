import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class SistemaVentas extends javax.swing.JFrame {

    DefaultTableModel modelo;
    DefaultTableModel modelo2;

    public SistemaVentas() {
        initComponents();
        this.setLocationRelativeTo(null);
        modelo = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
                //bloqueamos las toda la tabla 
            }
        };
        modelo.addColumn("id Venta");
        modelo.addColumn("Precio");
        modelo.addColumn("Descripción");
        modelo.addColumn("Stock");
        this.jTable1.setModel(modelo);
        jTable1.getTableHeader().setReorderingAllowed(false);

        modelo2 = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int colum) {
                return false;
                //bloqueamos las toda la tabla 
            }
        };
        modelo2.addColumn("id Venta");
        modelo2.addColumn("Precio");
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Stock");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("SubTotal");
        this.jTable2.setModel(modelo2);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jTable2.getTableHeader().setResizingAllowed(false);
        acctionKey();
        
        txtTotal.setEditable(false);
        butQuitar.setEnabled(false);
        butCancelarV.setEnabled(false);
        butImprimir.setEnabled(false);
    }
    static Scanner leer = new Scanner(System.in);
    String url = "jdbc:mysql://localhost:3306/sistemaventas?useTimezone=true&serverTimezone=UTC&useSSL=false";
    String username = "root";
    String password = "12345";

    String[] vector = new String[4];
    String[] vectorR = new String[6];

    String parametro4 = "";
    int parametro3 = 0;

    String index2(String par, int par2) {
        parametro4 = par;
        parametro3 = par2;

        return par;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtCodigo = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        icono = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        butRealizarV = new javax.swing.JButton();
        butCancelarV = new javax.swing.JButton();
        butImprimir = new javax.swing.JButton();
        butRegresa = new javax.swing.JButton();
        butInfo = new javax.swing.JButton();
        txtTotal = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        butRegistrar = new javax.swing.JButton();
        butQuitar = new javax.swing.JButton();
        jLabel4Toto = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4Toto1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ventas");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCodigo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 102, 102));
        txtCodigo.setMaximumSize(new java.awt.Dimension(6, 20));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        jPanel1.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 60, 170, 30));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable2);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 810, 190));

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shop-icon_34368.png"))); // NOI18N
        jPanel1.add(icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 50));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        butRealizarV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        butRealizarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/venta-al-por-mayor.png"))); // NOI18N
        butRealizarV.setText("Realizar venta");
        butRealizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRealizarVActionPerformed(evt);
            }
        });

        butCancelarV.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        butCancelarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        butCancelarV.setText("Cancelar venta");
        butCancelarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarVActionPerformed(evt);
            }
        });

        butImprimir.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        butImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/impresora.png"))); // NOI18N
        butImprimir.setText("Imprimir");
        butImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(butRealizarV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butCancelarV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(butImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(butRealizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butCancelarV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(butImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, -1, 60));

        butRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        butRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(butRegresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 490, 40, 30));

        butInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gestion-de-la-informacion.png"))); // NOI18N
        butInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butInfoActionPerformed(evt);
            }
        });
        jPanel1.add(butInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 10, 40, 30));

        txtTotal.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        txtTotal.setForeground(new java.awt.Color(0, 102, 102));
        txtTotal.setMaximumSize(new java.awt.Dimension(6, 20));
        jPanel1.add(txtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 110, 30));

        jComboBox1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Código", "Descripción" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 120, 30));

        butRegistrar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        butRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/verificar.png"))); // NOI18N
        butRegistrar.setText("Registrar");
        butRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegistrarActionPerformed(evt);
            }
        });
        jPanel1.add(butRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 120, 30));

        butQuitar.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        butQuitar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/boton-eliminar.png"))); // NOI18N
        butQuitar.setText("Quitar");
        butQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butQuitarActionPerformed(evt);
            }
        });
        jPanel1.add(butQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 120, 30));

        jLabel4Toto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4Toto.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4Toto.setText("Total $:");
        jPanel1.add(jLabel4Toto, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 50, 30));

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
        jScrollPane2.setViewportView(jTable1);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 690, 90));

        jLabel4Toto1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4Toto1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4Toto1.setText("Tipo de búsqueda:");
        jPanel1.add(jLabel4Toto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 130, 30));

        jLabel4.setBackground(new java.awt.Color(255, 35, 1));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 840, -1));

        jLabel3.setBackground(new java.awt.Color(255, 35, 1));
        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Sistema de ventas");
        jLabel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 50));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        jPanel1.add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 530));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void acctionKey() {
        KeyListener l = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent ke) {
            }

            @Override
            public void keyPressed(KeyEvent ke) {

            }//presed

            @Override
            public void keyReleased(KeyEvent ke) {
                String busca = txtCodigo.getText();
                String campo = "";
                if (jComboBox1.getSelectedIndex() == 0) {
                    campo = "idproductos";
                } else {
                    campo = "descripcion";
                }
                modelo.getDataVector().removeAllElements();//Limpia la tabla
                jTable1.updateUI();

                try {
                    Connection conexion = DriverManager.getConnection(url, username, password);
                    Statement statement = conexion.createStatement();
                    ResultSet rs = statement.executeQuery("SELECT*FROM productos WHERE " + campo + " LIKE '%" + busca + "%'");
                    while (rs.next()) {
                        vector[0] = String.valueOf(rs.getInt("idproductos"));
                        vector[1] = Float.toString(rs.getFloat("PrecioVenta"));
                        vector[2] = rs.getString("Descripcion");
                        vector[3] = String.valueOf(rs.getInt("Stock"));
                        modelo.addRow(vector);
                    }//while
                } catch (SQLException ex) {
                    System.out.println("Error de conexion: " + ex);
                }
            }
        };
        txtCodigo.addKeyListener(l);
    }
    private void butRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegresaActionPerformed
        if (parametro3 == 0) {
            VentasInventario objIn = new VentasInventario();
            objIn.setVisible(true);
            dispose();
        } else {
            opciones obj = new opciones();
            obj.index(parametro4, parametro3);
            obj.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_butRegresaActionPerformed

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed

    }//GEN-LAST:event_txtCodigoActionPerformed

    private void butInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butInfoActionPerformed
        
    }//GEN-LAST:event_butInfoActionPerformed
    int id = 0;

    public void ID() {
        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
           //obtenion del user y de los id
            if (parametro3 == 1) {
                ResultSet rs = statement.executeQuery("SELECT*FROM gerente");
                while (rs.next()) {
                    int idg = rs.getInt("idGerente");
                    String user = rs.getString("UserName");
                    if (parametro4.equals(user)) {
                        id = idg;
                    }
                }//while
            } else {
                ResultSet rs2 = statement.executeQuery("SELECT*FROM empleado");
                while (rs2.next()) {
                    int idg = rs2.getInt("idEmpleado");
                    String user = rs2.getString("UserName");
                    if (parametro4.equals(user)) {
                        id = idg;
                    }//if   
                }//while
            }//else            
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }
    int idv = 0;
//metodo paraobtener el IdVenta de laventa
    public void IDV() {
        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();

            ResultSet rs = statement.executeQuery("SELECT*FROM venta");
            while (rs.next()) {
                idv = rs.getInt("idVenta");
            }
        } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }
    }
    float subtot = 0, Total = 0;
    private void butRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegistrarActionPerformed
        //Obtención de las tablas
        if (jTable1.getSelectedRow() != -1) {
            vectorR[0] = (String) modelo.getValueAt(jTable1.getSelectedRow(), 0);
            vectorR[1] = (String) modelo.getValueAt(jTable1.getSelectedRow(), 1);
            vectorR[2] = (String) modelo.getValueAt(jTable1.getSelectedRow(), 2);
            vectorR[3] = (String) modelo.getValueAt(jTable1.getSelectedRow(), 3);
            try{
            do {
                vectorR[4] = JOptionPane.showInputDialog(this, "Ingresa la cantidad de articulos");
                
            } while (Integer.parseInt(vectorR[4]) <= 0 && vectorR[4] == null);
            }catch(Exception e){
                System.out.println("Error tipo "+e);
            }
            if (Integer.parseInt(vectorR[4])<Integer.parseInt(vectorR[3])) {
            subtot = (Float.parseFloat(vectorR[1])) * Float.parseFloat(vectorR[4]);
            vectorR[5] = Float.toString(subtot);
            modelo2.addRow(vectorR);
            Total = Total + subtot;
            txtTotal.setText(Float.toString(Total));
            //limpiamos todo
            modelo.getDataVector().removeAllElements();//Limpia la tabla
            jTable1.updateUI();
            txtCodigo.setText(""); 
            butQuitar.setEnabled(true);
            }else{
                JOptionPane.showMessageDialog(this, "Cantidad de articulos insuficientes");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar un registro");
        }
    }//GEN-LAST:event_butRegistrarActionPerformed

    private void butQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butQuitarActionPerformed
        //Vemos si se selecciona una fila a cancelar 
        if (jTable1.getSelectedRow() != -1) {
            String f = (String) modelo2.getValueAt(jTable2.getSelectedRow(), 5);//Obtención del subtotal del producto a cancelar
            float cancela = Float.parseFloat(f);
            // Se actualiza el total
            Total = Total - cancela;
            txtTotal.setText(Float.toString(Total));
            //Se actualiza la tabla
            modelo2.removeRow(jTable2.getSelectedRow());
            jTable2.updateUI();
        } else {
            JOptionPane.showMessageDialog(this, "Favor de seleccionar un registro");
        }
    }//GEN-LAST:event_butQuitarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
    float paga = 0;
    private void butRealizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRealizarVActionPerformed
        String SQL = "";
        ID();
       
//Se obtiene el monto dado por el cliente y se acepta solo se el monto dadoporel cliente es mayor o igual a el total apagar 
        do {
            try{
             String pagar = JOptionPane.showInputDialog(this, "Ingresa el monto dado");
             paga = Float.valueOf(pagar);  
            }catch(Exception e){
                System.out.println("Error tipo: "+e);
            }
            
            
        } while (paga < Total);
        JOptionPane.showMessageDialog(this, "El cambio es de " + (paga - Total));//Se muestra el cambio
        //Se habilitan y des habilitan los botones
        butCancelarV.setEnabled(true);
        butImprimir.setEnabled(true);
        butQuitar.setEnabled(false);

        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            //Regitramos las ventas en el SQL en la tabla ventas
            SQL = "INSERT INTO venta (MontoTotal,idEmpleado)"
                    + "Values("
                    + "\"" + Total + "\","
                    + "\"" + id + "\")";
            statement.execute(SQL);
           
            IDV();
           //Regitramos las ventas en el SQL en la tabla venta-producto
            for (int i = 0; i < modelo2.getRowCount(); i++) {
               //Obtenemos los valores de la tabla (idproducto)
                Object f = jTable2.getValueAt(i, 0);
                String ff = f.toString();
                //Obtenemos los valores de la tabla (cantidad)
                Object d = jTable2.getValueAt(i, 4);
                String dd = d.toString();
                //Obtenemos los valores de la tabla (monto)
                Object g = jTable2.getValueAt(i, 5);
                String gg = g.toString();

                SQL = "INSERT INTO ventaprodcuto (idVenta,IdProducto,Cantidad,Monto)"
                        + "Values("
                        + "\"" + idv + "\","
                        + "\"" + Integer.parseInt(ff) + "\","
                        + "\"" + Integer.parseInt(dd) + "\","
                        + "\"" + Float.valueOf(gg) + "\")";
                statement.execute(SQL);
            }
        
//------------------------------------------------------------------------Ticket------------------------------------------------------------------------        
        Document documento = new Document(PageSize.B8, 5, 5, 10, 10);
        try {
            //Ruta
            String ruta = System.getProperty("user.home");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "/OneDrive/Escritorio/Tickets.pdf"));
            
            //Objeto celda
            PdfPCell cell2 = new PdfPCell();
            //Objeto del prfTitulo
            Paragraph prfTitulo = new Paragraph();
            //Titulo
            prfTitulo.setAlignment(Paragraph.ALIGN_CENTER);
            prfTitulo.add("Mercadito");
            prfTitulo.setAlignment(Paragraph.ALIGN_CENTER);
            prfTitulo.setFont(FontFactory.getFont("Tahoma", 26, Font.BOLD, BaseColor.BLACK));
            //Parrafo en blanco
            Paragraph prfNada = new Paragraph();
            prfNada.setFont(FontFactory.getFont("Tahoma", 10, Font.BOLD, BaseColor.BLACK));
            prfNada.add(" ");
            //Parrafo direccion
            Paragraph prfDic = new Paragraph();
            prfDic.setFont(FontFactory.getFont("Tahoma", 6, Font.BOLD, BaseColor.BLACK));
            prfDic.add("Armería 505. Col. oriental");
            prfDic.setAlignment(Paragraph.ALIGN_CENTER);
            //Parrafo direccion
            Paragraph prfRFC = new Paragraph();
            prfRFC.setFont(FontFactory.getFont("Tahoma", 6, Font.BOLD, BaseColor.BLACK));
            prfRFC.add("RFC0031282AB1");
            prfRFC.setAlignment(Paragraph.ALIGN_CENTER);
            //Parrafo linea ´punteada
            Paragraph prfBarras = new Paragraph();
            prfBarras.add("=======================");
            //Creacion delformato para las celdas de la tabla 
            //Modifica la fuente
            BaseFont bf = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1257, BaseFont.EMBEDDED);
            //Esta es para el tamaño
            Font ft = new Font(bf, 6, 0, BaseColor.BLACK);
           
            
            
            //Creacion de la tabla 
            PdfPTable tabla = new PdfPTable(3);
            tabla.getDefaultCell().setBorder(Rectangle.NO_BORDER);
            tabla.addCell(new Paragraph("Cantidad", ft));
            tabla.addCell(new Paragraph("Producto", ft));
            tabla.addCell(new Paragraph("SubTotal", ft));

           for (int i = 0; i < modelo2.getRowCount(); i++) {
               //Obtenemos los valores de la tabla (cantidad)
               Object d = jTable2.getValueAt(i, 4);
               String dd = d.toString();

                //Obtenemos los valores de la tabla (descripocion)
                Object f = jTable2.getValueAt(i, 2);
                String ff = f.toString();
  
                //Obtenemos los valores de la tabla (monto)
                Object g = jTable2.getValueAt(i, 5);
                String gg = g.toString();
                
                tabla.addCell(new Paragraph(dd, ft));
                tabla.addCell(new Paragraph(ff, ft));
                tabla.addCell(new Paragraph("$ "+gg, ft));
           }
           //Parrafo total
           Paragraph prfTotal = new Paragraph();
            prfTotal.setFont(FontFactory.getFont("Tahoma", 7, Font.BOLD, BaseColor.BLACK));
            prfTotal.add("Total $: "+Total);
            prfTotal.setAlignment(Paragraph.ALIGN_RIGHT);
            //Parrafo de pago
           Paragraph prfPaga = new Paragraph();
            prfPaga.setFont(FontFactory.getFont("Tahoma", 7, Font.BOLD, BaseColor.BLACK));
            prfPaga.add("Efectivo $: "+paga);
            prfPaga.setAlignment(Paragraph.ALIGN_RIGHT);
            //Parrafo cambio
            Paragraph prfCambio = new Paragraph();
            prfCambio.setFont(FontFactory.getFont("Tahoma",7, Font.BOLD, BaseColor.BLACK));
            prfCambio.add("Cambio $: "+(paga-Total));
            prfCambio.setAlignment(Paragraph.ALIGN_RIGHT);
            //Parrafo Iva
            Paragraph prfIVA = new Paragraph();
            prfIVA.setFont(FontFactory.getFont("Tahoma", 7, Font.BOLD, BaseColor.BLACK));
            prfIVA.add("IVA $: "+(Total*0.16));
            prfIVA.setAlignment(Paragraph.ALIGN_RIGHT);
            
            Paragraph prfGracias = new Paragraph();
            prfGracias.setFont(FontFactory.getFont("Tahoma", 8, Font.BOLD, BaseColor.BLACK));
            prfGracias.add("Gracias por su compra, vuelva pronto");
            prfGracias.setAlignment(Paragraph.ALIGN_CENTER);
           //Se agregan al documento
            documento.open();
            documento.add(prfTitulo);
            documento.add(prfNada);
            documento.add(prfDic);
            documento.add(prfRFC);;
            documento.add(prfBarras);
            documento.add(tabla);
            documento.add(prfTotal);
            documento.add(prfPaga);
            documento.add(prfCambio);
            documento.add(prfIVA);
            documento.add(prfBarras);
            documento.add(prfGracias);
            documento.close();
            
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
//------------------------------------------------------------------------------------------------------        
        //Se Borra los datos de la tabla de busquedas de productos
        modelo.getDataVector().removeAllElements();
        jTable1.updateUI();
        //Se Borra los datos de la tabla de las ventas
        modelo2.getDataVector().removeAllElements();
        jTable2.updateUI();
        //Se borran las etiquetas 
        Total = 0;
        txtCodigo.setText("");txtTotal.setText(""+Total);
        
        JOptionPane.showMessageDialog(null, "Se ha realiozado correctamente la venta.");
       } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }//catch
        
    }//GEN-LAST:event_butRealizarVActionPerformed

    private void butCancelarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarVActionPerformed
        String SQL = "";
        try {
            Connection conexion = DriverManager.getConnection(url, username, password);
            Statement statement = conexion.createStatement();
            //Elimina el registro de ventaProducto
            SQL = "DELETE FROM ventaprodcuto WHERE idVenta =" + idv;
            statement.execute(SQL);
            //Elimina el registro de venta
            SQL = "DELETE FROM venta WHERE idVenta = " + idv;
            statement.execute(SQL);
            butCancelarV.setEnabled(false);
            butImprimir.setEnabled(false);
            
            JOptionPane.showMessageDialog(null, "Se ha cancelado correctamente la venta.");
         } catch (SQLException ex) {
            System.out.println("Error de conexion: " + ex);
        }//catch
        
    }//GEN-LAST:event_butCancelarVActionPerformed

    private void butImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butImprimirActionPerformed
       //Se obtiene las rutas del archivo pdf
        String ruta = System.getProperty("user.home");
        String archivo= ruta+"/OneDrive/Escritorio/Tickets.pdf";
        try {
            //muestrael ticket para imprimir
            File objetofile = new File (archivo);
            Desktop.getDesktop().open(objetofile);

     }catch (IOException ex) {

            System.out.println(ex);

     }       
    }//GEN-LAST:event_butImprimirActionPerformed

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
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SistemaVentas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SistemaVentas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butCancelarV;
    private javax.swing.JButton butImprimir;
    private javax.swing.JButton butInfo;
    private javax.swing.JButton butQuitar;
    private javax.swing.JButton butRealizarV;
    private javax.swing.JButton butRegistrar;
    private javax.swing.JButton butRegresa;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel icono;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4Toto;
    private javax.swing.JLabel jLabel4Toto1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
