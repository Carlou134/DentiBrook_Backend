package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Reputacion;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IReputacionRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IReputacionService;

import java.util.List;

@Service
public class ReputacionServiceImplements implements IReputacionService {
    @Autowired
    private IReputacionRepository rR;


    @Override
    public void insert(Reputacion reputacion) {
        rR.save(reputacion);
    }

    @Override
    public List<Reputacion> list() {
        return rR.findAll();
    }

    @Override
    public void delete(int reputacion_id) {
        rR.deleteById(reputacion_id);
    }

    @Override
    public Reputacion listId(int reputacion_id) {
        return rR.findById(reputacion_id).orElse(new Reputacion());
    }
}
