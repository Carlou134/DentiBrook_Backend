package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Examen;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IExamenRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IExamenService;

import java.util.List;

@Service
public class IExamenServiceImplements implements IExamenService {
    @Autowired
    private IExamenRepository eR;

    @Override
    public void insert(Examen examen) {
        eR.save(examen);
    }

    @Override
    public List<Examen> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int examen_id) {
        eR.deleteById(examen_id);
    }

    @Override
    public Examen listId(int examen_id) {
        return eR.findById(examen_id).orElse(new Examen());
    }
}
