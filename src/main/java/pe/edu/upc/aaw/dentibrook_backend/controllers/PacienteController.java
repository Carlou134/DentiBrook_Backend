package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.PacienteDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Paciente;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IPacienteService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {
    @Autowired
    private IPacienteService pS;

    @PostMapping
    public void registrar(@RequestBody PacienteDTO dto){
        ModelMapper m = new ModelMapper();
        Paciente p = m.map(dto, Paciente.class);
        pS.insert(p);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<PacienteDTO> listar(){
        return pS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, PacienteDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        pS.delete(id);
    }

    @GetMapping("/{id}")
    public PacienteDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        PacienteDTO dto = m.map(pS.listId(id),PacienteDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody PacienteDTO dto){
        ModelMapper m = new ModelMapper();
        Paciente p = m.map(dto, Paciente.class);
        pS.insert(p);
    }
}
