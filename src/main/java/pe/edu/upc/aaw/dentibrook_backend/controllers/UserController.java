package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;


import pe.edu.upc.aaw.dentibrook_backend.dtos.RolbyUserDTO;
import pe.edu.upc.aaw.dentibrook_backend.dtos.UserDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Users;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IUserService;

import java.util.ArrayList;
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
        uS.insert(p);
    }

    @GetMapping("/cantidadusersporrol")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<RolbyUserDTO> cantidadUsuariosPorRol(){
        List<String[]> list = uS.quantityRolbyUser();
        List<RolbyUserDTO> listaDTO = new ArrayList<>();
        for (String[] data:list){
            RolbyUserDTO dto = new RolbyUserDTO();
            dto.setRol(data[0]);
            dto.setQuantityUsers(Integer.parseInt(data[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}


