package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;

import java.util.List;

public interface IServicioService {
    public void insert(Servicio Servicio);
    public List<Servicio> list();
    public void delete(int Servicio_id);
    public Servicio listId(int Servicio_id);
}
