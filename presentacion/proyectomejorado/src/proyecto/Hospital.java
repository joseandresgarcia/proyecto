/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;




/**
 *
 * @authores JESUS HAYLEN y JOSE ANDRES 
 */
public class Hospital extends javax.swing.JFrame  {
LogMedicos medicos=new LogMedicos();
 LogAdministrativo administrativo=new LogAdministrativo();    
  LogAdmision admision=new LogAdmision();
    LogCaja caja=new LogCaja(); 
       LogTriaje triaje=new LogTriaje();
       Desbloqueo desbloqueo=new Desbloqueo();
       LogInfomes loginformes=new LogInfomes();
       
    INFORME_DE_PACIENTES menuinforme=new INFORME_DE_PACIENTES();
    
    public Hospital() {
        initComponents();
        //hora 
        Timer tiempo=new Timer(100, new Hospital.hora());
        tiempo.start();
    
           //DISEÑO 
        setLocationRelativeTo(null);//para centrar el formulario 
        setResizable(false);//para que no se maximice la pantalla
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono2.png")).getImage());//paa cambiar el icono del jfrane
       //para cambiar el fondo
        ((JPanel)getContentPane()).setOpaque(false); ImageIcon dos=new
        ImageIcon(this.getClass().getResource("/imagenes/fondop2.jpg")); JLabel fondo2= new JLabel();
        fondo2.setIcon(dos); getLayeredPane().add(fondo2,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo2.setBounds(0,0,dos.getIconWidth(),dos.getIconHeight()); 
     
        
    }
    
     class hora implements ActionListener{
   
        public void actionPerformed(ActionEvent e) {
            Date sisthora=new Date();
            String pmAm="hh:mm:ss a";
            SimpleDateFormat format=new  SimpleDateFormat(pmAm);
            Calendar hoy=Calendar.getInstance();
            hora.setText(String.format(format.format(sisthora),hoy));
            
        }
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btncerrar = new javax.swing.JButton();
        btnTriaje = new javax.swing.JButton();
        btnCaja = new javax.swing.JButton();
        btnAdmision = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMedico = new javax.swing.JButton();
        btnAdministrativo = new javax.swing.JButton();
        btnDesbloqueo = new javax.swing.JButton();
        btninformes = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        btncerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerrarprincipal1.png"))); // NOI18N
        btncerrar.setBorder(null);
        btncerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btncerrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cerarilum1.png"))); // NOI18N
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        btnTriaje.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnTriaje.setForeground(new java.awt.Color(204, 0, 153));
        btnTriaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eferm.PNG"))); // NOI18N
        btnTriaje.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnTriaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTriaje.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnTriaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/traijeilum.PNG"))); // NOI18N
        btnTriaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTriajeActionPerformed(evt);
            }
        });

        btnCaja.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnCaja.setForeground(new java.awt.Color(204, 0, 153));
        btnCaja.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/caja.PNG"))); // NOI18N
        btnCaja.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnCaja.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCaja.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaja.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cajailum.PNG"))); // NOI18N
        btnCaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCajaActionPerformed(evt);
            }
        });

        btnAdmision.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnAdmision.setForeground(new java.awt.Color(204, 0, 153));
        btnAdmision.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivo.PNG"))); // NOI18N
        btnAdmision.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAdmision.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdmision.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdmision.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/archivoilum.PNG"))); // NOI18N
        btnAdmision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdmisionActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(0, 0, 51));
        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo7.jpg"))); // NOI18N
        jLabel1.setText("SISTEMA DE SALUD");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnMedico.setFont(new java.awt.Font("Arial", 1, 20)); // NOI18N
        btnMedico.setForeground(new java.awt.Color(204, 0, 153));
        btnMedico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/doctors.PNG"))); // NOI18N
        btnMedico.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnMedico.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMedico.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMedico.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/docilum.PNG"))); // NOI18N
        btnMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMedicoActionPerformed(evt);
            }
        });

        btnAdministrativo.setBackground(new java.awt.Color(0, 0, 0));
        btnAdministrativo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAdministrativo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/adminis.PNG"))); // NOI18N
        btnAdministrativo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btnAdministrativo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAdministrativo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAdministrativo.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admiilum.PNG"))); // NOI18N
        btnAdministrativo.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/admiilum.PNG"))); // NOI18N
        btnAdministrativo.setVerifyInputWhenFocusTarget(false);
        btnAdministrativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministrativoActionPerformed(evt);
            }
        });

        btnDesbloqueo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/desblokear.png"))); // NOI18N
        btnDesbloqueo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesbloqueoActionPerformed(evt);
            }
        });

        btninformes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informe.PNG"))); // NOI18N
        btninformes.setToolTipText("");
        btninformes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        btninformes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btninformes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btninformes.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/informeilum.PNG"))); // NOI18N
        btninformes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btninformesActionPerformed(evt);
            }
        });

        jButton2.setText("AYUDA");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setText("ADMINISTRATIVOS ");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setText("MEDICOS");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setText("ADMISION");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setText("TRIAJE");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setText("CAJA");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setText("INFORMES");

        hora.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        hora.setForeground(new java.awt.Color(255, 255, 255));
        hora.setText("jLabel8");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel2)
                .addGap(164, 164, 164)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(101, 101, 101))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addComponent(btnDesbloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(265, 265, 265)
                        .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmision, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninformes, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(227, 227, 227)
                .addComponent(jLabel7)
                .addGap(84, 84, 84))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(hora)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(31, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(hora)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMedico, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAdministrativo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTriaje, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCaja, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAdmision, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btninformes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDesbloqueo, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministrativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministrativoActionPerformed
      
       administrativo.hospital=this;
       administrativo.setVisible(true);
       this.setVisible(false);
       //dispose();
       
    }//GEN-LAST:event_btnAdministrativoActionPerformed

    private void btnMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMedicoActionPerformed
     
     medicos.hospital=this;
       medicos.setVisible(true);
       this.setVisible(false);
       //dispose();
    }//GEN-LAST:event_btnMedicoActionPerformed

    private void btnAdmisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdmisionActionPerformed
     
       triaje.hospital=this;
       triaje.setVisible(true);
       this.setVisible(false);
      // dispose();
    }//GEN-LAST:event_btnAdmisionActionPerformed

    private void btnCajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCajaActionPerformed
   
        caja.hospital=this;
       caja.setVisible(true);
       this.setVisible(false);
       //dispose();
    }//GEN-LAST:event_btnCajaActionPerformed

    private void btnTriajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTriajeActionPerformed

         admision.hospital=this;
         admision.setVisible(true);
        this.setVisible(false);
        //dispose();
    }//GEN-LAST:event_btnTriajeActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
      System.exit(0);
      
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnDesbloqueoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesbloqueoActionPerformed
      if(administrativo.i<3){
        JOptionPane.showMessageDialog(null,"EL SISTEMA SE ENCUENTRA DESBLOQUEADO..¡¡¡");
      }
      else{
        administrativo.calculo();
        this.setVisible(false);
      }
      
    }//GEN-LAST:event_btnDesbloqueoActionPerformed

    private void btninformesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btninformesActionPerformed
    
         loginformes.hospital=this;
         loginformes.setVisible(true);
         this.setVisible(false);
        
    }//GEN-LAST:event_btninformesActionPerformed

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
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hospital.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hospital().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btnAdministrativo;
    public static javax.swing.JButton btnAdmision;
    public static javax.swing.JButton btnCaja;
    private javax.swing.JButton btnDesbloqueo;
    public static javax.swing.JButton btnMedico;
    public static javax.swing.JButton btnTriaje;
    public static javax.swing.JButton btncerrar;
    private javax.swing.JButton btninformes;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
