package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;

import java.util.List;

public interface IPacienteService {
    public void insert(Paciente paciente);
    public List<Paciente> list();
    public void delete(int paciente_id);
    public Paciente listId(int paciente_id);
}
