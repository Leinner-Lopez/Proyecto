package Modelos;

import java.util.Date;

public class Citas {
    private int documentoMedico;
    private int documentoPaciente;
    private Date fechaCita;

    public Citas() {
    }
    
    public Citas(int documentoMedico, int documentoPaciente, Date fechaCita) {
        this.documentoMedico = documentoMedico;
        this.documentoPaciente = documentoPaciente;
        this.fechaCita = fechaCita;
    }

    public int getDocumentoMedico() {
        return documentoMedico;
    }

    public void setDocumentoMedico(int documentoMedico) {
        this.documentoMedico = documentoMedico;
    }

    public int getDocumentoPaciente() {
        return documentoPaciente;
    }

    public void setDocumentoPaciente(int documentoPaciente) {
        this.documentoPaciente = documentoPaciente;
    }

    public Date getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(Date fechaCita) {
        this.fechaCita = fechaCita;
    }
}
