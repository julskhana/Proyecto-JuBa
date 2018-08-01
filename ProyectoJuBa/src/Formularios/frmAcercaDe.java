/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Formularios;

import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author julian
 */
public class frmAcercaDe extends javax.swing.JFrame {

    /**
     * Creates new form frmAcercaDe
     */
    public frmAcercaDe() {
        initComponents();
        
        //Excepcion para cargar imagen
        try{
            BufferedImage espolicon = ImageIO.read(new File("src/icons/espol_icon.png"));
            logoEspol.setIcon(new ImageIcon(espolicon));
        }catch (Exception e){    
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

        jTextField1 = new javax.swing.JTextField();
        btRegresar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        logoEspol = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Información");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField1.setText("Materia Integradora 2018 LicRed");
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, 350, 40));

        btRegresar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btRegresar.setForeground(new java.awt.Color(255, 0, 0));
        btRegresar.setText("Regresar");
        btRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(btRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 590, 150, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Tutora Materia Integradora");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, 250, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Profesor Materia Integradora");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 470, 250, 40));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Ing. Robert Andrade");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 470, 250, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Ing. María Angélica Santacruz");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 510, 240, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 204, 0));
        jLabel5.setText("JUNQUÍ SUDARIO JERSON");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 390, 270, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/jerson.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 180, 210, 210));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 204, 0));
        jLabel3.setText("BAJAÑA ARAUJO JULIÁN");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 380, 260, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/julian.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 200, 200));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Versión 0.1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 110, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Cantarell", 1, 18)); // NOI18N
        jTextField2.setText("Sistema de Alimentacion Automatica para la Camaronera Marbeth S.A.");
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 70, 640, -1));

        logoEspol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/espol_icon.png"))); // NOI18N
        getContentPane().add(logoEspol, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        // cerrar ventana
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRegresarActionPerformed
        int opcion = JOptionPane.showConfirmDialog(this,"¿DESEA REGRESAR A LA VENTANA PRINCIPAL?","ATENCION",JOptionPane.YES_NO_OPTION);
        if(opcion==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btRegresarActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel logoEspol;
    // End of variables declaration//GEN-END:variables
}
