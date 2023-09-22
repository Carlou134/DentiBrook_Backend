package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Tratamiento;
import pe.edu.upc.aaw.dentibrook_backend.repositories.ITratamientoRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ITratamientoService;

import java.util.List;

@Service
public class TratamientoServiceImplements implements ITratamientoService {
    @Autowired
    private ITratamientoRepository tR;


    @Override
    public void insert(Tratamiento tratamiento) {
        tR.save(tratamiento);
    }

    @Override
    public List<Tratamiento> list() {
        return tR.findAll();
    }

    @Override
    public void delete(int tratamiento_id) {
        tR.deleteById(tratamiento_id);
    }

    @Override
    public Tratamiento listId(int tratamiento_id) {
        return tR.findById(tratamiento_id).orElse(new Tratamiento());
    }
}
