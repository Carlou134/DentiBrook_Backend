package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Medicamento;

import java.util.List;

@Repository
public interface IMedicamentoRepository extends JpaRepository<Medicamento, Integer> {
    List<Medicamento> findByVia(String via);
}
