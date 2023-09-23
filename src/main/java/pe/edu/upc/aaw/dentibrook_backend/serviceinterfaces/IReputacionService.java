package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;


import pe.edu.upc.aaw.dentibrook_backend.entities.Reputacion;

import java.util.List;

public interface IReputacionService {
    public void insert(Reputacion reputacion);
    public List<Reputacion> list();
    public void delete(int reputacion_id);
    public Reputacion listId(int reputacion_id);
}
