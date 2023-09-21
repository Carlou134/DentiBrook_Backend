package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ICitaRepository extends JpaRepository<Cita,Integer> {
    List<Cita> findByFecha(LocalDate fecha);

    @Query(value="SELECT tipo_cita, COUNT(cita_id)\n" +
            "FROM cita\n" +
            "GROUP BY tipo_cita",nativeQuery=true)
    public List<String[]>quantityOfCitas();
}
