package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Role;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
    public void insert(Role role);
    public void delete(int id);
    public Role listId(int id);
}
