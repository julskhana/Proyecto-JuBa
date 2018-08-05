package Formularios;

/**
 *
 * @author julian
 */
public class frmIngresoNuevaEmpresa extends javax.swing.JFrame {

    /**
     * Creates new form frmIngresoNuevaEmpresa
     */
    
    //identificador para usuarios en busqueda
    public static int id_usuario;
    
    public frmIngresoNuevaEmpresa() {
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

        btcancelar = new javax.swing.JButton();
        btingresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btBuscarUsuario = new javax.swing.JButton();
        tfnombre = new javax.swing.JTextField();
        tfruc = new javax.swing.JTextField();
        tfdirreccion = new javax.swing.JTextField();
        tfdirplanta = new javax.swing.JTextField();
        tftelefono = new javax.swing.JTextField();
        tfcorreo = new javax.swing.JTextField();
        tf_id_usuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ingreso de Empresas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btcancelar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btcancelar.setForeground(new java.awt.Color(255, 0, 51));
        btcancelar.setText("Cancelar");
        getContentPane().add(btcancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 120, 40));

        btingresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btingresar.setForeground(new java.awt.Color(255, 0, 51));
        btingresar.setText("Ingresar");
        getContentPane().add(btingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 120, 40));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("RUC:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("Direccion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Direccion Planta:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("Telefono:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 204, 0));
        jLabel6.setText("Correo:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 310, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 204, 0));
        jLabel7.setText("Usuario:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 360, -1, -1));

        btBuscarUsuario.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btBuscarUsuario.setForeground(new java.awt.Color(255, 0, 0));
        btBuscarUsuario.setText("Buscar");
        btBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(btBuscarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 360, 80, 30));

        tfnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnombreActionPerformed(evt);
            }
        });
        getContentPane().add(tfnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 90, 171, 30));
        getContentPane().add(tfruc, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 130, 171, 30));
        getContentPane().add(tfdirreccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 170, 171, 30));
        getContentPane().add(tfdirplanta, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 210, 171, 50));
        getContentPane().add(tftelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 270, 171, 30));
        getContentPane().add(tfcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 310, 171, 30));
        getContentPane().add(tf_id_usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 360, 88, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 610, 10));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("INGRESO NUEVA EMPRESA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 500, 50));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnombreActionPerformed

    private void btBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        frmBuscarUsuarioEmpresas bu = new frmBuscarUsuarioEmpresas();
        bu.setVisible(true);
    }//GEN-LAST:event_btBuscarUsuarioActionPerformed

    /**
     * @param args the command line arguments
     */
    private void limpiar(){
        tfnombre.setText("");
        tfruc.setText("");
        tfdirreccion.setText("");
        tfdirplanta.setText("");
        tftelefono.setText("");
        tfcorreo.setText("");
        tf_id_usuario.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscarUsuario;
    private javax.swing.JButton btcancelar;
    private javax.swing.JButton btingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tf_id_usuario;
    private javax.swing.JTextField tfcorreo;
    private javax.swing.JTextField tfdirplanta;
    private javax.swing.JTextField tfdirreccion;
    private javax.swing.JTextField tfnombre;
    private javax.swing.JTextField tfruc;
    private javax.swing.JTextField tftelefono;
    // End of variables declaration//GEN-END:variables
}
