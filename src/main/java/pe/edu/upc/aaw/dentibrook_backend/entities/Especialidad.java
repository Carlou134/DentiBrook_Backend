package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int especialidad_id;
    @Column(name = "nombre_especialidad", length = 30)
    private String nombre_especialidad;

    public Especialidad() {
    }

    public Especialidad(int especialidad_id, String nombre_especialidad) {
        this.especialidad_id = especialidad_id;
        this.nombre_especialidad = nombre_especialidad;
    }

    public int getEspecialidad_id() {
        return especialidad_id;
    }

    public void setEspecialidad_id(int especialidad_id) {
        this.especialidad_id = especialidad_id;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }
}
