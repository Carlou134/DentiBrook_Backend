package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="Cita")
public class Cita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Cita;
    private int cita_id;
    private int odontologo_id;
    private int tipopago_id;
    private int duracionenhoras;
    @OneToOne
    @Column(name = "hora", length = 5)
    private String hora;
    @Column(name = "motivo", length = 100)
    private String motivo;


    @Column(name = "estado", length = 10)
    private String estado;
    @Column(name = "direccion_consultorio", length = 30)
    private String direccion_consultorio;
    @Column(name = "tipo_cita", length = 10)
    private String tipo_cita;
    @Column(name = "fecha", length = 10)
    private LocalDate fecha;
}
    public Cita() {
    }
