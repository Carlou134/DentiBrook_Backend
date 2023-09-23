package pe.edu.upc.aaw.dentibrook_backend.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Servicio;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer>{
    List<Servicio> findServicioByPrecio(BigDecimal precio);
    @Query(value = "SELECT s.tipo_servicio, COUNT(ci.cita_id)\n" +
            "FROM servicio s\n" +
            "JOIN cita ci ON ci.id = s.id\n" +
            "GROUP BY s.tipo_servicio",nativeQuery = true)
    public List<String[]> quantityTipo_serviciobyCita();
}
