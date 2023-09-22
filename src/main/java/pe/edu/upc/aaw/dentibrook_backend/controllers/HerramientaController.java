package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.HerramientaDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Herramienta;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IHerramientaService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/herramientas")
public class HerramientaController {
    @Autowired
    private IHerramientaService hS;

    @PostMapping
    public void registrar(@RequestBody HerramientaDTO dto){
        ModelMapper m = new ModelMapper();
        Herramienta h = m.map(dto, Herramienta.class);
        hS.insert(h);
    }

    @GetMapping
    public List<HerramientaDTO> listar(){
        return hS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, HerramientaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        hS.delete(id);
    }

    @GetMapping("/{id}")
    public HerramientaDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        HerramientaDTO dto = m.map(hS.listId(id),HerramientaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody HerramientaDTO dto){
        ModelMapper m = new ModelMapper();
        Herramienta h = m.map(dto, Herramienta.class);
        hS.insert(h);
    }
}
