package Interfaz.Administrador;
import Persistencias.Metodos;
import Modelos.Administrador;
import Persistencias.AdministradorSQL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class EditarAdministrador extends javax.swing.JFrame {

    boolean estado = false;
    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public EditarAdministrador() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public EditarAdministrador(String[] administrador) {
        try {
            initComponents();
            this.setLocationRelativeTo(this);
            this.setResizable(false);
            this.setTitle("Editar Paciente");
            BTNmostrar.setText("Mostrar");
            JPConfirmarContraseña.setEchoChar('•');
            JPContraseña.setEchoChar('•');
            String[] partes = Metodos.descomponerDireccion(administrador[7]);
            JTnombre_1.setText(administrador[0]);
            JTnombre_2.setText(administrador[1]);
            JTapellido_1.setText(administrador[2]);
            JTapellido_2.setText(administrador[3]);
            CBTipo_Documento.setSelectedItem(administrador[4]);
            JTNumero_Documento.setText(administrador[5]);
            Date fechaNacimiento = formato.parse(administrador[6]);
            JSFecha_Nacimiento.setValue(fechaNacimiento);
            CBTipo_Via1.setSelectedItem(partes[0]);
            JTNumero_Principal1.setText(partes[1]);
            CBLetras1.setSelectedItem(partes[3]);
            CBOrientacion1.setSelectedItem(partes[4]);
            JTNumero1.setText(partes[5]);
            CBLetras2.setSelectedItem(partes[6]);
            JTNumero2.setText(partes[7]);
            CBBarrio.setSelectedItem(administrador[8]);
            JTCorreo_Electronico.setText(administrador[9]);
            JTTelefono.setText(administrador[10]);
            JTUsuario.setText(administrador[11]);
            JPContraseña.setText(administrador[12]);
            JPConfirmarContraseña.setText(administrador[12]);
        } catch (ParseException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JLDatos_Usuario = new javax.swing.JLabel();
        JLnombre_1 = new javax.swing.JLabel();
        JTnombre_1 = new javax.swing.JTextField();
        JLnombre_2 = new javax.swing.JLabel();
        JTnombre_2 = new javax.swing.JTextField();
        JLapellido_1 = new javax.swing.JLabel();
        JTapellido_1 = new javax.swing.JTextField();
        JLapellido_2 = new javax.swing.JLabel();
        JTapellido_2 = new javax.swing.JTextField();
        JLTipo_Documento = new javax.swing.JLabel();
        CBTipo_Documento = new javax.swing.JComboBox<>();
        JLNumero_Documento = new javax.swing.JLabel();
        JTNumero_Documento = new javax.swing.JTextField();
        JLFecha_Nacimiento = new javax.swing.JLabel();
        JSFecha_Nacimiento = new javax.swing.JSpinner();
        JLDatosContacto = new javax.swing.JLabel();
        JLNumero_Telefono = new javax.swing.JLabel();
        JTCorreo_Electronico = new javax.swing.JTextField();
        JLCorreoElectronico = new javax.swing.JLabel();
        JTTelefono = new javax.swing.JTextField();
        JLNumeral = new javax.swing.JLabel();
        CBLetras2 = new javax.swing.JComboBox<>();
        JCBIS = new javax.swing.JCheckBox();
        JTNumero2 = new javax.swing.JTextField();
        CBTipo_Via1 = new javax.swing.JComboBox<>();
        JLBarrio = new javax.swing.JLabel();
        JTNumero_Principal1 = new javax.swing.JTextField();
        JLRaya = new javax.swing.JLabel();
        JTNumero1 = new javax.swing.JTextField();
        CBBarrio = new javax.swing.JComboBox<>();
        JLDireccion1 = new javax.swing.JLabel();
        CBOrientacion1 = new javax.swing.JComboBox<>();
        BTNResgistrarse = new javax.swing.JButton();
        CBLetras1 = new javax.swing.JComboBox<>();
        JLDatosCuenta = new javax.swing.JLabel();
        JLUsuario = new javax.swing.JLabel();
        JTUsuario = new javax.swing.JTextField();
        BTNmostrar = new javax.swing.JButton();
        JPConfirmarContraseña = new javax.swing.JPasswordField();
        JPContraseña = new javax.swing.JPasswordField();
        JLContraseña = new javax.swing.JLabel();
        JLConfirmarContraseña = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JLDatos_Usuario.setFont(new java.awt.Font("Serif", 1, 36)); // NOI18N
        JLDatos_Usuario.setText("Datos del Usuario");
        jPanel1.add(JLDatos_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        JLnombre_1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLnombre_1.setText("Primer Nombre");
        jPanel1.add(JLnombre_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        JTnombre_1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JTnombre_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 131, 30));

        JLnombre_2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLnombre_2.setText("Segundo Nombre");
        jPanel1.add(JLnombre_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 70, -1, -1));

        JTnombre_2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JTnombre_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 146, 30));

        JLapellido_1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLapellido_1.setText("Primer Apellido");
        jPanel1.add(JLapellido_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, -1, -1));

        JTapellido_1.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JTapellido_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, 132, 30));

        JLapellido_2.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLapellido_2.setText("Segundo Apellido");
        jPanel1.add(JLapellido_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 70, -1, -1));

        JTapellido_2.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JTapellido_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 147, 30));

        JLTipo_Documento.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLTipo_Documento.setText("Tipo de Documento");
        jPanel1.add(JLTipo_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, -1, -1));

        CBTipo_Documento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        CBTipo_Documento.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CC", "CE", "PAS", "PEP", "PPN" }));
        jPanel1.add(CBTipo_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, 60, 30));

        JLNumero_Documento.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLNumero_Documento.setText("Numero de Documento");
        jPanel1.add(JLNumero_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, -1, -1));

        JTNumero_Documento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JTNumero_Documento, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 191, 30));

        JLFecha_Nacimiento.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLFecha_Nacimiento.setText("Fecha de Nacimiento");
        jPanel1.add(JLFecha_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 140, -1, -1));

        JSFecha_Nacimiento.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JSFecha_Nacimiento.setModel(new javax.swing.SpinnerDateModel(new java.util.Date(), null, null, java.util.Calendar.DAY_OF_YEAR));
        JSFecha_Nacimiento.setEditor(new javax.swing.JSpinner.DateEditor(JSFecha_Nacimiento, "yyyy-MM-dd"));
        jPanel1.add(JSFecha_Nacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 170, -1, 30));

        JLDatosContacto.setFont(new java.awt.Font("Serif", 1, 34)); // NOI18N
        JLDatosContacto.setText("Datos de Contacto");
        jPanel1.add(JLDatosContacto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        JLNumero_Telefono.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLNumero_Telefono.setText("Numero de Telefono");
        jPanel1.add(JLNumero_Telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, -1, -1));

        JTCorreo_Electronico.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JTCorreo_Electronico.setPreferredSize(new java.awt.Dimension(15, 30));
        jPanel1.add(JTCorreo_Electronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 204, -1));

        JLCorreoElectronico.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLCorreoElectronico.setText("Correo electronico");
        jPanel1.add(JLCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, -1, -1));

        JTTelefono.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JTTelefono.setPreferredSize(new java.awt.Dimension(15, 30));
        jPanel1.add(JTTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 410, 128, -1));

        JLNumeral.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        JLNumeral.setText("#");
        jPanel1.add(JLNumeral, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, -1, -1));

        CBLetras2.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CBLetras2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E" }));
        jPanel1.add(CBLetras2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, -1, -1));

        JCBIS.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        JCBIS.setText("Bis");
        jPanel1.add(JCBIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, -1, -1));

        JTNumero2.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel1.add(JTNumero2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 250, 37, -1));

        CBTipo_Via1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CBTipo_Via1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Calle", "Carrera", "Transversal", "Diagonal", "Avenida" }));
        jPanel1.add(CBTipo_Via1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, -1, -1));

        JLBarrio.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLBarrio.setText("Barrio");
        jPanel1.add(JLBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 310, -1, -1));

        JTNumero_Principal1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel1.add(JTNumero_Principal1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 37, -1));

        JLRaya.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        JLRaya.setText("-");
        jPanel1.add(JLRaya, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 250, -1, -1));

        JTNumero1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jPanel1.add(JTNumero1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 250, 37, -1));

        CBBarrio.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        CBBarrio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antonio Nariño", "Balmoral", "Bella Vista", "Bonet", "Bosque Bonnet", "Callejón de Bonet", "Carlos Lleras", "Cedritos", "Ciudad Eben-ezer", "Ciudad Jardín", "Ciudadela Comfenalco", "Coburgo", "Comboy", "Conjunto Cerrado San Martín de Los Olivos", "Conjunto Residencial Asoveinte", "Conjunto Residencial Balcones de San José", "Conjunto Residencial Villa Rosita", "Diagonal 17", "Eben Ezer", "El Caney", "El Edén", "El Lucero", "El Manantial", "El Oasis", "El Progreso", "El Rosal", "El Tejar", "Emilio Sierra", "Fontanar", "Fusacat", "Gaitán I", "Gaitán II", "Gran Colombia", "Independencia", "José Antonio Galán", "La Cabaña", "La Esmeralda", "La Florida", "La Independencia", "La Palma", "La Pampa", "La Primavera", "La Venta", "Leidy Di", "Llano Grande", "Llano Largo", "Llano Verde", "Los Andes", "Los Fundadores", "Los Girasoles", "Los Robles", "Los Sauces", "Luxemburgo", "Maíz Amarillo", "Mandalay", "Manila", "Marsella", "Mi Tesoro", "Monte Verde", "Nueva Campiña", "Nueva Esperanza", "Nuevo Balmoral", "Olaya", "Parques de Occidente Etapas I y II", "Pekín", "Piedra Grande", "Potosí", "Porvenir La Salle", "Quintas de Balmoral", "San Antonio", "San Diego La Venta", "San Francisco", "San Jorge", "San Mateo", "Santa Ana Campestre", "Santa Anita", "Santa Clara", "Santa Librada", "Santa María de Los Ángeles", "Santander", "Siboney", "Teresita I", "Teresita II", "Urbanización Altos de Pekín", "Urbanización Cádiz", "Urbanización Cambulos", "Urbanización El Oasis", "Urbanización La Primavera", "Urbanización Las Brisas", "Urbanización Nueva Campiña", "Urbanización Parques de Occidente Etapas I y II", "Urbanización Pedregal de San Luis", "Urbanización Villa Alix", "Urbanización Los Girasoles", "Urbanización San Diego La Venta", "Urbanización Santa Anita", "Urbanización Siboney", "Urbanización Teresita I", "Urbanización Teresita II", "Urbanización Villa Rosita", "Urbanización Villas de San Diego I", "Urbanización Villas de San Diego II", "Urbanización Villas de San José", "Urbanización Villas del Rosario", "Urbanización Villa Natalia", "Urbanización Villa Rosalía", "Urbanización Villa Sutagaos", "Villa Alix", "Villa Aranzazu", "Villa Armerita", "Villa Celeste", "Villa Country", "Villa de Los Sutagaos", "Villa Natalia", "Villa Rosalía", "Villas de San Diego I", "Villas de San Diego II", "Villas de La Pampa" }));
        jPanel1.add(CBBarrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, -1));

        JLDireccion1.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLDireccion1.setText("Direccion");
        jPanel1.add(JLDireccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, 87, -1));

        CBOrientacion1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CBOrientacion1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Este", "Oeste", "Sur", "Norte" }));
        jPanel1.add(CBOrientacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, -1, -1));

        BTNResgistrarse.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        BTNResgistrarse.setText("Registrar");
        BTNResgistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNResgistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(BTNResgistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 550, -1, -1));

        CBLetras1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        CBLetras1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "A", "B", "C", "D", "E" }));
        jPanel1.add(CBLetras1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        JLDatosCuenta.setFont(new java.awt.Font("Serif", 1, 34)); // NOI18N
        JLDatosCuenta.setText("Datos de la Cuenta");
        jPanel1.add(JLDatosCuenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        JLUsuario.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLUsuario.setText("Usuario");
        jPanel1.add(JLUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 510, -1, -1));

        JTUsuario.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        JTUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(JTUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 164, 30));

        BTNmostrar.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        BTNmostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNmostrarActionPerformed(evt);
            }
        });
        jPanel1.add(BTNmostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 560, 84, 30));

        JPConfirmarContraseña.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JPConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 560, 140, -1));

        JPContraseña.setFont(new java.awt.Font("Serif", 0, 18)); // NOI18N
        jPanel1.add(JPContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 140, -1));

        JLContraseña.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLContraseña.setText("Contraseña");
        jPanel1.add(JLContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, -1, -1));

        JLConfirmarContraseña.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        JLConfirmarContraseña.setText("Confirmar Contraseña");
        jPanel1.add(JLConfirmarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 560, -1, -1));

        jLabel1.setFont(new java.awt.Font("Serif", 0, 16)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Registro.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 600));

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

    private void BTNResgistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNResgistrarseActionPerformed
        String contra = new String(JPContraseña.getPassword());
        String Ccontra = new String(JPConfirmarContraseña.getPassword());
        //Verificamos si todos los campos estan completos:
        if (!JTnombre_1.getText().equals("") && !JTapellido_1.getText().equals("") && !JTNumero_Documento.getText().equals("")
                && !JTNumero_Principal1.getText().equals("") && !JTCorreo_Electronico.getText().equals("") && !JTUsuario.getText().equals("")
                && !contra.equals("") && contra.equals(Ccontra)) {
            int respuesta = JOptionPane.showConfirmDialog(null, "¿Estas segur@ de enviar los datos?", "Confirmacion", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            if (respuesta == JOptionPane.YES_OPTION) {
                String Bis = "";
                if (JCBIS.isSelected()) {
                    Bis = "Bis";
                }
                String Direccion = Metodos.direccion(CBTipo_Via1.getSelectedItem().toString().trim(), JTNumero_Principal1.getText().trim(), Bis.trim(), CBLetras1.getSelectedItem().toString().trim(), CBOrientacion1.getSelectedItem().toString().trim(), JTNumero1.getText().trim(), CBLetras2.getSelectedItem().toString().trim(), JTNumero2.getText().trim());
                Date FechaNacimiento = (Date) JSFecha_Nacimiento.getValue();
                Administrador A = new Administrador(JTnombre_1.getText(), JTnombre_2.getText(), JTapellido_1.getText(), JTapellido_2.getText(), CBTipo_Documento.getSelectedItem().toString(), Integer.parseInt(JTNumero_Documento.getText()), FechaNacimiento, JTCorreo_Electronico.getText(), JTTelefono.getText(), Direccion, CBBarrio.getSelectedItem().toString(), JTUsuario.getText(), contra);
                Administrador.setUsuario(JTUsuario.getText());
                AdministradorSQL AS = new AdministradorSQL(A);
                AS.actualizarDatos();
                this.dispose();
                new VizualizarAdministradores().setVisible(true);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Llena todos los campos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BTNResgistrarseActionPerformed

    private void BTNmostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNmostrarActionPerformed
        estado = !estado;
        if (estado) {
            BTNmostrar.setText("Ocultar");
            JPContraseña.setEchoChar((char) 0);
            JPConfirmarContraseña.setEchoChar((char) 0);
        } else {
            BTNmostrar.setText("Mostrar");
            JPConfirmarContraseña.setEchoChar('•');
            JPContraseña.setEchoChar('•');
        }

    }//GEN-LAST:event_BTNmostrarActionPerformed

    private void JTUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTUsuarioActionPerformed

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
            java.util.logging.Logger.getLogger(EditarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNResgistrarse;
    private javax.swing.JButton BTNmostrar;
    private javax.swing.JComboBox<String> CBBarrio;
    private javax.swing.JComboBox<String> CBLetras1;
    private javax.swing.JComboBox<String> CBLetras2;
    private javax.swing.JComboBox<String> CBOrientacion1;
    private javax.swing.JComboBox<String> CBTipo_Documento;
    private javax.swing.JComboBox<String> CBTipo_Via1;
    private javax.swing.JCheckBox JCBIS;
    private javax.swing.JLabel JLBarrio;
    private javax.swing.JLabel JLConfirmarContraseña;
    private javax.swing.JLabel JLContraseña;
    private javax.swing.JLabel JLCorreoElectronico;
    private javax.swing.JLabel JLDatosContacto;
    private javax.swing.JLabel JLDatosCuenta;
    private javax.swing.JLabel JLDatos_Usuario;
    private javax.swing.JLabel JLDireccion1;
    private javax.swing.JLabel JLFecha_Nacimiento;
    private javax.swing.JLabel JLNumeral;
    private javax.swing.JLabel JLNumero_Documento;
    private javax.swing.JLabel JLNumero_Telefono;
    private javax.swing.JLabel JLRaya;
    private javax.swing.JLabel JLTipo_Documento;
    private javax.swing.JLabel JLUsuario;
    private javax.swing.JLabel JLapellido_1;
    private javax.swing.JLabel JLapellido_2;
    private javax.swing.JLabel JLnombre_1;
    private javax.swing.JLabel JLnombre_2;
    private javax.swing.JPasswordField JPConfirmarContraseña;
    private javax.swing.JPasswordField JPContraseña;
    private javax.swing.JSpinner JSFecha_Nacimiento;
    private javax.swing.JTextField JTCorreo_Electronico;
    private javax.swing.JTextField JTNumero1;
    private javax.swing.JTextField JTNumero2;
    private javax.swing.JTextField JTNumero_Documento;
    private javax.swing.JTextField JTNumero_Principal1;
    private javax.swing.JTextField JTTelefono;
    private javax.swing.JTextField JTUsuario;
    private javax.swing.JTextField JTapellido_1;
    private javax.swing.JTextField JTapellido_2;
    private javax.swing.JTextField JTnombre_1;
    private javax.swing.JTextField JTnombre_2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
