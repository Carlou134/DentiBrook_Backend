package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.ExamenLab;

@Repository
public interface IExamenLabRepository extends JpaRepository<ExamenLab, Integer> {
}
