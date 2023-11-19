package pe.edu.upc.aaw.dentibrook_backend.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.upc.aaw.dentibrook_backend.dtos.MedicamentoDTO;
import pe.edu.upc.aaw.dentibrook_backend.entities.Medicamento;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.IMedicamentoService;


import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/medicamentos")
public class MedicamentoController {
    @Autowired
    private IMedicamentoService mS;

    @PostMapping
    public void registrar(@RequestBody MedicamentoDTO dto){
        ModelMapper m = new ModelMapper();
        Medicamento me = m.map(dto, Medicamento.class);
        mS.insert(me);
    }

    @GetMapping
    public List<MedicamentoDTO> listar(){
        return mS.list().stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicamentoDTO.class);
        }).collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        mS.delete(id);
    }

    @GetMapping("/{id}")
    public MedicamentoDTO listarDTO(@PathVariable("id") Integer id){
        ModelMapper m = new ModelMapper();
        MedicamentoDTO dto = m.map(mS.listId(id),MedicamentoDTO.class);
        return dto;
    }

    @PutMapping
    public void modificar(@RequestBody MedicamentoDTO dto){
        ModelMapper m = new ModelMapper();
        Medicamento me = m.map(dto, Medicamento.class);
        mS.insert(me);
    }

    @PostMapping("/buscar")
    public List<MedicamentoDTO> buscar(@RequestBody Map<String, String> request) {
        String via = request.get("via");
        return mS.findByVia(via).stream().map(x->{
            ModelMapper m = new ModelMapper();
            return m.map(x, MedicamentoDTO.class);
        }).collect(Collectors.toList());
    }
}
