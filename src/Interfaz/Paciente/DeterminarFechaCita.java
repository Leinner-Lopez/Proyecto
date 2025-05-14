package Interfaz.Paciente;

import Persistencias.CitasSQL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DeterminarFechaCita extends javax.swing.JFrame {

    CitasSQL c = new CitasSQL();
    int numeroDocumento;

    public DeterminarFechaCita(ArrayList<String> citasDisponibles, String nombre_1, String apellido_1, String especialidad, int numeroDocumento) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.numeroDocumento = numeroDocumento;
        JLnombre.setText(nombre_1);
        JLApellido.setText(apellido_1);
        JLEspecialidad.setText(especialidad);
        JCBHorasDisponibles.removeAllItems();
        for (String i : citasDisponibles) {
            JCBHorasDisponibles.addItem(i);
        }
    }

    public DeterminarFechaCita() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JLnombre = new javax.swing.JLabel();
        JLApellido = new javax.swing.JLabel();
        JLEspecialidad = new javax.swing.JLabel();
        JCBHorasDisponibles = new javax.swing.JComboBox<>();
        BTNAgendar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLnombre.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JLnombre.setText("jLabel1");
        getContentPane().add(JLnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 200, 30));

        JLApellido.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JLApellido.setText("jLabel2");
        getContentPane().add(JLApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 200, 30));

        JLEspecialidad.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JLEspecialidad.setText("jLabel3");
        getContentPane().add(JLEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 180, 30));

        JCBHorasDisponibles.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JCBHorasDisponibles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(JCBHorasDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 190, 40));

        BTNAgendar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        BTNAgendar.setText("Agendar");
        BTNAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(BTNAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, -1, -1));

        jLabel6.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel6.setText("Horario Disponible:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, 190, 30));

        jLabel5.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        jLabel5.setText("Agenda tu cita!");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 250, 50));

        jLabel1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel1.setText("Nombre:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 90, 30));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel2.setText("Apellido:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 90, 32));

        jLabel3.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel3.setText("Especialidad:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 130, 30));

        jLabel4.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Determinar fechas.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTNAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgendarActionPerformed
        String Hora_cita = JCBHorasDisponibles.getSelectedItem().toString();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date fecha = null;
        try {
            fecha = formato.parse(Hora_cita);
        } catch (ParseException e) {
            System.out.println("Error: " + e.getMessage());
        }
        c.agendarCita(numeroDocumento, fecha);
        this.dispose();

    }//GEN-LAST:event_BTNAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(DeterminarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeterminarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeterminarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeterminarFechaCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeterminarFechaCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgendar;
    private javax.swing.JComboBox<String> JCBHorasDisponibles;
    private javax.swing.JLabel JLApellido;
    private javax.swing.JLabel JLEspecialidad;
    private javax.swing.JLabel JLnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
