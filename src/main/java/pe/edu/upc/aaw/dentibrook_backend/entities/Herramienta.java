package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "herramienta")
public class Herramienta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int herramienta_id;
    @ManyToOne
    @JoinColumn(name = "odontologo_id")
    private Odontologo odontologo_id;
    @Column(name = "nombre", length = 30)
    private String nombre;

    public Herramienta() {
    }

    public Herramienta(int herramienta_id, Odontologo odontologo_id, String nombre) {
        this.herramienta_id = herramienta_id;
        this.odontologo_id = odontologo_id;
        this.nombre = nombre;
    }

    public int getHerramienta_id() {
        return herramienta_id;
    }

    public void setHerramienta_id(int herramienta_id) {
        this.herramienta_id = herramienta_id;
    }

    public Odontologo getOdontologo_id() {
        return odontologo_id;
    }

    public void setOdontologo_id(Odontologo odontologo_id) {
        this.odontologo_id = odontologo_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
