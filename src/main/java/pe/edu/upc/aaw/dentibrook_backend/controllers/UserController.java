package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import pe.edu.upc.aaw.dentibrook_backend.dtos.UserDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Role;
import pe.edu.upc.aaw.dentibrook_backend.entities.Users;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IUserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private IUserService uS;

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users p = m.map(dto, Users.class);

        // Crear un nuevo rol desde el DTO (sin ID)
        List<Role> rolesToAdd = dto.getRoles();

        // Asignar la lista de roles al usuario (sin IDs)
        p.setRoles(rolesToAdd);

        // Para cada rol en la lista, establecer la referencia al usuario
        for (Role role : rolesToAdd) {
            role.setUser(p);
        }

        uS.insert(p);
    }

}


