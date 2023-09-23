package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Odontologo;

@Repository
public interface IOdontologoRepository extends JpaRepository<Odontologo, Integer> {
}
