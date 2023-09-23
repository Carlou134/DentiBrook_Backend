package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;

import java.math.BigDecimal;
import java.util.List;

public interface IServicioService {
    public void insert(Servicio Servicio);
    public List<Servicio> list();
    public void delete(int Servicio_id);
    public Servicio listId(int Servicio_id);
    List<Servicio> findServicioByPrecio(BigDecimal precio);
    public List<String[]> quantityTipo_serviciobyCita();
}
