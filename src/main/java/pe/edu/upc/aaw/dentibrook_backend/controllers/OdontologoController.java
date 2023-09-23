package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.OdontologoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IOdontologoService;


import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private IOdontologoService oS;

    @PostMapping
    public void registrar(@RequestBody OdontologoDTO dto){
        ModelMapper m = new ModelMapper();
        Odontologo o = m.map(dto, Odontologo.class);
        oS.insert(o);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN') or hasAuthority('USER')")
    public List<OdontologoDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, OdontologoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }

    @GetMapping("/{id}")
    public OdontologoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        OdontologoDTO dto = m.map(oS.listId(id),OdontologoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody OdontologoDTO dto){
        ModelMapper m = new ModelMapper();
        Odontologo o = m.map(dto, Odontologo.class);
        oS.insert(o);
    }
}
