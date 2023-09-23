package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Herramienta;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IHerramientaRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IHerramientaService;

import java.util.List;

@Service
public class HerramientaServiceImplements implements IHerramientaService {
    @Autowired
    private IHerramientaRepository hR;


    @Override
    public void insert(Herramienta herramienta) {
        hR.save(herramienta);
    }

    @Override
    public List<Herramienta> list() {
        return hR.findAll();
    }

    @Override
    public void delete(int herramienta_id) {
        hR.deleteById(herramienta_id);
    }

    @Override
    public Herramienta listId(int herramienta_id) {
        return hR.findById(herramienta_id).orElse(new Herramienta());
    }
}
