package Formularios;

import Objetos.empresa;
import Objetos.usuario;
import bd.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class frmMantenimientoEmpresas extends javax.swing.JFrame {

    /**
     * Creates new form frmUsuarios
     */
    public frmMantenimientoEmpresas() {
        initComponents();
        
        btEliminar.enable(false);
        btEditar.enable(false);
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
        tbempresa = new javax.swing.JTable();
        cbtipo = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btNuevaEmpresa = new javax.swing.JButton();
        btEliminar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbSalir = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantenimiento Empresas");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbempresa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "RUC", "Direccion", "Planta", "Telefono", "Correo", "Id Usuario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbempresa);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 750, 200));

        cbtipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id", "Nombre", "Ruc", "Direccion", "Direccion Planta", "Telefono", "Correo", "Id Usuario" }));
        getContentPane().add(cbtipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 40));
        getContentPane().add(tfdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 300, 40));

        btConsultar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btConsultar.setForeground(new java.awt.Color(255, 0, 0));
        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(btConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 120, 130, 40));

        btNuevaEmpresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btNuevaEmpresa.setForeground(new java.awt.Color(255, 0, 0));
        btNuevaEmpresa.setText("Nuevo");
        btNuevaEmpresa.setMaximumSize(new java.awt.Dimension(80, 32));
        btNuevaEmpresa.setMinimumSize(new java.awt.Dimension(80, 32));
        btNuevaEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaEmpresaActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevaEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 413, 140, 40));

        btEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEliminar.setForeground(new java.awt.Color(255, 0, 0));
        btEliminar.setText("Eliminar");
        btEliminar.setMaximumSize(new java.awt.Dimension(80, 32));
        btEliminar.setMinimumSize(new java.awt.Dimension(80, 32));
        btEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 120, 40));

        btEditar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEditar.setForeground(new java.awt.Color(255, 0, 0));
        btEditar.setText("Editar");
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });
        getContentPane().add(btEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 410, 130, 40));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("Descripcion:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 140, -1));

        cbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbSalir.setForeground(new java.awt.Color(255, 0, 0));
        cbSalir.setText("Salir");
        cbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSalirActionPerformed(evt);
            }
        });
        getContentPane().add(cbSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 410, 140, 40));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 610, 10));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 204, 0));
        jLabel15.setText("MANTENIMIENTO EMPRESA");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 540, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevaEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaEmpresaActionPerformed
        frmIngresoNuevaEmpresa ine = new frmIngresoNuevaEmpresa();
        ine.setVisible(true);
    }//GEN-LAST:event_btNuevaEmpresaActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        if (formularioConsultaValido()){
            consultarRegistro();
            btEliminar.enable(true);
            btEditar.enable(true);
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    private void btEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarActionPerformed
        // TODO add your handling code here:
        
        /*if (seleccionEliminacionValida()){
            ConexionBD c = new ConexionBD();
            try{
                c.conectar();
                int filas[] =tbusuario.getSelectedRows();
                    for (int i = 0; i < filas.length; i++) {
                        int fila = filas[i];
                        String id = tbusuario.getValueAt(fila,0).toString();
                        if(!c.eliminarUsuario(Integer.parseInt(id))){
                            JOptionPane.showMessageDialog(this,"Ocurrió un error en la eliminación","Eliminación",JOptionPane.ERROR_MESSAGE);
                            return ;
                        }
                    }
            }catch(Exception e){
                System.out.println(e);
            }
            c.desconectar();
        }
        if(formularioConsultaValidoA()){
            consultarRegistro();}
        */
    }//GEN-LAST:event_btEliminarActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btEditarActionPerformed

    private void cbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_cbSalirActionPerformed
    
    public void consultarRegistro(){
        String tipo = cbtipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBD c = new ConexionBD();
                c.conectar();
                //creacion de array lists que contentran las empresas
                ArrayList<empresa> registro = c.consultarEmpresas("","empresa");
                ArrayList<empresa> resultado = new ArrayList<empresa>();
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (empresa emp:registro){
                        if(tipo.equals("Id")&&(descripcion.length()>0)){
                            if(String.valueOf(emp.getId_empresa()).equals(descripcion) ){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Nombre")){
                            if(emp.getNombre().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Ruc")){
                            if(emp.getRuc().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Direccion")){
                            if(emp.getDireccion().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Direccion Planta")){
                            if(emp.getDireccion_planta().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Telefono")){
                            if(emp.getTelefono().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Correo")){
                            if(emp.getCorreo().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }

                DefaultTableModel dtm = (DefaultTableModel)tbempresa.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (empresa em:resultado){
                    Object[] fila = new Object[8];
                    fila[0] = em.getId_empresa();
                    fila[1] = em.getNombre();
                    fila[2] = em.getRuc();
                    fila[3] = em.getDireccion();
                    fila[4] = em.getDireccion_planta();
                    fila[5] = em.getTelefono();
                    fila[6] = em.getCorreo();
                    fila[7] = em.getId_usuario();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar empresas"+e);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
            System.out.println("consulta de registros empresa: "+e);
        }
    }
    
    private boolean formularioConsultaValido(){
        String tipo = cbtipo.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        if(tipo.equals("Nombre") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el nombre de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("RUC") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el RUC de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Direccion") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar la direccion de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Direccion Planta") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar la direccion de la planta de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Telefono") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el telefono de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Correo") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el correo de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Id Usuario") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el usuario de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return true;
    }
    
    private boolean seleccionEliminacionValida(){ 
        int n = tbempresa.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar mínimo un registro para eliminar","Eliminación",JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        int op = JOptionPane.showConfirmDialog(this, "Está seguro de eliminar los registros seleccionados?","Eliminación",JOptionPane.YES_NO_OPTION);
        if(op==0)
            return true;
        else
            return false;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btEliminar;
    private javax.swing.JButton btNuevaEmpresa;
    private javax.swing.JButton cbSalir;
    private javax.swing.JComboBox<String> cbtipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbempresa;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}
