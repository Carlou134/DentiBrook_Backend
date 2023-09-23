package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.HistorialMedico;
import pe.edu.upc.aaw.dentibrook_backend.repositories.HistorialMedicoRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IHistorialMedicoService;

import java.util.List;

@Service
public class HistorialMedicoServiceImplements implements IHistorialMedicoService {
    @Autowired
    private HistorialMedicoRepository hR;


    @Override
    public void insert(HistorialMedico historialMedico) {
        hR.save(historialMedico);
    }

    @Override
    public List<HistorialMedico> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int hm_id) {
        hR.deleteById(hm_id);
    }

    @Override
    public HistorialMedico listId(int hm_id) {
        return hR.findById(hm_id).orElse(new HistorialMedico());
    }
}
