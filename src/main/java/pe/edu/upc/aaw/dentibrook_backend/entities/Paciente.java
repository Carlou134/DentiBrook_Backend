package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "Paciente")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_paciente;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user_id;
    @Column(name = "contacto_emergencia", length = 100)
    private String contacto_emergencia;

    public Paciente() {
    }

    public Paciente(int id_paciente, Users user_id, String contacto_emergencia) {
        this.id_paciente = id_paciente;
        this.user_id = user_id;
        this.contacto_emergencia = contacto_emergencia;
    }

    public int getId_paciente() {
        return id_paciente;
    }

    public void setId_paciente(int id_paciente) {
        this.id_paciente = id_paciente;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public String getContacto_emergencia() {
        return contacto_emergencia;
    }

    public void setContacto_emergencia(String contacto_emergencia) {
        this.contacto_emergencia = contacto_emergencia;
    }
}

