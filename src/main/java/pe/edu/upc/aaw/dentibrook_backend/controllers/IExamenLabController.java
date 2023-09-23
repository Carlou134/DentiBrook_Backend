package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.ExamenLabDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.ExamenLab;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IExamenLabService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/examen-laboratorio")
public class IExamenLabController {
    @Autowired
    private IExamenLabService eS;

    @PostMapping
    public void registrar(@RequestBody ExamenLabDTO dto){
        ModelMapper m = new ModelMapper();
        ExamenLab e = m.map(dto, ExamenLab.class);
        eS.insert(e);
    }

    @GetMapping
    public List<ExamenLabDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ExamenLabDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public ExamenLabDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ExamenLabDTO dto = m.map(eS.listId(id),ExamenLabDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ExamenLabDTO dto){
        ModelMapper m = new ModelMapper();
        ExamenLab e = m.map(dto, ExamenLab.class);
        eS.insert(e);
    }
}
