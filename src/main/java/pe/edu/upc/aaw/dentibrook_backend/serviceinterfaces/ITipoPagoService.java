package pe.edu.upc.aaw.dentibrook_backend.serviceinterfaces;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;

import java.util.List;
public interface ITipoPagoService {
    public void insert(TipoPago TipoPago);
    public List<TipoPago> list();
    public void delete(int IdTipoPago);
    public TipoPago listId(int IdTipoPago);

    List<TipoPago> findByMetodoDePago(String metodoDePago);
}
