package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.CitaDTO;
import pe.edu.upc.aaw.dentibrook_backend.dtos.QuantitybyCitaDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ICitaService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/citas")
public class CitaController {
    @Autowired
    private ICitaService cS;

    @PostMapping
    @PreAuthorize("hasAuthority('USER')")
    public void registrar(@RequestBody CitaDTO dto){
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cS.insert(c);
    }

    @GetMapping
    @PreAuthorize("hasAuthority('ODONTOLOGO') OR hasAuthority('USER')")
    public List<CitaDTO> listar(){
        return cS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        cS.delete(id);
    }

    @GetMapping("/{id}")
    public CitaDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        CitaDTO dto = m.map(cS.listId(id),CitaDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody CitaDTO dto){
        ModelMapper m = new ModelMapper();
        Cita c = m.map(dto, Cita.class);
        cS.insert(c);
    }

    @PostMapping("/buscar")
    public List<CitaDTO> buscar(@RequestBody LocalDate fecha) {
        return cS.findByFecha(fecha).stream().map(x->{
            ModelMapper vrm=new ModelMapper();
            return vrm.map(x,CitaDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cantidadcitaportipo")
    public List<QuantitybyCitaDTO> cantidadCitaporTipo_Cita(){
        List<String[]> vrlista = cS.quantityOfCitas();
        List<QuantitybyCitaDTO> vrlistaDTO = new ArrayList<>();
        for (String[] data:vrlista){
            QuantitybyCitaDTO vrdto = new QuantitybyCitaDTO();
            vrdto.setTipo_cita(data[0]);
            vrdto.setAdQuantityCita(Integer.parseInt(data[1]));
            vrlistaDTO.add(vrdto);
        }
        return vrlistaDTO;
    }
}
