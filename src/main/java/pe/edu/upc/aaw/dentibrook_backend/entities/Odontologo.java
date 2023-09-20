package pe.edu.upc.aaw.dentibrook_backend.entities;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "odontologo")
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int odontologo_id;
    @ManyToOne
    @JoinColumn(name = "id")
    private Users user_id;
    @ManyToOne
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad_id;
    @Column(name = "experiencia_laboral_anios", nullable = false)
    private int experiencia_laboral_anios;
    @Column(name = "educacion_universitaria", length = 30)
    private String educacion_universitaria;
    @Column(name = "historial_pacientes", nullable = false)
    private int historial_pacientes;
    @Column(name = "horario_atencion", length = 11)
    private String horario_atencion;
    @Column(name = "salario", nullable = false)
    private BigDecimal salario;

    public Odontologo() {
    }
}
