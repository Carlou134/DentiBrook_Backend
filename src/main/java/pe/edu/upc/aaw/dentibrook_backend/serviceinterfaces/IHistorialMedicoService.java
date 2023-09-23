package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.HistorialMedico;

import java.util.List;

public interface IHistorialMedicoService {
    public void insert(HistorialMedico historialMedico);
    public List<HistorialMedico> list();
    public void delete(int hm_id);
    public HistorialMedico listId(int hm_id);
}
