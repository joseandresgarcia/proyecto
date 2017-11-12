/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;


import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Calendar;
import static javafx.scene.input.KeyCode.S;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;
import static proyecto.pacientes.imprimir;

/**
 *
 * @author pc1
 */
public class Registrarpaciente extends javax.swing.JFrame {
    pacientes pacientes;
    String cod;
    String imagen;
    String rutaimagen;
     static String nhistoria;
    
    
    /**
     * Creates new form historiaclinica
     */
    public Registrarpaciente() {
        initComponents();
        
       //DISEÑO 
         setLocationRelativeTo(null);//para centrar el formulario 
         setResizable(false);//para que no se maximice la pantalla
         setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono2.png")).getImage());//paa cambiar el icono del jfrane
       //para cambiar el fondo
          ((JPanel)getContentPane()).setOpaque(false); ImageIcon dos=new
          ImageIcon(this.getClass().getResource("/imagenes/hc.jpg")); JLabel fondo2= new JLabel();
          fondo2.setIcon(dos); getLayeredPane().add(fondo2,JLayeredPane.FRAME_CONTENT_LAYER);
          fondo2.setBounds(0,0,dos.getIconWidth(),dos.getIconHeight()); 
        
        
        
        
        
        
        
        
        
        
    }

  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnumeroh = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jDatefecha = new com.toedter.calendar.JDateChooser();
        jLabel10 = new javax.swing.JLabel();
        btnregistrar = new javax.swing.JButton();
        btnimprimir = new javax.swing.JButton();
        SALIR = new javax.swing.JButton();
        btnatras = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        txtdni = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtapelli = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtlnaci = new javax.swing.JTextField();
        fechanac = new com.toedter.calendar.JDateChooser();
        txtnombre = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtdirec = new javax.swing.JTextField();
        txtcorreo = new javax.swing.JTextField();
        cbsexo = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtnacionalidad = new javax.swing.JTextField();
        cbestado = new javax.swing.JComboBox();
        txtcel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncargarfoto = new javax.swing.JButton();
        lblfoto = new javax.swing.JLabel();
        btnlimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 14)); // NOI18N
        jLabel1.setText("REGISTRO DEL PACIENTE");

        jLabel2.setText("Nº DE HISTORIA         :");

        jLabel7.setText("FECHA  DE REGISTRO :");

        jLabel8.setText("USUARIO REGISTRADOR   :");

        txtnumeroh.setEditable(false);
        txtnumeroh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumerohActionPerformed(evt);
            }
        });

        jLabel10.setText(" ");

        btnregistrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnregistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar_2.png"))); // NOI18N
        btnregistrar.setText("registrar");
        btnregistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnimprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.jpg"))); // NOI18N
        btnimprimir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnimprimir.setHideActionText(true);
        btnimprimir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnimprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnimprimirActionPerformed(evt);
            }
        });

        SALIR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        SALIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SALIRActionPerformed(evt);
            }
        });

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras_1.png"))); // NOI18N
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Filiatorios"));

        jLabel15.setText("DNI              :");

        jLabel17.setText("NACIONALIDAD              :");

        jLabel18.setText("ESTADO  CIVIL                 :");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel11.setText("NOMBRES      :");

        cbsexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEGIR", "MASCULINO", "FEMENINO" }));

        jLabel9.setText("SEXO            :");

        jLabel12.setText("LUGAR DE NACIMIENTO   :");

        jLabel13.setText("FECHA DE NACIMIENTO   :");

        cbestado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ELEGIR", "SOLTER@", "CASAD@", "VIUD@" }));
        cbestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbestadoActionPerformed(evt);
            }
        });

        jLabel3.setText("APELLIDOS    :");

        jLabel4.setText("DIRECCION   :");

        jLabel5.setText("CEL/TELF      :");

        jLabel6.setText("CORREO       :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtdirec, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(txtnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(txtapelli, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3))
                .addGap(7, 7, 7)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel9)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel12)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechanac, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                            .addComponent(txtnacionalidad)
                            .addComponent(txtlnaci)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtapelli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtdirec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(txtlnaci, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(fechanac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(txtnacionalidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(11, 11, 11)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel9)
                                    .addComponent(cbsexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtcel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(3, 3, 3))))
        );

        btncargarfoto.setText("CARGAR FOTO");
        btncargarfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncargarfotoActionPerformed(evt);
            }
        });

        lblfoto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FOTO.png"))); // NOI18N

        btnlimpiar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnlimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnlimpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar_1.png"))); // NOI18N
        btnlimpiar.setText("limpiar");
        btnlimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnlimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnimprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SALIR, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDatefecha, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addGap(152, 152, 152)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btncargarfoto))
                            .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jDatefecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(lblfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncargarfoto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnimprimir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnregistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SALIR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnatras, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtnumeroh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(btnlimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnumerohActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumerohActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumerohActionPerformed

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void cbestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbestadoActionPerformed

    private void SALIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SALIRActionPerformed
      System.exit(0);
    }//GEN-LAST:event_SALIRActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
    pacientes.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnatrasActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
      
      
        int edad=0;
        int i = 0;
            try{
               i++;
           conectar cc= new conectar();
          Connection cn = cc.conexion(); 
        
           Statement instruccion= cn.createStatement();
          //insertando lo capturado  
           String apenom=txtapelli.getText()+txtnombre.getText();
           String  direc=txtdirec.getText();
           String  correo=txtcorreo.getText();
           String  sexo= cbsexo.getSelectedItem().toString();
           int  cel=Integer.parseInt(txtcel.getText());
        
   

            int año = fechanac.getCalendar().get(Calendar.YEAR);
            int mes = fechanac.getCalendar().get(Calendar.MONTH) + 1;
            int dia = fechanac.getCalendar().get(Calendar.DAY_OF_MONTH);
            String  fechanacimiento=""+año+mes+dia;
   
            int  dni=Integer.parseInt(txtdni.getText());
            String   lugarnac=txtlnaci.getText();
            String   nacionalidad=txtnacionalidad.getText();
            String   estadocivil=cbestado.getSelectedItem().toString();
             cod=apenom;
             
            nhistoria=cod.charAt(0)+""+cod.charAt(1)+""+cod.charAt(2)+""+i+"2017";
            txtnumeroh.setText(nhistoria);
             
            rutaimagen=(String.valueOf(fichero));
            //paraconvertir nuestra imgen a kbts
            FileInputStream archivofoto;
          
            archivofoto=new  FileInputStream (rutaimagen);
             //para  insertarlo en nuestra base de datoshacemos lo siguiente 
             //  imagen=setBinaryStream( ,archivofoto);
              short sex=0;
             if (sexo.equals("Masculino")){sex=1; }
           instruccion.executeUpdate("INSERT INTO pacientes(Apellidos_y_nombres,Direccion,Correo,Sexo,telefono"
                  + ",Fecha_Nacimiento,DNI,Lugar_de_nacimiento,Nacionalidad,Estado_civil,rutaimagen,imagen)"
                  + "VALUES('"+apenom+"','"+direc+"','"+correo+"','"+Short.toString(sex)+"','"+cel+"','"+fechanacimiento+"','"+dni
                  +"','"+lugarnac+"','"+nacionalidad+"','"+estadocivil+"','"+rutaimagen+"','"+archivofoto+"')");
          int Codigopaciente=0;
           ResultSet  tabla= instruccion.executeQuery("select CodigoPaciente from pacientes where DNI='"+dni+"'");
           while(tabla.next())
           {
               Codigopaciente=tabla.getInt("CodigoPaciente");
           }   
           
           instruccion.executeUpdate("INSERT INTO historiaClinica(NumeroHistoria,CodigoPaciente)"
                  + "VALUES('"+nhistoria+"',"+Integer.toString(Codigopaciente)+")");
           
        }
      
          catch(SQLException e)
        { System.out.println(e); }
       catch(Exception e){ System.out.println(e);}
        System.out.print("\n");
        
        
   
     JOptionPane.showMessageDialog(null,"Registro exitoso ");
        
        
        
    }//GEN-LAST:event_btnregistrarActionPerformed

    
    static  File fichero ;
    private void btncargarfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncargarfotoActionPerformed
   
        
        int resultado;
        cargarfoto ventana =new cargarfoto();
        
        //cargando un filtro para ver que tipo de imagenes 
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");

        ventana.jfchcargarfoto.setFileFilter(filtro);

        resultado= ventana.jfchcargarfoto.showOpenDialog(null);


        if (JFileChooser.APPROVE_OPTION == resultado){//si es que el usuario pone abrir o se ha legido un archivo 

        fichero = ventana.jfchcargarfoto.getSelectedFile();// se guarda el archivo que el usuario a selecionado su direccion
        try{
            
            
            

          ImageIcon icon = new ImageIcon(fichero.toString());//ruta de la imagen que el usuario a cargado
   //ajustando el tamaño de la imagen 
          Icon icono = new ImageIcon(icon.getImage().getScaledInstance(lblfoto.getWidth(), lblfoto.getHeight(), Image.SCALE_DEFAULT));
   //procedemos a mostrarla en el leibol
          lblfoto.setText(null);
               
          lblfoto.setIcon( icono );


        }catch(Exception ex){

           
        JOptionPane.showMessageDialog(null, "Error abriendo la   imagen "+ ex);
                 
        }
    
 }
        
    }//GEN-LAST:event_btncargarfotoActionPerformed

    private void btnimprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnimprimirActionPerformed
  
        
        
    }//GEN-LAST:event_btnimprimirActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
       txtuser.setText("");
       txtnombre.setText("");
       txtapelli.setText("");
       txtcorreo.setText(""); 
       txtcel.setText("");
       txtdirec.setText("");
       txtdni.setText("");
       txtnacionalidad.setText("");
       txtlnaci.setText("");
       cbsexo.setSelectedIndex(0);
       cbestado.setSelectedIndex(0);
       fechanac.setDate(null);
       jDatefecha.setDate(null);
       txtnumeroh.setText("");
       lblfoto.setText("");
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrarpaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
               
                new Registrarpaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SALIR;
    private javax.swing.JButton btnatras;
    private javax.swing.JButton btncargarfoto;
    private javax.swing.JButton btnimprimir;
    private javax.swing.JButton btnlimpiar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JComboBox cbestado;
    private javax.swing.JComboBox cbsexo;
    private com.toedter.calendar.JDateChooser fechanac;
    private com.toedter.calendar.JDateChooser jDatefecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblfoto;
    private javax.swing.JTextField txtapelli;
    private javax.swing.JTextField txtcel;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtdirec;
    private javax.swing.JTextField txtdni;
    private javax.swing.JTextField txtlnaci;
    private javax.swing.JTextField txtnacionalidad;
    private javax.swing.JTextField txtnombre;
    public static javax.swing.JTextField txtnumeroh;
    private javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
