package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Medicamento;

import java.util.List;

public interface IMedicamentoService {
    public void insert(Medicamento medicamento);
    public List<Medicamento> list();
    public void delete(int medicamento_id);
    public Medicamento listId(int medicamento_id);
}
