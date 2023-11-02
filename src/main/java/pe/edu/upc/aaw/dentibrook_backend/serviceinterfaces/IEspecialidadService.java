package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Especialidad;

import java.util.List;

public interface IEspecialidadService {
    public void insert(Especialidad especialidad);
    public List<Especialidad> list();
    public void delete(int especialidad_id);
    public Especialidad listId(int especialidad_id);
    List<Especialidad> findEspecialidadByNombreEspecialidad(String nombreEspecialidad);
}
