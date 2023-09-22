package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Examen;

import java.util.List;

public interface IExamenService {
    public void insert(Examen examen);
    public List<Examen> list();
    public void delete(int examen_id);
    public Examen listId(int examen_id);
}
