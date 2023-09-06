package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    @ManyToOne
    @JoinColumn(name = "persona_id")
    private Persona persona_id;
    @Column(name = "direccion", length = 50)
    private String direccion;
    @Column(name = "contacto_emergencia", length = 10)
    private String contacto_emergencia;

    public Paciente() {
    }

    public Paciente(int id_paciente, Persona persona_id, String direccion, String contacto_emergencia) {
        this.id_paciente = id_paciente;
        this.persona_id = persona_id;
        this.direccion = direccion;
        this.contacto_emergencia = contacto_emergencia;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Persona getPersona_id() {
        return persona_id;
    }

    public void setPersona_id(Persona persona_id) {
        this.persona_id = persona_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getContacto_emergencia() {
        return contacto_emergencia;
    }

    public void setContacto_emergencia(String contacto_emergencia) {
        this.contacto_emergencia = contacto_emergencia;
    }
}

