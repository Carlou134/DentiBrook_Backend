package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Especialidad;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IEspecialidadRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IEspecialidadService;

import java.util.List;

@Service
public class EspecialidadServiceImplements implements IEspecialidadService {
    @Autowired
    private IEspecialidadRepository eR;


    @Override
    public void insert(Especialidad especialidad) {
        eR.save(especialidad);
    }

    @Override
    public List<Especialidad> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int especialidad_id) {
        eR.deleteById(especialidad_id);
    }

    @Override
    public Especialidad listId(int especialidad_id) {
        return eR.findById(especialidad_id).orElse(new Especialidad());
    }

    @Override
    public List<Especialidad> findEspecialidadByNombreEspecialidad(String nombreEspecialidad) {
        return eR.findEspecialidadByNombreEspecialidad(nombreEspecialidad);
    }
}
