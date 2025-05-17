package Interfaz.Paciente;

import Interfaz.Form_Seleccion;
import Interfaz.IniciarSesion;
import Persistencias.PacienteSQL;
import Persistencias.UsuarioSQL;
import Modelos.Paciente;
import Modelos.Usuario;
public class Pantalla_PrincipalP extends javax.swing.JFrame {

    UsuarioSQL u = new PacienteSQL();
    Usuario user = new Paciente();

    public Pantalla_PrincipalP() {
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
        JLco = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JLCorreo = new javax.swing.JLabel();
        JLNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        JMenu = new javax.swing.JMenuBar();
        JMRegistrar = new javax.swing.JMenu();
        subVerCitas = new javax.swing.JMenuItem();
        subAgendarCita = new javax.swing.JMenuItem();
        JMCerrarSesión = new javax.swing.JMenu();
        subCerrarSesión = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLco.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        JLco.setText("Correo:");
        jPanel1.add(JLco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, -1, -1));

        JLCorreo.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jPanel1.add(JLCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 340, 320, 37));

        JLNombre.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jPanel1.add(JLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 310, 35));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PPpaciente.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        JMenu.setMinimumSize(new java.awt.Dimension(41, 50));
        JMenu.setPreferredSize(new java.awt.Dimension(41, 50));

        JMRegistrar.setText("Citas");
        JMRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMRegistrar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        subVerCitas.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        subVerCitas.setText("VerCitas");
        subVerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subVerCitasActionPerformed(evt);
            }
        });
        JMRegistrar.add(subVerCitas);

        subAgendarCita.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        subAgendarCita.setText("AgendarCita");
        subAgendarCita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subAgendarCitaActionPerformed(evt);
            }
        });
        JMRegistrar.add(subAgendarCita);

        JMenu.add(JMRegistrar);

        JMCerrarSesión.setText("Cerrar Sesión");
        JMCerrarSesión.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        subCerrarSesión.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        subCerrarSesión.setText("Cerrar Sesión");
        subCerrarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subCerrarSesiónActionPerformed(evt);
            }
        });
        JMCerrarSesión.add(subCerrarSesión);

        JMenu.add(JMCerrarSesión);

        setJMenuBar(JMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subAgendarCitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subAgendarCitaActionPerformed
        new AgendarCita().setVisible(true);
    }//GEN-LAST:event_subAgendarCitaActionPerformed

    private void subVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subVerCitasActionPerformed
        new VerCitas().setVisible(true);
    }//GEN-LAST:event_subVerCitasActionPerformed

    private void subCerrarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subCerrarSesiónActionPerformed
        new Form_Seleccion().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_subCerrarSesiónActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalP.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_PrincipalP().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCorreo;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLco;
    private javax.swing.JMenu JMCerrarSesión;
    private javax.swing.JMenu JMRegistrar;
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem subAgendarCita;
    private javax.swing.JMenuItem subCerrarSesión;
    private javax.swing.JMenuItem subVerCitas;
    // End of variables declaration//GEN-END:variables
}
