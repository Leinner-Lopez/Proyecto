package Modelos;

import java.util.Date;

public class Medico extends Usuario {
    
    public enum especialidad {
        Medicina_Interna, Pediatría, Ginecología_y_Obstetricia, Cirugía_General, Anestesiología,
        Cardiología, Neurología, Traumatología_y_Ortopedia, Dermatología, Oftalmología, Otorrinolaringología, Neumología,
        Urología, Endocrinología, Gastroenterología, Nefrología, Psiquiatría, Oncología, Reumatología, Radiología
    };
    public especialidad tipo;

    public Medico() {
    }

    public Medico(String nombre1, String nombre2, String apellido1, String apellido2, String tipoDocumento, int numeroDocumento, Date fechaNacimiento, String correo, String telefono, String direccion, String barrio, String usuario, String contraseña, especialidad tipo) {
        super(nombre1, nombre2, apellido1, apellido2, tipoDocumento, numeroDocumento, fechaNacimiento, correo, telefono, direccion, barrio, contraseña);
        this.tipo = tipo;
    }

    public especialidad getTipo() {
        return tipo;
    }

    public void setTipo(especialidad tipo) {
        this.tipo = tipo;
    }



    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public static String getUsuario() {
        return usuario;
    }

    public static void setUsuario(String usuario) {
        Usuario.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
