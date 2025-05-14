package Interfaz.Medico;
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
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        JMEstablecer_Disponibilidad = new javax.swing.JMenuItem();

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

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\geral\\OneDrive\\Documentos\\NetBeansProjects.jar\\Vital-Care\\src\\Imagenes\\PPMedic.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 470));

        JMenu.setMinimumSize(new java.awt.Dimension(134, 50));
        JMenu.setPreferredSize(new java.awt.Dimension(134, 50));

        jMenu1.setText("Citas");
        jMenu1.setMinimumSize(new java.awt.Dimension(41, 30));
        jMenu1.setPreferredSize(new java.awt.Dimension(41, 30));

        jMenuItem2.setText("Ver Citas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        JMenu.add(jMenu1);

        jMenu2.setText("Disponibilidad");

        JMEstablecer_Disponibilidad.setText("Establecer Disponibilidad");
        JMEstablecer_Disponibilidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMEstablecer_DisponibilidadActionPerformed(evt);
            }
        });
        jMenu2.add(JMEstablecer_Disponibilidad);

        JMenu.add(jMenu2);

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

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        new VerCitas().setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void JMEstablecer_DisponibilidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMEstablecer_DisponibilidadActionPerformed
       new Establecer_Disponibilidad().setVisible(true);
    }//GEN-LAST:event_JMEstablecer_DisponibilidadActionPerformed

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
    private javax.swing.JMenuItem JMEstablecer_Disponibilidad;
    private javax.swing.JMenuBar JMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
