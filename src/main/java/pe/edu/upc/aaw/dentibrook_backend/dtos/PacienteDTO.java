package pe.edu.upc.aaw.dentibrook_backend.dtos;


import pe.edu.upc.aaw.dentibrook_backend.entities.Users;

public class PacienteDTO {
    private int id_paciente;
    private Users user_id;
    private String contacto_emergencia;

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
