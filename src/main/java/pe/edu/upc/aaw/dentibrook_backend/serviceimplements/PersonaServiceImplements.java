package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Persona;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IPersonaRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IPersonaService;

import java.util.List;

@Service
public class PersonaServiceImplements implements IPersonaService {
    @Autowired
    private IPersonaRepository pR;
    @Override
    public void insert(Persona persona) {
        pR.save(persona);
    }

    @Override
    public List<Persona> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int persona_id) {
        pR.deleteById(persona_id);
    }

    @Override
    public Persona listId(int persona_id) {
        return pR.findById(persona_id).orElse(new Persona());
    }
}
