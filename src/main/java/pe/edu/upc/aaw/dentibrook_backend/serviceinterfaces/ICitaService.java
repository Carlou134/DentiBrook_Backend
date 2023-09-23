package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;

import java.time.LocalDate;
import java.util.List;

public interface ICitaService {
    public void insert(Cita Cita);
    public List<Cita> list();
    public void delete(int Cita_id);
    public Cita listId(int Cita_id);
    List<Cita> findByFecha(LocalDate fecha);
    public List<String[]>quantityOfCitas();
}
