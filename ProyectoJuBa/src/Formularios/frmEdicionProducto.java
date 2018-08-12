package Formularios;

import Objetos.producto;
import bd.ConexionBD;
import javax.swing.JOptionPane;

/**
 *
 * @author Jerson Junqui
 */
public class frmEdicionProducto extends javax.swing.JFrame {

    /**
     * Creates new form frmEdicionProducto
     */
    public frmEdicionProducto() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfPesoIdeal = new javax.swing.JFormattedTextField();
        jLabel7 = new javax.swing.JLabel();
        cbProveedor = new javax.swing.JComboBox<>();
        tfNombreCientifico = new javax.swing.JFormattedTextField();
        tfNombre = new javax.swing.JFormattedTextField();
        tfId_producto = new javax.swing.JFormattedTextField();
        cbSalir = new javax.swing.JButton();
        cbLimpiar = new javax.swing.JButton();
        cbGuardar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("EDICIÓN PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 280, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 610, 10));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("ID Producto");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Nombre");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Nombre Cientifico");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 240, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Proveedor");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, 110, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Peso Ideal");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, -1, -1));
        getContentPane().add(tfPesoIdeal, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 330, 90, 30));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Kg");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 330, -1, -1));

        cbProveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nicovita", "Skretting" }));
        getContentPane().add(cbProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 280, 190, 30));
        getContentPane().add(tfNombreCientifico, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 190, 30));
        getContentPane().add(tfNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 190, 30));

        tfId_producto.setEditable(false);
        getContentPane().add(tfId_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 120, 90, 30));

        cbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbSalir.setForeground(new java.awt.Color(255, 0, 0));
        cbSalir.setText("SALIR");
        cbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 400, 130, 40));

        cbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        cbLimpiar.setText("LIMPIAR");
        cbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 400, 140, 40));

        cbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbGuardar.setForeground(new java.awt.Color(255, 0, 0));
        cbGuardar.setText("GUARDAR");
        cbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 400, 140, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalirActionPerformed
        frmMantenimientoProducto mo = new frmMantenimientoProducto();
        mo.setVisible(true);
    }//GEN-LAST:event_cbSalirActionPerformed

    private void LimpiarFormulario(){
        tfNombre.setText(null);
        tfNombreCientifico.setText(null);
        cbProveedor.setSelectedItem(null);
        tfPesoIdeal.setText(null);
    }
    
    private void cbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLimpiarActionPerformed
        LimpiarFormulario();
    }//GEN-LAST:event_cbLimpiarActionPerformed

    private boolean formularioValido(){
        if(tfNombre.getText().equals("") ||
            tfNombreCientifico.getText().equals("") ||
            cbProveedor.getSelectedItem().equals("") ||
            tfPesoIdeal.getText().equals("")){  
            JOptionPane.showMessageDialog(this, "Formulario incompleto!", "Ingreso", JOptionPane.ERROR_MESSAGE);
            return false;
        }return true;
    }
    
    private void cbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGuardarActionPerformed
        ConexionBD c = new ConexionBD();
        if(formularioValido()){
            int id_producto             = Integer.parseInt(tfId_producto.getText());
            String nombre               = tfNombre.getText();
            String nombre_cientifico    = tfNombreCientifico.getText();
            String proveedor            = cbProveedor.getSelectedItem().toString();
            int peso_ideal              = Integer.parseInt(tfPesoIdeal.getText());

            try{
                c.conectar();
                producto o = new producto(id_producto,nombre,nombre_cientifico,proveedor,peso_ideal);
                if(c.editarProducto(o)){
                    JOptionPane.showMessageDialog(this,"Ingreso Exitoso","Validación",JOptionPane.INFORMATION_MESSAGE);

                }else
                JOptionPane.showMessageDialog(this,"Ingreso Fallido","Validación",JOptionPane.ERROR_MESSAGE);

                c.desconectar();
            }catch(Exception e){
                JOptionPane.showMessageDialog(this,"Ocurrio un problema durante el ingreso","Validación",JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_cbGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbGuardar;
    private javax.swing.JButton cbLimpiar;
    private javax.swing.JComboBox<String> cbProveedor;
    private javax.swing.JButton cbSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField tfId_producto;
    private javax.swing.JFormattedTextField tfNombre;
    private javax.swing.JFormattedTextField tfNombreCientifico;
    private javax.swing.JFormattedTextField tfPesoIdeal;
    // End of variables declaration//GEN-END:variables
}