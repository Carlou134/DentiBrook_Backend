package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;

import pe.edu.upc.aaw.dentibrook_backend.entities.Users;

import java.util.List;

public interface IUserService {
    public List<Users> list();
    public void insert(Users users);
    public List<String[]> quantityRolbyUser();
}
