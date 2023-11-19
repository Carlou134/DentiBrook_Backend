package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.EstrellasSumDTO;
import pe.edu.upc.aaw.dentibrook_backend.dtos.HistorialDTOSum;
import pe.edu.upc.aaw.dentibrook_backend.dtos.OdontologoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IOdontologoService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    @Autowired
    private IOdontologoService oS;

    @PostMapping
    @PreAuthorize("hasAuthority('ODONTOLOGO')")
    public void registrar(@RequestBody OdontologoDTO dto){
        ModelMapper m = new ModelMapper();
        Odontologo o = m.map(dto, Odontologo.class);
        oS.insert(o);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ODONTOLOGO') OR hasAuthority('USER')")
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

    @GetMapping("/historial")
    @PreAuthorize("hasAuthority('ODONTOLOGO')")
    public List<HistorialDTOSum> EspecialidadPacientes() {
        List<String[]> historialEspecialidad = oS.sumHistorial();
        List<HistorialDTOSum> historialDTO = new ArrayList<>();

        for (String[] data : historialEspecialidad) {
            HistorialDTOSum dto = new HistorialDTOSum();
            dto.setNombreEspecialidad(data[0]);
            dto.setTotalPacientes(Integer.parseInt(data[1]));
            historialDTO.add(dto);
        }

        return historialDTO;
    }

    @GetMapping("/estrellas")
    @PreAuthorize("hasAuthority('ODONTOLOGO')")
    public List<EstrellasSumDTO> OdontologoEstrellas() {
        List<String[]> odontologoEstrellas = oS.sumEstrellas();
        List<EstrellasSumDTO> estrellasDTO = new ArrayList<>();

        for (String[] data : odontologoEstrellas) {
            EstrellasSumDTO dto = new EstrellasSumDTO();
            dto.setNombre(data[0]);
            dto.setTotalEstrellas(Integer.parseInt(data[1]));
            estrellasDTO.add(dto);
        }

        return estrellasDTO;
    }
}
