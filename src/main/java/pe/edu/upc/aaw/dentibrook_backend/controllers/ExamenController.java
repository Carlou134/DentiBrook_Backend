package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.ExamenDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Examen;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IExamenService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/examen")
public class ExamenController {
    @Autowired
    private IExamenService eS;

    @PostMapping
    public void registrar(@RequestBody ExamenDTO dto){
        ModelMapper m = new ModelMapper();
        Examen e = m.map(dto, Examen.class);
        eS.insert(e);
    }

    @GetMapping
    public List<ExamenDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ExamenDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public ExamenDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ExamenDTO dto = m.map(eS.listId(id),ExamenDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ExamenDTO dto){
        ModelMapper m = new ModelMapper();
        Examen e = m.map(dto, Examen.class);
        eS.insert(e);
    }
}
