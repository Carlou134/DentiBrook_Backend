package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Medicamento;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IMedicamentoRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IMedicamentoService;

import java.util.List;

@Service
public class MedicamentoServiceImplements implements IMedicamentoService {
    @Autowired
    private IMedicamentoRepository mR;


    @Override
    public void insert(Medicamento medicamento) {
        mR.save(medicamento);
    }

    @Override
    public List<Medicamento> list() {
        return mR.findAll();
    }

    @Override
    public void delete(int medicamento_id) {
        mR.deleteById(medicamento_id);
    }

    @Override
    public Medicamento listId(int medicamento_id) {
        return mR.findById(medicamento_id).orElse(new Medicamento());
    }
}
