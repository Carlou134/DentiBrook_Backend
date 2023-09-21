package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Cita;

import java.time.LocalDate;
import java.util.List;
@Repository
public interface ICitaRepository extends JpaRepository<Cita,Integer> {
    List<Cita> findByfecha(LocalDate fecha);

    @Query(value="select count(t.ad_id_Cita) \n" +
            " from Cita t",nativeQuery=true)
    public List<String[]>quantityOfCitas();
}
