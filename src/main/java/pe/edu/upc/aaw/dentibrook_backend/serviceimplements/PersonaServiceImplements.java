package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Persona;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IPersonaRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IPersonaService;

import java.util.List;

@Service
public class PersonaServiceImplements implements IPersonaService {
    private IPersonaRepository pR;
    @Override
    public void insert(Persona persona) {

    }

    @Override
    public List<Persona> list() {
        return null;
    }
}
