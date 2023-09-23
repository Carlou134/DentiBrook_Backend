package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.ExamenLab;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IExamenLabRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IExamenLabService;

import java.util.List;

@Service
public class IExamenLabServiceImplements implements IExamenLabService {
    @Autowired
    private IExamenLabRepository eR;


    @Override
    public void insert(ExamenLab examenLab) {
        eR.save(examenLab);
    }

    @Override
    public List<ExamenLab> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int examenLab_id) {
        eR.deleteById(examenLab_id);
    }

    @Override
    public ExamenLab listId(int examenLab_id) {
        return eR.findById(examenLab_id).orElse(new ExamenLab());
    }
}
