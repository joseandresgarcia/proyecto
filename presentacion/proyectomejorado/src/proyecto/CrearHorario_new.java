/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import control.ComboBoxInt;
import control.ComboBoxString;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class CrearHorario_new extends javax.swing.JFrame {
  Creaciones creaciones;
//   int e;
    /**
     * Creates new form CrearHorario
     */
/*    Horario horario=new Horario();
    String areas,doctores,l1,l2,m1,m2,mi1,mi2,j1,j2,v1,v2,s1,s2,d1,d2;  
    String x[]=new String[9]; */
    public CrearHorario_new() {
       initComponents();
       areas();
       Listar();
          
    }
    
    DefaultComboBoxModel value1,value2;     
    public void  areas (){
        value1=new DefaultComboBoxModel();
        cboArea.setModel(value1);
        try{
            conectar cc= new conectar();
            Connection cn = cc.conexion(); 
         
            Statement instruccion= cn.createStatement();
            ResultSet tabla=instruccion.executeQuery("select Codigo, Areas_Disponibles from areas;");
            
            value1.addElement(new ComboBoxString("Elegir","Elegir"));
            while(tabla.next()){
               value1.addElement(new ComboBoxString(tabla.getString("Codigo"),tabla.getString("Areas_disponibles")));
               //choArea.addItem(tabla.getString("Areas_disponibles"));
            }
        }
        catch(SQLException e){
           System.out.println(e);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
       
       
       } 
    
    public void medicos(String codigoArea){
        value2=new DefaultComboBoxModel();
        cboMedicos.setModel(value2);
        try{
            conectar cc= new conectar();
            Connection cn = cc.conexion(); 
         
            Statement instruccion= cn.createStatement();
            ResultSet tabla=instruccion.executeQuery(
                    "select idDoctores,Nombre from Doctores Inner join Personal on Doctores.Personal_codigo=Personal.Codigo "
                            + "where areas_Codigo='"+codigoArea+"';");
            
            value2.addElement(new ComboBoxInt(0,"Elegir"));
            while(tabla.next()){
               value2.addElement(new ComboBoxInt(tabla.getInt("idDoctores"),tabla.getString("Nombre")));
               //choArea.addItem(tabla.getString("Areas_disponibles"));
            }
        }
        catch(SQLException e){
           System.out.println(e);
        }
        catch(Exception e){
           System.out.println(e.getMessage());
           JOptionPane.showMessageDialog(null, e.getMessage());
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cboArea = new javax.swing.JComboBox<>();
        cboMedicos = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cboDia = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cboInicio = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cboFin = new javax.swing.JComboBox<>();
        btnAlmacenar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("CREACION DE HORARIOS");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        cboArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboAreaActionPerformed(evt);
            }
        });

        cboMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboMedicosActionPerformed(evt);
            }
        });

        jLabel2.setText("AREA:");

        jLabel3.setText("MEDICOS:");

        cboDia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SÁBADO", "DOMINGO" }));
        cboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaActionPerformed(evt);
            }
        });

        jLabel14.setText("DIA:");

        jLabel15.setText("Inicio");

        cboInicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00 A.M.", "07:00 A.M.", "08:00 A.M.", "09:00 A.M.", "10:00 A.M.", "11:00 A.M.", "12:00 P.M.", "01:00 P.M.", "02:00 P.M.", "03:00 P.M.", "04:00 P.M.", "05:00 P.M.", "06:00 P.M.", "07:00 P.M.", "08:00 P.M.", "09:00 P.M.", "10:00 P.M.", "11:00 P.M.", "12:00 A.M." }));

        jLabel16.setText("FIn");

        cboFin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "06:00 A.M.", "07:00 A.M.", "08:00 A.M.", "09:00 A.M.", "10:00 A.M.", "11:00 A.M.", "12:00 P.M.", "01:00 P.M.", "02:00 P.M.", "03:00 P.M.", "04:00 P.M.", "05:00 P.M.", "06:00 P.M.", "07:00 P.M.", "08:00 P.M.", "09:00 P.M.", "10:00 P.M.", "11:00 P.M.", "12:00 A.M." }));

        btnAlmacenar.setText("ALMACENAR");
        btnAlmacenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlmacenarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboDia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cboMedicos, 0, 181, Short.MAX_VALUE)
                            .addComponent(cboInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboArea, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel2))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlmacenar)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(cboInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(cboFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAlmacenar)
                .addContainerGap())
        );

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tblHorarios);

        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("ATRAS");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(103, 103, 103)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnSalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*
    void almacen(){
            
        x[0]=String.valueOf(cboArea.getSelectedItem());
        x[1]=String.valueOf(cboMedicos.getSelectedItem());
        x[2]="  "+l1+"-"+l2+" "+String.valueOf(co1.getSelectedItem());
        x[3]="  "+m1+"-"+m2+" "+String.valueOf(cho2.getSelectedItem());
        x[4]="  "+mi1+"-"+mi2+" "+String.valueOf(cho3.getSelectedItem());
        x[5]="  "+j1+"-"+j2+" "+String.valueOf(cho4.getSelectedItem());
        x[6]="  "+v1+"-"+v2+" "+String.valueOf(cho5.getSelectedItem());
        x[7]="  "+s1+"-"+s2+" "+String.valueOf(cho6.getSelectedItem());
        x[8]="  "+d1+"-"+d2+" "+String.valueOf(cho7.getSelectedItem());
        
            
        }*/
    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
        ComboBoxString controlArea=(ComboBoxString)cboArea.getSelectedItem();
        medicos(controlArea.getID());
    }//GEN-LAST:event_cboAreaActionPerformed

    private void btnAlmacenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlmacenarActionPerformed
        ComboBoxString controlArea=(ComboBoxString)cboArea.getSelectedItem();
        ComboBoxInt controlMedico=(ComboBoxInt)cboMedicos.getSelectedItem();
        String area=controlArea.getID();
        int medico=controlMedico.getID();
        
        String dia,Hinicio,Hfin;
        dia=cboDia.getSelectedItem().toString();
        Hinicio=cboInicio.getSelectedItem().toString();
        Hfin=cboFin.getSelectedItem().toString();
        
        Almacenar(area,medico,dia,Hinicio,Hfin);
        Listar();
    }//GEN-LAST:event_btnAlmacenarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        int fila=tblHorarios.getSelectedRow();
        int CodigoHorario=Integer.parseInt(tblHorarios.getValueAt(fila, 0).toString());
        
        Eliminar(CodigoHorario);
        Listar();
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
     creaciones.setVisible(true);
      this.setVisible(false);
                
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicosActionPerformed

    private void cboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboDiaActionPerformed

    public void Almacenar(String Area,int Medico,String Dia,String HIn, String HFi){
        
        conectar cc= new conectar();
        Connection cn = cc.conexion(); 
        
        Statement instruccion;
        try {
            instruccion = cn.createStatement();
            int  res= instruccion.executeUpdate("insert into horarios (idDoctores,Dia,Hora_inicio,Hora_fin,Area_Codigo) "
                    + "values ("+Integer.toString(Medico)+",'"+Dia+"','"+HIn+"','"+HFi+"','"+Area+"');");
            
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se Creo el Horario para el Doctor " + cboMedicos.getSelectedItem().toString());
            }else
                JOptionPane.showMessageDialog(null, "No se ha podido crear el Horario" );
    
        } catch (SQLException ex) {
            Logger.getLogger(CrearHorario_new.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    public void Eliminar(int CodigoHorario){
        
        conectar cc= new conectar();
        Connection cn = cc.conexion(); 
        
        Statement instruccion;
        try {
            instruccion = cn.createStatement();
            int  res= instruccion.executeUpdate("delete From horarios where idHorario="+ CodigoHorario);
            
            if (res>0){
                JOptionPane.showMessageDialog(null, "Se elimino el Horario para el Doctor " + cboMedicos.getSelectedItem().toString());
            }else
                JOptionPane.showMessageDialog(null, "No se ha podido eliminar el Horario" );
    
        } catch (SQLException ex) {
            Logger.getLogger(CrearHorario_new.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
    
    
    public void Listar(){
        
        conectar cc= new conectar();
        Connection cn = cc.conexion(); 
        
        Statement instruccion;
        
        try {
            instruccion = cn.createStatement();
            ResultSet  tabla= instruccion.executeQuery(
                    "select idHorario Nro,Areas_disponibles Area,Nombre,Dia,Hora_Inicio Inicio,Hora_fin Fin "
                    + "from horarios " 
                    + "inner join doctores on doctores.idDoctores=horarios.idDoctores " 
                    + "Inner join Personal on Doctores.Personal_codigo=Personal.Codigo "
                    + "Inner join Areas on horarios.Area_Codigo=Areas.Codigo;");
            
            String Cabecera[]={"Nro","Area","Nombre","Dia","Inicio","Fin"};
            String Datos[][]={};
            DefaultTableModel tab=new DefaultTableModel(Datos,Cabecera);
            tblHorarios.setModel(tab);
            
            while(tabla.next())
            {
                Object LisaHorario[]={Integer.toString(tabla.getInt("Nro")),tabla.getString("Area"),tabla.getString("Nombre"),tabla.getString("Dia"),tabla.getString("Inicio"),tabla.getString("Fin")};
                tab.addRow(LisaHorario);
            }    
    
        } catch (SQLException ex) {
            Logger.getLogger(CrearHorario_new.class.getName()).log(Level.SEVERE, null, ex);
        }

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
            java.util.logging.Logger.getLogger(CrearHorario_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearHorario_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearHorario_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearHorario_new.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new CrearHorario_new().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlmacenar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboFin;
    private javax.swing.JComboBox<String> cboInicio;
    private javax.swing.JComboBox<String> cboMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHorarios;
    // End of variables declaration//GEN-END:variables
}
