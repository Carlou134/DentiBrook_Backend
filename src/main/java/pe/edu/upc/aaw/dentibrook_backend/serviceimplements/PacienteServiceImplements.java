package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IPacienteRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IPacienteService;

import java.util.List;
@Service
public class PacienteServiceImplements implements IPacienteService {
    @Autowired
    private IPacienteRepository pR;

    @Override
    public void insert(Paciente paciente) {
        pR.save(paciente);
    }

    @Override
    public List<Paciente> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int paciente_id) {
        pR.deleteById(paciente_id);
    }

    @Override
    public Paciente listId(int paciente_id) {
        return pR.findById(paciente_id).orElse(new Paciente());
    }
}
