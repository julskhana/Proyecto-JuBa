/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Objetos.usuario;
import bd.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author julian
 */
public class frmBuscarUsuarioEmpresas extends javax.swing.JFrame {

    /**
     * Creates new form frmClientes
     */
    
    public frmBuscarUsuarioEmpresas() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbusuarios = new javax.swing.JTable();
        cbConsulta = new javax.swing.JComboBox<>();
        tfdescripcion = new javax.swing.JTextField();
        btConsultar = new javax.swing.JButton();
        btSeleccionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Busqueda Usuarios - Ingreso Empresas");

        tbusuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Cuenta", "Cedula", "Nombres", "Apellidos", "Correo", "Tipo", "Cargo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbusuarios.setToolTipText("");
        jScrollPane1.setViewportView(tbusuarios);

        cbConsulta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Cuenta", "Nombres", "Apellidos", "Cedula", "Estado" }));

        btConsultar.setText("Consultar");
        btConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultarActionPerformed(evt);
            }
        });

        btSeleccionar.setText("Seleccionar");
        btSeleccionar.setPreferredSize(new java.awt.Dimension(75, 30));
        btSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSeleccionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 328, Short.MAX_VALUE)
                .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313))
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(cbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfdescripcion)
                .addGap(18, 18, 18)
                .addComponent(btConsultar)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 729, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfdescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btConsultar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSeleccionar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSeleccionarActionPerformed
        // TODO add your handling code here:
        if(seleccionValida()){
            int fila = tbusuarios.getSelectedRow();
            frmIngresoEmpresa.id_usuario = Integer.parseInt(tbusuarios.getValueAt(fila,0).toString());
            this.dispose();
        }
    }//GEN-LAST:event_btSeleccionarActionPerformed

    private void btConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultarActionPerformed
        // TODO add your handling code here:
        if (formularioConsultaValido()){
            //consultarRegistroU();
        }
    }//GEN-LAST:event_btConsultarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    //funciones
    
    /*
    public void consultarRegistroU(){
        String tipo = cbConsulta.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBD c = new ConexionBD();
                c.conectar();
                
                ArrayList<usuario> registro = c.consultarEmpresas("","usuario");
                ArrayList<usuario> resultado = new ArrayList<usuario>();
                
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (usuario us:registro){
                        if(tipo.equals("Cedula")&&(descripcion.length()>0)){
                            if(us.getCedula().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Nombres")&&(descripcion.length()>0)){
                            if(us.getNombres().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Apellidos")&&(descripcion.length()>0)){
                            if(us.getApellidos().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Cuenta")&&(descripcion.length()>0)){
                            if(us.getCuenta().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Correo")&&(descripcion.length()>0)){
                            if(us.getCorreo().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Id")&&(descripcion.length()>0)){
                            if(String.valueOf(us.getId()).equals(descripcion)){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Tipo")&&(descripcion.length()>0)){
                            if(us.getTipo().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Cargo")&&(descripcion.length()>0)){
                            if(us.getCorreo().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else if(tipo.equals("Estado")&&(descripcion.length()>0)){
                            if(us.getEstado().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(us);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }
                
                DefaultTableModel dtm = (DefaultTableModel)tbusuarios.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos for
                for (usuario u:resultado){
                    Object[] fila = new Object[9];
                    fila[0] = u.getId();
                    fila[1] = u.getCuenta();
                    fila[2] = u.getCedula();
                    fila[3] = u.getNombres();
                    fila[4] = u.getApellidos();
                    fila[5] = u.getCorreo();
                    fila[6] = u.getTipo();
                    fila[7] = u.getCargo();
                    fila[8] = u.getEstado();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar usuarios"+e);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los registros","Consulta",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
    }
    */    

    private boolean formularioConsultaValido(){
        String tipo = cbConsulta.getSelectedItem().toString();
        String descripcion = tfdescripcion.getText();
        if(tipo.equals("Cedula") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un número","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Nombres") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un Nombre","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Apellidos") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un Apellido","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Id") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un Identificador","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Cuenta") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un cuenta","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Estado") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar un estado","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return true;
    }
    
    
    //funcion para establecer seleccion valida al momento de editar
    private boolean seleccionValida(){ 
        int n = tbusuarios.getSelectedRowCount();
        if(n==0){
            JOptionPane.showMessageDialog(this,"Debe seleccionar mínimo un registro","Clientes",JOptionPane.ERROR_MESSAGE);
            return false;        
        }
        return true;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btConsultar;
    private javax.swing.JButton btSeleccionar;
    private javax.swing.JComboBox<String> cbConsulta;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable tbusuarios;
    private javax.swing.JTextField tfdescripcion;
    // End of variables declaration//GEN-END:variables
}
