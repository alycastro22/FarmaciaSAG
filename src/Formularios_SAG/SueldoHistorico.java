/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios_SAG;

import Conexion.Conexion;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.sound.midi.SysexMessage;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Allisson Castro
 */
public class SueldoHistorico extends javax.swing.JFrame {

    /**
     * Creates new form SueldoHistorico
     */
    
    
       
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("componentes/LOGOSAG(2).png"));
        return retValue;
    }
 

    public SueldoHistorico() {
        initComponents();
        cargarnombre();
        cargartabla();
        CargaE ch = new SueldoHistorico.CargaE();
        txtCargarEmpleado.setModel(ch.getvalues());
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
        TablaSueldoHistorico = new javax.swing.JTable();
        BotonGuardarSH = new javax.swing.JLabel();
        BotonEditarSH = new javax.swing.JLabel();
        BotonAgregarSH = new javax.swing.JLabel();
        BotonCancelarSH = new javax.swing.JLabel();
        BotonRegresarSH = new javax.swing.JLabel();
        txtSueldoSH = new javax.swing.JTextField();
        txtFechaInicioSH = new com.toedter.calendar.JDateChooser();
        txtFechaFinalSH = new com.toedter.calendar.JDateChooser();
        txtEmpleadoSH = new javax.swing.JTextField();
        txtBuscarSH = new javax.swing.JTextField();
        txtCargarEmpleado = new javax.swing.JComboBox<>();
        txtIdSueldoH = new javax.swing.JLabel();
        txtIdEmpleado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(1000, 710));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TablaSueldoHistorico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Sueldo", "Empleado", "Fecha Inicio", "Fecha Final ", "Sueldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaSueldoHistorico.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaSueldoHistoricoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaSueldoHistorico);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 600, 290));

        BotonGuardarSH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonGuardarSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarSHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonGuardarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, 140, 50));

        BotonEditarSH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonEditarSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonEditarSHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonEditarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, 50));

        BotonAgregarSH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonAgregarSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonAgregarSHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonAgregarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, 140, 50));

        BotonCancelarSH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonCancelarSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonCancelarSHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonCancelarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, 130, 50));

        BotonRegresarSH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonRegresarSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonRegresarSHMouseClicked(evt);
            }
        });
        getContentPane().add(BotonRegresarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 130, 50));

        txtSueldoSH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtSueldoSH.setForeground(new java.awt.Color(153, 153, 153));
        txtSueldoSH.setText("Ingrese Sueldo");
        txtSueldoSH.setBorder(null);
        txtSueldoSH.setEnabled(false);
        txtSueldoSH.setOpaque(false);
        txtSueldoSH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtSueldoSHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtSueldoSHFocusLost(evt);
            }
        });
        txtSueldoSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtSueldoSHMousePressed(evt);
            }
        });
        txtSueldoSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSueldoSHActionPerformed(evt);
            }
        });
        txtSueldoSH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSueldoSHKeyTyped(evt);
            }
        });
        getContentPane().add(txtSueldoSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 540, 200, 30));
        getContentPane().add(txtFechaInicioSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 425, 200, 30));
        getContentPane().add(txtFechaFinalSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 485, 200, 30));

        txtEmpleadoSH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtEmpleadoSH.setForeground(new java.awt.Color(153, 153, 153));
        txtEmpleadoSH.setText("Ingrese Nombre Empleado");
        txtEmpleadoSH.setBorder(null);
        txtEmpleadoSH.setEnabled(false);
        txtEmpleadoSH.setOpaque(false);
        txtEmpleadoSH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEmpleadoSHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEmpleadoSHFocusLost(evt);
            }
        });
        txtEmpleadoSH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtEmpleadoSHMousePressed(evt);
            }
        });
        txtEmpleadoSH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpleadoSHActionPerformed(evt);
            }
        });
        getContentPane().add(txtEmpleadoSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 368, 200, 30));

        txtBuscarSH.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtBuscarSH.setForeground(new java.awt.Color(153, 153, 153));
        txtBuscarSH.setText("Buscar por Nombre o Sueldo");
        txtBuscarSH.setBorder(null);
        txtBuscarSH.setOpaque(false);
        txtBuscarSH.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarSHFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarSHFocusLost(evt);
            }
        });
        txtBuscarSH.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtBuscarSHKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarSHKeyTyped(evt);
            }
        });
        getContentPane().add(txtBuscarSH, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 225, 250, 30));

        txtCargarEmpleado.setFont(new java.awt.Font("Georgia", 0, 14)); // NOI18N
        txtCargarEmpleado.setForeground(new java.awt.Color(153, 153, 153));
        txtCargarEmpleado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Empleado..." }));
        txtCargarEmpleado.setOpaque(false);
        txtCargarEmpleado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtCargarEmpleadoMouseClicked(evt);
            }
        });
        txtCargarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCargarEmpleadoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCargarEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, 270, 30));
        getContentPane().add(txtIdSueldoH, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, 60, 20));
        getContentPane().add(txtIdEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 60, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/componentes/Pantalla Sueldo Historico(5).png"))); // NOI18N
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtEmpleadoSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpleadoSHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpleadoSHActionPerformed

    private void txtEmpleadoSHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpleadoSHFocusGained
        if (txtEmpleadoSH.getText().equals("Ingrese Nombre Empleado")) {
            txtEmpleadoSH.setText("");
            txtEmpleadoSH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtEmpleadoSHFocusGained

    private void txtEmpleadoSHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEmpleadoSHFocusLost
        if (txtEmpleadoSH.getText().equals("")) {
            txtEmpleadoSH.setText("Ingrese Nombre Empleado");
            txtEmpleadoSH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtEmpleadoSHFocusLost

    private void txtSueldoSHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSueldoSHFocusGained
        if (txtSueldoSH.getText().equals("Ingrese Sueldo")) {
            txtSueldoSH.setText("");
            txtSueldoSH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtSueldoSHFocusGained

    private void txtSueldoSHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtSueldoSHFocusLost
        if (txtSueldoSH.getText().equals("")) {
            txtSueldoSH.setText("Ingrese Sueldo");
            txtSueldoSH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtSueldoSHFocusLost

    private void txtBuscarSHFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarSHFocusGained
        if (txtBuscarSH.getText().equals("Buscar por Nombre o Sueldo")) {
            txtBuscarSH.setText("");
            txtBuscarSH.setForeground(new Color(0, 0, 0));
        }
    }//GEN-LAST:event_txtBuscarSHFocusGained

    private void txtBuscarSHFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarSHFocusLost
        if (txtBuscarSH.getText().equals("")) {
            txtBuscarSH.setText("Buscar por Nombre o Sueldo");
            txtBuscarSH.setForeground(new Color(153, 153, 153));
        }
    }//GEN-LAST:event_txtBuscarSHFocusLost

  

    private void txtSueldoSHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSueldoSHActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSueldoSHActionPerformed

    private void BotonRegresarSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonRegresarSHMouseClicked
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Empleados().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_BotonRegresarSHMouseClicked

    private void BotonCancelarSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonCancelarSHMouseClicked
        BotonEditarSH.setEnabled(Boolean.FALSE);
        BotonGuardarSH.setEnabled(Boolean.FALSE);
        Limpiar();
        Inhabilitar();
    }//GEN-LAST:event_BotonCancelarSHMouseClicked

    private void BotonAgregarSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonAgregarSHMouseClicked
        Habillitar();
    }//GEN-LAST:event_BotonAgregarSHMouseClicked

    private void txtBuscarSHKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarSHKeyPressed
        //buscarData(txtBuscarSH.getText());
    }//GEN-LAST:event_txtBuscarSHKeyPressed

    private void TablaSueldoHistoricoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaSueldoHistoricoMouseClicked
        try {
            int fila = TablaSueldoHistorico.getSelectedRow();
            int id = Integer.parseInt(TablaSueldoHistorico.getValueAt(fila, 0).toString());
            PreparedStatement ps;
            ResultSet rs;
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("SELECT SH.Id_Sueldo_Historico, SH.Id_Empleado,E.NombreE, SH.Fecha_Inicio,SH.Fecha_Finalizacion,SH.Sueldo\n"
                    + "From Sueldo_Historico AS SH \n"
                    + "INNER JOIN Empleados AS E ON SH.Id_Empleado = E.Id_Empleado\n"
                    + "Where SH.Id_Sueldo_Historico=?\n"
                    + "Order By SH.Id_Sueldo_Historico");

            ps.setInt(1, id);
            rs = ps.executeQuery();

            while (rs.next()) {

                txtIdSueldoH.setText(String.valueOf(id));
                txtIdEmpleado.setText(rs.getString("Id_Empleado"));
                txtEmpleadoSH.setText(rs.getString("NombreE"));
                txtFechaInicioSH.setDate(rs.getDate("Fecha_Inicio"));
                txtFechaFinalSH.setDate(rs.getDate("Fecha_Finalizacion"));
                txtSueldoSH.setText(rs.getString("Sueldo"));
                System.out.println(id);

            }

            Habillitar();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_TablaSueldoHistoricoMouseClicked

    private void BotonEditarSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonEditarSHMouseClicked
        if (txtEmpleadoSH.getText().equals("Ingrese Nombre Empleado") || txtSueldoSH.getText().equals("Ingrese Sueldo")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");
        } else {
            int IdSueldo = Integer.parseInt(txtIdSueldoH.getText());

            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String FechaI = sdf.format(txtFechaInicioSH.getDate());
            String FechaF = sdf.format(txtFechaFinalSH.getDate());
            String Sueldo = txtSueldoSH.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Update Sueldo_Historico set  Fecha_Inicio=?,Fecha_Finalizacion=?,Sueldo=? Where Id_Sueldo_Historico=?");
                ps.setString(1, FechaI);
                ps.setString(2, FechaF);
                ps.setString(3, Sueldo);
                ps.setInt(4, IdSueldo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro Actualizado");
                cargartabla();

                Limpiar();
                // Inhabillitar();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());

            }
        }


    }//GEN-LAST:event_BotonEditarSHMouseClicked

    private void BotonGuardarSHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarSHMouseClicked
        if (txtEmpleadoSH.getText().equals("Ingrese Nombre Empleado") || txtFechaInicioSH.getDate().equals("") || txtFechaFinalSH.getDate().equals("")
                || txtSueldoSH.getText().equals("Ingrese Sueldo")) {
            JOptionPane.showMessageDialog(null, "No se puede Guardar datos vacios");

        } else {
            String Id_Empleado = txtIdEmpleado.getText();
            String NombreE = txtEmpleadoSH.getText();
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
            String FechaInicio = sdf.format(txtFechaInicioSH.getDate());
            String FechaFinal = sdf.format(txtFechaFinalSH.getDate());
            String Sueldo = txtSueldoSH.getText();

            try {
                Connection con = Conexion.getConexion();
                PreparedStatement ps = con.prepareStatement("Insert into Sueldo_Historico(Id_Empleado,Fecha_Inicio,Fecha_Finalizacion,Sueldo) VALUES(?,?,?,?)");
                ps.setInt(1, Integer.parseInt(Id_Empleado));
                ps.setString(2, FechaInicio);
                ps.setString(3, FechaFinal);
                ps.setString(4, Sueldo);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargartabla();
                Limpiar();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex.toString());
            }
        }


    }//GEN-LAST:event_BotonGuardarSHMouseClicked

    public void validarNumerosLetras(java.awt.event.KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 64
                || e.getKeyChar() >= 91 && e.getKeyChar() <= 96
                || e.getKeyChar() >= 123 && e.getKeyChar() <= 129
                || e.getKeyChar() >= 145 && e.getKeyChar() <= 159
                || e.getKeyChar() >= 164 && e.getKeyChar() <= 238) {

            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo no acepta caracteres especiales", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void txtBuscarSHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarSHKeyTyped
        buscarDato(txtBuscarSH.getText());
        validarNumerosLetras(evt);
        if (txtBuscarSH.getText().length() > 15) {
            JOptionPane.showMessageDialog(null, "Alcanzaste el m??ximo de caracteres para este campo", "Advertencia", JOptionPane.WARNING_MESSAGE);
            evt.consume();
        } else if (txtBuscarSH.getText().length() > 0) {
            if (!txtBuscarSH.getText().matches("^(?!.*([A-Za-z????????????????????????\\s])\\1{2})[A-Za-z????????????????????????\\s0-9]+$")) {
                evt.consume();
            }
        }
    }//GEN-LAST:event_txtBuscarSHKeyTyped

    private void txtCargarEmpleadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCargarEmpleadoMouseClicked

        //System.out.println(txtCargarEmpleado.getSelectedIndex());
    }//GEN-LAST:event_txtCargarEmpleadoMouseClicked

    private void txtCargarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCargarEmpleadoActionPerformed
        PreparedStatement ps;
        ResultSet rs;
        String Nombre = txtCargarEmpleado.getSelectedItem().toString();
        try {
            txtIdEmpleado.setText(Empleados.Id_emp);

            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select  Id_Empleado from Empleados where NombreE=?");
            ps.setString(1, Nombre);
            rs = ps.executeQuery();
            while (rs.next()) {
                txtIdEmpleado.setText(rs.getString("Id_Empleado"));
            }
            buscarData(Integer.parseInt(txtIdEmpleado.getText()));
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }//GEN-LAST:event_txtCargarEmpleadoActionPerformed

    private void txtEmpleadoSHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtEmpleadoSHMousePressed

    }//GEN-LAST:event_txtEmpleadoSHMousePressed

    private void txtSueldoSHMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSueldoSHMousePressed
        if (txtSueldoSH.isEnabled() == false) {

            JOptionPane.showMessageDialog(null, "Dar Click en Agregar o Editar para utilizar el campo", "Advertencia", JOptionPane.WARNING_MESSAGE);

        }
    }//GEN-LAST:event_txtSueldoSHMousePressed

    private void txtSueldoSHKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSueldoSHKeyTyped
      validarNumeros(evt);
        if (txtSueldoSH.getText().length() > 7) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSueldoSHKeyTyped

   public void validarNumeros(java.awt.event.KeyEvent e) {
        if (e.getKeyChar() >= 33 && e.getKeyChar() <= 47
                || e.getKeyChar() >= 58 && e.getKeyChar() <= 238) {
            e.consume();
            JOptionPane.showMessageDialog(null, "Este campo solo admite n??meros", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
  
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
            java.util.logging.Logger.getLogger(SueldoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SueldoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SueldoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SueldoHistorico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SueldoHistorico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonAgregarSH;
    private javax.swing.JLabel BotonCancelarSH;
    private javax.swing.JLabel BotonEditarSH;
    private javax.swing.JLabel BotonGuardarSH;
    private javax.swing.JLabel BotonRegresarSH;
    private javax.swing.JTable TablaSueldoHistorico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtBuscarSH;
    private javax.swing.JComboBox<String> txtCargarEmpleado;
    private javax.swing.JTextField txtEmpleadoSH;
    private com.toedter.calendar.JDateChooser txtFechaFinalSH;
    private com.toedter.calendar.JDateChooser txtFechaInicioSH;
    private javax.swing.JLabel txtIdEmpleado;
    private javax.swing.JLabel txtIdSueldoH;
    private javax.swing.JTextField txtSueldoSH;
    // End of variables declaration//GEN-END:variables

    private void Limpiar() {
        txtEmpleadoSH.setText("");
        if (txtEmpleadoSH.getText().equals("")) {
            txtEmpleadoSH.setText("Ingrese Nombre");
            txtEmpleadoSH.setForeground(new Color(153, 153, 153));
        }

        txtSueldoSH.setText("");

        txtEmpleadoSH.setText("");
        if (txtEmpleadoSH.getText().equals("")) {
            txtEmpleadoSH.setText("Ingrese Nombre");
            txtEmpleadoSH.setForeground(new Color(153, 153, 153));
        }

        /**
         * txtFechaInicioSH.setDate() txtFechaFinalSH.setDate("");*
         */
    }

    private void Habillitar() {

        //txtEmpleadoSH.enable(Boolean.TRUE);
        txtFechaInicioSH.enable(Boolean.TRUE);
        txtFechaFinalSH.enable(Boolean.TRUE);
        txtSueldoSH.enable(Boolean.TRUE);
    }

    private void Inhabilitar() {

        txtEmpleadoSH.enable(Boolean.FALSE);
        txtFechaInicioSH.enable(Boolean.FALSE);
        txtFechaFinalSH.enable(Boolean.FALSE);
        txtSueldoSH.enable(Boolean.FALSE);

    }

    private void buscarData(int valor) {
        String[] titulos = {"ID Sueldo", "Nombre Empleado", "Fecha Inicio", "Fecha Final", "Sueldo"};
        String[] registros = new String[13];
        String sql = "Select SH.Id_Sueldo_Historico, E.NombreE, SH.Fecha_Inicio,SH.Fecha_Finalizacion,SH.Sueldo\n"
                + "FROM Sueldo_Historico AS SH \n"
                + "INNER JOIN Empleados AS E ON SH.Id_Empleado = E.Id_Empleado\n"
                + "WHERE E.Id_Empleado=" + valor + "\n"
                + "ORDER BY SH.Id_Sueldo_Historico";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Sueldo_Historico");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha_Inicio");
                registros[3] = rs.getString("Fecha_Finalizacion");
                registros[4] = rs.getString("Sueldo");

                model.addRow(registros);
            }

            TablaSueldoHistorico.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void cargartabla() {
        DefaultTableModel modeloTabla = (DefaultTableModel) TablaSueldoHistorico.getModel();
        modeloTabla.setRowCount(0);

        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;

        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select SH.Id_Sueldo_Historico, E.NombreE, SH.Fecha_Inicio,SH.Fecha_Finalizacion,SH.Sueldo\n"
                    + "FROM Sueldo_Historico AS SH \n"
                    + "INNER JOIN Empleados AS E ON SH.Id_Empleado = E.Id_Empleado\n"
                    + "ORDER BY SH.Id_Sueldo_Historico");
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();

            while (rs.next()) {
                Object[] fila = new Object[columnas];
                for (int indice = 0; indice < columnas; indice++) {
                    fila[indice] = rs.getObject(indice + 1);
                }
                modeloTabla.addRow(fila);
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public void cargarnombre() {

        int tener = txtCargarEmpleado.getSelectedIndex();
        PreparedStatement ps;
        ResultSet rs;

        try {
            txtIdEmpleado.setText(Empleados.Id_emp);
            int Id = Integer.parseInt(txtIdEmpleado.getText());
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement("Select  NombreE from Empleados where Id_Empleado=?");
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            txtCargarEmpleado.addItem("Seleccionar Usuario");
            while (rs.next()) {
                txtEmpleadoSH.setText(rs.getString("NombreE"));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
        }

    }

    public class CargaE {

        public DefaultComboBoxModel getvalues() {

            DefaultComboBoxModel modelo = new DefaultComboBoxModel();
            try {
                Connection con = Conexion.getConexion();
                String sql = "select NombreE from Empleados";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                modelo.addElement("Seleccione Empleado...");
                while (rs.next()) {
                    modelo.addElement(rs.getString(1));
                }
                con.close();
                rs.close();
            } catch (Exception e) {
                System.out.println(e);
            }
            return modelo;
        }

    }

    private void buscarDato(String valor) {
        String[] titulos = {"ID Sueldo", "Nombre Empleado", "Fecha Inicio", "Fecha Final", "Sueldo"};
        String[] registros = new String[13];
        String sql = "Select SH.Id_Sueldo_Historico, E.NombreE, SH.Fecha_Inicio,SH.Fecha_Finalizacion,SH.Sueldo\n"
                + "FROM Sueldo_Historico AS SH \n"
                + "INNER JOIN Empleados AS E ON SH.Id_Empleado = E.Id_Empleado\n"
                + "WHERE CONCAT (SH.Id_Sueldo_Historico, ' ', E.NombreE) LIKE '%" + valor + "%'\n"
                + "ORDER BY SH.Id_Sueldo_Historico";

        DefaultTableModel model = new DefaultTableModel(null, titulos);
        Connection con = Conexion.getConexion();

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                registros[0] = rs.getString("Id_Sueldo_Historico");
                registros[1] = rs.getString("NombreE");
                registros[2] = rs.getString("Fecha_Inicio");
                registros[3] = rs.getString("Fecha_Finalizacion");
                registros[4] = rs.getString("Sueldo");

                model.addRow(registros);
            }

            TablaSueldoHistorico.setModel(model);
            // anchoColumnas();
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
