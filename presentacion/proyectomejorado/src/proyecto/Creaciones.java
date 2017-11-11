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

/**
 *
 * @author JESUS HAYLEN y jose andres
 */
public class Creaciones extends javax.swing.JFrame {
CrearArea creararea=new CrearArea();
CrearCuentas crearcuentas=new CrearCuentas();
CrearHorario crearhorario=new CrearHorario();
Controles controles;
    /**
     * Creates new form Creaciones
     */
    public Creaciones() {
        initComponents();
                 //DISEÑO 
          setLocationRelativeTo(null);//para centrar el formulario 
          setResizable(false);//para que no se maximice la pantalla
          setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono5.png")).getImage());//paa cambiar el icono del jfrane
         //para cambiar el fondo
          ((JPanel)getContentPane()).setOpaque(false); ImageIcon dos=new
          ImageIcon(this.getClass().getResource("/imagenes/fondocrear.jpg")); JLabel fondo2= new JLabel();
          fondo2.setIcon(dos); getLayeredPane().add(fondo2,JLayeredPane.FRAME_CONTENT_LAYER);
          fondo2.setBounds(0,0,dos.getIconWidth(),dos.getIconHeight());  
        
        
        
        
        
        
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnArea = new javax.swing.JButton();
        btnCuentas = new javax.swing.JButton();
        btnHorarios = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        jButton2.setText("jButton2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 255, 0));
        jLabel3.setText("CREAR Y ELIMINAR");

        btnArea.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnArea.setForeground(new java.awt.Color(102, 255, 0));
        btnArea.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atencion-digna.png"))); // NOI18N
        btnArea.setText("AREAS");
        btnArea.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnCuentas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnCuentas.setForeground(new java.awt.Color(51, 255, 0));
        btnCuentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/personal.png"))); // NOI18N
        btnCuentas.setText("CUENTAS");
        btnCuentas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentasActionPerformed(evt);
            }
        });

        btnHorarios.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHorarios.setForeground(new java.awt.Color(51, 255, 0));
        btnHorarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iconohorarios.png"))); // NOI18N
        btnHorarios.setText("HORARIOS");
        btnHorarios.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHorarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHorariosActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras.png"))); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnAtras))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(btnCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(148, 148, 148))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCuentas)
                    .addComponent(btnHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnAtras)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    void procesos1(){
      crearhorario.e=crearhorario.choArea.getSelectedIndex();
      if(crearhorario.e==0){
        crearhorario.choMedicos.setEnabled(false); 
        crearhorario.txtL1.setEditable(false); 
        crearhorario.txtL2.setEditable(false); 
        crearhorario.txtM1.setEditable(false); 
        crearhorario.txtM2.setEditable(false); 
        crearhorario.txtMi1.setEditable(false); 
        crearhorario.txtMi2.setEditable(false); 
        crearhorario.txtJ1.setEditable(false); 
        crearhorario.txtJ2.setEditable(false); 
        crearhorario.txtV1.setEditable(false); 
        crearhorario.txtV2.setEditable(false); 
        crearhorario.txtS1.setEditable(false); 
        crearhorario.txtS2.setEditable(false); 
        crearhorario.txtD1.setEditable(false); 
        crearhorario.txtD2.setEditable(false); 
        crearhorario.btnAlmacenar.setEnabled(false);
        crearhorario.cho1.setEnabled(false);
        crearhorario.cho2.setEnabled(false);
        crearhorario.cho3.setEnabled(false);
        crearhorario.cho4.setEnabled(false);
        crearhorario.cho5.setEnabled(false);
        crearhorario.cho6.setEnabled(false);
        crearhorario.cho7.setEnabled(false);
      }
      else{    
        crearhorario.choMedicos.setEnabled(true);
      }
      
    }
    void procesos2(){
         crearhorario.e=crearhorario.choMedicos.getSelectedIndex();
      if(crearhorario.e!=0)
      {
        crearhorario.txtL1.setEditable(true); 
        crearhorario.txtL2.setEditable(true); 
        crearhorario.txtM1.setEditable(true); 
        crearhorario.txtM2.setEditable(true); 
        crearhorario.txtMi1.setEditable(true); 
        crearhorario.txtMi2.setEditable(true); 
        crearhorario.txtJ1.setEditable(true); 
        crearhorario.txtJ2.setEditable(true); 
        crearhorario.txtV1.setEditable(true); 
        crearhorario.txtV2.setEditable(true); 
        crearhorario.txtS1.setEditable(true); 
        crearhorario.txtS2.setEditable(true); 
        crearhorario.txtD1.setEditable(true); 
        crearhorario.txtD2.setEditable(true); 
        crearhorario.btnAlmacenar.setEnabled(true);
        crearhorario.cho1.setEnabled(true);
        crearhorario.cho2.setEnabled(true);
        crearhorario.cho3.setEnabled(true);
        crearhorario.cho4.setEnabled(true);
        crearhorario.cho5.setEnabled(true);
        crearhorario.cho6.setEnabled(true);
        crearhorario.cho7.setEnabled(true);
      }
    }
    
    private void btnHorariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHorariosActionPerformed
      procesos1();
      crearhorario.creaciones=this;
      crearhorario.setVisible(true);
      this.setVisible(false);
    }//GEN-LAST:event_btnHorariosActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        controles.setVisible(true);
        this.setVisible(false);
// dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        
        creararea.creaciones=this;
        creararea.setVisible(true);
        this.setVisible(false);
       
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentasActionPerformed
        crearcuentas.creaciones=this;
        crearcuentas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnCuentasActionPerformed

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
            java.util.logging.Logger.getLogger(Creaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Creaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Creaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Creaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Creaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCuentas;
    private javax.swing.JButton btnHorarios;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
