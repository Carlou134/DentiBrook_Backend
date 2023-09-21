package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.CitaDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ICitaService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private ICitaService cS;

    @PostMapping
    public void registrar(@RequestBody CitaDTO dto){
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cS.insert(c);
    }

    @GetMapping
    public List<CitaDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CitaDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CitaDTO dto = m.map(cS.listId(id),CitaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CitaDTO dto){
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cS.insert(c);
    }
}
