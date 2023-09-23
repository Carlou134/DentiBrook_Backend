package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "examen")
public class Examen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examen_id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente_id;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo_id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "hora", length = 5)
    private String hora;
    @Column(name = "tipo_examen", length = 20)
    private String tipo_examen;
    @Column(name = "indicaciones_pre_examen", length = 20)
    private String indicaciones_pre_examen;
    @Column(name = "resultados", length = 100)
    private String resultados;

    public Examen() {
    }

    public Examen(int examen_id, Paciente paciente_id, Odontologo odontologo_id, LocalDate fecha, String hora, String tipo_examen, String indicaciones_pre_examen, String resultados) {
        this.examen_id = examen_id;
        this.paciente_id = paciente_id;
        this.odontologo_id = odontologo_id;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo_examen = tipo_examen;
        this.indicaciones_pre_examen = indicaciones_pre_examen;
        this.resultados = resultados;
    }

    public int getExamen_id() {
        return examen_id;
    }

    public void setExamen_id(int examen_id) {
        this.examen_id = examen_id;
    }

    public Paciente getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Paciente paciente_id) {
        this.paciente_id = paciente_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getTipo_examen() {
        return tipo_examen;
    }

    public void setTipo_examen(String tipo_examen) {
        this.tipo_examen = tipo_examen;
    }

    public String getIndicaciones_pre_examen() {
        return indicaciones_pre_examen;
    }

    public void setIndicaciones_pre_examen(String indicaciones_pre_examen) {
        this.indicaciones_pre_examen = indicaciones_pre_examen;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}
