package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Herramienta;

@Repository
public interface IHerramientaRepository extends JpaRepository<Herramienta, Integer> {
}
