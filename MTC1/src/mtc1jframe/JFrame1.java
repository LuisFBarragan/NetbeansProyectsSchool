//Luis Francisco Barragan Flores
//Numero control: 18460194
//Maquina de turing C1
package mtc1jframe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisf
 */
public class JFrame1 extends javax.swing.JFrame {
     DefaultTableModel modelo; //
    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
        initComponents();
        this.setLocationRelativeTo(null);
        Inicializar1();// se inicializa el metodo 
        modelo = new DefaultTableModel();
        modelo.addColumn("Estado");
        modelo.addColumn("Cambio ");
        modelo.addColumn("Movimiento");
        modelo.addColumn("Cadena");
        this.jTable.setModel(modelo);

    }
    //variables declaradas
    int cont = 1, estado = 0;
    String cadena, cadena2 = "";
    char cambio;
    String[] vector = new String[4];//vetor para guardar los resultados en la tabla

    public class Estructura {// estructura de los datos que tendra la matriz para la tabla de transiciones
        int C1Estado;
        String C1simbolo;
        String C1Mov;
    }

    static Estructura[][] C1 = new Estructura[1][3];// se crea el vector que contendra las variables de la class estructura

    void Inicializar1() {// se carga el vector por asi decirlo
        for (int x = 0; x < 1; x++) {
            for (int y = 0; y < 3; y++) {
                C1[x][y] = new Estructura();
            }
        }                      //Definicion de tabla de Transiciones     
                 //columna 0                  //columna 1                    //columna b
/*C1Estado*/    C1[0][0].C1Estado = 0;        C1[0][1].C1Estado = 0;         C1[0][2].C1Estado = 1;  
  /*1*/         C1[0][0].C1simbolo = "1";     C1[0][1].C1simbolo = "0";      C1[0][2].C1simbolo = "b"; 
                C1[0][0].C1Mov = "R";         C1[0][1].C1Mov = "R";          C1[0][2].C1Mov = "L"; 
    }
    
    //metodo que realiza el complemento a 1
    public void Complemento1() {
        while (estado != 1) {//while que indica si el estado esdiferente al estado uno termiona el proceso
            //___________________________ caso 0________________________________________________
            if (cadena.charAt(cont) == '0') {//Si la cadena contenida en el caracter cont == 0, si aplica la tabla de la columna 0
                estado = C1[0][0].C1Estado; // se asigna el a la variable estado el estado que se va enviar de la columna 0
                cambio = C1[0][0].C1simbolo.charAt(0);//en la variable cambio se asigna el carcater que se va acambiar segun la columna 0
                cadena2 = cadena2 + Character.toString(cambio);//En la cadena2 se va gradando la cadena resultante del proceso
                if (C1[0][0].C1Mov == "R") {//detecta el movimiento que este tendrá, si el movimiento va para la derecha el contador aumenta y si va a la izquierda el contador disminuye, 
                    cont++;
                } else {
                    cont--;
                }
                /*  System.out.println("" + estado);
                    System.out.println("" + C1[0][0].C1Mov);     // Escuchador utilizado durante la elaboracion del programa
                    System.out.println("Cadena " + cadena2); */
                vector[0] = "" + estado;//se envia el estado actual a la tabla
                vector[1] = "" + cambio;//envia el simbolo que cambió
                vector[2] = "" + C1[0][0].C1Mov;//envia el movimiento que se hizo a la tabla
                vector[3] = "" + cadena2;//envia el movimiento que se hizo a la tabla
                modelo.addRow(vector);

                //___________________________ caso 1________________________________________________
            } else if (cadena.charAt(cont) == '1') {//Si la cadena contenida en el caracter cont == 1, si aplica la tabla de la columna 1
                estado = C1[0][1].C1Estado; // se asigna el estado a la variable estado el estado de la columna 1
                cambio = C1[0][1].C1simbolo.charAt(0);//en la variable cambio se asigna el carcater que se va acambiar segun la columna 1
                cadena2 = cadena2 + Character.toString(cambio);//En la cadena2 se va gradando la cadena resultante del proceso
                if (C1[0][1].C1Mov == "R") {
                    cont++;
                } else {
                    cont--;
                }
                /*System.out.println("" + estado);
                    System.out.println("" + C1[0][1].C1Mov);    // Escuchador utilizado durante la elaboracion del programa
                    System.out.println("Cadena " + cadena2);*/
                vector[0] = "" + estado;//se envia el estado actual a la tabla
                vector[1] = "" + cambio;//envia el simbolo que cambió
                vector[2] = "" + C1[0][1].C1Mov;//envia el movimiento que se hizo a la tabla
                vector[3] = "" + cadena2;//envia el movimiento que se hizo a la tabla
                modelo.addRow(vector);
            } //___________________________ caso F________________________________________________
            else {//Si la cadena contenida en el caracter contno fue ni uno ni cero se aplica la columna 2
                estado = C1[0][2].C1Estado;// se asigna el estado a la variable estado el estado de la columna 2
                cambio = C1[0][2].C1simbolo.charAt(0);;//en la variable cambio se asigna el carcater que se va acambiar segun la columna 2
                cadena2 = cadena2 + Character.toString(cambio);//En la cadena2 se va gradando la cadena resultante del proceso
                if (C1[0][2].C1Mov == "R") {
                    cont++;
                } else {

                    cont--;
                }
                /*System.out.println("" + estado);
                    System.out.println("" + C1[0][1].C1Mov);     // Escuchador
                    System.out.println("Cadena " + cadena2); */
                vector[0] = "" + estado;//se envia el estado actual a la tabla
                vector[1] = "" + cambio;//envia el simbolo que cambió
                vector[2] = "" + C1[0][2].C1Mov;//envia el movimiento que se hizo a la tabla
                vector[3] = "" + cadena2.substring(0, cadena2.length() - 1);//envia el movimiento que se hizo a la tabla
                modelo.addRow(vector);
            }//else
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSpinner1 = new javax.swing.JSpinner();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txtEntraCadena = new javax.swing.JTextField();
        butRun = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButExit = new javax.swing.JButton();
        jButHelp = new javax.swing.JButton();
        jButCreditos = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Maquina de Turing C1");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/itcolima3.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 130, 80));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel3.setText("   Lenguajes y Autómatas I");
        jLabel3.setOpaque(true);
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 270, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/itcolima2.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 0, 90, -1));

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Ingresa una cadena:");
        jLabel4.setOpaque(true);

        txtEntraCadena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEntraCadenaActionPerformed(evt);
            }
        });

        butRun.setBackground(new java.awt.Color(51, 153, 0));
        butRun.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        butRun.setText("Run");
        butRun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butRunActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 51));
        jButton4.setText("Limpiar");

        jButton3.setBackground(new java.awt.Color(255, 255, 102));
        jButton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 12)); // NOI18N
        jButton3.setText("Clean");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 111, Short.MAX_VALUE)
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

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Resultado");
        jLabel5.setOpaque(true);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton4))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEntraCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(butRun, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(83, 83, 83)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(158, 158, 158)))
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(txtEntraCadena, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(butRun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(126, 126, 126)))
                .addComponent(jButton4)
                .addContainerGap())
        );

        jButExit.setBackground(new java.awt.Color(153, 0, 0));
        jButExit.setText("SALIR");
        jButExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButExitActionPerformed(evt);
            }
        });

        jButHelp.setText("Ayuda");
        jButHelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButHelpActionPerformed(evt);
            }
        });

        jButCreditos.setText("Creditos");
        jButCreditos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButCreditosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButHelp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButCreditos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButExit)
                .addGap(234, 234, 234))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButExit)
                    .addComponent(jButHelp)
                    .addComponent(jButCreditos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButton1.setText("Definición Formal");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Diagrama y Tabla");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 710, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButCreditosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButCreditosActionPerformed
        //Boton donse se muestran los creditos
        JOptionPane.showMessageDialog(null, "-----------Creditos-----------"
                + "\n Ing. en Sistemas Computacionales."
                + "\n Lenguajes y Autómatas I."
                + "\n Unidad 6"
                + "\n A6.6 Programa: MT de una cinta para obtener el complemento a uno de un número binario"
                + "\n Autor: Luis Francisco Barragan Flores."
                + "\n Numero de control: 18460194");
    }//GEN-LAST:event_jButCreditosActionPerformed

    private void jButHelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButHelpActionPerformed
        //Boton de ayuda
        JOptionPane.showMessageDialog(null, "-----------Funcionamiento del programa-----------"
                + "\n Este programa solo acepta una cadena con con los numeros 1 y 0"
                + "\n Este programa aplica el complento a 1 a la cadena dada"
                + "\n Este programa comienza con el primer caracter de la izquiersa"
                + "\n Se debe de considerar que el espcaio en blanco sera tomado como b, por lo tanto si se ingresa una b el programa NO RECONOCERA EL ERROR YAL LLEGAR A EL FINALIZARÁ ");
    }//GEN-LAST:event_jButHelpActionPerformed

    private void jButExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButExitActionPerformed
        System.exit(0);// finaliza el programa
    }//GEN-LAST:event_jButExitActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Boton que muestra el lenguaje formal
        JOptionPane.showMessageDialog(null, "-----------Lenguaje Formal-----------"
                + "\n Q = {q1,q2}"
                + "\n Σ = {0,1}"
                + "\n Γ = {0,1,ѣ}"
                + "\n F = {q2}"
                + "\n S = q1");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //boton que abre el framen con la tabla de transicón y el diagrama
        Diagrama obj = new Diagrama();
        obj.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtEntraCadenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEntraCadenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEntraCadenaActionPerformed

    private void butRunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butRunActionPerformed
        //boton donde se implementa el metodo a 1
        cadena = "b" + (txtEntraCadena.getText()) + "b";
        boolean v = false;
        for (int i = 1; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '0' || cadena.charAt(i) == '1' || cadena.charAt(i) == 'b') {//if para comprovar si el caracter ingresado es valido o no. if (cadena.charAt(cont) == '0' || cadena.charAt(cont) == '1' || cadena.charAt(cont) == 'b') {//if para comprovar si el caracter ingresado es valido o no.
                v = true;
            } else {//else que indica que se metió un caracter invalido
                JOptionPane.showMessageDialog(null, "Caracter no valido."
                        + "\n Este programa solo acepta los nuemros 1 y 0");
                v = false;
            }
        }//for
        
        if (v == true) {
            Complemento1();//se llama al metodo 
        }
    }//GEN-LAST:event_butRunActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Boton para limpiar
        txtEntraCadena.setText("");//Limpia el txt donde entran los datos
        modelo.getDataVector().removeAllElements();//Limpia la tabla
        jTable.updateUI();
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton butRun;
    private javax.swing.JButton jButCreditos;
    private javax.swing.JButton jButExit;
    private javax.swing.JButton jButHelp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTable;
    private javax.swing.JTextField txtEntraCadena;
    // End of variables declaration//GEN-END:variables
}
