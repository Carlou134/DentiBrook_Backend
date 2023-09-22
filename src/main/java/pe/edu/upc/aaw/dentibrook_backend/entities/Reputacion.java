package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "reputacion")
public class Reputacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reputacion_id;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo_id;
    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente_id;
    @Column(name = "comentario", length = 200)
    private String comentario;
    @Column(name = "estrellas")
    private int estrellas;

    public Reputacion() {
    }

    public Reputacion(int reputacion_id, Odontologo odontologo_id, Paciente paciente_id, String comentario, int estrellas) {
        this.reputacion_id = reputacion_id;
        this.odontologo_id = odontologo_id;
        this.paciente_id = paciente_id;
        this.comentario = comentario;
        this.estrellas = estrellas;
    }

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
