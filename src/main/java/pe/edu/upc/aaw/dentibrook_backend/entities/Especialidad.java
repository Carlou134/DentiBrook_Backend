package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int especialidad_id;
    @Column(name = "nombreEspecialidad", length = 30)
    private String nombreEspecialidad;

    public Especialidad() {
    }

    public Especialidad(int especialidad_id, String nombreEspecialidad) {
        this.especialidad_id = especialidad_id;
        this.nombreEspecialidad = nombreEspecialidad;
    }

    public int getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(int especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public String getNombreEspecialidad() {
        return nombreEspecialidad;
    }

    public void setNombreEspecialidad(String nombreEspecialidad) {
        this.nombreEspecialidad = nombreEspecialidad;
    }
}
