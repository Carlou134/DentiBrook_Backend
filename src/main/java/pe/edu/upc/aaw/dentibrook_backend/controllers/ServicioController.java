package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.ServicioDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IServicioService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/servicios")
public class ServicioController {
    @Autowired
    private IServicioService sS;

    @PostMapping
    public void registrar(@RequestBody ServicioDTO dto){
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        sS.insert(s);
    }

    @GetMapping
    public List<ServicioDTO> listar(){
        return sS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, ServicioDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        sS.delete(id);
    }

    @GetMapping("/{id}")
    public ServicioDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        ServicioDTO dto = m.map(sS.listId(id),ServicioDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody ServicioDTO dto){
        ModelMapper m = new ModelMapper();
        Servicio s = m.map(dto, Servicio.class);
        sS.insert(s);
    }
}
