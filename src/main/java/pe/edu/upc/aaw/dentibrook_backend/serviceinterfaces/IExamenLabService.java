package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.ExamenLab;

import java.util.List;

public interface IExamenLabService {
    public void insert(ExamenLab examenLab);
    public List<ExamenLab> list();
    public void delete(int examenLab_id);
    public ExamenLab listId(int examenLab_id);
}
