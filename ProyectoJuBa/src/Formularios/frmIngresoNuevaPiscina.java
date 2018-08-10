package Formularios;

/**
 *
 * @author Jerson Junqui
 */
public class frmIngresoNuevaPiscina extends javax.swing.JFrame {

    //identificador para empresa en busqueda
    public static int ingresar_id_empresa;
    
    /**
     * Creates new form frmIngresoNuevaPiscina
     */
    public frmIngresoNuevaPiscina() {
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
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        tfDescripcion = new javax.swing.JFormattedTextField();
        tfLongitud_ancho = new javax.swing.JFormattedTextField();
        tfLongitud_largo = new javax.swing.JFormattedTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tfId_empresa = new javax.swing.JFormattedTextField();
        tfId_producto = new javax.swing.JFormattedTextField();
        tfArea = new javax.swing.JFormattedTextField();
        tfPoblacion = new javax.swing.JFormattedTextField();
        cbGuardar = new javax.swing.JButton();
        cbLimpiar = new javax.swing.JButton();
        cbSalir = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        cbForma = new javax.swing.JComboBox<>();
        jLabel16 = new javax.swing.JLabel();
        cbUbicacion = new javax.swing.JComboBox<>();
        cbBuscar_empresa = new javax.swing.JButton();
        cbBuscar_producto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 590, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("INGRESO NUEVA PISCINA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, 390, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Descripción");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Ubicación");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Longitud Ancho");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Longitud Largo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Área");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Tipo");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 204, 0));
        jLabel9.setText("Forma");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 204, 0));
        jLabel10.setText("Población");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 204, 0));
        jLabel11.setText("ID Empresa");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 204, 0));
        jLabel12.setText("ID Producto");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));
        getContentPane().add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 330, 30));
        getContentPane().add(tfLongitud_ancho, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, 110, 30));
        getContentPane().add(tfLongitud_largo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 250, 110, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 204, 0));
        jLabel13.setText("camarones");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 350, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 204, 0));
        jLabel14.setText("metros");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 90, 30));
        getContentPane().add(tfId_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 60, 30));
        getContentPane().add(tfId_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 300, 60, 30));
        getContentPane().add(tfArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 300, 110, 30));
        getContentPane().add(tfPoblacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 350, 90, 30));

        cbGuardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbGuardar.setForeground(new java.awt.Color(255, 0, 0));
        cbGuardar.setText("GUARDAR");
        cbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(cbGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 140, 40));

        cbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbLimpiar.setForeground(new java.awt.Color(255, 0, 0));
        cbLimpiar.setText("LIMPIAR");
        cbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cbLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 430, 130, 40));

        cbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbSalir.setForeground(new java.awt.Color(255, 0, 0));
        cbSalir.setText("SALIR");
        cbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 430, 140, 40));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("metros");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 250, 90, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Piscina de Larvas", "Piscinas de Langostinos" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, 150, 30));

        cbForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangular", "Circular", "Cuadrada" }));
        getContentPane().add(cbForma, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 350, 130, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 204, 0));
        jLabel16.setText("metros cuadrados");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 300, 170, 30));

        cbUbicacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Base 1", "Base 2", "Base 3", "Base 4", "Marbeth Durán" }));
        getContentPane().add(cbUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 110, 30));

        cbBuscar_empresa.setText("BUSCAR");
        cbBuscar_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscar_empresaActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscar_empresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 80, 30));

        cbBuscar_producto.setText("BUSCAR");
        cbBuscar_producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscar_productoActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscar_producto, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 80, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Método utilizado para limpiar los campos del formulario.
     */
    private void LimpiarFormulario(){
        tfDescripcion.setText(null);
        cbUbicacion.setSelectedItem(null);
        tfLongitud_ancho.setText(null);
        tfLongitud_largo.setText(null);
        tfArea.setText(null);
        cbTipo.setSelectedItem(null);
        cbForma.setSelectedItem(null);
        tfPoblacion.setText(null);
        tfId_empresa.setText(null);
        tfId_producto.setText(null);
    }
    
    private void cbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbLimpiarActionPerformed
        LimpiarFormulario();
    }//GEN-LAST:event_cbLimpiarActionPerformed

    private void cbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalirActionPerformed
        frmMantenimientoPiscina mo = new frmMantenimientoPiscina();
        mo.setVisible(true);
    }//GEN-LAST:event_cbSalirActionPerformed

    private void cbBuscar_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscar_empresaActionPerformed
        frmBuscarIdEmpresa bie = new frmBuscarIdEmpresa();
        bie.setVisible(true);
    }//GEN-LAST:event_cbBuscar_empresaActionPerformed

    private void cbBuscar_productoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscar_productoActionPerformed
        
    }//GEN-LAST:event_cbBuscar_productoActionPerformed

    private void cbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGuardarActionPerformed
        
    }//GEN-LAST:event_cbGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbBuscar_empresa;
    private javax.swing.JButton cbBuscar_producto;
    private javax.swing.JComboBox<String> cbForma;
    private javax.swing.JButton cbGuardar;
    private javax.swing.JButton cbLimpiar;
    private javax.swing.JButton cbSalir;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JFormattedTextField tfArea;
    private javax.swing.JFormattedTextField tfDescripcion;
    public static javax.swing.JFormattedTextField tfId_empresa;
    private javax.swing.JFormattedTextField tfId_producto;
    private javax.swing.JFormattedTextField tfLongitud_ancho;
    private javax.swing.JFormattedTextField tfLongitud_largo;
    private javax.swing.JFormattedTextField tfPoblacion;
    // End of variables declaration//GEN-END:variables
}
