package pe.edu.upc.aaw.dentibrook_backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.edu.upc.aaw.dentibrook_backend.entities.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
}