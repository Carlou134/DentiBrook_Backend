package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.Users;
import pe.edu.upc.aaw.dentibrook_backend.repositories.UserRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IUserService;

import java.util.List;

@Service
public class UserServiceImplements implements IUserService {
    @Autowired
    private UserRepository uR;

    @Override
    public List<Users> list() {
        return uR.findAll();
    }

    @Override
    public void insert(Users users) {
        uR.save(users);
    }

    @Override
    public void delete(int id) {
        uR.deleteById(id);
    }

    @Override
    public Users listId(int id) {
        return uR.findById(id).orElse(new Users());
    }

    @Override
    public Users findByUsername(String username) {
        return uR.findByUsername(username);
    }

    @Override
    public int buscarUsername(String nombre) {
        return uR.buscarUsername(nombre);
    }

    @Override
    public void insRol(String authority, Integer user_id) {
        uR.insRol(authority, user_id);
    }

    @Override
    public List<String[]> quantityRolbyUser() {
        return uR.quantityRolbyUser();
    }
}
