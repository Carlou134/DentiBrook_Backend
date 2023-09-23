package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Examen;
import pe.edu.upc.aaw.dentibrook_backend.entities.ExamenLab;
import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;
import pe.edu.upc.aaw.dentibrook_backend.entities.Tratamiento;

import java.time.LocalDate;

public class HistorialMedicoDTO {
    private int historial_medico_id;
    private Paciente paciente_id;
    private Tratamiento tratamiento_id;
    private Examen examen_id;
    private ExamenLab examen_laboratorio_id;
    private LocalDate fecha_de_creacion;
    private String cirugias;
    private String alergias;
    private String seguro_medico;

    public int getHistorial_medico_id() {
        return historial_medico_id;
    }

    public void setHistorial_medico_id(int historial_medico_id) {
        this.historial_medico_id = historial_medico_id;
    }

    public Paciente getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Paciente paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Tratamiento getTratamiento_id() {
        return tratamiento_id;
    }

    public void setTratamiento_id(Tratamiento tratamiento_id) {
        this.tratamiento_id = tratamiento_id;
    }

    public Examen getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(Examen examen_id) {
        this.examen_id = examen_id;
    }

    public ExamenLab getExamen_laboratorio_id() {
        return examen_laboratorio_id;
    }

    public void setExamen_laboratorio_id(ExamenLab examen_laboratorio_id) {
        this.examen_laboratorio_id = examen_laboratorio_id;
    }

    public LocalDate getFecha_de_creacion() {
        return fecha_de_creacion;
    }

    public void setFecha_de_creacion(LocalDate fecha_de_creacion) {
        this.fecha_de_creacion = fecha_de_creacion;
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getSeguro_medico() {
        return seguro_medico;
    }

    public void setSeguro_medico(String seguro_medico) {
        this.seguro_medico = seguro_medico;
    }
}
