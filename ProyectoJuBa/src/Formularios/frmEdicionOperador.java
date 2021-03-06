package Formularios;

import Objetos.operador;
import bd.ConexionBD;
import javax.swing.JOptionPane;

/**
 *
 * @author Jerson Junqui
 */
public class frmEdicionOperador extends javax.swing.JFrame {

    public frmMantenimientoOperador frm;
    /**
     * Creates new form frmEdicionOperador
     */
    public frmEdicionOperador(String id, frmMantenimientoOperador frm) {
        this.frm = frm;
        initComponents();
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfId = new javax.swing.JFormattedTextField();
        tfNombre = new javax.swing.JFormattedTextField();
        tfCedula = new javax.swing.JFormattedTextField();
        tfTelefono = new javax.swing.JFormattedTextField();
        cbTipo = new javax.swing.JComboBox<>();
        cbGuardar = new javax.swing.JButton();
        cbLimpiar = new javax.swing.JButton();
        cbSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 590, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("EDICIÓN OPERADOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 10, 310, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 160, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Cedula");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Teléfono");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Tipo");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, -1, -1));

        tfId.setEditable(false);
        getContentPane().add(tfId, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 110, 90, 30));
        getContentPane().add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 180, 30));
        getContentPane().add(tfCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 220, 180, 30));
        getContentPane().add(tfTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 280, 180, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operador de Alimento", "Operador de Maquinaria", "Operador de Transporte", "Operador de Seguridad" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, 180, 30));

        cbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbGuardar.setForeground(new java.awt.Color(255, 0, 0));
        cbGuardar.setText("GUARDAR");
        cbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 400, 140, 40));

        cbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        cbLimpiar.setText("LIMPIAR");
        cbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 400, 140, 40));

        cbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbSalir.setForeground(new java.awt.Color(255, 0, 0));
        cbSalir.setText("SALIR");
        cbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 130, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean formularioValido(){
        if(tfNombre.getText().equals("") ||
            tfCedula.getText().equals("") ||
            tfTelefono.getText().equals("") ||    
            cbTipo.getSelectedItem().equals("")){
            
           JOptionPane.showMessageDialog(this,"Formulario incompleto","Validación",JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void cbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGuardarActionPerformed
        ConexionBD c = new ConexionBD();
        if(formularioValido()){
            int id_operador       = Integer.parseInt(tfId.getText());
            String nombre         = tfNombre.getText();
            String cedula         = tfCedula.getText();
            String telefono       = tfTelefono.getText();
            String tipo           = (String)cbTipo.getSelectedItem();
            
            try{
                c.conectar();
                operador o = new operador(id_operador,nombre,cedula,telefono,tipo);
                if(c.editarOperador(o)){
                    JOptionPane.showMessageDialog(this,"Ingreso Exitoso","Validación",JOptionPane.INFORMATION_MESSAGE);
                
                }else
                    JOptionPane.showMessageDialog(this,"Ingreso Fallido","Validación",JOptionPane.ERROR_MESSAGE);
                
                c.desconectar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Ocurrio un problema durante el ingreso","Validación",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cbGuardarActionPerformed

    private void LimpiarFormulario(){
        tfNombre.setText(null);
        tfCedula.setText(null);
        tfTelefono.setText(null);
        cbTipo.setSelectedItem(null);
    }
    
    private void cbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLimpiarActionPerformed
        LimpiarFormulario();
    }//GEN-LAST:event_cbLimpiarActionPerformed

    private void cbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalirActionPerformed
        frmMantenimientoOperador mo = new frmMantenimientoOperador();
        mo.setVisible(true);
    }//GEN-LAST:event_cbSalirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbGuardar;
    private javax.swing.JButton cbLimpiar;
    private javax.swing.JButton cbSalir;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField tfCedula;
    private javax.swing.JFormattedTextField tfId;
    private javax.swing.JFormattedTextField tfNombre;
    private javax.swing.JFormattedTextField tfTelefono;
    // End of variables declaration//GEN-END:variables
}
