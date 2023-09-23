package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;


import pe.edu.upc.aaw.dentibrook_backend.entities.Tratamiento;

import java.util.List;

public interface ITratamientoService {
    public void insert(Tratamiento tratamiento);
    public List<Tratamiento> list();
    public void delete(int tratamiento_id);
    public Tratamiento listId(int tratamiento_id);
}
