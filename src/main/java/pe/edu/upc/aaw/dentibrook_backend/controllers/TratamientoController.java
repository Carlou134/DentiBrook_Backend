package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.TratamientoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Tratamiento;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ITratamientoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tratamiento")
public class TratamientoController {
    @Autowired
    private ITratamientoService tS;

    @PostMapping
    public void registrar(@RequestBody TratamientoDTO dto){
        ModelMapper m = new ModelMapper();
        Tratamiento t = m.map(dto, Tratamiento.class);
        tS.insert(t);
    }

    @GetMapping
    public List<TratamientoDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TratamientoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TratamientoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TratamientoDTO dto = m.map(tS.listId(id),TratamientoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TratamientoDTO dto){
        ModelMapper m = new ModelMapper();
        Tratamiento t = m.map(dto, Tratamiento.class);
        tS.insert(t);
    }
}
