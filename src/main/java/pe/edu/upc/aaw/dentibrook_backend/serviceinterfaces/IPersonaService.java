package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Persona;

import java.util.List;

public interface IPersonaService {
    public void insert(Persona persona);
    public List<Persona> list();
}
