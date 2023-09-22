package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "examen_de_laboratorio")
public class ExamenLab {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int examen_de_laboratorio_id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente_id;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "hora", length = 5)
    private String hora;
    @Column(name = "tipo_examen", length = 20)
    private String tipo_examen;
    @Column(name = "tipo_muestra_tomada", length = 20)
    private String tipo_muestra_tomada;
    @Column(name = "resultados", length = 100)
    private String resultados;

    public ExamenLab() {
    }

    public ExamenLab(int examen_de_laboratorio_id, Paciente paciente_id, LocalDate fecha, String hora, String tipo_examen, String tipo_muestra_tomada, String resultados) {
        this.examen_de_laboratorio_id = examen_de_laboratorio_id;
        this.paciente_id = paciente_id;
        this.fecha = fecha;
        this.hora = hora;
        this.tipo_examen = tipo_examen;
        this.tipo_muestra_tomada = tipo_muestra_tomada;
        this.resultados = resultados;
    }

    public int getExamen_de_laboratorio_id() {
        return examen_de_laboratorio_id;
    }

    public void setExamen_de_laboratorio_id(int examen_de_laboratorio_id) {
        this.examen_de_laboratorio_id = examen_de_laboratorio_id;
    }

    public Paciente getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Paciente paciente_id) {
        this.paciente_id = paciente_id;
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

    public String getTipo_muestra_tomada() {
        return tipo_muestra_tomada;
    }

    public void setTipo_muestra_tomada(String tipo_muestra_tomada) {
        this.tipo_muestra_tomada = tipo_muestra_tomada;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
}
