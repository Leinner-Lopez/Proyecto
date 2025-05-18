package Interfaz.Administrador;

import Persistencias.AdministradorSQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VizualizarPacientes extends javax.swing.JFrame {

    AdministradorSQL A = new AdministradorSQL();

    public VizualizarPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel tabla = new DefaultTableModel(A.visualizarPacientes(), new String[]{"NOMBRE", "APELLIDO", "TIPO DOCUMENTO", "NUMERO DE DOCUMENTO", "SEGURO MEDICO", "NUMERO DE TELEFONO"});
        JTPacientes.setModel(tabla);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTPacientes = new javax.swing.JTable();
        BTNEliminar = new javax.swing.JButton();
        BTNEditar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTPacientes.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        JTPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(JTPacientes);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 820, 226));

        BTNEliminar.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        BTNEliminar.setText("Eliminar");
        BTNEliminar.setBorder(null);
        BTNEliminar.setContentAreaFilled(false);
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, 160, 60));

        BTNEditar.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        BTNEditar.setText("Editar");
        BTNEditar.setBorder(null);
        BTNEditar.setContentAreaFilled(false);
        BTNEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEditarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNEditar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 380, 160, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/tablas Citas editar (1).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        int fila = JTPacientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un paciente para eliminar");
        } else {
            int numeroDocumento = Integer.parseInt(JTPacientes.getValueAt(fila, 3).toString());
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea eliminar al paciente?", "Confirmar Eliminación", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                A.eliminarPaciente(numeroDocumento);
                DefaultTableModel tabla = new DefaultTableModel(A.visualizarPacientes(), new String[]{"NOMBRE", "APELLIDO", "TIPO DOCUMENTO", "NUMERO DE DOCUMENTO", "SEGURO MEDICO", "NUMERO DE TELEFONO"});
                JTPacientes.setModel(tabla);
            }
        }
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void BTNEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEditarActionPerformed
        int fila = JTPacientes.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un paciente para editar");
        } else {
            int numeroDocumento = Integer.parseInt(JTPacientes.getValueAt(fila, 3).toString());
            int confirmacion = JOptionPane.showConfirmDialog(null, "¿Está seguro de que desea editar al paciente?", "Editar Paciente", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                String [] datos = A.editarPaciente(numeroDocumento);
                new EditarPaciente(datos).setVisible(true);
                this.dispose();
            }
        }
    }//GEN-LAST:event_BTNEditarActionPerformed

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
            java.util.logging.Logger.getLogger(VizualizarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VizualizarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VizualizarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VizualizarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VizualizarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEditar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JTable JTPacientes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
