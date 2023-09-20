package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;

@Entity
@Table(name = "especialidad")
public class Especialidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int especialidad_id;
}
