package pe.edu.upc.aaw.dentibrook_backend.controllers;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.TipoPagoDTO;
import pe.edu.upc.aaw.dentibrook_backend.dtos.TipoPagoSumDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ITipoPagoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
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

    @PostMapping("/buscar")
    public List<TipoPagoDTO> buscar(@RequestBody Map<String, String> request) {
        String metodoDePago = request.get("metodoDePago");
        return tS.findByMetodoDePago(metodoDePago).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, TipoPagoDTO.class);
        }).collect(Collectors.toList());
    }

    @GetMapping("/cuotas")
    @PreAuthorize("hasAuthority('ODONTOLOGO')")
    public List<TipoPagoSumDTO> difficultyPersons() {
        List<String[]> cuotasTipoPago = tS.sumCuotas();
        List<TipoPagoSumDTO> cuotasTipoPagoDTO = new ArrayList<>();

        for (String[] data : cuotasTipoPago) {
            TipoPagoSumDTO dto = new TipoPagoSumDTO();
            dto.setMetodoDePago(data[0]);
            dto.setTotalCuotas(Integer.parseInt(data[1]));
            cuotasTipoPagoDTO.add(dto);
        }

        return cuotasTipoPagoDTO;
    }
}
