package Interfaz.Paciente;

import Modelos.Citas;
import Persistencias.CitasSQL;
import Persistencias.PacienteSQL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;
import java.util.ArrayList;

public class AgendarCita extends javax.swing.JFrame {

    PacienteSQL P = new PacienteSQL();
    CitasSQL c = new CitasSQL();

    public AgendarCita() {
        initComponents();
        this.setLocationRelativeTo(null);
        DefaultTableModel tabla = new DefaultTableModel(P.verMedicos(), new String[]{"NOMBRE", "APELLIDO", "Especialidad", "Inicio Disponibilidad", "Fin Disponibilidad"});
        JTMedicos.setModel(tabla);
        JTMedicos.setDefaultEditor(Object.class, null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTMedicos = new javax.swing.JTable();
        CBEspecialidad = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        BTNBuscar = new javax.swing.JToggleButton();
        BTNAgendar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JTMedicos.setFont(new java.awt.Font("Rockwell", 0, 12)); // NOI18N
        JTMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTMedicos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 830, 280));

        CBEspecialidad.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        CBEspecialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Todos", "Medicina_Interna", "Pediatría", "Ginecología_y_Obstetricia", "Cirugía_General", "Anestesiología", "Cardiología", "Neurología", "Traumatología_y_Ortopedia", "Dermatología", "Oftalmología", "Otorrinolaringología", "Neumología", "Urología", "Endocrinología", "Gastroenterología", "Nefrología", "Psiquiatría", "Oncología", "Reumatología", "Radiología" }));
        jPanel1.add(CBEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel2.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel2.setText("Especialidad");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 30));

        BTNBuscar.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        BTNBuscar.setText("Buscar");
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 450, 80, 30));

        BTNAgendar.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        BTNAgendar.setText("Agendar");
        BTNAgendar.setBorder(null);
        BTNAgendar.setContentAreaFilled(false);
        BTNAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTNAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNAgendarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 190, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agendar cita P.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 850, 510));

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

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
        if (CBEspecialidad.getSelectedItem().toString().equals("Todos")) {
            DefaultTableModel tabla = new DefaultTableModel(P.verMedicos(), new String[]{"NOMBRE", "APELLIDO", "Especialidad", "Inicio Disponibilidad", "Fin Disponibilidad"});
            JTMedicos.setModel(tabla);
        } else {
            DefaultTableModel tabla = new DefaultTableModel(P.buscarMedicos(CBEspecialidad.getSelectedItem().toString()), new String[]{"NOMBRE", "APELLIDO", "Especialidad", "Inicio Disponibilidad", "Fin Disponibilidad"});
            JTMedicos.setModel(tabla);
            JTMedicos.setDefaultEditor(Object.class, null);
        }
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNAgendarActionPerformed
        int Fila = JTMedicos.getSelectedRow();
        if (Fila == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un medico para agendar la cita medica");
        } else {
            String FechaFin = JTMedicos.getValueAt(Fila, 4).toString();
            String FechaInicio = JTMedicos.getValueAt(Fila, 3).toString();
            Timestamp disponibilidadFinal = Timestamp.valueOf(FechaFin);
            Timestamp disponibilidadInicial = Timestamp.valueOf(FechaInicio);
            Timestamp ahora = new Timestamp(System.currentTimeMillis());
            if (disponibilidadFinal.after(ahora)) {
                ArrayList<String> citasDisponibles;
                Citas ci = new Citas();
                int numeroDocumento = c.determinarNumeroDocumentoMedico(JTMedicos.getValueAt(Fila, 0).toString(), JTMedicos.getValueAt(Fila, 1).toString(), JTMedicos.getValueAt(Fila, 2).toString());
                ci.setDocumentoMedico(numeroDocumento);
                ci.setDocumentoPaciente(c.determinarNumeroDocumentoPaciente());
                citasDisponibles = c.obtenerCitasDisponibles(disponibilidadInicial, disponibilidadFinal, numeroDocumento);
                new DeterminarFechaCita(citasDisponibles, JTMedicos.getValueAt(Fila, 0).toString(), JTMedicos.getValueAt(Fila, 1).toString(), JTMedicos.getValueAt(Fila, 2).toString(), ci).setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "La disponibilidad del Medico a vencido", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_BTNAgendarActionPerformed

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
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgendarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgendarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNAgendar;
    private javax.swing.JToggleButton BTNBuscar;
    private javax.swing.JComboBox<String> CBEspecialidad;
    private javax.swing.JTable JTMedicos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
