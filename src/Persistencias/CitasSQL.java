package Persistencias;

import Modelos.Citas;
import Modelos.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class CitasSQL {

    Conexion c = new Conexion();
    private Citas ci;

    public CitasSQL() {
    }

    public CitasSQL(Citas ci) {
        this.ci = ci;
    }

    public int determinarNumeroDocumentoMedico(String nombre_1, String apellido_1, String especialidad) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rta = null;
        int documento = 0;
        try {
            con = c.conectar();
            String query = "SELECT num_documento FROM medicos WHERE nombre_1=? AND apellido_1 = ? AND especialidad = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, nombre_1);
            stmt.setString(2, apellido_1);
            stmt.setString(3, especialidad);
            rta = stmt.executeQuery();
            if (rta.next()) {
                documento = rta.getInt("num_documento");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
                if (rta != null) {
                    rta.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return documento;
    }

    public int determinarNumeroDocumentoPaciente() {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rta = null;
        int documento = 0;
        try {
            con = c.conectar();
            String query = "SELECT num_documento FROM pacientes WHERE usuario = ?";
            stmt = con.prepareStatement(query);
            stmt.setString(1, Usuario.getUsuario());
            rta = stmt.executeQuery();
            if (rta.next()) {
                documento = rta.getInt("num_documento");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
                if (rta != null) {
                    rta.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return documento;
    }

    public ArrayList<String> obtenerCitasTomadas(Timestamp inicioDisponibilidad, Timestamp finDisponibilidad, int numeroDocumento) {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rta = null;
        ArrayList<String> horasDisponibles = new ArrayList<>();
        try {
            con = c.conectar();
            String query = "SELECT fecha_hora FROM citas WHERE documento_medico = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, numeroDocumento);
            rta = stmt.executeQuery();
            ArrayList<LocalDateTime> citasTomadas = new ArrayList<>();
            while (rta.next()) {
                Timestamp fechaHora = rta.getTimestamp("fecha_hora");
                citasTomadas.add(fechaHora.toLocalDateTime());
            }
            LocalDateTime inicio = inicioDisponibilidad.toLocalDateTime();
            LocalDateTime fin = finDisponibilidad.toLocalDateTime();
            DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            while (!inicio.isAfter(fin)) {
                boolean ocupada = false;
                for (LocalDateTime cita : citasTomadas) {
                    if (cita.isEqual(inicio)) {
                        ocupada = true;
                        break;
                    }
                }
                if (!ocupada) {
                    horasDisponibles.add(inicio.format(formato));
                }
                inicio = inicio.plusMinutes(15);
            }
            return horasDisponibles;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rta != null) {
                    rta.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        return horasDisponibles;
    }

    public void agendarCita() {
        Timestamp fechasql = new Timestamp(ci.getFechaCita().getTime());
        Connection con = null;
        ResultSet rta = null;
        PreparedStatement stmt = null;
        try {
            con = c.conectar();
            String query = "INSERT INTO citas (fecha_hora, documento_paciente, documento_medico) VALUES (?, ?, ?)";
            stmt = con.prepareStatement(query);
            stmt.setTimestamp(1, fechasql);
            stmt.setInt(2, ci.getDocumentoPaciente());
            stmt.setInt(3, ci.getDocumentoMedico());
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Cita Agendada con exito", "Cita agendada", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (rta != null) {
                    rta.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    public void eliminarCita() {
        Timestamp fechasql = new Timestamp(ci.getFechaCita().getTime());
        Connection con = null;
        PreparedStatement stmt = null;
        try {
            con = c.conectar();
            String query = "DELETE FROM citas WHERE documento_paciente = ? AND documento_medico = ? AND fecha_hora = ?";
            stmt = con.prepareStatement(query);
            stmt.setInt(1, ci.getDocumentoPaciente());
            stmt.setInt(2, ci.getDocumentoMedico());
            stmt.setTimestamp(3, fechasql);
            int filas = stmt.executeUpdate();
            if (filas > 0) {
                JOptionPane.showMessageDialog(null, "Cita eliminada con exito", "Paciente Eliminado", JOptionPane.INFORMATION_MESSAGE);
            } else {
                System.out.println("No se pudo eliminar la cita");
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
