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
public class GerenciaSucursal extends javax.swing.JFrame {

    /**
     * Creates new form GerenciaSucursal
     */
    public GerenciaSucursal() {
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

        BotonRegresarGS = new javax.swing.JLabel();
        BotonAgregarGS = new javax.swing.JLabel();
        BotonEditarGS = new javax.swing.JLabel();
        BotonGuardarGS = new javax.swing.JLabel();
        BotonCancelarGS = new javax.swing.JLabel();
        ComboNombreSurcursalGS = new javax.swing.JComboBox<>();
        ComboNombreEmpleadoGS = new javax.swing.JComboBox<>();
        FechaInicial = new com.toedter.calendar.JDateChooser();
        FechaFinal = new com.toedter.calendar.JDateChooser();
        txtBuscarPro = new javax.swing.JTextField();
        GerenciaSucursal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BotonRegresarGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 46, 120, 30));
        getContentPane().add(BotonAgregarGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 140, 130, 30));
        getContentPane().add(BotonEditarGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 140, 120, 30));
        getContentPane().add(BotonGuardarGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 120, 30));
        getContentPane().add(BotonCancelarGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, 120, 30));

        ComboNombreSurcursalGS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNombreSurcursalGS.setBorder(null);
        ComboNombreSurcursalGS.setOpaque(false);
        getContentPane().add(ComboNombreSurcursalGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 336, 180, 30));

        ComboNombreEmpleadoGS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboNombreEmpleadoGS.setBorder(null);
        ComboNombreEmpleadoGS.setOpaque(false);
        getContentPane().add(ComboNombreEmpleadoGS, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 180, 30));
        getContentPane().add(FechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 180, 35));
        getContentPane().add(FechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 525, 180, 34));

        txtBuscarPro.setBorder(null);
        txtBuscarPro.setOpaque(false);
        txtBuscarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarProActionPerformed(evt);
            }
        });
        getContentPane().add(txtBuscarPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 220, 240, 30));

        GerenciaSucursal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Gerente-Sucursal.png"))); // NOI18N
        GerenciaSucursal.setText("jLabel1");
        getContentPane().add(GerenciaSucursal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 940, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GerenciaSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GerenciaSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GerenciaSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GerenciaSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GerenciaSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarGS;
    private javax.swing.JLabel BotonCancelarGS;
    private javax.swing.JLabel BotonEditarGS;
    private javax.swing.JLabel BotonGuardarGS;
    private javax.swing.JLabel BotonRegresarGS;
    private javax.swing.JComboBox<String> ComboNombreEmpleadoGS;
    private javax.swing.JComboBox<String> ComboNombreSurcursalGS;
    private com.toedter.calendar.JDateChooser FechaFinal;
    private com.toedter.calendar.JDateChooser FechaInicial;
    private javax.swing.JLabel GerenciaSucursal;
    private javax.swing.JTextField txtBuscarPro;
    // End of variables declaration//GEN-END:variables
}
