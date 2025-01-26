package maquina_expendedora;

import javax.swing.JOptionPane;

public class Maquina_Expendedora extends javax.swing.JFrame {

    static float numero1 = 0, numero2 = 0;
    static String operador, vendido, cambio2;
    static int cantidad = 0;
    static float cambio = 0;
    static int fila = 0, columna = 0, cant = 0;
    static boolean e = true;
    static int moneda = 0;
    static int[][] MONEY = 
           //1  2  5  v  N                                       
            {{1, 2, 5, 0, 0},//E0 
            {2, 3, 6, 1, 1},//E1
            {3, 4, 7, 2, 2},//E2
            {4, 5, 7, 3, 3},//E3
            {5, 6, 7, 4, 4},//E4
            {6, 7, 7, 5, 5},//E5
            {7, 7, 7, 6, 6},//E6
            {7, 7, 7, 0, 0}};//E7

    static String[][] Cambio
            = //1    2    5    v    N   
            {{"N", "N", "N", "N", "N"},//E0 
            {"N", "N", "N", "N", "N"},//E1 
            {"N", "N", "N", "N", "N"},//E2 
            {"N", "N", "1", "N", "N"},//E3 
            {"N", "N", "2", "N", "N"},//E4 
            {"N", "N", "3", "N", "N"},//E5 
            {"N", "1", "4", "N", "N"},//E6 
            {"1", "2", "5", "C", "O"}};//E7

    public Maquina_Expendedora() {
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        btnComprarObscura = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        btnComprarClara = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        txtCambio = new javax.swing.JTextField();
        txtrecibe = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnUno1 = new javax.swing.JButton();
        btnDos2 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jTextField12 = new javax.swing.JTextField();
        btnUno3 = new javax.swing.JButton();
        btnUno4 = new javax.swing.JButton();
        btnUno5 = new javax.swing.JButton();
        btnCinco5 = new javax.swing.JButton();
        btnmas = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        btnigual = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 36)); // NOI18N
        jLabel1.setText("MAQUINA EXPENDEDORA");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 560, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 90));

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(255, 255, 102));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquina_expendedora/Imagenes/cervezas.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 170));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 180));

        jTextField1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField1.setText("PRECIO: $ 7.00");
        jPanel3.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 30));

        jTextField2.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField2.setText("CERVEZA OBSCURA");
        jPanel3.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, 170, 30));

        btnComprarObscura.setBackground(new java.awt.Color(255, 153, 0));
        btnComprarObscura.setText("COMPRAR");
        btnComprarObscura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarObscuraActionPerformed(evt);
            }
        });
        jPanel3.add(btnComprarObscura, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 290, 200));

        jPanel5.setBackground(new java.awt.Color(255, 255, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 255, 102));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquina_expendedora/Imagenes/cerveza.png"))); // NOI18N
        jPanel6.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 170));

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 180));

        jTextField3.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField3.setText("PRECIO: $ 7.00");
        jPanel5.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 170, 30));

        jTextField4.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField4.setText("CERVEZA CLARA");
        jPanel5.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 50, 170, 30));

        jPanel7.setBackground(new java.awt.Color(255, 255, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(255, 255, 102));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquina_expendedora/Imagenes/cerveza.png"))); // NOI18N
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 170));

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 180));

        jTextField5.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField5.setText("PRECIO: $ 7.00");
        jPanel7.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, 30));

        jTextField6.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField6.setText("CERVEZA CLARA");
        jPanel7.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jPanel5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 290, 200));

        jPanel9.setBackground(new java.awt.Color(255, 255, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 255, 102));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquina_expendedora/Imagenes/cerveza.png"))); // NOI18N
        jPanel10.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 170));

        jPanel9.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 180));

        jTextField7.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField7.setText("PRECIO: $ 7.00");
        jPanel9.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, 30));

        jTextField8.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField8.setText("CERVEZA CLARA");
        jPanel9.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jPanel11.setBackground(new java.awt.Color(255, 255, 102));
        jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel12.setBackground(new java.awt.Color(255, 255, 102));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/maquina_expendedora/Imagenes/cerveza.png"))); // NOI18N
        jPanel12.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 10, 100, 170));

        jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 100, 180));

        jTextField9.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField9.setText("PRECIO: $ 7.00");
        jPanel11.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 170, 30));

        jTextField10.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jTextField10.setText("CERVEZA CLARA");
        jPanel11.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 170, 30));

        jPanel9.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 290, 200));

        jPanel5.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 290, 200));

        btnComprarClara.setBackground(new java.awt.Color(51, 255, 51));
        btnComprarClara.setText("COMPRAR");
        btnComprarClara.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComprarClaraActionPerformed(evt);
            }
        });
        jPanel5.add(btnComprarClara, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 170, 30));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 290, 200));

        jPanel13.setBackground(new java.awt.Color(255, 255, 102));
        jPanel13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel13.add(txtCambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 150, 30));
        jPanel13.add(txtrecibe, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 150, 30));

        btnCancelar.setText("X");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        jPanel13.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 50, 40));

        btnUno1.setText("1");
        btnUno1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnUno1MouseClicked(evt);
            }
        });
        btnUno1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUno1ActionPerformed(evt);
            }
        });
        jPanel13.add(btnUno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 50, 40));

        btnDos2.setText("2");
        btnDos2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDos2ActionPerformed(evt);
            }
        });
        jPanel13.add(btnDos2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 50, 40));

        jPanel14.setBackground(new java.awt.Color(255, 255, 102));
        jPanel14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel14.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 150, 30));

        btnUno3.setText("1");
        jPanel14.add(btnUno3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 50, 40));

        btnUno4.setText("1");
        jPanel14.add(btnUno4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 50, 40));

        btnUno5.setText("1");
        jPanel14.add(btnUno5, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 50, 40));

        jPanel13.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 100, 290, 320));

        btnCinco5.setText("5");
        btnCinco5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCinco5ActionPerformed(evt);
            }
        });
        jPanel13.add(btnCinco5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 50, 40));

        btnmas.setText("+");
        btnmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasActionPerformed(evt);
            }
        });
        jPanel13.add(btnmas, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 50, 40));

        jLabel8.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel8.setText("        Cambio");
        jPanel13.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 110, -1));

        btnigual.setText("=");
        btnigual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnigualActionPerformed(evt);
            }
        });
        jPanel13.add(btnigual, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 50, 40));

        jLabel9.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        jLabel9.setText("Ingresa las monedas");
        jPanel13.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 100, 220, 320));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void comprar(int moneda) {
        if (moneda>=7) {
            
        }else{
           cant = cant + moneda;
        txtrecibe.setText("" + cant); 
        }
        if (moneda == 1) {
            columna = 0;
            System.out.println("Estados " + MONEY[fila][columna]);
            System.out.println("Estados2 " + Cambio[fila][columna]);
            if (cant >= 7) {
                cambio2 = Cambio[fila][columna];
                txtCambio.setText(""+cambio2);
            }
        } else if (moneda == 2) {
            columna = 1;
            System.out.println("Estados " + MONEY[fila][columna]);
            System.out.println("Estados2 " + Cambio[fila][columna]);
            if (cant >= 7) {
                cambio2 = Cambio[fila][columna];
                txtCambio.setText(""+cambio2);
            }
        } else if (moneda == 5) {
            columna = 2;
            System.out.println("Estados " + MONEY[fila][columna]);
            System.out.println("Estados2 " + Cambio[fila][columna]);
            if (cant >= 7) {
                cambio2 = Cambio[fila][columna];
                txtCambio.setText(""+cambio2);
            }

        } else if (moneda == 7) {
            columna = 3;
            JOptionPane.showConfirmDialog(null, "Compra realizada con exito");
            System.out.println("Estado2 " + Cambio[fila][columna]);
            if (cant >= 7) {
                vendido = Cambio[fila][columna];
            }

        } else if (moneda == 8) {
            columna = 4;
            if (cant >= 7) {
                vendido = Cambio[fila][columna];
                JOptionPane.showMessageDialog(null, "Tu compra fue de " + vendido);
                
            }
        }
        fila = MONEY[fila][columna];

        System.out.println("Cantidad" + cant);

    }


    
    
    
    
    private void btnUno1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUno1ActionPerformed
      moneda = 1;
        comprar(moneda);
       
    }//GEN-LAST:event_btnUno1ActionPerformed

    private void btnDos2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDos2ActionPerformed
      moneda = 2;
        comprar(moneda);
        
    }//GEN-LAST:event_btnDos2ActionPerformed

    private void btnCinco5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCinco5ActionPerformed
       moneda = 5;
        comprar(moneda);
        
    }//GEN-LAST:event_btnCinco5ActionPerformed

    private void btnmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasActionPerformed
      
     }//GEN-LAST:event_btnmasActionPerformed

    private void btnUno1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnUno1MouseClicked
        
    }//GEN-LAST:event_btnUno1MouseClicked

    private void btnigualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnigualActionPerformed
      
    }//GEN-LAST:event_btnigualActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
       
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnComprarObscuraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarObscuraActionPerformed
       
        moneda = 8;
        comprar(moneda);
       
    }//GEN-LAST:event_btnComprarObscuraActionPerformed

    private void btnComprarClaraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComprarClaraActionPerformed
       moneda = 7;
        comprar(moneda);
        
    }//GEN-LAST:event_btnComprarClaraActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Maquina_Expendedora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCinco5;
    private javax.swing.JButton btnComprarClara;
    private javax.swing.JButton btnComprarObscura;
    private javax.swing.JButton btnDos2;
    private javax.swing.JButton btnUno1;
    private javax.swing.JButton btnUno3;
    private javax.swing.JButton btnUno4;
    private javax.swing.JButton btnUno5;
    private javax.swing.JButton btnigual;
    private javax.swing.JButton btnmas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtCambio;
    private javax.swing.JTextField txtrecibe;
    // End of variables declaration//GEN-END:variables
}
