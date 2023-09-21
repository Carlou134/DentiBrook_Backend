package pe.edu.upc.aaw.dentibrook_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.TipoPagoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ITipoPagoService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/tipodepagos")
public class TipoPagoController {
    @Autowired
    private ITipoPagoService tS;

    @PostMapping
    public void registrar(@RequestBody TipoPagoDTO dto){
        ModelMapper m = new ModelMapper();
        TipoPago t = m.map(dto, TipoPago.class);
        tS.insert(t);
    }

    @GetMapping
    public List<TipoPagoDTO> listar(){
        return tS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoPagoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        tS.delete(id);
    }

    @GetMapping("/{id}")
    public TipoPagoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        TipoPagoDTO dto = m.map(tS.listId(id),TipoPagoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody TipoPagoDTO dto){
        ModelMapper m = new ModelMapper();
        TipoPago t = m.map(dto, TipoPago.class);
        tS.insert(t);
    }

}
