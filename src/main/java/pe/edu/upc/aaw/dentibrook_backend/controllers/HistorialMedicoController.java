package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.HistorialMedicoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.HistorialMedico;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IHistorialMedicoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/historial-medico")
public class HistorialMedicoController {
    @Autowired
    private IHistorialMedicoService hS;

    @PostMapping
    public void registrar(@RequestBody HistorialMedicoDTO dto){
        ModelMapper m = new ModelMapper();
        HistorialMedico h = m.map(dto, HistorialMedico.class);
        hS.insert(h);
    }

    @GetMapping
    public List<HistorialMedicoDTO> listar(){
        return hS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, HistorialMedicoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }

    @GetMapping("/{id}")
    public HistorialMedicoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        HistorialMedicoDTO dto = m.map(hS.listId(id),HistorialMedicoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody HistorialMedicoDTO dto){
        ModelMapper m = new ModelMapper();
        HistorialMedico h = m.map(dto, HistorialMedico.class);
        hS.insert(h);
    }
}
