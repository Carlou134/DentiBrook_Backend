package pe.edu.upc.aaw.dentibrook_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.TipoPago;

import java.util.List;

@Repository
public interface ITipoPagoRepository extends JpaRepository<TipoPago, Integer>  {
    List<TipoPago> findByMetodoDePago(String metodoDePago);

    @Query(value = "SELECT metodo_de_pago, SUM(cuotas) FROM tipo_pago\n" +
            "GROUP BY metodo_de_pago ORDER BY COUNT(metodo_de_pago) desc", nativeQuery = true)
    public List<String[]> sumCuotas();
}