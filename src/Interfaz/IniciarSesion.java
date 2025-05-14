package Interfaz;

import Interfaz.Medico.Pantalla_PrincipalM;
import Interfaz.Administrador.Pantalla_Principal;
import Interfaz.Paciente.Pantalla_PrincipalP;
import Modelos.Usuario;
import Persistencias.UsuarioSQL;
import Persistencias.PacienteSQL;
import javax.swing.JOptionPane;

public class IniciarSesion extends javax.swing.JFrame {

    boolean estado = false;

    public IniciarSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Iniciar Sesion");
        btnEstadoContraseña.setText("Mostrar");
        JPContraseña.setEchoChar('•');
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JTUsuario = new javax.swing.JTextField();
        btnIniciar_Sesion = new javax.swing.JButton();
        JPContraseña = new javax.swing.JPasswordField();
        btnEstadoContraseña = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTUsuario.setBackground(new java.awt.Color(255, 255, 255));
        JTUsuario.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        JTUsuario.setForeground(new java.awt.Color(0, 0, 0));
        JTUsuario.setBorder(null);
        JTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 280, 36));

        btnIniciar_Sesion.setBorder(null);
        btnIniciar_Sesion.setContentAreaFilled(false);
        btnIniciar_Sesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciar_Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciar_SesionActionPerformed(evt);
            }
        });
        jPanel1.add(btnIniciar_Sesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 180, 40));

        JPContraseña.setBackground(new java.awt.Color(255, 255, 255));
        JPContraseña.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        JPContraseña.setForeground(new java.awt.Color(0, 0, 0));
        JPContraseña.setBorder(null);
        jPanel1.add(JPContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 280, 36));

        btnEstadoContraseña.setBackground(new java.awt.Color(102, 204, 255));
        btnEstadoContraseña.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        btnEstadoContraseña.setForeground(new java.awt.Color(0, 0, 0));
        btnEstadoContraseña.setBorder(null);
        btnEstadoContraseña.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEstadoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEstadoContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 290, 110, 30));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Usuario");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Contraseña");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\OneDrive\\Documentos\\NetBeansProjects.jar\\Vital-Care\\src\\Imagenes\\Iniciar Sesion.png")); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 640, 550));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed

    }//GEN-LAST:event_JTUsuarioActionPerformed

    private void btnEstadoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoContraseñaActionPerformed
        estado = !estado;
        if (estado) {
            btnEstadoContraseña.setText("Ocultar");
            JPContraseña.setEchoChar((char) 0);
        } else {
            btnEstadoContraseña.setText("Mostrar");
            JPContraseña.setEchoChar('•');
        }
    }//GEN-LAST:event_btnEstadoContraseñaActionPerformed

    private void btnIniciar_SesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciar_SesionActionPerformed
        UsuarioSQL U = new PacienteSQL();
        String contra = new String(JPContraseña.getPassword()).trim();
        if (!JTUsuario.getText().equals("") && !contra.equals("")) {
            String rol = U.verificarDatos(JTUsuario.getText(), contra);
            switch (rol) {
                case "pacientes":
                    JOptionPane.showMessageDialog(null, "Bienvenido " + JTUsuario.getText(), "Usuario Paciente", JOptionPane.INFORMATION_MESSAGE);
                    Usuario.setUsuario(JTUsuario.getText());
                    new Pantalla_PrincipalP().setVisible(true);
                    this.dispose();
                    break;
                case "medicos":
                    JOptionPane.showMessageDialog(null, "Bienvenido " + JTUsuario.getText(), "Usuario Medico", JOptionPane.INFORMATION_MESSAGE);
                    Usuario.setUsuario(JTUsuario.getText());
                    new Pantalla_PrincipalM().setVisible(true);
                    this.dispose();
                    break;
                case "administradores":
                    JOptionPane.showMessageDialog(null, "Bienvenido " + JTUsuario.getText(), "Usuario Administrador", JOptionPane.INFORMATION_MESSAGE);
                    Usuario.setUsuario(JTUsuario.getText());
                    new Pantalla_Principal().setVisible(true);
                    this.dispose();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "El usuario no a sido encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnIniciar_SesionActionPerformed

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
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniciarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniciarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField JPContraseña;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JButton btnEstadoContraseña;
    private javax.swing.JButton btnIniciar_Sesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
