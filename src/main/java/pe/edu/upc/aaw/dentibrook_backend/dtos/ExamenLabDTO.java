package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;


import java.time.LocalDate;

public class ExamenLabDTO {
    private int examen_de_laboratorio_id;
    private Paciente paciente_id;
    private LocalDate fecha;
    private String hora;
    private String tipo_examen;
    private String tipo_muestra_tomada;
    private String resultados;

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
