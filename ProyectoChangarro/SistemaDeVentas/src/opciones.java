
public class opciones extends javax.swing.JFrame {

    int parametro2=0;
    String parametro1 ="";
    
    
    public opciones() {
        initComponents();
        this.setLocationRelativeTo(null);
        butReporteG.setVisible(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        icono = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        butVenta = new javax.swing.JButton();
        butMod = new javax.swing.JButton();
        butAddEmp = new javax.swing.JButton();
        butEliminar = new javax.swing.JButton();
        butAddProduct = new javax.swing.JButton();
        butReporteV = new javax.swing.JButton();
        butReporteG = new javax.swing.JButton();
        jl1 = new javax.swing.JLabel();
        jl2 = new javax.swing.JLabel();
        j3 = new javax.swing.JLabel();
        butRegresa = new javax.swing.JButton();
        FondoFeo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 153));
        setPreferredSize(new java.awt.Dimension(720, 620));
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(720, 620));
        jPanel2.setLayout(null);

        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/shop-icon_34368.png"))); // NOI18N
        jPanel2.add(icono);
        icono.setBounds(10, 0, 60, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(null);

        butVenta.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/carrito-de-supermercado.png"))); // NOI18N
        butVenta.setText("\n\n\nVenta");
        butVenta.setBorder(null);
        butVenta.setOpaque(false);
        butVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butVentaActionPerformed(evt);
            }
        });
        jPanel1.add(butVenta);
        butVenta.setBounds(-10, 30, 190, 50);

        butMod.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/editar.png"))); // NOI18N
        butMod.setText("Modificar");
        butMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butModActionPerformed(evt);
            }
        });
        jPanel1.add(butMod);
        butMod.setBounds(0, 130, 180, 50);

        butAddEmp.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butAddEmp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/agregar.png"))); // NOI18N
        butAddEmp.setText("Empleado");
        butAddEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddEmpActionPerformed(evt);
            }
        });
        jPanel1.add(butAddEmp);
        butAddEmp.setBounds(0, 280, 180, 50);

        butEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/trash-can_115312.png"))); // NOI18N
        butEliminar.setText("Eliminar");
        butEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(butEliminar);
        butEliminar.setBounds(0, 180, 180, 50);

        butAddProduct.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butAddProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/bolsa-de-la-compra.png"))); // NOI18N
        butAddProduct.setText("Agregar");
        butAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAddProductActionPerformed(evt);
            }
        });
        jPanel1.add(butAddProduct);
        butAddProduct.setBounds(0, 230, 180, 50);

        butReporteV.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butReporteV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/grafico-de-barras (1).png"))); // NOI18N
        butReporteV.setText("Reporte  Ventas");
        butReporteV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReporteVActionPerformed(evt);
            }
        });
        jPanel1.add(butReporteV);
        butReporteV.setBounds(0, 380, 181, 50);

        butReporteG.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butReporteG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/contabilidad.png"))); // NOI18N
        butReporteG.setText("Reporte Gastos");
        butReporteG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butReporteGActionPerformed(evt);
            }
        });
        jPanel1.add(butReporteG);
        butReporteG.setBounds(0, 430, 180, 50);

        jl1.setBackground(new java.awt.Color(255, 255, 255));
        jl1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jl1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl1.setText("Procesos");
        jl1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl1.setOpaque(true);
        jPanel1.add(jl1);
        jl1.setBounds(0, 0, 180, 35);

        jl2.setBackground(new java.awt.Color(255, 255, 255));
        jl2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jl2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jl2.setText("Catálogo");
        jl2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jl2.setOpaque(true);
        jPanel1.add(jl2);
        jl2.setBounds(0, 90, 180, 35);

        j3.setBackground(new java.awt.Color(255, 255, 255));
        j3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        j3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        j3.setText("Reportes");
        j3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j3.setOpaque(true);
        jPanel1.add(j3);
        j3.setBounds(0, 340, 180, 35);

        butRegresa.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        butRegresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/cerrar-sesion.png"))); // NOI18N
        butRegresa.setText(" Regresar");
        butRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRegresaActionPerformed(evt);
            }
        });
        jPanel1.add(butRegresa);
        butRegresa.setBounds(0, 490, 180, 40);

        jPanel2.add(jPanel1);
        jPanel1.setBounds(0, 50, 180, 550);

        FondoFeo.setBackground(new java.awt.Color(255, 35, 1));
        FondoFeo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        FondoFeo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FondoFeo.setText("Sistema de ventas y control de inventarios");
        FondoFeo.setOpaque(true);
        jPanel2.add(FondoFeo);
        FondoFeo.setBounds(0, 0, 720, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo4.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 40, 740, 580);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void butRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRegresaActionPerformed
        VentasInventario principal=new VentasInventario();
        principal.setVisible(true);
        dispose();
    }//GEN-LAST:event_butRegresaActionPerformed

    private void butReporteGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReporteGActionPerformed
      
    }//GEN-LAST:event_butReporteGActionPerformed

    private void butReporteVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butReporteVActionPerformed
        ReporteVentas objrv = new ReporteVentas();
        objrv.setVisible(true);
        dispose();
    }//GEN-LAST:event_butReporteVActionPerformed

    private void butAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddProductActionPerformed
        ControlAlmacen objAdd = new ControlAlmacen();
        objAdd.index2(parametro1,parametro2);
        objAdd.setVisible(true);
        dispose();

        //Esta es lo que va enviar :v
    }//GEN-LAST:event_butAddProductActionPerformed

    private void butEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butEliminarActionPerformed
        Eliminar objeli = new Eliminar();
        objeli.index2(parametro1,parametro2);
        objeli.setVisible(true);
        dispose();
    }//GEN-LAST:event_butEliminarActionPerformed

    private void butModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butModActionPerformed
        ModificarProducto objmod = new ModificarProducto();
        objmod.setVisible(true);
        dispose();

    }//GEN-LAST:event_butModActionPerformed

    private void butVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butVentaActionPerformed
        SistemaVentas objven = new SistemaVentas();
        objven.index2(parametro1,parametro2);
        objven.setVisible(true);
        dispose();
    }//GEN-LAST:event_butVentaActionPerformed

    private void butAddEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAddEmpActionPerformed
        Empleados objEmp = new Empleados();
        objEmp.index2(parametro1,parametro2);
        objEmp.setVisible(true);
        dispose();
    }//GEN-LAST:event_butAddEmpActionPerformed
    
    public String index (String par, int par2){
        parametro1= par;
        parametro2= par2;
        return par;
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
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(opciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new opciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoFeo;
    private javax.swing.JButton butAddEmp;
    private javax.swing.JButton butAddProduct;
    private javax.swing.JButton butEliminar;
    private javax.swing.JButton butMod;
    private javax.swing.JButton butRegresa;
    private javax.swing.JButton butReporteG;
    private javax.swing.JButton butReporteV;
    private javax.swing.JButton butVenta;
    private javax.swing.JLabel icono;
    private javax.swing.JLabel j3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    // End of variables declaration//GEN-END:variables
}
