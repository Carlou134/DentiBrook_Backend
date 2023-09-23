package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Role;
import pe.edu.upc.aaw.dentibrook_backend.repositories.RoleRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IRoleService;

import java.util.List;

@Service
public class RoleServiceImplements implements IRoleService {
    @Autowired
    private RoleRepository rR;

    @Override
    public List<Role> list() {
        return rR.findAll();
    }

    @Override
    public void insert(Role role) {
        rR.save(role);
    }
}
