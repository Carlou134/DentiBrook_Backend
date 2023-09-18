package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Cita")
public class Cita{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cita_id;

}

