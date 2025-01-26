/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automata;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisf
 */
public class Grafico extends javax.swing.JFrame {

    DefaultTableModel modelo;

    /**
     * Creates new form Grafico
     */
    public Grafico() {
        initComponents();
        modelo = new DefaultTableModel();
        modelo.addColumn("Lexema");
        modelo.addColumn("Componente Léxico");
        this.jTable.setModel(modelo);
    }
    JFileChooser chooser = new JFileChooser();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtArea = new javax.swing.JTextArea();
        jPanel5 = new javax.swing.JPanel();
        jButRead = new javax.swing.JButton();
        jButGrabar = new javax.swing.JButton();
        jButLimpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jButLex = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jButSalir = new javax.swing.JButton();
        jButCreitos = new javax.swing.JButton();
        jButAiuda = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Analizador Léxico");
        setAlwaysOnTop(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jtxtArea.setColumns(20);
        jtxtArea.setRows(5);
        jScrollPane1.setViewportView(jtxtArea);

        jButRead.setBackground(new java.awt.Color(0, 153, 0));
        jButRead.setText("Leer");
        jButRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButReadActionPerformed(evt);
            }
        });

        jButGrabar.setBackground(new java.awt.Color(0, 102, 102));
        jButGrabar.setText("Grabar");
        jButGrabar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButGrabarActionPerformed(evt);
            }
        });

        jButLimpiar.setBackground(new java.awt.Color(255, 255, 0));
        jButLimpiar.setText("Limpiar");
        jButLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButGrabar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButRead)
                    .addComponent(jButGrabar)
                    .addComponent(jButLimpiar))
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jLabel1.setText("Fichero");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 96, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable);

        jButLex.setBackground(new java.awt.Color(153, 255, 153));
        jButLex.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButLex.setText("Análisis Léxico");
        jButLex.setMaximumSize(new java.awt.Dimension(101, 30));
        jButLex.setMinimumSize(new java.awt.Dimension(101, 30));
        jButLex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButLexActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(255, 255, 51));
        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Clean Table");
        jButton1.setMaximumSize(new java.awt.Dimension(101, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(101, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(101, 30));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                        .addComponent(jButLex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButLex, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButSalir.setBackground(new java.awt.Color(204, 0, 0));
        jButSalir.setText("Salir");
        jButSalir.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButSalir.setOpaque(false);
        jButSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButSalirActionPerformed(evt);
            }
        });

        jButCreitos.setText("Créditos");
        jButCreitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCreitosActionPerformed(evt);
            }
        });

        jButAiuda.setText("Ayuda");
        jButAiuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButAiudaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButAiuda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButCreitos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButAiuda)
                            .addComponent(jButCreitos))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jButSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setText("   Lenguajes y Autómatas I");
        jLabel2.setOpaque(true);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automata/imagenes/itcolima3.png"))); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/automata/imagenes/itcolima2.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152)
                .addComponent(jLabel3)
                .addGap(26, 26, 26)
                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 533, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButSalirActionPerformed
        System.exit(0);// finaliza el programa
    }//GEN-LAST:event_jButSalirActionPerformed

    private void jButCreitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCreitosActionPerformed
        JOptionPane.showMessageDialog(this, "Luis Francico Barragan Flores \n" + "No. Cuenta: 18460194");
    }//GEN-LAST:event_jButCreitosActionPerformed

    private void jButAiudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButAiudaActionPerformed
        JOptionPane.showMessageDialog(this, "Este programa lee un archivo de texto (cualquier extensión) "
                + "y lo despliegue en un cuadro de texto- \n"
                + "Tambien permite editar el contenido, guardar los cambios (con el mismo nombre u otro diferente).");
    }//GEN-LAST:event_jButAiudaActionPerformed

    private void jButLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLimpiarActionPerformed
        jtxtArea.setText("");
    }//GEN-LAST:event_jButLimpiarActionPerformed

    private void jButGrabarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButGrabarActionPerformed
        int noyea = chooser.showSaveDialog(this);
        if (noyea == JFileChooser.APPROVE_OPTION) {
            File fichero = chooser.getSelectedFile();
            try (FileWriter fw = new FileWriter(fichero)) {
                fw.write(this.jtxtArea.getText());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        JOptionPane.showMessageDialog(this, "Se guardo con exito");
    }//GEN-LAST:event_jButGrabarActionPerformed

    private void jButReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButReadActionPerformed

        int yea = chooser.showOpenDialog(this);
        if (yea == JFileChooser.APPROVE_OPTION) {
            File fichero = chooser.getSelectedFile();
            try (FileReader fr = new FileReader(fichero)) {
                String cadena = "";
                int largo = fr.read();
                while (largo != -1) {
                    cadena = cadena + (char) largo;
                    largo = fr.read();
                }
                this.jtxtArea.setText(cadena);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_jButReadActionPerformed

    private void jButLexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButLexActionPerformed
        String txtarea = jtxtArea.getText();
        byte[] txtbyte = txtarea.getBytes();
        String cadena = "";
                int i = 0, row = 0, col = 0;
        String []vector= new String[2];
        int[][] matriz = 
        {{1, 2, 7, 5, 4, 3, 6, 0, 16},        //Fila 0 Camino Inicial
        {14, 14, 14, 14, 14, 14, 14, 8, 16},  //Fila 1 Camino Número
        {2, 2, 14, 14, 14, 14, 14, 8, 16},    //Fila 2 Camino Número
        {14, 14, 14, 14, 14, 14, 14, 9, 16},  //Fila 3 Camino Separador
        {14, 14, 14, 14, 14, 14, 14, 10, 16}, //Fila 4 Camino Agrupador
        {14, 14, 14, 14, 14, 14, 14, 11, 16}, //Fila 5 Camino Asignación
        {14, 14, 14, 14, 14, 14, 14, 12, 16}, //Fila 6 Camino Op. aritmético
        {7, 7, 7, 14, 14, 14, 14, 13, 16},    //Fila 7 Camino Id
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 8 Número natural
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 9 Separador
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 10 Agrupador
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 11 Asignación
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 12 Operador aritmético
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 13 Identificador
        {14, 14, 14, 14, 14, 14, 14, 15, 16}, //Fila 14 Camino lexéma inválido
        {1, 2, 7, 5, 4, 3, 6, 0, 16},         //Fila 15 Léxema inválido
        {16, 16, 16, 16, 16, 16, 16, 17, 16}, //Fila 16 Camino carácter inválido
        {1, 2, 7, 5, 4, 3, 6, 0, 16}
        };
        while (i < txtbyte.length) {
            // inicio bloque para evaluar caracter 
            if (txtbyte[i] == 48) { // 0 
                cadena += (char) txtbyte[i];
                col = 0;
            } else if (txtbyte[i] >= 49 && txtbyte[i] <= 57) { // 1...9
               cadena += (char) txtbyte[i];
                col = 1;
            } else if ((txtbyte[i] >= 65 && txtbyte[i] <= 90) || (txtbyte[i] >= 97 && txtbyte[i] <= 122)) { // a...zA...Z
                cadena += (char) txtbyte[i];
                col = 2;
            } else if (txtbyte[i] == 61) { // =
                cadena += (char) txtbyte[i];
                col = 3;
            } else if (txtbyte[i] == 40 || txtbyte[i] == 41 || txtbyte[i] == 91 || txtbyte[i] == 93 || txtbyte[i] == 123 || txtbyte[i] == 125) { // ( ) [ ] { }
                cadena += (char) txtbyte[i];
                col = 4;
            } else if (txtbyte[i] == 44 || txtbyte[i] == 46 || txtbyte[i] == 59) { // . , ;
                cadena += (char) txtbyte[i];
                col = 5;
            } else if (txtbyte[i] == 42 || txtbyte[i] == 43 || txtbyte[i] == 45 || txtbyte[i] == 47) { // * + - /
                cadena += (char) txtbyte[i];
                col = 6;
            } else if (txtbyte[i] == 10 || txtbyte[i] == 32 || txtbyte[i] == 13 || txtbyte[i] == 255) {
                cadena += (char) txtbyte[i];
                col = 7;
            } else {
                cadena += (char) txtbyte[i];
                col = 8;
            }
            
            //  evaluar caracter
            row = matriz[row][col];
            if (row == 8) {
                vector[0] = cadena;
                vector[1] = "Número natural";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 9) {
                vector[0] = cadena;
                vector[1] = "Separador";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 10) {
                vector[0] = cadena;
                vector[1] = "Agrupador";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 11) {
                vector[0] = cadena;
                vector[1] = "Asignación";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 12) {
                vector[0] = cadena;
                vector[1] = "Operador aritmético";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 13) {
                vector[0] = cadena;
                vector[1] = "Identificador";
                modelo.addRow(vector);
                cadena = "";
            } else if (row == 15) {
                vector[0] = cadena;
                vector[1] = "error léxico por secuencia incorrecta";
                modelo.addRow(vector);
                cadena = "";
            }
            else if(row==17){
                vector[0] = cadena;
                vector[1] = "No valido";
                modelo.addRow(vector);
                cadena = "";
            }
            i++;
        }
    }//GEN-LAST:event_jButLexActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       modelo.getDataVector().removeAllElements();
       jTable.updateUI();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jButAiuda;
    private javax.swing.JButton jButCreitos;
    private javax.swing.JButton jButGrabar;
    private javax.swing.JButton jButLex;
    private javax.swing.JButton jButLimpiar;
    private javax.swing.JButton jButRead;
    private javax.swing.JButton jButSalir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable;
    private javax.swing.JTextArea jtxtArea;
    // End of variables declaration//GEN-END:variables
}
