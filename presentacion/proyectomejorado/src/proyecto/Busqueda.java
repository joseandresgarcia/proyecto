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



/**
 *
 * @author JESUS HAYLEN
 */
public class Busqueda extends javax.swing.JFrame {
    Atencion atencion;
    /**
     * Creates new form Busqueda
     */
     CrearHorario crearHorario;
     //DefaultTableModel p=new DefaultTableModel();
     int e,dni;
    public Busqueda() {
        initComponents();
        /*p.addColumn("AREA");
        p.addColumn("DOCTOR  ");
        p.addColumn("LUNES");
        p.addColumn("MARTES");
        p.addColumn("MIÉRCOLES");
        p.addColumn("JUEVES");
        p.addColumn("VIERNES");
        p.addColumn("SABADO");
        p.addColumn("DOMINGO");
        this.tblHorarios.setModel(p);*/
        areas ();
        Listar_Horarios("","");
    }

    public void Listar_Horarios(String area,String medico){
        conectar cc= new conectar();
        Connection cn = cc.conexion(); 
        
        Statement instruccion;
        
        try {
            instruccion = cn.createStatement();
            ResultSet  tabla= instruccion.executeQuery(
                    " select idHorario Nro,Areas_disponibles Area,Nombre,Dia,concat(concat(Hora_Inicio,' - '),Hora_fin) horario  "
                    + "from horarios " 
                    + "inner join doctores on doctores.idDoctores=horarios.idDoctores " 
                    + "Inner join Personal on Doctores.Personal_codigo=Personal.Codigo "
                    + "Inner join Areas on horarios.Area_Codigo=Areas.Codigo "
                    + "Where Areas.Areas_Disponibles like '%"+area+"%' and Personal.Nombre like '%"+medico+"%';");
            
            String Cabecera[]={"Nro","Area","Nombre","Lunes","Martes","Miércoles","Jueves","Viernes","Sábado","Domingo"};
            String Datos[][]={};
            DefaultTableModel tab=new DefaultTableModel(Datos,Cabecera);
            tblHorarios.setModel(tab);
            
            String Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo;
            
            while(tabla.next())
            {   Lunes=""; Martes=""; Miercoles=""; Jueves=""; Viernes=""; Sabado=""; Domingo="";
            
                if(tabla.getString("Dia").equals("Lunes")){Lunes=tabla.getString("Horario");}
                switch(tabla.getString("Dia")){
                    case "LUNES":
                        Lunes=tabla.getString("Horario");
                        break;
                    case "MARTES":
                        Martes=tabla.getString("Horario");
                        break;
                    case "MIERCOLES":
                        Miercoles=tabla.getString("Horario");
                        break;
                    case "JUEVES":
                        Jueves=tabla.getString("Horario");
                        break;
                    case "VIERNES":
                        Viernes=tabla.getString("Horario");
                        break;
                    case "SABADO":
                        Sabado=tabla.getString("Horario");
                        break;
                    default:
                        Domingo=tabla.getString("Dia");
                        break;
                }
                Object LisaHorario[]={Integer.toString(tabla.getInt("Nro")),tabla.getString("Area"),tabla.getString("Nombre"),
                    Lunes, Martes, Miercoles, Jueves, Viernes, Sabado, Domingo};
                    tab.addRow(LisaHorario);
            }    
            
        } catch (SQLException ex) {
            Logger.getLogger(CrearHorario_new.class.getName()).log(Level.SEVERE, null, ex);
        }


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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblHorarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnCita = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        cboArea = new javax.swing.JComboBox<>();
        cboMedicos = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblHorarios);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("BUSQUEDA");

        jLabel2.setText("MEDICOS:");

        jLabel4.setText("AREAS:");

        btnCita.setText("GENERAR CITA");
        btnCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCitaActionPerformed(evt);
            }
        });

        btnAtras.setText("ATRAS");
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

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

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnAtras)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCita))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 311, Short.MAX_VALUE)
                                .addComponent(btnBuscar)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(cboArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboMedicos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCita)
                    .addComponent(btnAtras))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        atencion.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCitaActionPerformed
       e=tblHorarios.getSelectedRow();
      if(e>=0){
        dni=Integer.parseInt(JOptionPane.showInputDialog("INGRESE DNI DEL PACIENTE"));
      }
    }//GEN-LAST:event_btnCitaActionPerformed

    private void cboAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboAreaActionPerformed
        ComboBoxString controlArea=(ComboBoxString)cboArea.getSelectedItem();
        medicos(controlArea.getID());
    }//GEN-LAST:event_cboAreaActionPerformed

    private void cboMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboMedicosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboMedicosActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        String Areas,Medicos;
        if (!cboArea.getSelectedItem().toString().equals("Elegir")){Areas=cboArea.getSelectedItem().toString();} else Areas="";
        if (!cboMedicos.getSelectedItem().toString().equals("Elegir")){Medicos=cboMedicos.getSelectedItem().toString();}else Medicos="";
        Listar_Horarios(Areas,Medicos);
    }//GEN-LAST:event_btnBuscarActionPerformed

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
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Busqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Busqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCita;
    private javax.swing.JComboBox<String> cboArea;
    private javax.swing.JComboBox<String> cboMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblHorarios;
    // End of variables declaration//GEN-END:variables
}
