package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;


import pe.edu.upc.aaw.dentibrook_backend.dtos.RolbyUserDTO;
import pe.edu.upc.aaw.dentibrook_backend.dtos.RoleDTO;
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

    @Autowired
    private PasswordEncoder passwordEncoder;

    @GetMapping
    @PreAuthorize("hasAuthority('ODONTOLOGO') OR hasAuthority('USER')")
    public List<UserDTO> listar(){
        return uS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, UserDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping
    @PreAuthorize("hasAuthority('ODONTOLOGO')")
    public void registrar(@RequestBody UserDTO dto) {
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);

        // Encriptar la contraseña antes de guardarla
        String passwordEncriptada = passwordEncoder.encode(dto.getPassword());
        u.setPassword(passwordEncriptada);

        uS.insert(u);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        uS.delete(id);
    }

    @GetMapping("/{id}")
    public UserDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        UserDTO dto = m.map(uS.listId(id),UserDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody UserDTO dto){
        ModelMapper m = new ModelMapper();
        Users u = m.map(dto, Users.class);

        // Verificar si se proporcionó una nueva contraseña en el DTO
        if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
            // Encriptar la nueva contraseña antes de guardarla
            String passwordEncriptada = passwordEncoder.encode(dto.getPassword());
            u.setPassword(passwordEncriptada);
        } else {
            // Si no se proporcionó una nueva contraseña, mantener la contraseña existente
            // Esto es útil si solo se están actualizando otros campos del usuario sin cambiar la contraseña.
            Users existingUser = uS.listId(u.getId()); // Utiliza el método adecuado de tu servicio
            if (existingUser != null) {
                u.setPassword(existingUser.getPassword());
            }
        }

        uS.insert(u); // Asegúrate de que este método haga la actualización o inserción adecuada
    }

    @GetMapping("/buscar/{username}")
    public Users getUserByUsername(@PathVariable String username) {
        return uS.findByUsername(username);
    }

    @GetMapping("/count/{username}")
    public int countByUsername(@PathVariable String username) {
        return uS.buscarUsername(username);
    }

    @PostMapping("/insertar-rol")
    public void insertarRol(@RequestBody RoleDTO dto) {
        uS.insRol(dto.getRol(), dto.getUser().getId());
    }

    @GetMapping("/cantidadusersporrol")
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


