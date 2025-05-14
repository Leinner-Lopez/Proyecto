package Interfaz.Medico;

import Persistencias.MedicoSQL;
import java.util.Date;
import javax.swing.JOptionPane;

public class Establecer_Disponibilidad extends javax.swing.JFrame {
    Date fechaInicio;
    Date fechaFinal;
    public Establecer_Disponibilidad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JSInicio = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        JSFin = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        BTNEstablecer = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JSInicio.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        JSInicio.setModel(new javax.swing.SpinnerDateModel());
        JSInicio.setEditor(new javax.swing.JSpinner.DateEditor(JSInicio, "yyyy-MM-dd HH:mm:ss"));
        getContentPane().add(JSInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 150, 60));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel1.setText("Disponibilidad");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel2.setText("Fin:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        JSFin.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        JSFin.setModel(new javax.swing.SpinnerDateModel());
        JSFin.setEditor(new javax.swing.JSpinner.DateEditor(JSFin, "yyyy-MM-dd HH:mm:ss"));
        getContentPane().add(JSFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 150, 60));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel3.setText("Inicio:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 200, -1, -1));

        BTNEstablecer.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        BTNEstablecer.setText("Establecer");
        BTNEstablecer.setBorder(null);
        BTNEstablecer.setContentAreaFilled(false);
        BTNEstablecer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNEstablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEstablecerActionPerformed(evt);
            }
        });
        getContentPane().add(BTNEstablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 400, 180, 40));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/disponibilidad medico .png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNEstablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEstablecerActionPerformed
        fechaInicio = (Date) JSInicio.getValue();
        fechaFinal = (Date) JSFin.getValue();
        if(fechaFinal.after(fechaInicio)){
            MedicoSQL M = new MedicoSQL();
            M.esteblecerDisponibilidad(fechaInicio, fechaFinal);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(null, "Fechas incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTNEstablecerActionPerformed

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
            java.util.logging.Logger.getLogger(Establecer_Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Establecer_Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Establecer_Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Establecer_Disponibilidad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Establecer_Disponibilidad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNEstablecer;
    private javax.swing.JSpinner JSFin;
    private javax.swing.JSpinner JSInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
