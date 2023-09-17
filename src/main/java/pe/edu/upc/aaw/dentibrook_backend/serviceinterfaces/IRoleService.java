package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Role;
import pe.edu.upc.aaw.dentibrook_backend.repositories.RoleRepository;

import java.util.List;

public interface IRoleService {
    public List<Role> list();
}
