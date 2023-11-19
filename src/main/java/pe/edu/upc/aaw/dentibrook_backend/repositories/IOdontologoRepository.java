package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;

import java.util.List;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {
    @Query(value = "SELECT e.nombre_especialidad, SUM(o.historial_pacientes) \n" +
            "FROM odontologo o \n" +
            "INNER JOIN especialidad e ON o.especialidad_id = e.especialidad_id\n" +
            "GROUP BY e.nombre_especialidad ORDER BY COUNT(e.nombre_especialidad) desc", nativeQuery = true)
    public List<String[]> sumHistorial();
}
