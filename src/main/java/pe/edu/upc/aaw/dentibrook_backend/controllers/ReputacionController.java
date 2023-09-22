package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.ReputacionDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Reputacion;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IReputacionService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/reputacion")
public class ReputacionController {
    @Autowired
    private IReputacionService iS;

    @PostMapping
    public void registrar(@RequestBody ReputacionDTO dto){
        ModelMapper m = new ModelMapper();
        Reputacion r = m.map(dto, Reputacion.class);
        iS.insert(r);
    }

    @GetMapping
    public List<ReputacionDTO> listar(){
        return iS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ReputacionDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        iS.delete(id);
    }

    @GetMapping("/{id}")
    public ReputacionDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ReputacionDTO dto = m.map(iS.listId(id),ReputacionDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ReputacionDTO dto){
        ModelMapper m = new ModelMapper();
        Reputacion r = m.map(dto, Reputacion.class);
        iS.insert(r);
    }
}
