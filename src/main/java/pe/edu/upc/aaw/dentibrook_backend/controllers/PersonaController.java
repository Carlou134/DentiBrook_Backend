package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.PersonaDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Persona;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IPersonaService;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private IPersonaService Ps;

    @PostMapping
    public void registrar(@RequestBody PersonaDTO dto){
        ModelMapper m = new ModelMapper();
        Persona p = m.map(dto, Persona.class);
        Ps.insert(p);
    }

    @GetMapping
    public List<PersonaDTO> listar(){
        return Ps.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PersonaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        Ps.delete(id);
    }

    @GetMapping("/{id}")
    public PersonaDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PersonaDTO dto = m.map(Ps.listId(id),PersonaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PersonaDTO dto){
        ModelMapper m = new ModelMapper();
        Persona p = m.map(dto, Persona.class);
        Ps.insert(p);
    }
}
