/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import proyecto.Hospital.hora;

/**
 *
 * @author EFE-VES
 */
public class pacientes extends javax.swing.JFrame {
        Registrarpaciente registrarpaciente=new Registrarpaciente();
        Consultas consultas;   
      static  DefaultTableModel table;
    
      
    /**
     * Creates new form pacientes
     */
    public pacientes() {
        initComponents();
        
        //DISEÑO 
        setLocationRelativeTo(null);//para centrar el formulario 
        setResizable(false);//para que no se maximice la pantalla
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/icono2.png")).getImage());//paa cambiar el icono del jfrane
       //para cambiar el fondo
        ((JPanel)getContentPane()).setOpaque(false); ImageIcon dos=new
        ImageIcon(this.getClass().getResource("/imagenes/pacientes.jpg")); JLabel fondo2= new JLabel();
        fondo2.setIcon(dos); getLayeredPane().add(fondo2,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo2.setBounds(0,0,dos.getIconWidth(),dos.getIconHeight()); 
     
        
        
        
        
        
        
        
        imprimir();
 
    }
   public  static  void imprimir(){
      String titulo[]={"CodigoPaciente","Apell.nombr","Direcc.","Correo","Sexo","Telf","fec.nacimiento","DNI","Lugar nac.","Nacion.","Estado c."};
      String datos[]=new String[50];
      try{
           
            conectar cc= new conectar();
             Connection cn = cc.conexion();
           Statement instruccion= cn.createStatement();
           ResultSet tabla=instruccion.executeQuery("select * from pacientes");
           table=new DefaultTableModel(null,titulo); 
           while(tabla.next()){
               
              datos[0]=tabla.getString("CodigoPaciente");
              datos[1]=tabla.getString("Apellidos_y_nombres");
              datos[2]=tabla.getString("Direccion");
              datos[3]=tabla.getString("Correo");
              datos[4]=tabla.getString("Sexo");
              datos[5]=tabla.getString("telefono");
              datos[6]=tabla.getString("Fecha_Nacimiento");
              datos[7]=tabla.getString("DNI");
              datos[8]=tabla.getString("Lugar_de_nacimiento");
              datos[9]=tabla.getString("Nacionalidad");
              datos[10]=tabla.getString("Estado_civil");
          
              
              table.addRow(datos);
           }
          tabla01.setModel(table);
         }
        
       catch(SQLException e){
           System.out.println(e);
       }
       catch(Exception e){
           System.out.println(e);
       }
      
      
 }
   public  void buscarpaciente(String  texto){
   try{
    String datos[]=new String[50];
    String titulos[]={"CodigoPaciente","Apell.nombr","Direcc.","Correo","Sexo","Telf","fec.nacimiento","DNI","Lugar nac.","Nacion.","Estado c."};
    String filtro=""+texto+"%";
    String SQL="select *from pacientes where DNI like"+'"'+filtro+'"';
   
       table=new DefaultTableModel(null,titulos);
           conectar cc= new conectar();
      Connection cn = cc.conexion(); 
        
           Statement instruccion= cn.prepareStatement(SQL);
           ResultSet tabla=instruccion.executeQuery(SQL);
           table=new DefaultTableModel(null,titulos); 
           while(tabla.next()){
              datos[0]=tabla.getString("CodigoPaciente");
              datos[1]=tabla.getString("Apellidos_y_nombres");
              datos[2]=tabla.getString("Direccion");
              datos[3]=tabla.getString("Correo");
              datos[4]=tabla.getString("Sexo");
              datos[5]=tabla.getString("telefono");
              datos[6]=tabla.getString("Fecha_Nacimiento");
              datos[7]=tabla.getString("DNI");
              datos[8]=tabla.getString("Lugar_de_nacimiento");
              datos[9]=tabla.getString("Nacionalidad");
              datos[10]=tabla.getString("Estado_civil");
             
              
              table.addRow(datos);
           }
          tabla01.setModel(table);
          tabla.close();
          instruccion.close();
          
         
      }
       catch(Exception e){
           System.out.println(e);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tabla01 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtbusqueda = new javax.swing.JTextField();
        btningresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnatras = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnactualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btneliminarpac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tabla01.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Título 5", "Título 6", "Título 7", "Título 8", "Título 9", "Título 10"
            }
        ));
        jScrollPane1.setViewportView(tabla01);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("LISTADO DE PACIENTES");

        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });
        txtbusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtbusquedaKeyReleased(evt);
            }
        });

        btningresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/nuevopac.png"))); // NOI18N
        btningresar.setText("NUEVO PACIENTE");
        btningresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btningresarActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE DNI   :");

        btnatras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/atras_1.png"))); // NOI18N
        btnatras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnatrasActionPerformed(evt);
            }
        });

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imprimir.jpg"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton2.setHideActionText(true);
        jButton2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnactualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/edit_page.png"))); // NOI18N
        btnactualizar.setText("ACTUALIZAR");
        btnactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnactualizarActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/BUSCAR.png"))); // NOI18N

        btneliminarpac.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trash.png"))); // NOI18N
        btneliminarpac.setText("ELIMINAR");
        btneliminarpac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneliminarpacActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(27, 27, 27)
                                        .addComponent(btningresar)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btneliminarpac, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 424, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(351, 351, 351))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnatras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btningresar)
                            .addComponent(btnactualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9))
                    .addComponent(btneliminarpac, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnatras)
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btningresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btningresarActionPerformed
     
        registrarpaciente.pacientes=this;
        registrarpaciente.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_btningresarActionPerformed

    private void btnatrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnatrasActionPerformed
       consultas.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btnatrasActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
   try
        {
           
            MessageFormat Titulo= new MessageFormat("LISTA DE PACIENTES REGISTRADOS");
   
         
            MessageFormat Pie=new MessageFormat("");
           
            tabla01.print(JTable.PrintMode.FIT_WIDTH,Titulo,Pie);
        }
        catch(PrinterException e)
        {
            Logger.getLogger(pacientes.class.getName()).log(Level.SEVERE,null,e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnactualizarActionPerformed
    
        imprimir();
        
        
        
    }//GEN-LAST:event_btnactualizarActionPerformed

    private void txtbusquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtbusquedaKeyReleased
     String buscar=txtbusqueda.getText();
        buscarpaciente(buscar);
        
        
        
    }//GEN-LAST:event_txtbusquedaKeyReleased

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void btneliminarpacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneliminarpacActionPerformed
      int fila=tabla01.getSelectedRow();
  
     int paciente=Integer.parseInt(tabla01.getValueAt(fila, 0).toString());

     eliminar2(paciente);

    
   
    }//GEN-LAST:event_btneliminarpacActionPerformed
       public   void eliminar2(int paciente){
      
       conectar cc= new conectar();
       Connection cn = cc.conexion();
              
      try
        {
              
            
              Statement instruccion = cn.createStatement();  
         
       
        int  j= instruccion.executeUpdate("delete From  historiaclinica where  CodigoPaciente ="+ paciente);
                
         if(j>0) {
              int  k= instruccion.executeUpdate("delete From   pacientes where  CodigoPaciente ="+ paciente);
                
              if(k>0){
             
        
               JOptionPane.showMessageDialog(null,"se elimino correctamente ");
               imprimir();  
 
               }
           
         }
         else{
         JOptionPane.showMessageDialog(null,"NO SE SELECCIONO FILA O LA TABLA ESTA VACIA...!!! ");
             }
        }
           
        catch(SQLException e){ System.out.println("No se encuentra el paciente  a eliminar "); }   
       
        
      
      
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
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnactualizar;
    private javax.swing.JButton btnatras;
    public javax.swing.JButton btneliminarpac;
    public static javax.swing.JButton btningresar;
    public javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tabla01;
    private javax.swing.JTextField txtbusqueda;
    // End of variables declaration//GEN-END:variables

  
}
