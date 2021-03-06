package Formularios;

import Objetos.operador;
import Objetos.piscina;
import bd.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jerson Junqui
 */
public class frmMantenimientoPiscina extends javax.swing.JFrame {

    /**
     * Creates new form frmPiscina
     */
    public frmMantenimientoPiscina() {
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
        jLabel4 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        btSalir = new javax.swing.JButton();
        btNuevaPiscina = new javax.swing.JButton();
        btEditarPiscina = new javax.swing.JButton();
        btEliminarPiscina = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultado = new javax.swing.JTable();
        cbConsultar = new javax.swing.JButton();
        tfDescripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 590, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("MANTENIMIENTO PISCINAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 360, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 204, 0));
        jLabel4.setText("UBICACIÓN:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, 30));

        cbTipo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id piscina", "Ubicacion" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 170, 30));

        btSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btSalir.setForeground(new java.awt.Color(255, 0, 0));
        btSalir.setText("Salir");
        btSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 420, 120, 40));

        btNuevaPiscina.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btNuevaPiscina.setForeground(new java.awt.Color(255, 0, 0));
        btNuevaPiscina.setText("Nuevo");
        btNuevaPiscina.setMaximumSize(new java.awt.Dimension(80, 32));
        btNuevaPiscina.setMinimumSize(new java.awt.Dimension(80, 32));
        btNuevaPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevaPiscinaActionPerformed(evt);
            }
        });
        getContentPane().add(btNuevaPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 120, 40));

        btEditarPiscina.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEditarPiscina.setForeground(new java.awt.Color(255, 0, 0));
        btEditarPiscina.setText("Editar");
        btEditarPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPiscinaActionPerformed(evt);
            }
        });
        getContentPane().add(btEditarPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 130, 40));

        btEliminarPiscina.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btEliminarPiscina.setForeground(new java.awt.Color(255, 0, 0));
        btEliminarPiscina.setText("Eliminar");
        btEliminarPiscina.setMaximumSize(new java.awt.Dimension(80, 32));
        btEliminarPiscina.setMinimumSize(new java.awt.Dimension(80, 32));
        btEliminarPiscina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEliminarPiscinaActionPerformed(evt);
            }
        });
        getContentPane().add(btEliminarPiscina, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 420, 120, 40));

        tbResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id_piscina", "descripcion", "ubicacion", "logitud_ancho", "longitud_largo", "area", "tipo", "forma", "poblacion", "id_empresa", "id_producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 890, 230));

        cbConsultar.setText("CONSULTAR");
        cbConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbConsultarActionPerformed(evt);
            }
        });
        getContentPane().add(cbConsultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 110, 130, 30));
        getContentPane().add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 280, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void btSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalirActionPerformed
        frmPrincipal frm = new frmPrincipal();
        frm.setVisible(true);
    }//GEN-LAST:event_btSalirActionPerformed

    private void btNuevaPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevaPiscinaActionPerformed
        frmIngresoNuevaPiscina inu = new frmIngresoNuevaPiscina();
        inu.setVisible(true);
    }//GEN-LAST:event_btNuevaPiscinaActionPerformed

    private void btEditarPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPiscinaActionPerformed

    }//GEN-LAST:event_btEditarPiscinaActionPerformed

    private void btEliminarPiscinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEliminarPiscinaActionPerformed
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
    }//GEN-LAST:event_btEliminarPiscinaActionPerformed

    public void consultarRegistro(){
        String tipo = cbTipo.getSelectedItem().toString();
        String descripcion = tfDescripcion.getText();        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBD c = new ConexionBD();
                c.conectar();
                //creacion de array lists que contentran las piscinas
                ArrayList<piscina> registro = c.consultarPiscinas("","piscina");
                ArrayList<piscina> resultado = new ArrayList<piscina>();
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (piscina emp:registro){
                        if(tipo.equals("Id piscina")&&(descripcion.length()>0)){
                            if(String.valueOf(emp.getId_piscina()).equals(descripcion) ){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Ubicacion")){
                            if(emp.getUbicacion().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }

                DefaultTableModel dtm = (DefaultTableModel)tbResultado.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (piscina em:resultado){
                    Object[] fila = new Object[2];
                    fila[0] = em.getId_piscina();
                    fila[1] = em.getUbicacion();
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar piscinas"+e);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar las piscinas","Consulta",JOptionPane.ERROR_MESSAGE);
            System.out.println("consulta de registros piscinas: "+e);
        }
    }
    
    private boolean formularioConsultaValido(){
        String tipo = cbTipo.getSelectedItem().toString();
        String descripcion = tfDescripcion.getText();
        if(tipo.equals("Id piscina") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el ID de la empresa.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Ubicacion") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar la Ubiación de la piscina.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return true;
    }
    
    private void cbConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbConsultarActionPerformed
        if (formularioConsultaValido()){
            consultarRegistro();
        }
    }//GEN-LAST:event_cbConsultarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEditarPiscina;
    private javax.swing.JButton btEliminarPiscina;
    private javax.swing.JButton btNuevaPiscina;
    private javax.swing.JButton btSalir;
    private javax.swing.JButton cbConsultar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbResultado;
    private javax.swing.JTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
