package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "historial_medico")
public class HistorialMedico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int historial_medico_id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente_id;
    @ManyToOne
    @JoinColumn(name = "tratamiento_id")
    private Tratamiento tratamiento_id;
    @ManyToOne
    @JoinColumn(name = "examen_id")
    private Examen examen_id;
    @ManyToOne
    @JoinColumn(name = "examen_de_laboratorio_id")
    private ExamenLab examen_laboratorio_id;
    @Column(name = "fecha_de_creacion")
    private LocalDate fecha_de_creacion;
    @Column(name = "cirugias", length = 100)
    private String cirugias;
    @Column(name = "alergias", length = 100)
    private String alergias;
    @Column(name = "seguro_medico", length = 100)
    private String seguro_medico;

    public HistorialMedico() {
    }

    public HistorialMedico(int historial_medico_id, Paciente paciente_id, Tratamiento tratamiento_id, Examen examen_id, ExamenLab examen_laboratorio_id, LocalDate fecha_de_creacion, String cirugias, String alergias, String seguro_medico) {
        this.historial_medico_id = historial_medico_id;
        this.paciente_id = paciente_id;
        this.tratamiento_id = tratamiento_id;
        this.examen_id = examen_id;
        this.examen_laboratorio_id = examen_laboratorio_id;
        this.fecha_de_creacion = fecha_de_creacion;
        this.cirugias = cirugias;
        this.alergias = alergias;
        this.seguro_medico = seguro_medico;
    }

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
