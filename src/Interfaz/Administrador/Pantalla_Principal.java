package Interfaz.Administrador;
import Modelos.Administrador;
import Modelos.Usuario;
import Persistencias.AdministradorSQL;
import Persistencias.UsuarioSQL;

public class Pantalla_Principal extends javax.swing.JFrame {
    UsuarioSQL u = new AdministradorSQL();
    Usuario user = new Administrador();

    public Pantalla_Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        user = u.recuperarNombreyCorreo();
        JLNombre.setText(user.getNombre1() + " " + user.getApellido1());
        JLCorreo.setText(user.getCorreo());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLus = new javax.swing.JLabel();
        JLco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLCorreo = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JMenu = new javax.swing.JMenuBar();
        JMRegistrar = new javax.swing.JMenu();
        subRegistrarMedico = new javax.swing.JMenuItem();
        subRegistrarPaciente = new javax.swing.JMenuItem();
        subRegistrarAdministrador = new javax.swing.JMenuItem();
        JMVisualizar = new javax.swing.JMenu();
        subPacientes = new javax.swing.JMenuItem();
        subMedicos = new javax.swing.JMenuItem();
        subAdministradores = new javax.swing.JMenuItem();
        subCitas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLus.setBackground(new java.awt.Color(0, 0, 0));
        JLus.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        JLus.setText("BIENVENID@");
        jPanel1.add(JLus, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, -1, -1));

        JLco.setBackground(new java.awt.Color(0, 0, 0));
        JLco.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        JLco.setText("Correo:");
        jPanel1.add(JLco, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        JLCorreo.setBackground(new java.awt.Color(0, 0, 0));
        JLCorreo.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(JLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 320, 37));

        JLNombre.setBackground(new java.awt.Color(0, 0, 0));
        JLNombre.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jPanel1.add(JLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 310, 35));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VITAL CARE (560 x 560 px) (3).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 560, 560));

        JMenu.setFont(new java.awt.Font("Serif", 1, 12)); // NOI18N
        JMenu.setPreferredSize(new java.awt.Dimension(181, 40));

        JMRegistrar.setText("Registrar");
        JMRegistrar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        JMRegistrar.setMinimumSize(new java.awt.Dimension(70, 28));

        subRegistrarMedico.setText("Medico");
        subRegistrarMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistrarMedicoActionPerformed(evt);
            }
        });
        JMRegistrar.add(subRegistrarMedico);

        subRegistrarPaciente.setText("Paciente");
        subRegistrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistrarPacienteActionPerformed(evt);
            }
        });
        JMRegistrar.add(subRegistrarPaciente);

        subRegistrarAdministrador.setText("Administrador");
        subRegistrarAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subRegistrarAdministradorActionPerformed(evt);
            }
        });
        JMRegistrar.add(subRegistrarAdministrador);

        JMenu.add(JMRegistrar);

        JMVisualizar.setText("Visualizar");
        JMVisualizar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        JMVisualizar.setMinimumSize(new java.awt.Dimension(70, 28));

        subPacientes.setText("Pacientes");
        subPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subPacientesActionPerformed(evt);
            }
        });
        JMVisualizar.add(subPacientes);

        subMedicos.setText("Medicos");
        subMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMedicosActionPerformed(evt);
            }
        });
        JMVisualizar.add(subMedicos);

        subAdministradores.setText("Administradores");
        subAdministradores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAdministradoresActionPerformed(evt);
            }
        });
        JMVisualizar.add(subAdministradores);

        subCitas.setText("Citas");
        subCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCitasActionPerformed(evt);
            }
        });
        JMVisualizar.add(subCitas);

        JMenu.add(JMVisualizar);

        setJMenuBar(JMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subRegistrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistrarPacienteActionPerformed
        new CrearCuentaPaciente().setVisible(true);
    }//GEN-LAST:event_subRegistrarPacienteActionPerformed

    private void subRegistrarMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistrarMedicoActionPerformed
        new CrearCuentaMedico().setVisible(true);
    }//GEN-LAST:event_subRegistrarMedicoActionPerformed

    private void subRegistrarAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subRegistrarAdministradorActionPerformed
        new CrearCuentaAdministrador().setVisible(true);
    }//GEN-LAST:event_subRegistrarAdministradorActionPerformed

    private void subPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subPacientesActionPerformed
        new VizualizarPacientes().setVisible(true);
    }//GEN-LAST:event_subPacientesActionPerformed

    private void subMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMedicosActionPerformed
        new VizualizarMedicos().setVisible(true);
    }//GEN-LAST:event_subMedicosActionPerformed

    private void subCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCitasActionPerformed
        new VizualizarCitas().setVisible(true);
    }//GEN-LAST:event_subCitasActionPerformed

    private void subAdministradoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAdministradoresActionPerformed
        new VizualizarAdministradores().setVisible(true);
    }//GEN-LAST:event_subAdministradoresActionPerformed

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCorreo;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLco;
    private javax.swing.JLabel JLus;
    private javax.swing.JMenu JMRegistrar;
    private javax.swing.JMenu JMVisualizar;
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem subAdministradores;
    private javax.swing.JMenuItem subCitas;
    private javax.swing.JMenuItem subMedicos;
    private javax.swing.JMenuItem subPacientes;
    private javax.swing.JMenuItem subRegistrarAdministrador;
    private javax.swing.JMenuItem subRegistrarMedico;
    private javax.swing.JMenuItem subRegistrarPaciente;
    // End of variables declaration//GEN-END:variables
}
