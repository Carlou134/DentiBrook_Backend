package pe.edu.upc.aaw.dentibrook_backend.dtos;

import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;


public class ReputacionDTO {
    private int reputacion_id;
    private Odontologo odontologo_id;
    private Paciente paciente_id;
    private String comentario;
    private int estrellas;

    public int getReputacion_id() {
        return reputacion_id;
    }

    public void setReputacion_id(int reputacion_id) {
        this.reputacion_id = reputacion_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public Paciente getPaciente_id() {
        return paciente_id;
    }

    public void setPaciente_id(Paciente paciente_id) {
        this.paciente_id = paciente_id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getEstrellas() {
        return estrellas;
    }

    public void setEstrellas(int estrellas) {
        this.estrellas = estrellas;
    }
}
