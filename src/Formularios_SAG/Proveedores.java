/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

/**
 *
 * @author Allisson Castro
 */
public class Proveedores extends javax.swing.JFrame {

    /**
     * Creates new form Proveedores
     */
    public Proveedores() {
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

        BotonRegresarPro = new javax.swing.JLabel();
        BotonAgregarPro = new javax.swing.JLabel();
        BotonEditarPro = new javax.swing.JLabel();
        BotonContactoPro = new javax.swing.JLabel();
        BotonGuardarPro = new javax.swing.JLabel();
        BotonCancelarPro = new javax.swing.JLabel();
        txtNombreEmpresaPro = new javax.swing.JTextField();
        txtRTNPro = new javax.swing.JTextField();
        ComboCiudadPro = new javax.swing.JComboBox<>();
        txtDireccionPro = new javax.swing.JTextField();
        txtTelefonoPro = new javax.swing.JTextField();
        txtBuscarPro = new javax.swing.JTextField();
        Proveedores = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BotonRegresarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 120, 40));
        getContentPane().add(BotonAgregarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 120, 40));
        getContentPane().add(BotonEditarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, 40));
        getContentPane().add(BotonContactoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 120, 40));
        getContentPane().add(BotonGuardarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, 90, 40));
        getContentPane().add(BotonCancelarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 630, 80, 30));

        txtNombreEmpresaPro.setBorder(null);
        txtNombreEmpresaPro.setOpaque(false);
        txtNombreEmpresaPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpresaProActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombreEmpresaPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, 25));

        txtRTNPro.setBorder(null);
        txtRTNPro.setOpaque(false);
        txtRTNPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRTNProActionPerformed(evt);
            }
        });
        getContentPane().add(txtRTNPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 180, 30));

        ComboCiudadPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboCiudadPro.setBorder(null);
        ComboCiudadPro.setOpaque(false);
        getContentPane().add(ComboCiudadPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 430, 190, 35));

        txtDireccionPro.setBorder(null);
        getContentPane().add(txtDireccionPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, 180, 25));

        txtTelefonoPro.setBorder(null);
        txtTelefonoPro.setOpaque(false);
        getContentPane().add(txtTelefonoPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 180, 30));

        txtBuscarPro.setBorder(null);
        txtBuscarPro.setOpaque(false);
        txtBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 224, 240, 30));

        Proveedores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Proveedores.png"))); // NOI18N
        Proveedores.setText("jLabel1");
        getContentPane().add(Proveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 951, 689));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreEmpresaProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpresaProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpresaProActionPerformed

    private void txtRTNProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRTNProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRTNProActionPerformed

    private void txtBuscarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarProActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarPro;
    private javax.swing.JLabel BotonCancelarPro;
    private javax.swing.JLabel BotonContactoPro;
    private javax.swing.JLabel BotonEditarPro;
    private javax.swing.JLabel BotonGuardarPro;
    private javax.swing.JLabel BotonRegresarPro;
    private javax.swing.JComboBox<String> ComboCiudadPro;
    private javax.swing.JLabel Proveedores;
    private javax.swing.JTextField txtBuscarPro;
    private javax.swing.JTextField txtDireccionPro;
    private javax.swing.JTextField txtNombreEmpresaPro;
    private javax.swing.JTextField txtRTNPro;
    private javax.swing.JTextField txtTelefonoPro;
    // End of variables declaration//GEN-END:variables
}
