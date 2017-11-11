/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

import javax.swing.table.DefaultTableModel;
import static proyecto.citas.cboareas;


public class CrearArea extends javax.swing.JFrame {
    Creaciones creaciones;
  
    
    String carea;
    String cod;
    int i=0;
    DefaultTableModel m=new DefaultTableModel();
    public CrearArea() {
        initComponents();

          //DISEÑO 
        setLocationRelativeTo(null);//para centrar el formulario 
        setResizable(false);//para que no se maximice la pantalla
        
        imprimir();
        this.tableT.setModel(m);
    }
    public void imprimir(){
      String titulo[]={"Codigo","Areas_disponibles"};
      String datos[]=new String[50];
      try{
            conectar cc= new conectar();
             Connection cn = cc.conexion(); 
        
       
          Statement instruccion= cn.createStatement();
          ResultSet tabla=instruccion.executeQuery("select * from areas");
           m=new DefaultTableModel(null,titulo); 
           while(tabla.next()){
              datos[0]=tabla.getString("Codigo");
              datos[1]=tabla.getString("Areas_disponibles");
              m.addRow(datos);
           }
          tableT.setModel(m);
         }
           
       catch(SQLException e){
           System.out.println(e);
       }
       catch(Exception e){
           System.out.println(e);
       }
        
        
    }
  
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCreararea = new javax.swing.JTextPane();
        btnRegistrar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableT = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 204));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 51));
        jLabel1.setText("INGRESE NOMBRE DE LA NUEVA ÁREA A CREAR ");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 590, -1));

        jScrollPane1.setViewportView(txtCreararea);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 415, 30));

        btnRegistrar.setBackground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setFont(new java.awt.Font("Arial Black", 1, 10)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/registrar_1.png"))); // NOI18N
        btnRegistrar.setText("REGISTRAR");
        btnRegistrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 60, -1, 40));

        btnAtras.setBackground(new java.awt.Color(0, 0, 0));
        btnAtras.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAtras.setForeground(new java.awt.Color(255, 255, 255));
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back.png"))); // NOI18N
        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 120, 40));

        tableT.setBackground(new java.awt.Color(102, 102, 102));
        tableT.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        tableT.setForeground(new java.awt.Color(255, 255, 255));
        tableT.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tableT);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 490, 160));

        btnEliminar.setBackground(new java.awt.Color(0, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, 140, 40));

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setText("SELECCIONAR FILA PARA ELIMINAR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 330, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondoarea.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 650, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        creaciones.setVisible(true);
        this.setVisible(false);
// dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        carea=txtCreararea.getText();
       
        i++;
            try{
         
          conectar cc= new conectar();
      Connection cn = cc.conexion(); 
        
          Statement instruccion= cn.createStatement();
     
           String espe=txtCreararea.getText();
           
           cod=carea.charAt(0)+""+carea.charAt(1)+""+carea.charAt(2)+""+carea.charAt(3)+i;
               
          ResultSet  tabla= instruccion.executeQuery("select * from areas");
           while(tabla.next())
           {}         
          instruccion.executeUpdate("INSERT INTO areas(Codigo,Areas_disponibles)VALUES('"+cod+"','"+espe+"')");

       
        }
     
          catch(SQLException e)
        { System.out.println(e); }
       catch(Exception e){ System.out.println(e);}
        System.out.print("\n");
        
         imprimir();
        
        txtCreararea.setText("");
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
    
       //-------------------------------------------------------------------------------------
     int fila=tableT.getSelectedRow();
     cod="";
     cod=tableT.getValueAt(fila,0).toString();
      try
      {
               conectar cc= new conectar();
              Connection cn = cc.conexion();
              
   
         Statement instruccion =cn.createStatement();   
         
       
         int j=instruccion.executeUpdate("DELETE FROM areas WHERE Codigo='"+cod+"'");
         if(j==1){
             
          imprimir();
             JOptionPane.showMessageDialog(null,"se elimino correctamente ");

         }
         else {
         JOptionPane.showMessageDialog(null,"NO SE SELECCIONO FILA O LA TABLA ESTA VACIA...!!! ");
         }
        }
       
        catch(SQLException e){ System.out.println("No se encuentra el area a eliminar "); }   
        catch(Exception e){ System.out.println(e); }
       
       
       
       
       
       
       
       
       
       
       
    }//GEN-LAST:event_btnEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(CrearArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearArea.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
                new CrearArea().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tableT;
    private javax.swing.JTextPane txtCreararea;
    // End of variables declaration//GEN-END:variables
}
