package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;
import pe.edu.upc.aaw.dentibrook_backend.repositories.IServicioRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IServicioService;

import java.math.BigDecimal;
import java.util.List;

@Service
public class ServicioServiceImplements  implements IServicioService{
    @Autowired
    private IServicioRepository pR;
    @Override
    public void insert(Servicio Servicio) {
        pR.save(Servicio);
    }

    @Override
    public List<Servicio> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int Servicio_id) {
        pR.deleteById(Servicio_id);
    }

    @Override
    public Servicio listId(int Servicio_id) {
        return pR.findById(Servicio_id).orElse(new Servicio());
    }

    @Override
    public List<Servicio> findServicioByPrecio(BigDecimal precio) {
        return pR.findServicioByPrecio(precio);
    }

    @Override
    public List<String[]> quantityTipo_serviciobyCita() {
        return pR.quantityTipo_serviciobyCita();
    }
}
