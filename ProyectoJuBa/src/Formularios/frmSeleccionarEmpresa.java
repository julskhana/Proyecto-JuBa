/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.*;
import bd.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author julian
 */
public class frmSeleccionarEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form frmSeleccionarEmpresa
     * @param u
     * @param usuario
     */
    public frmSeleccionarEmpresa(usuario u) {
        initComponents();
        //datos del usuario
        System.out.println("Datos usuario: "+u.getCuenta());
        
        tfcuenta_usuario.setText(u.getCuenta());
        
        //cargar empresas del usuario
        //cargando datos de cliente a editar
        ConexionBD c = new ConexionBD();
        try{
            c.conectar();
            ArrayList<empresa> emps = c.cargarEmpresas(u.getId());
            c.desconectar();
            for (empresa emp:emps){
                String item = emp.getNombre();
                cbEmpresa.addItem(item);
                System.out.println(item);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los datos del registro","Cargar Empresas",JOptionPane.ERROR_MESSAGE);
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

        cbEmpresa = new javax.swing.JComboBox<>();
        btSeleccionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tfcuenta_usuario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Selección de Empresa");

        btSeleccionar.setText("Seleccionar");
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        jLabel1.setText("Empresa/s:");

        jLabel2.setText("Usuario:");

        tfcuenta_usuario.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btSeleccionar)
                    .addComponent(cbEmpresa, 0, 162, Short.MAX_VALUE)
                    .addComponent(tfcuenta_usuario))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfcuenta_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(btSeleccionar)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
        ConexionBD c = new ConexionBD();
        try{
            c.conectar();
            usuario u = c.obtenerDatosUsuario(tfcuenta_usuario.getText());
            empresa e = c.obtenerDatosEmpresa(cbEmpresa.getSelectedItem().toString());
            c.desconectar();
            frmPrincipal p = new frmPrincipal(e, u);
            p.setVisible(true);
            //this.dispose();
        }catch(Exception ex){
            System.out.println(ex);
        }        
    }//GEN-LAST:event_btSeleccionarActionPerformed
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JComboBox<String> cbEmpresa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tfcuenta_usuario;
    // End of variables declaration//GEN-END:variables
}
