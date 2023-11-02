package pe.edu.upc.aaw.dentibrook_backend.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;
import pe.edu.upc.aaw.dentibrook_backend.repositories.ITipoPagoRepository;
import pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces.ITipoPagoService;

import java.util.List;

@Service
public class TipoPagoServiceImplements implements ITipoPagoService{
    @Autowired
    private ITipoPagoRepository pR;
    @Override
    public void insert(TipoPago TipoPago) {
        pR.save(TipoPago);
    }

    @Override
    public List<TipoPago> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int TipoPago_id) {
        pR.deleteById(TipoPago_id);
    }

    @Override
    public TipoPago listId(int TipoPago_id) {
        return pR.findById(TipoPago_id).orElse(new TipoPago());
}

    @Override
    public List<TipoPago> findByMetodoDePago(String metodoDePago) {
        return pR.findByMetodoDePago(metodoDePago);
    }
}

