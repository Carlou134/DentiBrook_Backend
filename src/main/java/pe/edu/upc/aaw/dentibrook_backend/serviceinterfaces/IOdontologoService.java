package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;


import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;

import java.util.List;

public interface IOdontologoService {
    public void insert(Odontologo odontologo);
    public List<Odontologo> list();
    public void delete(int odontologo_id);
    public Odontologo listId(int odontologo_id);
}
