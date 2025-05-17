package Interfaz.Medico;
import Interfaz.Form_Seleccion;
import Interfaz.IniciarSesion;
import Modelos.Usuario;
import Modelos.Medico;
import Persistencias.MedicoSQL;
import Persistencias.UsuarioSQL;

public class Pantalla_PrincipalM extends javax.swing.JFrame {
    UsuarioSQL u = new MedicoSQL();
    Usuario user = new Medico();

    public Pantalla_PrincipalM() {
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
        JMCitas = new javax.swing.JMenu();
        subVerCitas = new javax.swing.JMenuItem();
        JMDisponibilidad = new javax.swing.JMenu();
        JMEstablecer_Disponibilidad = new javax.swing.JMenuItem();
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
        jPanel1.add(JLNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 310, 35));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/PPMedic.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        JMenu.setMinimumSize(new java.awt.Dimension(134, 50));
        JMenu.setPreferredSize(new java.awt.Dimension(134, 50));

        JMCitas.setText("Citas");
        JMCitas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMCitas.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        JMCitas.setMinimumSize(new java.awt.Dimension(41, 30));
        JMCitas.setPreferredSize(new java.awt.Dimension(41, 30));

        subVerCitas.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        subVerCitas.setText("Ver Citas");
        subVerCitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subVerCitasActionPerformed(evt);
            }
        });
        JMCitas.add(subVerCitas);

        JMenu.add(JMCitas);

        JMDisponibilidad.setText("Disponibilidad");
        JMDisponibilidad.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JMDisponibilidad.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N

        JMEstablecer_Disponibilidad.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        JMEstablecer_Disponibilidad.setText("Establecer Disponibilidad");
        JMEstablecer_Disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEstablecer_DisponibilidadActionPerformed(evt);
            }
        });
        JMDisponibilidad.add(JMEstablecer_Disponibilidad);

        JMenu.add(JMDisponibilidad);

        JMCerrarSesión.setText("Cerrar Sesión");
        JMCerrarSesión.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subVerCitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subVerCitasActionPerformed
        new VerCitas().setVisible(true);
    }//GEN-LAST:event_subVerCitasActionPerformed

    private void JMEstablecer_DisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEstablecer_DisponibilidadActionPerformed
       new Establecer_Disponibilidad().setVisible(true);
    }//GEN-LAST:event_JMEstablecer_DisponibilidadActionPerformed

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
            java.util.logging.Logger.getLogger(Pantalla_PrincipalM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pantalla_PrincipalM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pantalla_PrincipalM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLCorreo;
    private javax.swing.JLabel JLNombre;
    private javax.swing.JLabel JLco;
    private javax.swing.JMenu JMCerrarSesión;
    private javax.swing.JMenu JMCitas;
    private javax.swing.JMenu JMDisponibilidad;
    private javax.swing.JMenuItem JMEstablecer_Disponibilidad;
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem subCerrarSesión;
    private javax.swing.JMenuItem subVerCitas;
    // End of variables declaration//GEN-END:variables
}
