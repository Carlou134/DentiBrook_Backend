package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;


import pe.edu.upc.aaw.dentibrook_backend.entities.Herramienta;

import java.util.List;

public interface IHerramientaService {
    public void insert(Herramienta herramienta);
    public List<Herramienta> list();
    public void delete(int herramienta_id);
    public Herramienta listId(int herramienta_id);
}
