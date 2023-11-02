package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.EspecialidadDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Especialidad;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IEspecialidadService;


import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/especialidad")
public class EspecialidadController {
    @Autowired
    private IEspecialidadService eS;

    @PostMapping
    public void registrar(@RequestBody EspecialidadDTO dto){
        ModelMapper m = new ModelMapper();
        Especialidad e = m.map(dto, Especialidad.class);
        eS.insert(e);
    }

    @GetMapping
    public List<EspecialidadDTO> listar(){
        return eS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EspecialidadDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        eS.delete(id);
    }

    @GetMapping("/{id}")
    public EspecialidadDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        EspecialidadDTO dto = m.map(eS.listId(id),EspecialidadDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody EspecialidadDTO dto){
        ModelMapper m = new ModelMapper();
        Especialidad p = m.map(dto, Especialidad.class);
        eS.insert(p);
    }

    @PostMapping("/buscar")
    public List<EspecialidadDTO> buscar(@RequestBody Map<String, String> request) {
        String nombreEspecialidad = request.get("nombreEspecialidad");
        return eS.findEspecialidadByNombreEspecialidad(nombreEspecialidad).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, EspecialidadDTO.class);
        }).collect(Collectors.toList());
    }
}
