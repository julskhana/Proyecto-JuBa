package Formularios;

import Objetos.alimento;
import bd.ConexionBD;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jerson Junqui
 */
public class frmMantenimientoAlimento extends javax.swing.JFrame {

    /**
     * Creates new form frmMantenimientoAlimento
     */
    public frmMantenimientoAlimento() {
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

        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        cbTipo = new javax.swing.JComboBox<>();
        tfDescripcion = new javax.swing.JFormattedTextField();
        cbBuscar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbResultado = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("MANTENIMIENTO ALIMENTO");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, 430, 30));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 590, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("DESCRIPCIÓN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 140, 30));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Id", "Nombre", "Descripcion", "Tipo", "Masa Total", "Fecha Expiracion" }));
        getContentPane().add(cbTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 160, 30));
        getContentPane().add(tfDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, 280, 30));

        cbBuscar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        cbBuscar.setForeground(new java.awt.Color(255, 0, 0));
        cbBuscar.setText("BUSCAR");
        cbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(cbBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 120, 120, 30));

        tbResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Descripcion", "Tipo", "Masa Total", "Fecha Expiracion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbResultado);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(102, 170, 800, 220));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/autenticacion.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean formularioValido(){
        String tipo = cbTipo.getSelectedItem().toString();
        String descripcion = tfDescripcion.getText();
        if(tipo.equals("Nombre") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el nombre.","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Descripcion") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar una Descripción","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Tipo") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar el tipo","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Masa Total") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar la Masa total","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }else if(tipo.equals("Fecha Expiracion") && descripcion.equals("")){
                JOptionPane.showMessageDialog(this,"Debe ingresar la Fecha de Expiración","Consulta",JOptionPane.ERROR_MESSAGE);
                return false;
        }
        return true;
    }
    
    public void consultarRegistro(){
        String tipo = cbTipo.getSelectedItem().toString();
        String descripcion = tfDescripcion.getText();        
        //consultar
        try{
            //cunsolta a la base
            try{
                ConexionBD c = new ConexionBD();
                c.conectar();
                ArrayList<alimento> registro = c.consultarAlimentos("","alimento");
                ArrayList<alimento> resultado = new ArrayList<alimento>();
                //Consultar tipo y descripcion
                if (tipo.equals("Todos")){
                        resultado = registro;
                }else{
                    for (alimento emp:registro){
                        if(tipo.equals("Id")&&(descripcion.length()>0)){
                            if(String.valueOf(emp.getId()).equals(descripcion) ){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Nombre")){
                            if(emp.getNombre().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Descripcion")){
                            if(emp.getDescripcion().toUpperCase().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Tipo")){
                            if(emp.getTipo().contains(descripcion.toUpperCase())){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Masa Total")){
                            if(String.valueOf(emp.getMasa_total()).equals(descripcion) ){
                                resultado.add(emp);
                            }
                        }else if(tipo.equals("Fecha Expiracion")){
                            //if(String.valueOf(emp.getFecha_expiracion())){
                              //  resultado.add(emp);
                            //}
                        }else{
                            JOptionPane.showMessageDialog(this,"Descripcion vacia.","Consulta Invalida",JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }
                }

                DefaultTableModel dtm = (DefaultTableModel)tbResultado.getModel();
                dtm.setRowCount(0);
                
                //recorriendo base de datos
                for (alimento em:resultado){
                    Object[] fila = new Object[6];
                    fila[0] = em.getId();
                    fila[1] = em.getNombre();
                    fila[2] = em.getDescripcion();
                    fila[3] = em.getTipo();
                    fila[4] = em.getMasa_total();
                    fila[5] = em.getFecha_expiracion();
                    
                    dtm.addRow(fila);
                }
            c.desconectar();
            }catch (Exception e){
                System.out.println("error al consultar alimento"+e);
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this,"Ocurrió un error al consultar los alimentos","Consulta",JOptionPane.ERROR_MESSAGE);
            System.out.println("consulta de registros alimentos: "+e);
        }
    }
    
    private void cbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarActionPerformed
        if (formularioValido()){
            consultarRegistro();
        }
    }//GEN-LAST:event_cbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cbBuscar;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbResultado;
    private javax.swing.JFormattedTextField tfDescripcion;
    // End of variables declaration//GEN-END:variables
}
