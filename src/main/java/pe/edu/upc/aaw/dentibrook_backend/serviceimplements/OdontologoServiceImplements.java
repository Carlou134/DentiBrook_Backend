package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IOdontologoRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IOdontologoService;

import java.util.List;

@Service
public class OdontologoServiceImplements implements IOdontologoService {
    @Autowired
    private IOdontologoRepository oR;


    @Override
    public void insert(Odontologo odontologo) {
        oR.save(odontologo);
    }

    @Override
    public List<Odontologo> list() {
        return oR.findAll();
    }

    @Override
    public void delete(int odontologo_id) {
        oR.deleteById(odontologo_id);
    }

    @Override
    public Odontologo listId(int odontologo_id) {
        return oR.findById(odontologo_id).orElse(new Odontologo());
    }

    @Override
    public List<String[]> sumHistorial() {
        return oR.sumHistorial();
    }
}
