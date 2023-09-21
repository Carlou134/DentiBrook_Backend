package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;
import pe.edu.upc.aaw.dentibrook_backend.repositories.ICitaRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ICitaService;

import java.util.List;
@Service
public class CitaServiceImplements implements ICitaService {
    @Autowired
    private ICitaRepository pR;

    @Override
    public void insert(Cita Cita) {
        pR.save(Cita);
    }

    @Override
    public List<Cita> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int Cita_id) {
        pR.deleteById(Cita_id);
    }

    @Override
    public Cita listId(int Cita_id) {
        return pR.findById(Cita_id).orElse(new Cita());
    }
}
